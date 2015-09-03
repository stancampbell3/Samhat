package net.explorys.samhat.avro.mr;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroCollector;
import org.apache.avro.mapred.AvroJob;
import org.apache.avro.mapred.AvroMapper;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;

/**
 * Derives from SourceDataStaging's test
 */
public class Avro837Mapper extends AvroMapper<GenericRecord, GenericRecord> {
    private Schema outputSchema = null;

    @Override
    public void configure(JobConf jobConf) {
        super.configure(jobConf);

        outputSchema = AvroJob.getOutputSchema(jobConf);
    }

    public void map(GenericRecord inRecord, AvroCollector<GenericRecord> collector, Reporter reporter) throws IOException {

        // again, we happen to be emitting User records back out so this isn't terribly exciting,
        // however, we could very easily supply a different type on the config.
        // -dsm

        GenericRecord outRecord = new GenericData.Record(outputSchema);

        // reminder:  "name" is an attribute defined in the schema.
        for(Schema.Field f : outputSchema.getFields()) {
            if (f.name().equals("organization")) {
                outRecord.put(f.name(), inRecord.get(f.name()) + "-transformed");
            } else {
                outRecord.put(f.name(), inRecord.get(f.name()));
            }
        }

        collector.collect(outRecord);
    }

}