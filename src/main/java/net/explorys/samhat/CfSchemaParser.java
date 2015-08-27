package net.explorys.samhat;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.pb.x12.Cf;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by stan.campbell on 8/26/15.
 */
public class CfSchemaParser {

    protected Cf processSchema(Cf schema, Node current) throws CfSchemaParsingException {
        if(null==schema) {
            schema = new Cf("X12"); // top level
        } else {
            // push down one level
            schema = schema.addChild(current.getNodeName(), current.getNodeName());
        }
        NodeList children = current.getChildNodes();
        for(int i=0;i<children.getLength();i++) {
            Node child = children.item(i);
            final NamedNodeMap attributes = child.getAttributes();
            Cf childSchema = null;
            if(null == attributes || attributes.getLength() < 3) {
                childSchema = schema.addChild(child.getNodeName(),child.getNodeName());
            } else {
                childSchema = schema.addChild(attributes.getNamedItem("name").getNodeValue(),
                        attributes.getNamedItem("segment").getNodeValue(),
                        attributes.getNamedItem("segmentQual").getNodeValue(),
                        Integer.parseInt(attributes.getNamedItem("segmentQualPos").getNodeValue()));
            }
            if(null==childSchema) {
                // failed to construct the child, throw an error
                throw new CfSchemaParsingException("Error in parsing on child node: "+child.getNodeName());
            }
            if(child.hasChildNodes()) {
                // Dive into the subnodes (the loop members)
                processSchema(childSchema, child);
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
            Cf schema = new Cf(elem.getAttribute("name"));
            processSchema(schema, elem);

            return schema;

        } catch (ParserConfigurationException e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:"+e);
        } catch (SAXException e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:"+e);
        } catch (IOException e) {
            throw new CfSchemaParsingException("Couldn't parse Cf from the spec:"+e);
        }
    }
}
