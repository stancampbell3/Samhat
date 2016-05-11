package net.explorys.samhat;

import net.explorys.samhat.avro.Avro837Util;
import org.apache.avro.Schema;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by stan.campbell on 8/31/15.
 */
public class AvroSchemaGenerator {

    static final String UNQUALIFIED_FIELDS = "unqualifiedFields";
    static final String QUALIFIED_FIELDS = "qualifiedFields";
    static final String UNMAPPED = "unmapped";
    static final String NAMESPACE = "net.explorys.samhat.z12.r837";

    public static final Schema SEGMENTS_ELEMENT_SCHEMA = (new Schema.Parser()).parse("{\"type\":\"array\",\"items\":\"string\"}");
    public static final Schema SEGMENTS_FIELD_SCHEMA = (new Schema.Parser()).parse("[ \"null\", {\"type\":\"array\",\"items\":\"string\"} ]");
    public static final Schema UNMAPPED_ELEMENTS_SCHEMA = (new Schema.Parser()).parse("{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"string\"}}");
    public static final Schema UNMAPPED_FIELD_SCHEMA = (new Schema.Parser()).parse("[ \"null\", {\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"string\"}} ]");

    private ObjectMapper mapper;
    private XmlBasedCfSchemaParser parser;

    JsonNode segmentsElementSchemaJson;
    JsonNode segmentsFieldSchemaJson;
    JsonNode unmappedFieldsSchemaJson;

    public AvroSchemaGenerator() {
        this.mapper = new ObjectMapper();
        this.parser = new XmlBasedCfSchemaParser();
    }

    public AvroSchemaGenerator(ObjectMapper mapper, XmlBasedCfSchemaParser parser) {
        this.mapper = mapper;
        this.parser = parser;
    }

    public AvroSchemaGenerator(XmlBasedCfSchemaParser parser) {
        this.parser = parser;
        this.mapper = new ObjectMapper();
    }

    public AvroSchemaGenerator(ObjectMapper mapper) {
        this.mapper = mapper;
        this.parser = new XmlBasedCfSchemaParser();
    }

    public JsonNode getSegmentsElementSchemaJson() throws IOException {

        if(null==segmentsElementSchemaJson) {
            segmentsElementSchemaJson = mapper.readValue(SEGMENTS_ELEMENT_SCHEMA.toString(false), JsonNode.class);
        }
        return segmentsElementSchemaJson;
    }

    public JsonNode getSegmentsFieldSchemaJson() throws IOException {
        if(null==segmentsFieldSchemaJson) {
            segmentsFieldSchemaJson = mapper.readValue(SEGMENTS_FIELD_SCHEMA.toString(false), JsonNode.class);
        }
        return segmentsFieldSchemaJson;
    }

    public JsonNode getUnmappedFieldsSchemaJson() throws IOException {
        if(null==unmappedFieldsSchemaJson) {
            unmappedFieldsSchemaJson = mapper.readValue(UNMAPPED_FIELD_SCHEMA.toString(false), JsonNode.class);
        }
        return unmappedFieldsSchemaJson;
    }

