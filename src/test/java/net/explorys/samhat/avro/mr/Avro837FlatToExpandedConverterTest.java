package net.explorys.samhat.avro.mr;

import net.explorys.samhat.AvroSchemaGenerator;
import net.explorys.samhat.DeclaredTypeInfo;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * Created by stan.campbell on 9/3/15.
 */
public class Avro837FlatToExpandedConverterTest {

    @Test
    public void canInstantiateDeclaredTypeInformation() {

        try {


            InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional2.xml");

            AvroSchemaGenerator schemaGenerator = new AvroSchemaGenerator();
            String jsonSchema = schemaGenerator.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schema837Pro);
            InputStream schem837ProAvro = new ByteArrayInputStream(jsonSchema.getBytes());

            schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional2.xml");
            Avro837FlatToExpandedConverter instance = new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);

            String xPath = "x12_schema[@name=\"X12\"]/loop[@name=\"ISA\"]/loop[@name=\"GS\"]/loop[@name=\"ST\"]/loop[@name=\"2000A\"]/segment[@name=\"2010AA\"]";
            DeclaredTypeInfo declaredTypeInfo = instance.getDeclaredTypeInfo(xPath);

            assertNotNull(declaredTypeInfo);
            assertEquals(declaredTypeInfo.getClassName(), "net.explorys.samhat.z12.r837.ContactInfo");
            assertEquals(declaredTypeInfo.getArity(), 7);
            assertNotNull(declaredTypeInfo.getPatterns());
            assertEquals(declaredTypeInfo.getPatterns().size(), 4);

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canConvertFlatToExpanded() {

        try {

            InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");

            AvroSchemaGenerator schemaGenerator = new AvroSchemaGenerator();
            String jsonSchema = schemaGenerator.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schema837Pro);
            InputStream schem837ProAvro = new ByteArrayInputStream(jsonSchema.getBytes());

            schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
            Avro837FlatToExpandedConverter instance = new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);

            Flat837 flatAvroRecord = createFlatTestRecordPro();

            GenericRecord expandedAvroRecord = instance.expand837(flatAvroRecord);

            assertNotNull(expandedAvroRecord);

            // TODO: check contents
            // -- should be an envelope
            String data = (String)expandedAvroRecord.get("source_filename");
            assertNotNull(data);
            assertEquals(data, "BigHospital_Subsystem_1441214822957.edi");

            Long longData = (Long)expandedAvroRecord.get("ingested_timestamp");
            assertNotNull(longData);
            assertEquals(longData.longValue(), 1441229222420L);

            data = (String)expandedAvroRecord.get("organization");
            assertNotNull(data);
            assertEquals(data, "80");

            // -- subrecord
            GenericData.Record x12 = (GenericData.Record)expandedAvroRecord.get("data");
            assertNotNull(x12);

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    /**
     * Create a flat GenericRecord (Avro) for testing.
     *
     * @return
     */
    Flat837 createFlatTestRecordPro() throws IOException {

        String data = loadResourceDocument("/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-commercial-health-insurance.edi");
        ByteBuffer dataAsBytes = ByteBuffer.wrap(data.getBytes());

        Flat837 outRecord = Flat837.newBuilder().
                setSourceFilename("BigHospital_Subsystem_1441214822957.edi").
                setOrganization("80").
                setIngestedTimestamp(1441229222420L).
                setData(dataAsBytes).
                build();

        return outRecord;
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
