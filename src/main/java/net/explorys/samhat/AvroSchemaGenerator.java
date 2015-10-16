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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by stan.campbell on 8/31/15.
 */
public class AvroSchemaGenerator {

    public static final String SEGMENTS_AVRO_TYPE_DEFINITION = "{ \"name\" : \"zSEGMENTS\", \"type\" : [ \"null\", { \"type\" : \"array\", \"items\" : \"string\" } ] }";
    public static final String SEGMENTS_NAMED_AVRO_TYPE_DEFINITION = "[ \"null\", { \"type\" : \"array\", \"items\" : \"string\" } ]";
    public static final String SEGMENTS_ARRAY_SCHEMA_DEFINITION = "{ \"type\" : \"array\", \"items\" : \"string\" }";
    public static final String X12_ENVELOPE_SCHEMA_DEFINITION = "{    \"type\": \"record\",    \"namespace\": \"net.explorys.samhat.z12.r837\",    \"name\": \"zX12Envelope\",    \"fields\": [    {    \"name\" : \"source_filename\",    \"type\" : \"string\"    },    {    \"name\" : \"ingested_timestamp\",    \"type\" : \"long\"    },    {    \"name\" : \"organization\",    \"type\" : \"string\"    },    {    \"name\" : \"data\",    \"type\" : \"zX12\"    }        ]   }";

    private ObjectMapper mapper;
    private XmlBasedCfSchemaParser parser;
    private ObjectNode segmentsFieldEntry;  // Inserted into the fields list
    private JsonNode segmentsTypeEntry;   // Inserted as the type of a leaf field like "1000A"

    public AvroSchemaGenerator() {
        this.mapper = new ObjectMapper();
        this.parser = new XmlBasedCfSchemaParser();
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public AvroSchemaGenerator(ObjectMapper mapper, XmlBasedCfSchemaParser parser) {
        this.mapper = mapper;
        this.parser = parser;
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public AvroSchemaGenerator(XmlBasedCfSchemaParser parser) {
        this.parser = parser;
        this.mapper = new ObjectMapper();
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public AvroSchemaGenerator(ObjectMapper mapper) {
        this.mapper = mapper;
        this.parser = new XmlBasedCfSchemaParser();
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    /**
     * Handy method for returning the Avro schema definition for a standard segments array type.
     *
     * @param parser
     * @return
     */
    public static Schema getSegmentsArraySchemaDefinition(Schema.Parser parser) {
        try {
            return parser.parse(SEGMENTS_ARRAY_SCHEMA_DEFINITION);
        } catch (Exception e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of SEGMENTS_ARRAY_SCHEMA_DEFINITION is faulty!", e);
        }
    }

    /**
     * Handy method for returning the JSON nodes necessary to specify the Avro for a standard Segments field for
     * a loop.
     *
     * @param mapper
     * @return
     */
    public static ObjectNode getSegmentsAvroTypeDefinition(ObjectMapper mapper) {
        try {
            return mapper.readValue(SEGMENTS_AVRO_TYPE_DEFINITION, ObjectNode.class);
        } catch (IOException e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of SEGMENTS_AVRO_TYPE_DEFINITION is faulty!", e);
        }
    }

    public static ObjectNode getX12EnvelopeSchemaDefinition(ObjectMapper mapper) {
        try {
            return mapper.readValue(X12_ENVELOPE_SCHEMA_DEFINITION, ObjectNode.class);
        } catch (IOException e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of X12_ENVELOPE_SCHEMA_DEFINITION is faulty!", e);
        }
    }

    /**
     * Handy method for returning the JSON nodes necessary to specify the Avro for a named type (a Record def).
     *
     * @param mapper
     * @return
     */
    public static JsonNode getSegmentsNamedAvroTypeDefinition(ObjectMapper mapper) {
        try {
            return mapper.readValue(SEGMENTS_NAMED_AVRO_TYPE_DEFINITION, JsonNode.class);
        } catch (IOException e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of SEGMENTS_NAMED_AVRO_TYPE_DEFINITION is faulty!", e);
        }
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
     * Build our internal representation of an Avro schema from the specification residing in an XML DOM
     * tree from the Node elem.  Recursively walk the schema and build the intermediate JSON tree which
     * will be annotated to create a full Avro schema.
     *
     * @param nodesList
     * @param elem
     * @return
     */
    List<ObjectNode> constructAvroJsonFromXmlSchema(List<ObjectNode> nodesList, Node elem) {

        // If nodesList is null, construct it
        if(null==nodesList) {
            nodesList = new LinkedList<>();
        }

        // Construct a new node
        ObjectNode objectNode = mapper.createObjectNode();
        nodesList.add(objectNode);

        NamedNodeMap attributes = elem.getAttributes();
        objectNode.put("name", attributes.getNamedItem("name").getTextContent());

        ArrayNode fields = mapper.createArrayNode();
        objectNode.put("fields", fields);

        // Add in the zSEGMENTS field to hold unparsed data
        fields.add(segmentsFieldEntry);

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
                    String fieldType = fieldAttributes.getNamedItem("name").getNodeValue();
                    ObjectNode fieldObject = mapper.createObjectNode();
                    fieldObject.put("name", fieldType);
                    fieldObject.put("type", fieldType);
                    fields.add(fieldObject);

                    // Process the child object
                    constructAvroJsonFromXmlSchema(nodesList, child);
                } else {

                    // If a nested element has no children, it's a segment so create an field
                    NamedNodeMap fieldAttributes = child.getAttributes();
                    String fieldName = fieldAttributes.getNamedItem("name").getNodeValue();
                    ObjectNode fieldObject = mapper.createObjectNode();
                    fieldObject.put("name", fieldName);
                    // TODO: this will be sensitive as it's checked throughout the code, should handle other types based on attributes
                    fieldObject.put("type", "string");
                    fields.add(fieldObject);
                }
            }
        }

        return nodesList;
    }

    ObjectNode constructAvroJsonFromXmlSchema(String namespace, Node elem, Map<String,Integer>symbolCounts) {

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

        // Add in the zSEGMENTS field to hold unparsed data
        fields.add(segmentsFieldEntry);

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
                    fieldObject.put("type", fieldObjectNode);
                    fields.add(fieldObject);
                } else {

                    // If a nested element has no children, it's a segment so create an field
                    NamedNodeMap fieldAttributes = child.getAttributes();
                    rawName = fieldAttributes.getNamedItem("name").getNodeValue();
                    ObjectNode fieldObject = mapper.createObjectNode();
                    // Primitive fields don't have to be distinguished only record types above
                    fieldObject.put("name", Avro837Util.makeAvroName(rawName));
                    // TODO: this will be sensitive as it's checked throughout the code, should handle other types based on attributes
                    fieldObject.put("type", "string");
                    fields.add(fieldObject);
                }
            }
        }

