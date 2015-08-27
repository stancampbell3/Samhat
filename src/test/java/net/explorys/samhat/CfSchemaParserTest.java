package net.explorys.samhat;

import static org.junit.Assert.*;

import org.codehaus.jackson.node.ObjectNode;
import org.junit.Test;
import org.pb.x12.Cf;
import org.pb.x12.X12;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import scala.Option;

import java.io.*;
import java.util.List;

/**
 * CfSchemaParserTest
 *
 * Ensure that we can load a Cf schema definition from XML, create a Cf from it, and that it behaves
 * the same as the original Institutional schema from X12ParserConfigurations.getInstitutionalCf()
 */
public class CfSchemaParserTest {

    final CfSchemaParser instance = new CfSchemaParser();
    final X12toAvroUtil parser = new X12toAvroUtil();

    @Test
    public void canParseStream() {

        try {
            Cf schema = instance.parseSchemaFromXml(getClass().getResourceAsStream("/x12_schema_837_professional.xml"));

            assertNotNull(schema);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: " + e);
        }
    }

    @Test
    public void canParseFile()
    {

        try {
            Cf schema = instance.parseSchemaFromXml("./src/test/resources/x12_schema_837_professional.xml");

            assertNotNull(schema);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: " + e);
        }
    }

    @Test
    public void schemasAreEquivalent() {

        try {
            String x12837Path = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi";

            // Parse our schema from XML
            Cf schema = instance.parseSchemaFromXml(getClass().getResourceAsStream("/x12_schema_837_professional.xml"));

            // Load our source 837 in X12 EDI format
            String x12Data1 = loadResourceDocument(x12837Path);
            assertNotNull(x12Data1);

            // Parse it using the regular schema
            Option<X12> x12ParsedOpt = parser.parseX12Document(x12Data1, X12_FORMAT.X12_837_INSTITUTIONAL());
            assertNotNull(x12ParsedOpt);
            assertTrue(x12ParsedOpt.isDefined());

            // Parse it using our hot new schema
            Option<X12> x12ParsedOpt2 = parser.parseX12Document(x12Data1, schema);
            assertNotNull(x12ParsedOpt2);
            assertTrue(x12ParsedOpt2.isDefined());

            // Make sure the parsed documents are equivalent
            // Dump both parsed files in XML
            String xml1 = (x12ParsedOpt.get()).toXML();
            String xml2 = (x12ParsedOpt2.get()).toXML();

            assertTrue( xml1.equals(xml2));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canCreateJsonFromSchema() {

        try {

            InputStream schemaDefinition = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
            List<ObjectNode> jsonObjects = instance.constructAvroJsonFromXmlSchema(schemaDefinition);

            assertNotNull(jsonObjects);

            System.out.println("JSON Schema:" + jsonObjects.toString());

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canLoadXmlDocument() {

        try {

            Document doc = instance.loadXmlSchema(getClass().getResourceAsStream("/x12_schema_837_professional.xml"));

            assertNotNull(doc);

            Element docElem = doc.getDocumentElement();
            assertNotNull(docElem);
            String topNodeName = docElem.getAttribute("name");
            assertEquals( topNodeName, "X12" );

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    /**
     * Utility.  Read the file at path, yielding a String with its contents.
     *
     * @param path
     * @return
     * @throws IOException
     */
    String loadResourceDocument(String path) throws IOException {

        StringBuilder bld = new StringBuilder();
        BufferedReader rdr = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
        String line;
        do {
            line = rdr.readLine();
            bld.append(line);
            bld.append("\n");
        } while(line!=null);
        return bld.toString();
    }
}
