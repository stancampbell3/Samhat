package net.explorys.samhat.avro.mr;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroCollector;
import org.apache.avro.mapred.AvroMapper;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Derives from SourceDataStaging's test, so absolutely lifted from d miel's code
 */
public class Avro837Mapper extends AvroMapper<GenericRecord, GenericRecord> {

    private Avro837FlatToExpandedConverter converter = null;

    @Override
    public void configure(JobConf jobConf) {
        super.configure(jobConf);

        try {
            // TODO: figure out how we want to provide the needed schema files to the converter
            Path path = new Path("x12_schema_837_professional.xml");
            FileSystem fileSystem = FileSystem.get(jobConf);
            InputStream cfSchemaXml = fileSystem.open(path);
            path = new Path("x12_schema_837_professional_avro.json");
            InputStream avroSchema = fileSystem.open(path);

            converter = new Avro837FlatToExpandedConverter(cfSchemaXml, avroSchema);
        } catch (Exception e) {
            throw new RuntimeException("Error in configuring Avro837Mapper: "+e, e);
        }
    }

    public void map(GenericRecord inRecord, AvroCollector<GenericRecord> collector, Reporter reporter) throws IOException {

        try {

            GenericRecord outRecord = converter.expand837(inRecord);
            collector.collect(outRecord);
        } catch (Exception e) {
            throw new RuntimeException("Error in mapping: "+e,e);
        }
    }

}