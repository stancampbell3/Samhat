package net.explorys.samhat.avro;

import org.apache.avro.Schema;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Utility for writing Avro records to a stream.
 */
public class DataStreamWriter<T> {

    private OutputStream out;
    private Schema schema;

    public DataStreamWriter(OutputStream out, Schema schema) {
        this.out = out;
        this.schema = schema;
    }

    public void write(T avroObject) throws IOException {

        // Serialize to a byte buffer
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(outputStream, null);

        DatumWriter<T> writer = new SpecificDatumWriter<T>(schema);

        writer.write(avroObject, encoder);
        byte[] serializedBytes = outputStream.toByteArray();

        // Write it to the stream
        out.write(serializedBytes, 0, serializedBytes.length);
        out.flush();
    }
}
