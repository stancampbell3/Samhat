package net.explorys.samhat;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.pb.x12.Cf;
import org.w3c.dom.*;
import java.io.InputStream;

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

    protected Cf processSchema(Cf schema, Node current) throws CfSchemaParsingException {

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

    public Cf parseSchemaFromXml(InputStream schemaStream) throws CfSchemaParsingException {

        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(schemaStream);

            // Normalize to compensate for stray whitespace in the spec
            doc.getDocumentElement().normalize();

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
}
