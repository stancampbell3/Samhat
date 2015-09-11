package net.explorys.samhat;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.pb.x12.Cf;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;

/**
 * XmlBasedCfSchemaParser
 *
 * The parser will load a Cf schema definition from the provided InputStream.
 * The schema definition is given in XML and consists of a starting and ending x12_schema tag,
 * a series of nested entries with at least "name" and "segment" attributes but possibly
 * including "segmentQual" and "segmentQualPos" attributes.  <loop../> elements may have nested
 * elements.  Single <segment../> elements will be treated
 * as fields/segments in the X12 schema.
 */
public class XmlBasedCfSchemaParser implements ICfSchemaParser {

    /**
     * Internally, processSchema walks the XML document whose head is current and returns
     * an equivalent X12 schema as a Cf instance.
     *
     * @param schema
     * @param current
     * @return
     * @throws CfSchemaParsingException
     */
    private Cf processSchema(Cf schema, Node current) throws CfSchemaParsingException {

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
    protected Document loadXmlSchema(InputStream xmlStream) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(xmlStream);

        // Normalize to compensate for stray whitespace in the spec
        doc.getDocumentElement().normalize();

        return doc;
    }

    /**
     * parseSchema loads the Cf schema definition from the xml input stream and yields an equivalent
     * X12 Cf instance.
     *
     * @param schemaStream
     * @return
     * @throws CfSchemaParsingException
     */
    @Override
    public Cf parseSchema(InputStream schemaStream) throws CfSchemaParsingException {

        try {

            Document doc = loadXmlSchema(schemaStream);

            return parseSchema(doc);

        } catch (Exception e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:"+e);
        }
    }

    /**
     * parseSchema loads the Cf schema definition from the xml document and yields an equivalent
     * X12 Cf instance.
     *
     * @param doc
     * @return
     * @throws CfSchemaParsingException
     */
    public Cf parseSchema(Document doc) throws CfSchemaParsingException {

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
     * parseSchema loads the Cf schema definition from the file and yields an equivalent
     * X12 Cf instance.
     *
     * @param filename
     * @return
     * @throws CfSchemaParsingException
     * @throws FileNotFoundException
     */
    @Override
    public Cf parseSchema(String filename) throws CfSchemaParsingException, FileNotFoundException {

        InputStream xmlStream = new FileInputStream(filename);
        return parseSchema(xmlStream);
    }
}
