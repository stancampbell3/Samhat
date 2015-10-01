package net.explorys.samhat.avro.mr;

import java.io.File;
import java.io.InputStream;

import org.apache.avro.Schema;
import org.apache.avro.mapred.AvroJob;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RunningJob;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * Derives from SourceDataStaging's test, so totally lifted from doug miel's code
 */
public class Avro837Tool extends Configured implements Tool {

    private String x837FlatDataPath = null;
    private String outputPath = null;
    private String x837FlatSchemaPath = null;
    private String x837ExpandedSchemaPath = null;

    public String getX837FlatDataPath() {
        return x837FlatDataPath;
    }

    public void setX837FlatDataPath(String x837FlatDataPath) {
        this.x837FlatDataPath = x837FlatDataPath;
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

    public String getX837ExpandedSchemaPath() {
        return x837ExpandedSchemaPath;
    }

    public void setX837ExpandedSchemaPath(String x837ExpandedSchemaPath) {
        this.x837ExpandedSchemaPath = x837ExpandedSchemaPath;
    }

    @Override
    public int run(String[] args) throws Exception {

        Configuration baseConf = getConf();
        JobConf conf = new JobConf(baseConf, Avro837Tool.class);
        conf.setJobName("Avro837Tool");

        FileInputFormat.setInputPaths(conf, new Path(getX837FlatDataPath()));
        FileOutputFormat.setOutputPath(conf, new Path(getOutputPath()));

        conf.setNumReduceTasks(0);

        // TODO: investigate where we should expect these schemas to actually live.. maybe HBase?
        Path path = new Path(x837FlatSchemaPath);
        // DEBUG
        System.out.println("x837FlatSchemaPath: "+path);
        FileSystem fs = FileSystem.get(conf);
        InputStream fsDataInputStream = fs.open(path);
        Schema inputSchema = new Schema.Parser().parse(fsDataInputStream);
        path = new Path(x837ExpandedSchemaPath);
        System.out.println("x837ExpandedSchemaPath: "+path);
        fsDataInputStream = fs.open(path);
        Schema outputSchema = new Schema.Parser().parse(fsDataInputStream);

        AvroJob.setMapperClass(conf, Avro837Mapper.class);

        AvroJob.setInputSchema(conf, inputSchema);
        AvroJob.setOutputSchema(conf, outputSchema);

        RunningJob rj = JobClient.runJob(conf);
        if (!rj.isSuccessful()) {
            throw new Exception("Job Failed!");
        }

        return 0;
    }

    public static void main(String[] args) {

        try {

            if(args.length<7) {

                System.out.println("Usage: hadoop jar Samhat.jar net.explorys.samhat.avro.mr.Avro837Tool -libjars $LIBJARS <x837FlatDataPath> <outputPath> <flatSchemaPath> <expandedSchemaPath>");
            } else {

                Avro837Tool tool = new Avro837Tool();
                Configuration conf = tool.getConf();
                if(null==conf) {
                    conf = new Configuration();
                }
                String[] otherArgs=new GenericOptionsParser(conf,args).getRemainingArgs();
                // DEBUG
                for(int i=0;i<otherArgs.length;i++) {
                    System.out.println("OtherARG"+i+": "+otherArgs[i]);
                }
                tool.setX837FlatDataPath(otherArgs[3]);
                tool.setOutputPath(otherArgs[4]);
                tool.setX837FlatSchemaPath(otherArgs[5]);
                tool.setX837ExpandedSchemaPath(otherArgs[6]);

                int res = ToolRunner.run(conf, tool, args);
                System.exit(res);
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}