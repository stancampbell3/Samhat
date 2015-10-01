package net.explorys.samhat.avro.mr;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;

/**
 * Created by stan.campbell on 9/3/15.
 */
public class Avro837FlatToExpandedConverterTest {

    // TODO: fix this test
    /*@Test
    public void canConvertFlatToExpanded() {

        try {

            InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
            InputStream schem837ProAvro = getClass().getResourceAsStream("/x12_schema_837_professional_avro.json");

            Avro837FlatToExpandedConverter instance = new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);

            GenericRecord flatAvroRecord = createFlatTestRecordPro();

            GenericRecord expandedAvroRecord = instance.expand837(flatAvroRecord);

            assertNotNull(expandedAvroRecord);

            // TODO: check contents

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }*/

    /**
     * Create a flat GenericRecord (Avro) for testing.
     *
     * @return
     */
    GenericRecord createFlatTestRecordPro() throws IOException {

        Schema avroSchemaFlat = (new Schema.Parser()).parse(getClass().getResourceAsStream("/Flat837.avsc"));

        GenericRecord outRecord = new GenericData.Record(avroSchemaFlat);
        outRecord.put("source_filename", "BigHospital_Subsystem_1441214822957.edi");
        outRecord.put("ingested_timestamp", 1441229222420L);
        outRecord.put("organization", "80");
        String data = loadResourceDocument("/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-commercial-health-insurance.edi");
        ByteBuffer dataAsBytes = ByteBuffer.wrap(data.getBytes());
        outRecord.put("data", dataAsBytes);

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
