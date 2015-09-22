package net.explorys.samhat.avro.mr;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.mapred.AvroValue;
import org.apache.avro.mapred.Pair;
import org.apache.avro.mapreduce.AvroJob;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.InputStream;

/**
 * Created by stan.campbell on 9/21/15.
 */
public class Avro837FlatTool extends Configured implements Tool {

    private String x837EDIDataPath = null;
    private String x837FlatSchemaPath = null;
    private String outputPath = null;

    public String getX837EDIDataPath() {
        return x837EDIDataPath;
    }

    public void setX837EDIDataPath(String x837EDIDataPath) {
        this.x837EDIDataPath = x837EDIDataPath;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public String getX837FlatSchemaPath() {
        return x837FlatSchemaPath;
    }

    public void setX837FlatSchemaPath(String x837FlatSchemaPath) {
        this.x837FlatSchemaPath = x837FlatSchemaPath;
    }

    @Override
    public int run(String[] args) throws Exception {

        Configuration conf = getConf();

        Path path = new Path(getX837FlatSchemaPath());
        FileSystem fileSystem = FileSystem.get(conf);
        InputStream fsDataInputStream = fileSystem.open(path);
        Schema flatSchema = new Schema.Parser().parse(fsDataInputStream);

        conf.set("output.schema", getX837FlatSchemaPath());

        Job job = new Job(conf, "Avro837FlatTool");

        AvroJob.setOutputKeySchema(job, Schema.create(Schema.Type.LONG));

        job.setInputFormatClass(TextInputFormat.class);
        job.setMapperClass(Avro837FlatMapper.class);

        AvroJob.setMapOutputKeySchema(job, Schema.create(Schema.Type.STRING));
        AvroJob.setMapOutputValueSchema(job, flatSchema);

        FileInputFormat.setInputPaths(job, new Path(getX837EDIDataPath()));
        FileOutputFormat.setOutputPath(job, new Path(getOutputPath()));

        job.waitForCompletion(true);

        return 0;
    }

    public static void main(String[] args) {

        try {

            if(args.length<7) {

                System.out.println("Usage: hadoop jar Samhat.jar net.explorys.samhat.avro.mr.Avro837FlatTool -libjars $LIBJARS <flatSchemaPath> <ediDataPath> <outputPath> <sourceFile> <org>");
            } else {

                Avro837FlatTool tool = new Avro837FlatTool();

                tool.setX837FlatSchemaPath(args[2]);
                tool.setX837EDIDataPath(args[3]);
                tool.setOutputPath(args[4]);

                Configuration config = new Configuration();

                // TODO: figure out the best way to include the source file without passing it as a command line argument

                config.set("source.file", args[5]);
                config.set("organization.name", args[6]);
                Long timestamp = System.currentTimeMillis();
                config.set("ingestion.timestamp", timestamp.toString());

                int res = ToolRunner.run(config, tool, args);
                System.exit(res);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
