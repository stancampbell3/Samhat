package net.explorys.samhat;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.pb.x12.Cf;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * CfSchemaParser
 *
 * The parser will load a Cf schema definition from the provided InputStream.
 * The schema definition is given in XML and consists of a starting and ending x12_schema tag,
 * a series of nested <child../> entries with at least "name" and "segment" attributes but possibly
 * including "segmentQual" and "segmentQualPos" attributes.  <child../> elements may have nested
 * <child../> elements to allow for specification of loops.  Single <child../> elements will be treated
 * as segments in the X12 schema.
 */
public class CfSchemaParser {

    private ObjectMapper mapper = new ObjectMapper();

    /**
     * Internally, processSchema walks the XML document whose head is current and returns
     * an equivalent X12 schema as a Cf instance.
     *
     * @param schema
     * @param current
     * @return
     * @throws CfSchemaParsingException
     */
    Cf processSchema(Cf schema, Node current) throws CfSchemaParsingException {

        if(null==schema) {
            schema = new Cf("X12"); // top level
        }
        NodeList children = current.getChildNodes();
        for(int i=0;i<children.getLength();i++) {
            Node child = children.item(i);

            if("child".equalsIgnoreCase(child.getNodeName())) {
                final NamedNodeMap attributes = child.getAttributes();
                String childNodeName = attributes.getNamedItem("name").getTextContent();
                String segmentName = attributes.getNamedItem("segment").getTextContent();
                Cf childSchema;
                if (attributes.getLength() < 3) {
                    childSchema = schema.addChild(childNodeName, segmentName);
                } else {
                    childSchema = schema.addChild(attributes.getNamedItem("name").getNodeValue(),
                            attributes.getNamedItem("segment").getNodeValue(),
                            attributes.getNamedItem("segmentQual").getNodeValue(),
                            Integer.parseInt(attributes.getNamedItem("segmentQualPos").getNodeValue()));
                }
                if (null == childSchema) {
                    // failed to construct the child, throw an error
                    throw new CfSchemaParsingException("Error in parsing on child node: " + child.getNodeName());
                }
                if (child.hasChildNodes()) {
                    // Dive into the subnodes (the loop members)
                    processSchema(childSchema, child);
                }
            }
        }
        return schema;
    }

    /**
     * Load the x12 schema definition from the given InputStream.
     *
     * @param xmlStream
     * @return
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public Document loadXmlSchema(InputStream xmlStream) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(xmlStream);

        // Normalize to compensate for stray whitespace in the spec
        doc.getDocumentElement().normalize();

        return doc;
    }

    /**
     * parseSchemaFromXml loads the Cf schema definition from the xml input stream and yields an equivalent
     * X12 Cf instance.
     *
     * @param schemaStream
     * @return
     * @throws CfSchemaParsingException
     */
    public Cf parseSchemaFromXml(InputStream schemaStream) throws CfSchemaParsingException {

        try {

            Document doc = loadXmlSchema(schemaStream);

            return parseSchemaFromXml(doc);

        } catch (Exception e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:"+e);
        }
    }

    /**
     * parseSchemaFromXml loads the Cf schema definition from the xml document and yields an equivalent
     * X12 Cf instance.
     *
     * @param doc
     * @return
     * @throws CfSchemaParsingException
     */
    public Cf parseSchemaFromXml(Document doc) throws CfSchemaParsingException {

        try {
            // First element should be "X12"
            String nodeName = doc.getDocumentElement().getNodeName();
            if(!"x12_schema".equalsIgnoreCase(nodeName)) {
                throw new ParserConfigurationException("Outer node is not X12");
            }

            Element elem = doc.getDocumentElement();

            return processSchema(null, elem);

        } catch (Exception e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:"+e);
        }
    }

    /**
     * parseSchemaFromXml loads the Cf schema definition from the file and yields an equivalent
     * X12 Cf instance.
     *
     * @param filename
     * @return
     * @throws CfSchemaParsingException
     * @throws FileNotFoundException
     */
    public Cf parseSchemaFromXml(String filename) throws CfSchemaParsingException, FileNotFoundException {

        InputStream xmlStream = new FileInputStream(filename);
        return parseSchemaFromXml(xmlStream);
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
     * representing the equivalent Avro schema.
     *
     * @param xmlStream
     * @return
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    public List<ObjectNode> constructAvroJsonFromXmlSchema(InputStream xmlStream) throws IOException, SAXException, ParserConfigurationException {

        Document xmlDoc = this.loadXmlSchema(xmlStream);
        return constructAvroJsonFromXmlSchema(xmlDoc);
    }

    public List<ObjectNode> constructAvroJsonFromXmlSchema(File xmlFile) throws IOException, ParserConfigurationException, SAXException {

        return constructAvroJsonFromXmlSchema(new FileInputStream(xmlFile));
    }
}
