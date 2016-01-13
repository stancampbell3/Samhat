package net.explorys.samhat.avro;

import net.explorys.samhat.avro.mr.Avro837FlatToExpandedConverter;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;

import java.io.*;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.file.*;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/**
 * Created by stan.campbell on 9/2/15.
 *
 * This utility allows us to read and write 837 records to Avro.
 * It's primarily used for testing purposes to generate and validate test data for the MR jobs.
 */
public class Avro837Util implements Serializable {

    String x12FlatDataSchemaPath;

    public Avro837Util(String x12FlatDataSchemaPath) {
        this.x12FlatDataSchemaPath = x12FlatDataSchemaPath;
    }

    public String getX12FlatDataSchemaPath() {
        return x12FlatDataSchemaPath;
    }

    public Schema getX12FlatDataSchema() throws IOException {
        return (new Schema.Parser()).parse(new File(x12FlatDataSchemaPath));
    }

    /**
     * Iterate over the x12837Data, saving each Collection of Byte as a record in the Avro formatted file.
     * Returns the number of records written.
     *
     * @param sourceFile            for example "BigHospital_Subsystem_1441214822957.edi"
     * @param ingestionTimestamp    for example 1441229222420
     * @param organization          for example "80"
     * @param x12837DataItr         an <pre>Iterator<ByteBuffer></pre> providing the separate x837 records
     * @param fileSystemURI         for example hdfs://localhost:54310
     * @param outputPath            for example /users/scampbell/flat837/80/
     * @return                      the number of records written to the file
     * @throws IOException
     */
    public long writeX12FlatData(String sourceFile, long ingestionTimestamp,
                                 String organization, Iterator<ByteBuffer> x12837DataItr,
                                 URI fileSystemURI, String outputPath) throws IOException {

        FileSystem fileSystem = FileSystems.getFileSystem(fileSystemURI);
        Path filePath = fileSystem.getPath(outputPath, makeFilename(organization, ingestionTimestamp));
        File outputFile = filePath.toFile();

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>();
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
        dataFileWriter.create(getX12FlatDataSchema(), outputFile);

        long recordCount = 0L;

        while(x12837DataItr.hasNext()) {
            ByteBuffer data = x12837DataItr.next();

            GenericRecord x837 = new GenericData.Record(getX12FlatDataSchema());
            x837.put("source_filename", sourceFile);
            x837.put("ingested_timestamp", ingestionTimestamp);
            x837.put("organization", organization);
            x837.put("data", data);

            dataFileWriter.append(x837);

            recordCount+=1;
        }

        dataFileWriter.close();
        return recordCount;
    }

    public long writeX12FlatData(String sourceFile, long ingestionTimestamp,
                                 String organization, ByteBuffer data,
                                 URI fileSystemURI, String outputPath) throws IOException {

        FileSystem fileSystem = FileSystems.getFileSystem(fileSystemURI);
        Path filePath = fileSystem.getPath(outputPath, makeFilename(organization, ingestionTimestamp));
        File outputFile = filePath.toFile();

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>();
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
        Schema x12FlatDataSchema = getX12FlatDataSchema();
        dataFileWriter.create(x12FlatDataSchema, outputFile);

        GenericRecord x837 = new GenericData.Record(x12FlatDataSchema);
        x837.put("source_filename", sourceFile);
        x837.put("ingested_timestamp", ingestionTimestamp);
        x837.put("organization", organization);
        x837.put("data", data);

        dataFileWriter.append(x837);
        dataFileWriter.close();
        return 1L;
    }

    public long writeX12FlatData(String sourceFile, long ingestionTimestamp,
                                 String organization, ByteBuffer data,
                                 String outputFilename) throws IOException {

        File outputFile = new File(outputFilename);

        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>();
        DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<>(datumWriter);
        Schema x12FlatDataSchema = getX12FlatDataSchema();
        dataFileWriter.create(x12FlatDataSchema, outputFile);

        GenericRecord x837 = new GenericData.Record(x12FlatDataSchema);
        x837.put("source_filename", sourceFile);
        x837.put("ingested_timestamp", ingestionTimestamp);
        x837.put("organization", organization);
        x837.put("data", data);

        dataFileWriter.append(x837);
        dataFileWriter.close();
        return 1L;
    }

    public static String makeAvroName(String rawName) {

        return makeAvroName(rawName, null);
    }

