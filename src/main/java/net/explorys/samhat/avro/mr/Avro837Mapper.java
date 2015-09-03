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
 * Derives from SourceDataStaging's test, so absolutely lifted from d miel's code
 */
public class Avro837Mapper extends AvroMapper<GenericRecord, GenericRecord> {

    private Schema outputSchema = null;

    @Override
    public void configure(JobConf jobConf) {
        super.configure(jobConf);

        outputSchema = AvroJob.getOutputSchema(jobConf);
    }

    public void map(GenericRecord inRecord, AvroCollector<GenericRecord> collector, Reporter reporter) throws IOException {

        GenericRecord outRecord = new GenericData.Record(outputSchema);

        // Ok, need to
        // 1.  Parse the data from the incoming record using

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