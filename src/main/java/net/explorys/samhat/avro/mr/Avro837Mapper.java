package net.explorys.samhat.avro.mr;

import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroCollector;
import org.apache.avro.mapred.AvroMapper;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Reporter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Derives from SourceDataStaging's test, so absolutely lifted from d miel's code
 */
public class Avro837Mapper extends AvroMapper<Flat837, GenericRecord> {

    private Avro837FlatToExpandedConverter converter = null;

    @Override
    public void configure(JobConf jobConf) {
        super.configure(jobConf);

        try {
            // TODO: figure out how we want to provide the needed schema files to the converter

            FileSystem fileSystem = FileSystem.get(jobConf);

            InputStream cfSchemaXml;
            try {
                // TODO: pull from job configuration not hardcoded path
                Path path = new Path("x12_schema_837_professional.xml");
                cfSchemaXml = fileSystem.open(path);
            } catch (FileNotFoundException fnf) {
                try {
                    // Check the classpath (used for testing)
                    cfSchemaXml = Thread.currentThread().getContextClassLoader()
                            .getResourceAsStream("x12_schema_837_professional.xml");
                } catch(Exception e) {
                    throw e;
                }
            }

            InputStream avroSchema;
            try {
                Path path = new Path("x12_schema_837_professional_avro.json");
                avroSchema = fileSystem.open(path);
            } catch (FileNotFoundException fnf) {
                try {
                    // Check the classpath (used for testing)
                    avroSchema = Thread.currentThread().getContextClassLoader()
                            .getResourceAsStream("x12_schema_837_professional_avro.json");
                } catch(Exception e) {
                    throw e;
                }
            }

            converter = new Avro837FlatToExpandedConverter(cfSchemaXml, avroSchema);

        } catch (Exception e) {
            throw new RuntimeException("Error in configuring Avro837Mapper: "+e, e);
        }
    }

    public void map(Flat837 inRecord, AvroCollector<GenericRecord> collector, Reporter reporter) throws IOException {

        try {

            GenericRecord outRecord = converter.expand837(inRecord);
            collector.collect(outRecord);
        } catch (Exception e) {
            throw new RuntimeException("Error in mapping: "+e,e);
        }
    }

}