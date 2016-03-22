package net.explorys.samhat.nifi;


import net.explorys.samhat.avro.DataStreamWriter;
import net.explorys.samhat.z12.r837.Flat837;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;

/**
 * Utility reads X12 EDI data from standard input, transforms it into a Flat837 object,
 * and serializes that using binary encoding to standard output.
 *
 * Intended to be called from a Nifi ExecuteStreamCommand processor.
 */
public class X12toFlat837 {

    static final int CAPACITY = 4096; // todo: size this intelligently

    static Flat837 wrapData(String ediData, String sourceFile, long ingestionTimestamp,
                     String organization) throws IOException {

        Flat837 rec = Flat837.newBuilder().setSourceFilename(sourceFile)
                .setIngestedTimestamp(ingestionTimestamp)
                .setOrganization(organization)
                .setData(ediData).build();

        return rec;
    }

    public static void main(String[] args) {

        try {

            ByteBuffer buffer = ByteBuffer.allocate(CAPACITY);
            InputStreamReader rdr = new InputStreamReader(System.in);
            int datum;
            while( (datum = rdr.read() ) != -1) {
                buffer.put((byte)datum);
            }

            String x12Document = new String(buffer.array());

            // todo: set the sourceFile and organization correctly
            Flat837 flat837 = wrapData(x12Document, "SomeLargeFile", System.currentTimeMillis(), "80");

            DataStreamWriter<Flat837> wtr = new DataStreamWriter<>(System.out, Flat837.SCHEMA$);
            wtr.write(flat837);

        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException("X12toFlat837 encountered a fatal error", e);
        }
    }
}
