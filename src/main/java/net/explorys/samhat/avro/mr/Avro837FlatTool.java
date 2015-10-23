package net.explorys.samhat.avro.mr;

import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapred.AvroKeyComparator;
import org.apache.avro.mapred.AvroValue;
import org.apache.avro.mapred.Pair;
import org.apache.avro.mapreduce.AvroJob;
import org.apache.avro.mapreduce.AvroKeyOutputFormat;
import org.apache.avro.mapreduce.AvroKeyValueOutputFormat;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
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

        // DEBUG
        // System.out.println("avro.output.schema:" + getX837FlatSchemaPath());

        Schema outputSchema = Pair.getPairSchema(Schema.create(Schema.Type.STRING), Flat837.SCHEMA$);
        conf.set("avro.output.schema", outputSchema.toString());

        Job job = new Job(conf, "Avro837FlatTool");
        job.setJarByClass(Avro837FlatTool.class);

        job.setMapOutputKeyClass(AvroKey.class);
        job.setGroupingComparatorClass(AvroKeyComparator.class);
        job.setSortComparatorClass(AvroKeyComparator.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setMapperClass(Avro837FlatMapper.class);

        job.setMapOutputKeyClass(String.class);
        job.setMapOutputValueClass(Flat837.class);

        AvroJob.setOutputKeySchema(job, Schema.create(Schema.Type.STRING));
        AvroJob.setOutputValueSchema(job, Flat837.getClassSchema());

        FileInputFormat.setInputPaths(job, new Path(getX837EDIDataPath()));
        FileOutputFormat.setOutputPath(job, new Path(getOutputPath()));

        job.waitForCompletion(true);

        return 0;
    }

    public static void main(String[] args) {

        try {

            if(args.length<5) {

                System.out.println("Usage: hadoop jar Samhat.jar net.explorys.samhat.avro.mr.Avro837FlatTool -libjars $LIBJARS <flatSchemaPath> <ediDataPath> <outputPath> <sourceFile> <org>");
            } else {

                Avro837FlatTool tool = new Avro837FlatTool();

                String flatSchemaPath = args[0];
                String ediDataPath = args[1];
                String outputPath = args[2];
                String sourceFilename = args[3];
                String orgName = args[4];
                String ingestionTimestamp = ""+System.currentTimeMillis();

                // DEBUG
                StringBuffer sbuf = new StringBuffer();
                sbuf.append("flatSchemaPath:").append(flatSchemaPath).append("\n");
                sbuf.append("ediDataPath:").append(ediDataPath).append("\n");
                sbuf.append("outputPath:").append(outputPath).append("\n");
                sbuf.append("sourceFilename:").append(sourceFilename).append("\n");
                sbuf.append("orgName:").append(orgName).append("\n");
                sbuf.append("ingestionTimestamp:").append(ingestionTimestamp).append("\n");
                // System.out.println(sbuf.toString());

                tool.setX837FlatSchemaPath(flatSchemaPath);
                tool.setX837EDIDataPath(ediDataPath);
                tool.setOutputPath(outputPath);

                Configuration config = new Configuration();

                // TODO: figure out the best way to include the source file without passing it as a command line argument

                config.set("source.file", sourceFilename);
                config.set("organization.name", orgName);
                config.set("ingestion.timestamp", ingestionTimestamp);

                int res = ToolRunner.run(config, tool, args);
                System.exit(res);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