    boolean isChildElement(Node node) {
        String nodeName = node.getNodeName();
        if("child".equalsIgnoreCase(nodeName) ||
            "segment".equalsIgnoreCase(nodeName) ||
            "loop".equalsIgnoreCase(nodeName)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Recursively walk the XML DOM, creating the Avro schema from the XML specification.
     *
     * @param namespace
     * @param elem
     * @param symbolCounts
     * @return
     */
    ObjectNode constructAvroJsonFromXmlSchema(String namespace,
      Node elem, Map<String,Integer>symbolCounts) throws IllegalAccessException,
            NoSuchFieldException, ClassNotFoundException, IOException {

        // symbolCounts can start null
        if(null==symbolCounts) {
            symbolCounts = new HashMap<>();
        }

        // Construct a new node
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("type", "record");
        objectNode.put("namespace", namespace);

        NamedNodeMap attributes = elem.getAttributes();

        String rawName = attributes.getNamedItem("name").getTextContent();
        objectNode.put("name", Avro837Util.makeAvroName(rawName, symbolCounts));

        ArrayNode fields = mapper.createArrayNode();
        objectNode.put("fields", fields);

        // Provide an unmapped field for holding segment data for which there are no mappings
        ObjectNode unmapped = mapper.createObjectNode();
        unmapped.put("name", UNMAPPED);
        unmapped.put("type", getUnmappedFieldsSchemaJson());
        fields.add(unmapped);

        // Time to gather the fields array from each of the subelements of elem...
        NodeList children = elem.getChildNodes();
        for(int i=0;i<children.getLength();i++) {

            Node child = children.item(i);

            // Ignore any non-child elements (text, etc.)
            if(isChildElement(child)) {

                NodeList grandkids = child.getChildNodes();

                if (grandkids.getLength() != 0) {
                    // If a nested element has children, it's a loop and we need to dive into it

                    // Put a field of this type in our fields array
                    NamedNodeMap fieldAttributes = child.getAttributes();
                    rawName = fieldAttributes.getNamedItem("name").getNodeValue();
                    ObjectNode fieldObject = mapper.createObjectNode();
                    fieldObject.put("name", Avro837Util.makeAvroName(rawName));
                    // Process the child object
                    ObjectNode fieldObjectNode = constructAvroJsonFromXmlSchema(namespace, child, symbolCounts);

                    // Make sure subrecords are nullable
                    ArrayNode nullableField = mapper.createArrayNode();
                    nullableField.add("null");
                    nullableField.add(fieldObjectNode);
                    fieldObject.put("type", nullableField);
                    fields.add(fieldObject);
                } else {

                    // If a nested element has no children, it's a segment so either create a field, or in the case
                    // of segment-field id's present in the fields attribute, create a record with the given fields
                    NamedNodeMap fieldAttributes = child.getAttributes();
                    rawName = fieldAttributes.getNamedItem("name").getNodeValue();
                    ObjectNode fieldObject = mapper.createObjectNode();

                    // Primitive fields don't have to be distinguished only record types as above
                    fieldObject.put("name", Avro837Util.makeAvroName(rawName));

                    // Leaf fields must be nullable as well
                    ArrayNode nullableField = mapper.createArrayNode();
                    nullableField.add("null");

                    // Check for custom field mapping
                    if(fieldAttributes.getNamedItem("classname")!=null) {

                        String declaredType = fieldAttributes.getNamedItem("classname").getNodeValue();

                        if(!symbolCounts.containsKey(declaredType)) {
                            // If we've not seen this class before in this schema generation session, add it
                            // Look up the class of the declared type
                            Class recordClass = Class.forName(declaredType);

                            // Get the schema of the named type
                            Field schemaField = recordClass.getDeclaredField("SCHEMA$");
                            Schema recordSchema = (Schema)schemaField.get(null);
                            String recordSchemaJsonStr = recordSchema.toString();
                            JsonNode recordSchemaJson = mapper.readTree(recordSchemaJsonStr);

                            nullableField.add(recordSchemaJson);

                            // Add it to our symbol table
                            symbolCounts.put(declaredType, 1);
                        } else {
                            // Otherwise, just declare the field as having that already defined type
                            nullableField.add(declaredType);

                            // Increment our count
                            symbolCounts.put(declaredType, symbolCounts.get(declaredType)+1);
                        }

                    } else {

                        // We'll construct an object record specific to this field
                        // Any elements which are specified in the X12 schema as having tagged elements will have
                        // those elements spelled out in the Avro schema as individual fields in this record.
                        // Anything else will end up in a designated "other" field within this record.

                        rawName = fieldAttributes.getNamedItem("name").getNodeValue();
                        String subrecordType = Avro837Util.makeAvroName(rawName);

                        // If this record type has already been defined, we'll just reference it
                        if(!symbolCounts.containsKey(subrecordType)) {
                            ObjectNode subrecord = mapper.createObjectNode();
                            subrecord.put("type", "record");
                            subrecord.put("namespace", NAMESPACE);
                            subrecord.put("name", subrecordType);

                            ArrayNode subrecordFields = mapper.createArrayNode();
                            subrecord.put("fields", subrecordFields);

                            // Unqualified fields
                            Node distinguished = fieldAttributes.getNamedItem(UNQUALIFIED_FIELDS);
                            if (distinguished != null) {
                                String values = distinguished.getNodeValue();
                                if (!"".equals(values)) {
                                    for (String s : values.split(",( )?")) {
                                        ObjectNode subrecordField = mapper.createObjectNode();
                                        subrecordField.put("name", s);
                                        subrecordField.put("type", getSegmentsFieldSchemaJson());
                                        subrecordFields.add(subrecordField);
                                    }
                                }
                            }

                            // Qualified fields requiring a second value to be meaningful, so resulting in a more complex field
                            distinguished = fieldAttributes.getNamedItem(QUALIFIED_FIELDS);
                            if (distinguished != null) {
                                String values = distinguished.getNodeValue();
                                if (!"".equals(values)) {
                                    for (String s : values.split(",( )?")) {
                                        ObjectNode subrecordField = mapper.createObjectNode();
                                        subrecordField.put("name", s);
                                        subrecordField.put("type", getSegmentsFieldSchemaJson());
                                        subrecordFields.add(subrecordField);
                                    }
                                }
                            }

                            // Provide an unmapped field for holding segment data for which there are no mappings
                            unmapped = mapper.createObjectNode();
                            unmapped.put("name", UNMAPPED);
                            unmapped.put("type", getUnmappedFieldsSchemaJson());
                            subrecordFields.add(unmapped);

                            nullableField.add(subrecord);

                            // Note that we've defined this type
                            symbolCounts.put(subrecordType, 1);
                        } else {

                            // Just reference the already defined type
                            nullableField.add(subrecordType);
                        }
                    }

                    fieldObject.put("type", nullableField);

                    fields.add(fieldObject);
                }
            }
        }

        return objectNode;
    }

    public ObjectNode constructAvroJsonFromXmlSchema(String namespace, Document xmlSchema) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IOException {

        Element doc = xmlSchema.getDocumentElement();
        return constructAvroJsonFromXmlSchema(namespace, doc, null);
    }


    /**
     * constructAvroJsonFromXmlSchema takes an Cf X12 schema in XML format and constructs a JSON Object
     * representing the equivalent Avro schema record type.  The collection of JSON objects must be built into a
     * complete AvroSchema before use by a serializer or deserializer.
     *
     * @param xmlFile
     * @return
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     */
    public ObjectNode constructAvroJsonFromXmlSchema(String namespace, File xmlFile) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IOException, ParserConfigurationException, SAXException {

        return constructAvroJsonFromXmlSchema(namespace, new FileInputStream(xmlFile));
    }

    public ObjectNode constructAvroJsonFromXmlSchema(String namespace, InputStream inputStream) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IOException, SAXException, ParserConfigurationException {

        final Document document = parser.loadXmlSchema(inputStream);
        return constructAvroJsonFromXmlSchema(namespace, document);
    }

    /**
     * Is this a primitive Avro type or a record type?
     *
     * @param typeName
     * @return
     */
    boolean isPrimitiveAvroType(String typeName) {

        // TODO: update when we handle more than string and record types
        return "string".equalsIgnoreCase(typeName) || "zSEGMENTS".equalsIgnoreCase(typeName);
    }

    /**
     * Given an record type entry containing a record definition, parse the fields list and return all referred to types
     * which are not primitive so must be record types.
     *
     * @param recordTypeEntry
     * @return
     */
    Set<String> getReferredRecordTypes(ObjectNode recordTypeEntry) {
        // Return a set of id's which are not in our recognized types so which must be record types
        // TODO: update when we handle more than string types and record types
        HashSet<String> referredRecordTypesSet = new HashSet<>();
        ArrayNode fieldsArray = (ArrayNode)recordTypeEntry.get("fields");
        Iterator<JsonNode> fieldsItr = fieldsArray.getElements();
        while(fieldsItr.hasNext()) {
            ObjectNode fieldNode = (ObjectNode)fieldsItr.next();
            String fieldType = fieldNode.get("type").getTextValue();
            if(!isPrimitiveAvroType(fieldType)) {
                referredRecordTypesSet.add(Avro837Util.makeAvroName(fieldType));
            }
            // Otherwise NOP, don't add the type as a referred type

        }
        return referredRecordTypesSet;
    }

    /**
     * Load the given XML schema, define the record types, and yield a complete Avro schema acceptable by an Avro parser.
     *
     * @param namespace
     * @param xmlInputStream
     * @return
     */
    public String constructAvroSchemaFromXmlSchema(String namespace, InputStream xmlInputStream) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IOException, SAXException, ParserConfigurationException, AvroSchemaParsingException {

        // Parse the xml definition and create the record type JSON objects
        final Document document = parser.loadXmlSchema(xmlInputStream);
        ObjectNode schemaDef = constructAvroJsonFromXmlSchema(namespace, document);

        // Add in envelope description
        ObjectNode envelopeRecord = mapper.createObjectNode();
        envelopeRecord.put("type", "record");
        envelopeRecord.put("namespace", namespace);
        envelopeRecord.put("name", "zX12Envelope");
        ArrayNode fieldsArray = mapper.createArrayNode();
        envelopeRecord.put("fields", fieldsArray);
        ObjectNode field = mapper.createObjectNode();
        field.put("name", "source_filename");
        field.put("type", "string");
        fieldsArray.add(field);
        field = mapper.createObjectNode();
        field.put("name", "ingested_timestamp");
        field.put("type", "long");
        fieldsArray.add(field);
        field = mapper.createObjectNode();
        field.put("name", "organization");
        field.put("type", "string");
        fieldsArray.add(field);
        field = mapper.createObjectNode();
        field.put("name", "x12Data");

        // Subobjects are nullable
        ArrayNode nullableSubobjectNode = mapper.createArrayNode();
        nullableSubobjectNode.add("null");
        nullableSubobjectNode.add(schemaDef);

        field.put("type", nullableSubobjectNode);
        fieldsArray.add(field);

        // Serialize to string
        String jsonSchema = envelopeRecord.toString();
        // System.out.println("JSON Avro Schema:"+jsonSchema);

        return jsonSchema;
    }

    public static void main(String[] args) {

        if(args.length<3) {
            System.out.println("Usage: java net.explorys.samhat.AvroSchemaGenerator <xml schema definition> <namespace> <output file>");
        } else {

            String xmlSchemaFilename = args[0];
            String namespace = args[1];
            String outputFilename = args[2];

            try {

                AvroSchemaGenerator instance = new AvroSchemaGenerator();
                InputStream schemaDefinition = new FileInputStream(xmlSchemaFilename);
                String jsonSchema = instance.constructAvroSchemaFromXmlSchema(namespace, schemaDefinition);

                System.out.println("Writing the Avro schema file to "+outputFilename);
                // Write the schema to outputFilename
                BufferedWriter wtr = new BufferedWriter( new FileWriter(outputFilename));
                wtr.write(jsonSchema);
                wtr.close();

                System.out.println("Checking compiled schema with Avro's Schema.Parser...");

                // Try to compile the schema
                Schema.Parser avroParser = new Schema.Parser();
                Schema schemaCooked = avroParser.parse(jsonSchema);

                System.out.println("Done.");

            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
