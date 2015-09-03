package net.explorys.samhat.avro.mr;

import net.explorys.samhat.CfSchemaParser;
import net.explorys.samhat.CfSchemaParsingException;
import net.explorys.samhat.avro.SchemaNotFoundException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.util.ByteBufferInputStream;
import org.pb.x12.Cf;
import org.pb.x12.FormatException;
import org.pb.x12.X12;
import org.pb.x12.X12Parser;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by stan.campbell on 9/3/15.
 */
public class Avro837FlatToExpandedConverter {

    /**
     * Take an instance of an Avro record in flat format, parse it using the appropriate X12/837 Cf schema and
     * return an expanded GenericRecord containing the same data as the original.
     *
     * We expect the GenericRecord to contain the following fields in flat format:
     *
     * sourceFile            for example "BigHospital_Subsystem_1441214822957.edi"
     * ingestionTimestamp    for example 1441229222420
     * organization          for example "80"
     * data                  a ByteBuffer containing the text contents of the 837 as bytes in UTF-8 encoding
     *
     * @param flat837Record
     * @param cfSchemaXML
     * @param x837AvroSchemaStream
     * @return
     */
    public GenericRecord expand837(GenericRecord flat837Record, InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws
            CfSchemaParsingException, IOException, FormatException, SchemaNotFoundException {

        ByteBuffer data = (ByteBuffer)flat837Record.get("data");

        // Use our Cf schema parser to translate the XML specification into an instance of CfSchema
        CfSchemaParser cfSchemaParser = new CfSchemaParser();
        Cf schema = cfSchemaParser.parseSchemaFromXml(cfSchemaXML);

        // TODO: expand our generated schema to include the sourceFile, ingestionTimestamp, etc. as well as the expanded x12/837 data
        X12Parser x12Parser = new X12Parser(schema);
        X12 x837 = (X12)x12Parser.parse(new ByteArrayInputStream(data.array()));


        Schema x837AvroSchema = parseAndReturnX12Schema(x837AvroSchemaStream);
        GenericRecord x837Record = new GenericData.Record(x837AvroSchema);

        // Build the GenericRecord by walking the parsed X12 instance
        walkTheX12(x837, x837Record);

        return x837Record;
    }

    Schema parseAndReturnX12Schema(InputStream x837AvroSchemaStream) throws IOException, SchemaNotFoundException {
        // Our schema defines all of the loop and segment names we expect in an X12.
        // However, it's implemented as a Union Schema and so we need to retrieve the "X12" portion so that the parser
        // knows which record to expect when de/serializing.
        Schema x837AvroSchema = (new Schema.Parser()).parse(x837AvroSchemaStream);
        List<Schema> schemaList = x837AvroSchema.getTypes();
        for(Schema schema : schemaList) {
            if("zX12".equalsIgnoreCase(schema.getName())) {
                return schema;
            }
        }
        throw new SchemaNotFoundException("Couldn't find the X12 schema");
    }

    void walkTheX12(X12 x837, GenericRecord x837AvroRecord) {

        throw new RuntimeException("Not yet implemented.");
    }

}
