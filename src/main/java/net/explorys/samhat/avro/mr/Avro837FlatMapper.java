package net.explorys.samhat.avro.mr;

import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapred.AvroValue;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapred.JobConf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * Created by stan.campbell on 9/21/15.
 */
public class Avro837FlatMapper extends Mapper<LongWritable, Text, AvroKey<String>, AvroValue<Flat837>> {

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

    Flat837 wrapData(Text ediData, String sourceFile, long ingestionTimestamp,
                           String organization) throws IOException {

        Flat837 rec = Flat837.newBuilder().setSourceFilename(sourceFile)
                .setIngestedTimestamp(ingestionTimestamp)
                .setOrganization(organization)
                .setX12Data(ediData.toString()).build();

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

        String keyStr = value.hashCode()+"";
        Flat837 record = wrapData(value, "sourcefile", 0L, "org");

        // TODO: make a better key
        context.write(new AvroKey<String>(keyStr), new AvroValue<Flat837>(record));
    }
}
