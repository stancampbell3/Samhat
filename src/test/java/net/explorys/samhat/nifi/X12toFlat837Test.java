package net.explorys.samhat.nifi;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.nio.ByteBuffer;

public class X12toFlat837Test {

    static final int CAPACITY = 4096;

    String loadTestDocument(String path) throws IOException {

        ByteBuffer buf = ByteBuffer.allocate(CAPACITY);
        int datum;
        InputStreamReader rdr = new InputStreamReader(this.getClass().getResourceAsStream(path));
        while((datum=rdr.read())!=-1) {
            buf.put((byte)datum);
        }

        return new String(buf.array());
    }

    @Test
    public void canProcessIncomingEDI() {

        try {
            ByteArrayInputStream myIn = new ByteArrayInputStream(loadTestDocument("/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-encounter.edi").getBytes());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream myOut = new PrintStream( baos );

            System.setIn(myIn);
            System.setOut(myOut);

            X12toFlat837 instance = new X12toFlat837();

            String[] args = {};
            instance.main(args);

            final String result = baos.toString();
            assertNotNull(result);
            assert(!"".equals(result));

        } catch(Exception e) {
            fail("Caught an exception:"+e);
        }
    }
}
