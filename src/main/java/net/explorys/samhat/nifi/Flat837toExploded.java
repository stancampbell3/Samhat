package net.explorys.samhat.nifi;

import net.explorys.samhat.avro.DataStreamReader;
import net.explorys.samhat.avro.DataStreamWriter;
import net.explorys.samhat.avro.mr.Avro837FlatToExpandedConverter;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 * Utility which reads binary Flat837 Avro records from standard input, transforms them into exploded
 * 837 Avro records, and serializes them as binary to standard output.
 *
 * Intended to be called as a Nifi processor.
 */
public class Flat837toExploded {

    static final int CAPACITY = 4096; // todo: size this intelligently

    public static void main(String[] args) {
        try {

            if(args.length<2) {
                throw new IllegalArgumentException("The xml and avro schemas must be supplied as a command line arguments");
            }

            // Read our avro schema from file
            Schema avroSchema = (new Schema.Parser()).parse(new FileInputStream(args[0]));

            // Read our cf schema from file
            BufferedReader cfRdr = new BufferedReader(new FileReader(args[1]));
            StringBuffer buf = new StringBuffer();
            String line;
            while((line = cfRdr.readLine())!=null) {
                buf.append(line);
            }
            String cfSchema = buf.toString();

            // Set up our reader
            DataStreamReader<Flat837> rdr = new DataStreamReader<>(avroSchema, System.in, CAPACITY);

            // Accept the flat837 from stdin
            Flat837 flat837 = rdr.read();

            // Explode it
            Avro837FlatToExpandedConverter exploder = new Avro837FlatToExpandedConverter(cfSchema, avroSchema);
            GenericRecord exploded837 = exploder.expand837(flat837);

            // Out to the stream
            DataStreamWriter<GenericRecord> wtr = new DataStreamWriter<>(System.out, avroSchema);
            wtr.write(exploded837);

        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Flat837toExploded encountered a fatal error", e);
        }
    }
}
