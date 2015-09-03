package net.explorys.samhat.avro;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.file.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/**
 * Created by stan.campbell on 9/2/15.
 *
 * This utility allows us to read and write 837 records to Avro.
 * It's primarily used for testing purposes to generate and validate test data for the MR jobs.
 */
public class Avro837Util {

    private Schema x12FlatDataSchema;

    public Avro837Util(String x12FlatDataSchemaPath) throws IOException {

        x12FlatDataSchema = (new Schema.Parser()).parse(new File(x12FlatDataSchemaPath));
    }

    public Avro837Util(InputStream x12FlatDataSchemaStream) throws IOException {

        x12FlatDataSchema = (new Schema.Parser()).parse(x12FlatDataSchemaStream);
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
        dataFileWriter.create(x12FlatDataSchema, outputFile);

        long recordCount = 0L;

        while(x12837DataItr.hasNext()) {
            ByteBuffer data = x12837DataItr.next();

            GenericRecord x837 = new GenericData.Record(x12FlatDataSchema);
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

    /**
     * Given the organization and the ingestion timestamp, create a unique filename.  We use the UUID to ensure
     * that if we are writing to HDFS, no two instances will be writing to the same file.
     *
     * @param organization
     * @param timestamp
     * @return
     */
    String makeFilename(String organization, long timestamp) {

        return (new StringBuffer()).append("x837_flat_").
                append("_").
                append(organization).
                append("_").
                append(timestamp).
                append("_").
                append((UUID.randomUUID()).toString()).
                append(".avro").toString();
    }
}
