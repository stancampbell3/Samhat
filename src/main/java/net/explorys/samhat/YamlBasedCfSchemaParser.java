package net.explorys.samhat;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import org.pb.x12.Cf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by stan.campbell on 9/10/15.
 */
public class YamlBasedCfSchemaParser implements ICfSchemaParser {

    @Override
    public Cf parseSchema(InputStream schemaStream) throws CfSchemaParsingException {

        try {

            Object doc = loadYamlSchema(schemaStream);
            return processSchema(null, doc, null);

        } catch (Exception e) {
            e.printStackTrace();
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:" + e);
        }
    }

    @Override
    public Cf parseSchema(String filename) throws CfSchemaParsingException, FileNotFoundException {

        InputStream xmlStream = new FileInputStream(filename);
        return parseSchema(xmlStream);
    }

    boolean isBuiltIn(String key) {
        return ("_segment".equalsIgnoreCase(key) || "_segmentQual".equalsIgnoreCase(key) || "_segmentQualPos".equalsIgnoreCase(key));
    }

    public Cf parseSchema(Object doc) throws CfSchemaParsingException {

        try {

            // Should contain one field labelled X12
            return processSchema(null, doc, null);
        } catch (Exception e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:" + e);
        }
    }

    private String getFieldValue(ArrayList<Map<String,Object>> fields, String fieldName) {

        if(null==fieldName || null==fields) {
            return null;
        }

        for(Map<String,Object> field : fields) {
            if(field.containsKey(fieldName)) {
                return field.get(fieldName).toString();
            }
        }

        return null;
    }

    private Cf processSchema(Cf schema, Object current, String currentName) throws CfSchemaParsingException {

        try {

            System.out.println("Processing node: "+currentName);

            if (null == schema) {
                // Start the root of the tree
                schema = new Cf("X12");
            }

            System.out.println("Class is: "+current.getClass());
            if(current instanceof Map) {
                System.out.println("IT'S A MAP!");
                Map<String, Object> fieldMap = (Map<String, Object>)current;

                // For each of it's fields wich are not primitive, process those schemas
                for(String fieldName : fieldMap.keySet()) {
                    System.out.println("Process schema for field: "+fieldName);
                    processSchema(schema, fieldMap.get(fieldName), fieldName);
                }
            }
            if(current instanceof List) {
                System.out.println("IT'S A LIST!");
                ArrayList<Map<String, Object>> fieldList = (ArrayList<Map<String, Object>>)current;

                // Add a new node for this record to the schema
                Cf childSchema;

                // Don't double create X12
                if(!"X12".equalsIgnoreCase(currentName)) {
                    // -- determine the segment, and if present the segmentQual and segmentQualPos
                    String segment = getFieldValue(fieldList, "_segment");
                    if (null == segment) {
                        throw new CfSchemaParsingException("No _segment specification for: " + currentName);
                    }
                    String segmentQual = getFieldValue(fieldList, "_segmentQual");
                    if (null == segmentQual) {

                        // Add a node to the schema for this record type and segment
                        childSchema = schema.addChild(currentName, segment);

                    } else {
                        String segmentQualPos = getFieldValue(fieldList, "_segmentQualPos");
                        if (null == segmentQualPos) {
                            throw new CfSchemaParsingException("No _segmentQualPos specification for: " + currentName);
                        }

                        // Add a node to the schema for this record type, segment, with qualifier at position
                        childSchema = schema.addChild(currentName, segment, segmentQual, new Integer(segmentQualPos));
                    }
                } else {
                    childSchema = schema;
                }

                // For each field
                for(Map<String, Object> field : fieldList) {

                    // TODO: fix this.. the algorithm is not at all pretty
                    // only one record should be in the map
                    String fieldName = field.keySet().iterator().next();
                    if(!isBuiltIn(fieldName)) {

                        // process this field
                        processSchema(childSchema, field.get(fieldName), fieldName);
                    }
                }
            }
            if(current instanceof String) {

                System.out.println("IT'S A STRING!");
            }

            return schema;
        } catch (Exception e) {

            throw new CfSchemaParsingException("Couldn't parse the YAML into a valid Cf", e);
        }
    }

    protected Object loadYamlSchema(InputStream yamlStream) throws YamlException {

        YamlReader yamlReader = new YamlReader(new InputStreamReader(yamlStream));
        return yamlReader.read();
    }
}
