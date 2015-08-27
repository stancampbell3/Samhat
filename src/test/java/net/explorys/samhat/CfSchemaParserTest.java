package net.explorys.samhat;

import static org.junit.Assert.*;
import org.junit.Test;
import org.pb.x12.Cf;
import org.pb.x12.X12;
import scala.Option;

import java.io.*;

/**
 * Created by stan.campbell on 8/26/15.
 */
public class CfSchemaParserTest {

    CfSchemaParser instance = new CfSchemaParser();
    X12toAvroUtil parser = new X12toAvroUtil();

    @Test
    public void canParseString() {

        try {
            Cf schema = instance.parseSchemaFromXml(getClass().getResourceAsStream("/x12_schema_837_professional.xml"));

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
            boolean result = X12toAvroUtil.areEqual(x12ParsedOpt.get(), x12ParsedOpt2.get());
            assertTrue(result);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    String loadResourceDocument(String path) throws IOException {

        StringBuilder bld = new StringBuilder();
        BufferedReader rdr = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
        String line = null;
        do {
            line = rdr.readLine();
            bld.append(line+"\n");
        } while(line!=null);
        return bld.toString();
    }
}
