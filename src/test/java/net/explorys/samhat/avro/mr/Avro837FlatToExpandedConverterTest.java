package net.explorys.samhat.avro.mr;

import net.explorys.samhat.z12.r837.Flat837;
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

    @Test
    public void canConvertFlatToExpanded() {

        try {

            InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
            InputStream schem837ProAvro = getClass().getResourceAsStream("/x12_schema_837_professional_avro.json");

            Avro837FlatToExpandedConverter instance = new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);

            Flat837 flatAvroRecord = createFlatTestRecordPro();

            GenericRecord expandedAvroRecord = instance.expand837(flatAvroRecord);

            assertNotNull(expandedAvroRecord);

            // TODO: check contents

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

        Schema avroSchemaFlat = (new Schema.Parser()).parse(getClass().getResourceAsStream("/Flat837.avsc"));

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
