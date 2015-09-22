package net.explorys.samhat.avro.mr;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroCollector;
import org.apache.avro.mapred.AvroMapper;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;

/**
 * Created by stan.campbell on 9/21/15.
 */
public class Avro837FlatMapper extends AvroMapper<Text, GenericRecord> {

    @Override
    public void configure(JobConf jobConf) {
        super.configure(jobConf);

        try {

        } catch(Exception e) {
            throw new RuntimeException("Error in configuring Avro837FlatMapper: "+e, e);
        }
    }

    GenericRecord wrapData(Text ediData, String sourceFile, long ingestionTimestamp,
                           String organization) {

        JobConf conf = (JobConf)getConf();

        throw new RuntimeException("Not yet implemented");
    }

    public void map(Text ediData, AvroCollector<GenericRecord> collector, Reporter reporter) throws IOException {

        try {
            // TODO: collect source file details
            Configuration config = this.getConf();
            String sourceFile = config.get("source.file");
            String organization = config.get("organization.name");
            long ingestionTimestamp = Long.parseLong(config.get("ingestion.timestamp"));

            GenericRecord outRecord = wrapData(ediData, sourceFile, ingestionTimestamp, organization);
            collector.collect(outRecord);
        } catch(Exception e) {
            throw new RuntimeException("Error in mapping: "+e,e);
        }
    }

}
