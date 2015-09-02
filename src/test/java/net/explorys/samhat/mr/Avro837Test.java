package net.explorys.samhat.mr;

import net.explorys.staging.config.StagingSystemConfig;

import org.apache.hadoop.conf.Configuration;
import org.junit.Test;


/**
 * Derives from SourceDataStaging's test
 */
public class Avro837Test {

    @Test
    public void testIt() throws Exception {

        Configuration c = new Configuration();
        c.set("fs.defaultFS", StagingSystemConfig.getStagingFS());

        Avro837Tool job = new Avro837Tool();
        job.setConf(c);
        job.setSchemaPath("testdata/user.avsc");
        job.setInputPath("testdata/avro/users.avro");
        job.setOutputPath("tmp/AvroInAvroOut-" + System.currentTimeMillis());

        job.run(null);

    }

}


