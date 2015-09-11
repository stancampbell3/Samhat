package net.explorys.samhat;

import net.explorys.common.data.patient.billing.X12ParserConfigurations;
import org.junit.Test;
import org.pb.x12.Cf;
import org.pb.x12.X12;
import scala.Option;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by stan.campbell on 9/10/15.
 */
public class YamlBasedCfSchemaParserTest {

    YamlBasedCfSchemaParser instance = new YamlBasedCfSchemaParser();
    final X12toAvroUtil parser = new X12toAvroUtil();

    @Test
    public void canParseStream() {

        try {

            Cf schema = instance.parseSchema(getClass().getResourceAsStream("/x12_schema_837_professional.yml"));

            assertNotNull(schema);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canParseFile() {

        try {
            Cf schema = instance.parseSchema("./src/test/resources/x12_schema_837_professional.yml");

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

            // Parse our schema from YAML
            Cf schema = instance.parseSchema(getClass().getResourceAsStream("/x12_schema_837_professional.yml"));
            Cf legacySchema = X12ParserConfigurations.getProfessionalCf();

            // Compare both schemas (DEBUG)
            System.out.println("Parsed schema:"+schema);
            System.out.println("Default schema:"+legacySchema);

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

            // DEBUG
            System.out.println(xml1);
            System.out.println(xml2);

            assertTrue( xml1.equals(xml2));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canLoadYamlDocument() {

        try {

            Object schemaYaml = instance.loadYamlSchema(getClass().getResourceAsStream("/x12_schema_837_professional.yml"));

            assertNotNull(schemaYaml);

            Map<String, Object> schemaMap = (Map<String, Object>)schemaYaml;
            assertTrue( schemaMap.containsKey("X12"));
            assertNotNull( schemaMap.get("X12"));
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
