package net.explorys.samhat;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by stan.campbell on 8/31/15.
 */
public class AvroSchemaGenerator {

    private ObjectMapper mapper;
    private CfSchemaParser parser;

    public AvroSchemaGenerator() {
        this.mapper = new ObjectMapper();
        this.parser = new CfSchemaParser();
    }

    public AvroSchemaGenerator(ObjectMapper mapper, CfSchemaParser parser) {
        this.mapper = mapper;
        this.parser = parser;
    }

    public AvroSchemaGenerator(CfSchemaParser parser) {
        this.parser = parser;
        this.mapper = new ObjectMapper();
    }

    public AvroSchemaGenerator(ObjectMapper mapper) {
        this.mapper = mapper;
        this.parser = new CfSchemaParser();
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
                    fieldObject.put("name", "z"+fieldType); // TODO: count occurencesAtThisLevel in case objects are repeated and make unique fieldNames
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
    public ObjectNode annotateJsonRecordNode(ObjectNode jsonObject, String namespace) {

        // Create the array node to hold the definition
        ObjectNode annotatedRecordNode = mapper.createObjectNode();
        annotatedRecordNode.put("type", "record");
        annotatedRecordNode.put("namespace", namespace);
        annotatedRecordNode.put("name", jsonObject.get("name"));

        // Add the fields definition
        ArrayNode fieldsNode = (ArrayNode)jsonObject.get("fields");
        ArrayNode schemaFieldsNode = mapper.createArrayNode();
        annotatedRecordNode.put("fields", schemaFieldsNode);

        Iterator<JsonNode> fieldsNodeElements = fieldsNode.getElements();
        while(fieldsNodeElements.hasNext()) {
            JsonNode fieldNode = fieldsNodeElements.next();
            ObjectNode fieldEntry = mapper.createObjectNode();
            fieldEntry.put("name", fieldNode.get("name"));
            fieldEntry.put("type", fieldNode.get("type"));
            schemaFieldsNode.add(fieldEntry);
        }

        return annotatedRecordNode;
    }

    /**
     * Load the given XML schema, define the record types, and yield a complete Avro schema acceptable by an Avro parser.
     *
     * @param namespace
     * @param xmlInputStream
     * @return
     */
    public String constructAvroSchemaFromXmlSchema(String namespace, InputStream xmlInputStream) throws IOException, SAXException, ParserConfigurationException {

        // Parse the xml definition and create the record type JSON objects
        final Document document = parser.loadXmlSchema(xmlInputStream);
        List<ObjectNode> recordTypes = constructAvroJsonFromXmlSchema(document);

        // This will be an array of record type definitions
        ArrayNode schemaArrayOfDefs = mapper.createArrayNode();

        for(ObjectNode recordTypeEntry : recordTypes) {
            ObjectNode schemaRecordType = annotateJsonRecordNode(recordTypeEntry, namespace);
            schemaArrayOfDefs.add(schemaRecordType);
        }

        // Serialize to string
        return schemaArrayOfDefs.toString();
    }
}