        return objectNode;
    }

    public ObjectNode constructAvroJsonFromXmlSchema(String namespace, Document xmlSchema) {

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
    public ObjectNode constructAvroJsonFromXmlSchema(String namespace, File xmlFile) throws IOException, ParserConfigurationException, SAXException {

        return constructAvroJsonFromXmlSchema(namespace, new FileInputStream(xmlFile));
    }

    public ObjectNode constructAvroJsonFromXmlSchema(String namespace, InputStream inputStream) throws IOException, SAXException, ParserConfigurationException {

        final Document document = parser.loadXmlSchema(inputStream);
        return constructAvroJsonFromXmlSchema(namespace, document);
    }

    /**
     * Is this a primitive Avro type or a record type? (Including zSEGMENTS as a primitive as we don't turn it into a record)
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
    public String constructAvroSchemaFromXmlSchema(String namespace, InputStream xmlInputStream) throws IOException, SAXException, ParserConfigurationException, AvroSchemaParsingException {

        // Parse the xml definition and create the record type JSON objects
        final Document document = parser.loadXmlSchema(xmlInputStream);
        ObjectNode schemaDef = constructAvroJsonFromXmlSchema(namespace, document);

        // TODO: For variants, introduce distinguished subtypes (maybe use the full path to the record to qualify?

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
        field.put("name", "data");

        // Subobjects are nullable
        ArrayNode nullableSubobjectNode = mapper.createArrayNode();
        nullableSubobjectNode.add("null");
        nullableSubobjectNode.add(schemaDef);

        field.put("type", nullableSubobjectNode);
        fieldsArray.add(field);

        // Serialize to string
        String jsonSchema = envelopeRecord.toString();
        System.out.println("JSON Avro Schema:"+jsonSchema);

        return jsonSchema;
    }
}
