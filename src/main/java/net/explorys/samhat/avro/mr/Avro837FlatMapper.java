package net.explorys.samhat.avro.mr;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by stan.campbell on 9/21/15.
 */
public class Avro837FlatMapper extends Mapper<LongWritable, Text, AvroKey<String>, AvroValue<GenericRecord>> {

    static final String FLAT_SCHEMA = "{\n" +
            "   \"namespace\":\"net.explorys.samhat.z12.r837\",\n" +
            "   \"type\":\"record\",\n" +
            "   \"name\":\"Flat837\",\n" +
            "   \"fields\":[\n" +
            "      {\n" +
            "         \"name\": \"source_filename\",\n" +
            "         \"type\": \"string\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\": \"ingested_timestamp\",\n" +
            "         \"type\": \"long\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\": \"organization\",\n" +
            "         \"type\": \"string\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\": \"data\",\n" +
            "         \"type\": \"bytes\"\n" +
            "      }\n" +
            "   ]\n" +
            "}";

    private JobConf config;

    private Schema flatSchema = (new Schema.Parser()).parse(FLAT_SCHEMA);

    GenericRecord wrapData(Text ediData, String sourceFile, long ingestionTimestamp,
                           String organization) throws IOException {

        GenericRecord rec = new GenericData.Record(getFlatSchema());
        rec.put("source_filename", sourceFile);
        rec.put("ingested_timestamp", ingestionTimestamp);
        rec.put("organization", organization);
        rec.put("data", ediData.getBytes());

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
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        GenericRecord record = wrapData(value, "sourcefile", 0L, "org");

        // TODO: create a better key
        AvroKey<String> avroKey = new AvroKey(key.toString());
        AvroValue<GenericRecord> avroValue = new AvroValue(record);
        context.write( avroKey, avroValue);
    }
}