    public static String makeAvroName(String rawName, Map<String,Integer> symbolCounts) {
        // TODO: investigate detecting identical record definitions and substituting a reference in the type
        // Distinguish record types by making each unique
        String cookedName;
        StringBuffer buf = new StringBuffer("z").append(rawName);
        if(null!=symbolCounts) {
            if (symbolCounts.containsKey(rawName)) {
                int count = symbolCounts.get(rawName) + 1;
                buf.append("_").append(count);
                symbolCounts.put(rawName, count);
            } else {
                symbolCounts.put(rawName, 0); // Raw, Raw_1, Raw_2, etc.
            }
        }
        cookedName = buf.toString();
        return cookedName;
    }

    /**
     * Given the organization and the ingestion timestamp, create a unique filename.  We use the UUID to ensure
     * that if we are writing to HDFS, no two instances will be writing to the same file.
     *
     * @param organization
     * @param timestamp
     * @return
     */
    static String makeFilename(String organization, long timestamp) {

        return (new StringBuffer()).append("x837_flat_").
                append("_").
                append(organization).
                append("_").
                append(timestamp).
                append("_").
                append((UUID.randomUUID()).toString()).
                append(".avro").toString();
    }

    /**
     * Utility.  Read the file at path, yielding a String with its contents.
     *
     * @param path
     * @return
     * @throws IOException
     */
    static String loadResourceDocument(String path) throws IOException {

        StringBuilder bld = new StringBuilder();
        BufferedReader rdr = new BufferedReader(new FileReader(path));
        String line;
        do {
            line = rdr.readLine();
            bld.append(line);
            bld.append("\n");
        } while(line!=null);
        return bld.toString();
    }

    public static void main(String[] args) {

        try {

            // TODO: better args parsing
            if(args.length<5) {

                System.out.println("Usage: \n");
                System.out.println("java -cp Samhat.jar net.explorys.samhat.avro.Avro837Util flat <flatSchemaPath> <edi path> <org name> <org id> <remotefilename> <output path>");
                System.out.println("OR");
                System.out.println("java -cp Samhat.jar net.explorys.samhat.avro.Avro837Util expand <avroExpandedSchemaPath> <xmlSchemaPath> <inputPath> <outputPath>");
            } else {
                if("flat".equalsIgnoreCase(args[0])) {

                    String flatDataSchemaPath = args[1]; // "src/test/resources/Flat837.avsc";
                    String ediPath = args[2]; // "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-ambulance.edi";
                    String orgName = args[3]; // "BigHospital_Subsystem"

                    // TODO: why is orgId fixed
                    String orgId = args[4]; // "80"
                    String sourceFilename = args[5]; // SomeRemoteFilename
                    String outputPath = args[6];

                    String dataDoc = loadResourceDocument(ediPath);
                    byte[] bytes = dataDoc.getBytes("utf-8");
                    ByteBuffer data = ByteBuffer.wrap(bytes);

                    Avro837Util util = new Avro837Util(flatDataSchemaPath);

                    util.writeX12FlatData(sourceFilename, System.currentTimeMillis(), orgName, data, outputPath);
                } else {

                    String avroExpandedSchemaPath = args[1];
                    String xmlSchemaPath = args[2];
                    String inputPath = args[3];
                    String outputPath = args[4];

                    // Deserialize the Flat837
                    DatumReader<Flat837> flat837DatumReader = new SpecificDatumReader<Flat837>(Flat837.class);
                    DataFileReader<Flat837> dataFileReader = new DataFileReader<Flat837>(new File(inputPath), flat837DatumReader);

                    // TODO: handle no "next"
                    Flat837 flat837 = dataFileReader.next();

                    InputStream avroExpandedSchemaStr = new FileInputStream(avroExpandedSchemaPath);
                    InputStream xmlSchemaStr = new FileInputStream(xmlSchemaPath);

                    Avro837FlatToExpandedConverter converter = new Avro837FlatToExpandedConverter(xmlSchemaStr, avroExpandedSchemaStr);

                    GenericRecord expanded837 = converter.expand837(flat837);

                    // Write the expanded837 to outputPath
                    DatumWriter<GenericRecord> expandedDatumWriter = new GenericDatumWriter<GenericRecord>(converter.getX837AvroSchema());
                    DataFileWriter<GenericRecord> expandedDataFileWriter = new DataFileWriter<GenericRecord>(expandedDatumWriter);
                    expandedDataFileWriter.create(converter.getX837AvroSchema(), new File(outputPath));
                    expandedDataFileWriter.append(expanded837);
                    expandedDataFileWriter.close();

                }
            }
        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
