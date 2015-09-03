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
 * Derives from SourceDataStaging's test
 */
public class Avro837Tool extends Configured implements Tool {

    private String x837FlatDataPath = null;
    private String outputPath = null;
    private String x837FlatSchemaPath = null;

    public void setX837FlatDataPath(String path) {
        x837FlatDataPath = path;
    }

    public void setOutputPath(String path) {
        outputPath = path;
    }

    public void setX837FlatSchemaPath(String path) {
        x837FlatSchemaPath = path;
    }

    @Override
    public int run(String[] args) throws Exception {

        JobConf conf = new JobConf(getConf(), Avro837Tool.class);
        conf.setJobName("Avro837Tool");

        FileInputFormat.setInputPaths(conf, new Path(x837FlatDataPath));
        FileOutputFormat.setOutputPath(conf, new Path(outputPath));

        conf.setNumReduceTasks(0);

        Schema schema = new Schema.Parser().parse(new File(x837FlatSchemaPath));

        AvroJob.setMapperClass(conf, Avro837Mapper.class);
        AvroJob.setInputSchema(conf, schema);

        AvroJob.setOutputSchema(conf, schema);
        // note:  this is a bit goofy because it's the same schema
        // however, we could put in any schema we wanted.
        // -dsm

        RunningJob rj = JobClient.runJob(conf);
        if (!rj.isSuccessful()) {
            throw new Exception("Job Failed!");
        }

        return 0;
    }
}