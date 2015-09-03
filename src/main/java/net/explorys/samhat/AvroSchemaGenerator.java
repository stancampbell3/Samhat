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

    private ObjectMapper mapper;
    private CfSchemaParser parser;
    private JsonNode segmentsFieldEntry;  // Inserted into the fields list
    private JsonNode segmentsTypeEntry;   // Inserted as the type of a leaf field like "1000A"

    public AvroSchemaGenerator() {
        this.mapper = new ObjectMapper();
        this.parser = new CfSchemaParser();
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public AvroSchemaGenerator(ObjectMapper mapper, CfSchemaParser parser) {
        this.mapper = mapper;
        this.parser = parser;
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public AvroSchemaGenerator(CfSchemaParser parser) {
        this.parser = parser;
        this.mapper = new ObjectMapper();
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public AvroSchemaGenerator(ObjectMapper mapper) {
        this.mapper = mapper;
        this.parser = new CfSchemaParser();
        this.segmentsFieldEntry = getSegmentsAvroTypeDefinition(mapper);
        this.segmentsTypeEntry = getSegmentsNamedAvroTypeDefinition(mapper);
    }

    public static Schema getSegmentsArraySchemaDefinition(Schema.Parser parser) {
        try {
            return parser.parse(SEGMENTS_ARRAY_SCHEMA_DEFINITION);
        } catch (Exception e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of SEGMENTS_ARRAY_SCHEMA_DEFINITION is faulty!", e);
        }
    }

    public static JsonNode getSegmentsAvroTypeDefinition(ObjectMapper mapper) {
        try {
            return mapper.readValue(SEGMENTS_AVRO_TYPE_DEFINITION, JsonNode.class);
        } catch (IOException e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of SEGMENTS_AVRO_TYPE_DEFINITION is faulty!", e);
        }
    }

    public static JsonNode getSegmentsNamedAvroTypeDefinition(ObjectMapper mapper) {
        try {
            return mapper.readValue(SEGMENTS_NAMED_AVRO_TYPE_DEFINITION, JsonNode.class);
        } catch (IOException e){

            // This should never occur because the field definition is static
            // However, if the definition is somehow changed and not tested (heaven forfend!)
            throw new RuntimeException("Definition of SEGMENTS_NAMED_AVRO_TYPE_DEFINITION is faulty!", e);
        }
    }

    List<ObjectNode> constructAvroJsonFromXmlSchema(List<ObjectNode> nodesList, Node elem) {

        // If nodesList is null, construct it
        if(null==nodesList) {
            nodesList = new LinkedList<ObjectNode>();
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
            if("child".equalsIgnoreCase(child.getNodeName())) {

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
                    fieldObject.put("type", "string");  // TODO: get type from attributes
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
        List<ObjectNode> jsonObj = constructAvroJsonFromXmlSchema(null, doc);

        return jsonObj;
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
                ObjectNode fieldEntry = mapper.createObjectNode();
                fieldEntry.put("name", Avro837Util.makeAvroName(fieldNode.get("name").getTextValue()));
                fieldEntry.put("type", Avro837Util.makeAvroName(type));
                schemaFieldsNode.add(fieldEntry);
            }
        }

        return annotatedRecordNode;
    }

    boolean isRecordTypeEntryEqual(ObjectNode rec1, ObjectNode rec2) {

        if(rec1==rec2) {
            return true;
        } else {
            if(null!=rec1 && null!=rec2) {

                // Must be named the same
                if(rec1.get("name").getTextValue().equalsIgnoreCase(rec2.get("name").getTextValue())) {

                    ArrayNode rec1Fields = (ArrayNode)rec1.get("fields");
                    ArrayNode rec2Fields = (ArrayNode)rec2.get("fields");

                    // Must have same size fields list
                    if(rec1Fields.size() != rec2Fields.size()) {
                        return false;
                    } else {

                        // All fields must have the same name and type
                        Iterator<JsonNode> rec1FieldsItr = rec1Fields.getElements();
                        Iterator<JsonNode> rec2FieldsItr = rec2Fields.getElements();
                        while(rec1FieldsItr.hasNext()) {

                            ObjectNode rec1Node = (ObjectNode)rec1FieldsItr.next();
                            ObjectNode rec2Node = (ObjectNode)rec2FieldsItr.next();

                            String nameRec1Field = rec1Node.get("name").getTextValue();
                            String nameRec2Field = rec2Node.get("name").getTextValue();

                            String typeRec1Field = rec1Node.get("type").getTextValue();
                            String typeRec2Field = rec2Node.get("type").getTextValue();

                            if( !(nameRec1Field.equalsIgnoreCase( nameRec2Field ) &&
                                    typeRec1Field.equalsIgnoreCase( typeRec2Field ))){
                                return false;
                            }
                        }

                        return true;  // all names and fields are equal
                    }

                } else {
                    return false;
                }
            } else {
                return false; // only one is non-null
            }
        }
    }

    /**
     * Is this a primitive Avro type or a record type? (Including zSEGMENTS as a primitive as we don't turn it into a record)
     *
     * @param typeName
     * @return
     */
    boolean isPrimitiveAvroType(String typeName) {

        // TODO: update when we handle more than string and record types
        if("string".equalsIgnoreCase(typeName)) {
            return true;
        }
        if("zSEGMENTS".equalsIgnoreCase(typeName)) {
            return true;
        }
        return false;
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
            } else {
                // NOP, don't add the type as a referred type
            }
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

        // Serialize to string
        String jsonSchema = schemaArrayOfDefs.toString();
        System.out.println("JSON Avro Schema:"+jsonSchema);

        return jsonSchema;
    }
}
