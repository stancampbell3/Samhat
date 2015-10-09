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
    private JsonNode segmentsFieldEntry;  // Inserted into the fields list
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
    public static JsonNode getSegmentsAvroTypeDefinition(ObjectMapper mapper) {
        try {
            return mapper.readValue(SEGMENTS_AVRO_TYPE_DEFINITION, JsonNode.class);
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

    /**
     * constructAvroJsonFromXmlSchema takes an Cf X12 schema in XML format and constructs a JSON Object
     * representing the equivalent Avro schema.
     *
     * @param xmlSchema
     * @return
     */
    public List<ObjectNode> constructAvroJsonFromXmlSchema(Document xmlSchema) {

        Element doc = xmlSchema.getDocumentElement();
        return constructAvroJsonFromXmlSchema(null, doc);
    }

    /**
     * constructAvroJsonFromXmlSchema takes an Cf X12 schema in XML format and constructs a JSON Object
     * representing the equivalent Avro schema record type.  The collection of JSON objects must be built into a
     * complete AvroSchema before use by a serializer or deserializer.
     *
     * @param xmlStream
     * @return
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    public List<ObjectNode> constructAvroJsonFromXmlSchema(InputStream xmlStream) throws IOException, SAXException, ParserConfigurationException {

        Document xmlDoc = parser.loadXmlSchema(xmlStream);
        return constructAvroJsonFromXmlSchema(xmlDoc);
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
    public List<ObjectNode> constructAvroJsonFromXmlSchema(File xmlFile) throws IOException, ParserConfigurationException, SAXException {

        return constructAvroJsonFromXmlSchema(new FileInputStream(xmlFile));
    }

    /**
     * Accept a record type definition as a Json object.  Return a wrapping Json object including namespace,
     * record type name, and field specifications.
     *
     * @param jsonObject
     * @param namespace
     * @return
     */
    public ObjectNode annotateJsonRecordNode(ObjectNode jsonObject, String namespace) throws IOException {

        // Create the array node to hold the definition
        ObjectNode annotatedRecordNode = mapper.createObjectNode();
        annotatedRecordNode.put("type", "record");
        annotatedRecordNode.put("namespace", namespace);
        annotatedRecordNode.put("name", Avro837Util.makeAvroName(jsonObject.get("name").getTextValue()));

        // Add the fields definition
        ArrayNode fieldsNode = (ArrayNode)jsonObject.get("fields");
        ArrayNode schemaFieldsNode = mapper.createArrayNode();
        annotatedRecordNode.put("fields", schemaFieldsNode);

        // Each loop may have zero or more segments which are not named
        // The first field for each loop will be "segments" and is nullable
        schemaFieldsNode.add(segmentsFieldEntry);

        Iterator<JsonNode> fieldsNodeElements = fieldsNode.getElements();
        while(fieldsNodeElements.hasNext()) {
            JsonNode fieldNode = fieldsNodeElements.next();
            String type = fieldNode.get("type").getTextValue();
            // TODO: expand as we handle more Avro types, for now they're all schema defined record types

            if("string".equalsIgnoreCase(type)) {

                // for leaf nodes, we actually need to generate record types holding only an array field.
                // fieldEntry.put("type", type);

                ObjectNode fieldEntry = mapper.createObjectNode();
                fieldEntry.put("name", Avro837Util.makeAvroName(fieldNode.get("name").getTextValue()));
                fieldEntry.put("type", segmentsTypeEntry);
                schemaFieldsNode.add(fieldEntry);
            } else {

                // for non-leaf nodes, make a nullable field of the given type

                ObjectNode fieldEntry = mapper.createObjectNode();
                fieldEntry.put("name", Avro837Util.makeAvroName(fieldNode.get("name").getTextValue()));
                ArrayNode nullableFieldEntryType = mapper.createArrayNode();
                nullableFieldEntryType.add("null");
                nullableFieldEntryType.add(Avro837Util.makeAvroName(type));
                fieldEntry.put("type", nullableFieldEntryType);
                schemaFieldsNode.add(fieldEntry);
            }
        }

        return annotatedRecordNode;
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
        List<ObjectNode> recordTypes = constructAvroJsonFromXmlSchema(document);

        // This will be an array of record type definitions
        ArrayNode schemaArrayOfDefs = mapper.createArrayNode();

        // Create our dependency graph, collapsing any identical record definitions (removing duplicates) and recording dependencies
        DependencyGraph dependencyGraph = new DependencyGraph();
        HashMap<String, ObjectNode> labelToObjectNodeMap = new HashMap<>();
        for(ObjectNode recordTypeEntry : recordTypes) {

            String recordTypeEntryName = Avro837Util.makeAvroName(recordTypeEntry.get("name").getTextValue());
            // Record the node by name (since our DependencyGraph only tracks the labels
            labelToObjectNodeMap.put( recordTypeEntryName, recordTypeEntry );

            // Get its dependencies: the record types to which this node refers in its fields array
            final Set<String> referredRecordTypes = getReferredRecordTypes(recordTypeEntry);

            // Record the dependencies
            dependencyGraph.addDependencyEntries(recordTypeEntryName, referredRecordTypes);
        }

        // Generate the schema defining record types in order
        System.out.println(dependencyGraph);
        List<String> dependenciesInOrder = dependencyGraph.getDependenciesInOrder();
        for(String recordTypeEntryName : dependenciesInOrder) {

            ObjectNode schemaRecordType = annotateJsonRecordNode(labelToObjectNodeMap.get(recordTypeEntryName), namespace);
            schemaArrayOfDefs.add(schemaRecordType);
        }

        // TODO: For variants, introduce distinguished subtypes (maybe use the full path to the record to qualify?

        // Add in envelope description
        ObjectNode envelopeRecordEntry = getX12EnvelopeSchemaDefinition(mapper);
        schemaArrayOfDefs.add(envelopeRecordEntry);

        // Serialize to string
        String jsonSchema = schemaArrayOfDefs.toString();
        System.out.println("JSON Avro Schema:"+jsonSchema);

        return jsonSchema;
    }
}
