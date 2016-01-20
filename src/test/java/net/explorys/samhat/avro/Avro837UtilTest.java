package net.explorys.samhat.avro;

import net.explorys.samhat.avro.mr.Avro837FlatToExpandedConverter;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;

import static org.junit.Assert.*;

/**
 * Created by stan.campbell on 10/16/15.
 */
public class Avro837UtilTest {

    @Test
    public void canWriteFlat837Avro() {

        try {

            // make sure we can write Flat837 instances
            String flatDataSchemaPath = "./src/test/resources/Flat837.avsc";
            String ediPath = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-ambulance.edi";
            String orgName = "BigHospital_Subsystem";

            String orgId = "80";
            String sourceFilename = "SomeRemoteFilename";

            // TODO: add guid to avoid stepping on other test instances
            String outputPath = "/tmp/"+sourceFilename+".avro";

            String dataDoc = loadResourceDocument(ediPath);
            byte[] bytes = dataDoc.getBytes("utf-8");
            ByteBuffer data = ByteBuffer.wrap(bytes);

            Avro837Util util = new Avro837Util(flatDataSchemaPath);

            util.writeX12FlatData(sourceFilename, System.currentTimeMillis(), orgName, data, outputPath);

        } catch(Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canWriteExploded837() {

        try {

            String avroExpandedSchemaPath = "./src/test/resources/x12_schema_837_professional_avro.json";
            String xmlSchemaPath = "./src/test/resources/x12_schema_837_professional.xml";
            String sourceFilename = "SomeRemoteFilename";
            String inputPath = "./src/test/resources/"+sourceFilename+".avro";

            // TODO: add guid to avoid stepping on other instances
            String outputPath = "/tmp/"+sourceFilename+".exploded.avro";

            // Deserialize the Flat837
            DatumReader<Flat837> flat837DatumReader = new SpecificDatumReader<Flat837>(Flat837.class);
            DataFileReader<Flat837> dataFileReader = new DataFileReader<Flat837>(new File(inputPath), flat837DatumReader);

            Flat837 flat837 = dataFileReader.next();

            InputStream avroExpandedSchemaStr = new FileInputStream(avroExpandedSchemaPath);
            InputStream xmlSchemaStr = new FileInputStream(xmlSchemaPath);

            Avro837FlatToExpandedConverter converter = new Avro837FlatToExpandedConverter(xmlSchemaStr, avroExpandedSchemaStr);

            GenericRecord expanded837 = converter.expand837(flat837);

            // Write the expanded837 to outputPath
            DatumWriter<GenericRecord> expandedDatumWriter = new GenericDatumWriter<GenericRecord>(converter.getX837AvroSchema());
            DataFileWriter<GenericRecord> expandedDataFileWriter = new DataFileWriter<GenericRecord>(expandedDatumWriter);
            expandedDataFileWriter.create(converter.getX837AvroSchema(), new File(outputPath));

            System.out.println("EXPANDED: "+expanded837.toString());
            expandedDataFileWriter.append(expanded837);
            expandedDataFileWriter.close();

        } catch(Exception e) {
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
