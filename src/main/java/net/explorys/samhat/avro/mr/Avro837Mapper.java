package net.explorys.samhat.avro.mr;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroCollector;
import org.apache.avro.mapred.AvroJob;
import org.apache.avro.mapred.AvroMapper;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Derives from SourceDataStaging's test, so absolutely lifted from d miel's code
 */
public class Avro837Mapper extends AvroMapper<GenericRecord, GenericRecord> {

    private Schema outputSchema = null;
    private Avro837FlatToExpandedConverter converter = null;

    @Override
    public void configure(JobConf jobConf) {
        super.configure(jobConf);

        outputSchema = AvroJob.getOutputSchema(jobConf);

        try {
            // TODO: figure out how we want to provide the needed schema files to the converter
            InputStream cfSchemaXml = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
            InputStream avroSchema = getClass().getResourceAsStream("/x12_schema_837_professional_avro.json");

            converter = new Avro837FlatToExpandedConverter(cfSchemaXml, avroSchema);
        } catch (Exception e) {
            throw new RuntimeException("Error in configuring Avro837Mapper: "+e, e);
        }
    }

    public void map(GenericRecord inRecord, AvroCollector<GenericRecord> collector, Reporter reporter) throws IOException {

        try {

            GenericRecord outRecord = null;
            outRecord = converter.expand837(inRecord);
            collector.collect(outRecord);
        } catch (Exception e) {
            throw new RuntimeException("Error in mapping: "+e,e);
        }
    }

}