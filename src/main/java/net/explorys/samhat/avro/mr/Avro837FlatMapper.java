package net.explorys.samhat.avro.mr;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroCollector;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapred.AvroMapper;
import org.apache.avro.mapred.AvroValue;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by stan.campbell on 9/21/15.
 */
public class Avro837FlatMapper extends AvroMapper implements Mapper<LongWritable, Text, AvroKey<LongWritable>, AvroValue<GenericRecord>> {

    private JobConf config;

    private Schema flatSchema;

    GenericRecord wrapData(Text ediData, String sourceFile, long ingestionTimestamp,
                           String organization) throws IOException {

        GenericRecord rec = new GenericData.Record(getFlatSchema());
        rec.put("source_filename", sourceFile);
        rec.put("ingested_timestamp", ingestionTimestamp);
        rec.put("organization", organization);
        rec.put("data", ediData);

        return rec;
    }

    public JobConf getConf() {
        return config;
    }

    public Schema getFlatSchema() throws IOException {

        if(null==flatSchema) {

            Path path = new Path(getConf().get("output.schema"));
            FileSystem fileSystem = FileSystem.get(getConf());
            InputStream fsDataInputStream = fileSystem.open(path);
            flatSchema = new Schema.Parser().parse(fsDataInputStream);
        }

        return flatSchema;
    }

    @Override
    public void map(Object datum, AvroCollector collector, Reporter reporter) throws IOException {
        super.map(datum, collector, reporter);
    }

    @Override
    public void map(LongWritable key, Text ediData, OutputCollector<AvroKey<LongWritable>, AvroValue<GenericRecord>> output, Reporter reporter) throws IOException {

        try {

            // TODO: collect source file details
            Configuration config = this.getConf();
            String sourceFile = config.get("source.file");
            String organization = config.get("organization.name");
            long ingestionTimestamp = Long.parseLong(config.get("ingestion.timestamp"));

            GenericRecord outRecord = wrapData(ediData, sourceFile, ingestionTimestamp, organization);

            output.collect(new AvroKey<LongWritable>(key), new AvroValue<GenericRecord>(outRecord));

        } catch(Exception e) {
            throw new RuntimeException("Error in mapping: "+e,e);
        }
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public void configure(JobConf job) {
        this.config = job;
    }

}
