package net.explorys.samhat;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import org.pb.x12.Cf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by stan.campbell on 9/10/15.
 */
public class YamlBasedCfSchemaParser implements ICfSchemaParser {

    @Override
    public Cf parseSchema(InputStream schemaStream) throws CfSchemaParsingException {

        try {

            Object doc = loadYamlSchema(schemaStream);
            return processSchema(null, doc);

        } catch (Exception e) {
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
            Map<String, Object> node = (Map<String, Object>) doc;

            return processSchema(null, doc);
        } catch (Exception e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:" + e);
        }
    }

    private Cf processSchema(Cf schema, Object current) throws CfSchemaParsingException {

        try {

            if (null == schema) {
                schema = new Cf("X12");
            }
            Map<String, Object> nodes = (Map<String, Object>) current;
            for (String childNodeName : nodes.keySet()) {

                System.out.println("Processing: "+childNodeName);

                // Ignore the built-ins
                // TODO: make the built-ins an enumeration or something
                if (!isBuiltIn(childNodeName)) {
                    // Represents a nested data type
                    Map<String, Object> childNode = (Map<String, Object>) nodes.get(childNodeName);
                    Object segmentName = childNode.get("_segment");
                    Cf childSchema;
                    if (!(null==segmentName)) {
                        if (!childNode.containsKey("segmentQual")) {
                            childSchema = schema.addChild(childNodeName, segmentName.toString());
                        } else {
                            String segmentQual = childNode.get("_segmentQual").toString();
                            int segmentQualPos = Integer.parseInt(childNode.get("_segmentQualPos").toString());
                            childSchema = schema.addChild(childNodeName, segmentName.toString(), segmentQual, segmentQualPos);
                        }
                        if (null == childSchema) {
                            // failed to construct the child, throw an error
                            throw new CfSchemaParsingException("Error in parsing on child node: " + childNodeName);
                        }
                    } else {
                        // TODO: log this, it's just the beginning of the schema processing
                        childSchema = schema;
                    }
                    processSchema(childSchema, childNode);
                }
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
