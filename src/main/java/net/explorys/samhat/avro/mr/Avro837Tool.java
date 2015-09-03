package net.explorys.samhat.avro.mr;

import java.io.File;

import org.apache.avro.Schema;
import org.apache.avro.mapred.AvroJob;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RunningJob;
import org.apache.hadoop.util.Tool;

/**
 * Derives from SourceDataStaging's test, so totally lifted from doug miel's code
 */
public class Avro837Tool extends Configured implements Tool {

    private String x837FlatDataPath = null;
    private String outputPath = null;
    private String x837FlatSchemaPath = null;
    private String x837ExpandedSchemaPath = null;

    public void setX837FlatDataPath(String path) {
        x837FlatDataPath = path;
    }

    public void setOutputPath(String path) {
        outputPath = path;
    }

    public void setX837FlatSchemaPath(String path) {
        x837FlatSchemaPath = path;
    }

    public void setX837ExpandedSchemaPath(String x837ExpandedSchemaPath) {
        this.x837ExpandedSchemaPath = x837ExpandedSchemaPath;
    }

    @Override
    public int run(String[] args) throws Exception {

        JobConf conf = new JobConf(getConf(), Avro837Tool.class);
        conf.setJobName("Avro837Tool");

        FileInputFormat.setInputPaths(conf, new Path(x837FlatDataPath));
        FileOutputFormat.setOutputPath(conf, new Path(outputPath));

        conf.setNumReduceTasks(0);

        // TODO: investigate where we should expect these schemas to actually live.. maybe HBase?
        Schema inputSchema = new Schema.Parser().parse(new File(x837FlatSchemaPath));
        Schema outputSchema = new Schema.Parser().parse(new File(x837FlatSchemaPath));

        AvroJob.setMapperClass(conf, Avro837Mapper.class);

        AvroJob.setInputSchema(conf, inputSchema);
        AvroJob.setOutputSchema(conf, outputSchema);

        RunningJob rj = JobClient.runJob(conf);
        if (!rj.isSuccessful()) {
            throw new Exception("Job Failed!");
        }

        return 0;
    }
}