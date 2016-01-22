package net.explorys.samhat.avro;

import org.apache.avro.Schema;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * Utility for reading Avro records from an input stream
 */
public class DataStreamReader<T> {

    private Schema schema;
    private InputStream in;
    private int capacity;

    public DataStreamReader(Schema schema, InputStream in, int capacity) {
        this.schema = schema;
        this.in = in;
        this.capacity = capacity;
    }

    public T read() throws IOException {

        // Buffer the data to a byte array
        ByteBuffer buffer = ByteBuffer.allocate(capacity);

        int datum;
        while( (datum = in.read()) != -1 ) {
            buffer.put((byte)datum);
        }
        byte[] bytes = buffer.array();

        // Decode into an Avro object
        SpecificDatumReader<T> reader = new SpecificDatumReader<T>(schema);
        Decoder decoder = DecoderFactory.get().binaryDecoder(bytes, null);
        T avroObject = reader.read(null, decoder);

        return avroObject;
    }
}
