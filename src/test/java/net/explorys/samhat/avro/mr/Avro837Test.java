package net.explorys.samhat.avro.mr;

import net.explorys.samhat.avro.Avro837Util;
import net.explorys.staging.config.StagingSystemConfig;

import org.apache.hadoop.conf.Configuration;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Derives from SourceDataStaging's test
 */
public class Avro837Test {

    /**
     * This test needs fixing to actually exercise the flat 837 schema
     *
    @Test
    public void testIt() throws Exception {

        Configuration c = new Configuration();
        c.set("fs.defaultFS", StagingSystemConfig.getStagingFS());

        Avro837Tool job = new Avro837Tool();
        job.setConf(c);
        job.setX837FlatSchemaPath("src/test/resources/users.avsc");
        job.setX837FlatDataPath("src/test/resources/users.avro");
        job.setOutputPath("/tmp/AvroInAvroOut-" + System.currentTimeMillis());

        job.run(null);

    }
    */

    /**
     * This class provides a convenient way to repeat the same data a given number of times
     * as an Iterator over ByteBuffers.
     */
    class SingleDataIterator implements Iterator<ByteBuffer> {

        private ByteBuffer data;
        private long nextsTilEmpty;

        public SingleDataIterator(ByteBuffer data, long nextsTilEmpty) {
            this.data = data;
            this.nextsTilEmpty = nextsTilEmpty;
        }

        @Override
        public boolean hasNext() {

            return nextsTilEmpty > 0;
        }

        @Override
        public ByteBuffer next() {

            if(nextsTilEmpty <= 0) {
                throw new NoSuchElementException("No more data.  Iterator is empty.");
            }

            nextsTilEmpty-=1;
            return data;
        }
    }

    @Test
    public void writeSomeLargeTestDataFiles() {


        try {

            String flatDataSchemaPath = "src/test/resources/Flat837.avsc";
            String x12837Path = "/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X223 Health Care Claim Institutional/X223-837-institutional-claim.edi";
            String data = loadResourceDocument(x12837Path);
            byte[] bytes = data.getBytes("utf-8");
            ByteBuffer bytesBuffer = ByteBuffer.wrap(bytes);

            SingleDataIterator dataIterator = new SingleDataIterator(bytesBuffer, 10000); // 10k records

            Avro837Util util = new Avro837Util(flatDataSchemaPath);

            long recordsWritten = util.writeX12FlatData("BigHospital_Subsystem_1441214822957.edi",
                    1441229222420L, "80", dataIterator, new URI("file:///"),
                    "/tmp");

            assertEquals(recordsWritten, 10000);

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception thrown: "+e);
        }
    }

    /**
     * Utility.  Read the file at path, yielding a String with its contents.
     *
     * @param path
     * @return
     * @throws IOException
     */
    String loadResourceDocument(String path) throws IOException {

        StringBuilder bld = new StringBuilder();
        BufferedReader rdr = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
        String line;
        do {
            line = rdr.readLine();
            bld.append(line);
            bld.append("\n");
        } while(line!=null);
        return bld.toString();
    }

}


