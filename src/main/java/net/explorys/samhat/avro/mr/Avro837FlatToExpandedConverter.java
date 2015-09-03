package net.explorys.samhat.avro.mr;

import net.explorys.samhat.CfSchemaParser;
import net.explorys.samhat.CfSchemaParsingException;
import net.explorys.samhat.avro.Avro837Util;
import net.explorys.samhat.avro.SchemaNotFoundException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.pb.x12.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/**
 * Created by stan.campbell on 9/3/15.
 */
public class Avro837FlatToExpandedConverter {

    private InputStream cfSchemaXML;
    private InputStream x837AvroSchemaStream;

    private CfSchemaParser cfSchemaParser;
    private Cf schema;
    private X12Parser x12Parser;
    private Schema x837AvroSchema;

    public Avro837FlatToExpandedConverter(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException, IOException {

        this.cfSchemaXML = cfSchemaXML;
        this.x837AvroSchemaStream = x837AvroSchemaStream;

        // Use our Cf schema parser to translate the XML specification into an instance of CfSchema
        cfSchemaParser = new CfSchemaParser();
        schema = cfSchemaParser.parseSchemaFromXml(cfSchemaXML);

        // Instantiate our x12Parser for the given cfSchema
        x12Parser = new X12Parser(schema);

        // Instantiate our Avro schemas.  This is expected to be a Union schema defining all of our record types.
        x837AvroSchema = (new Schema.Parser()).parse(x837AvroSchemaStream);
    }

    /**
     * Our schema defines all of the loop and segment names we expect in an X12.
     * However, it's implemented as a Union Schema and so we need to retrieve the "X12" portion
     * so that the parser knows which record to expect when de/serializing.
     *
     * @param schemaName
     * @return
     * @throws SchemaNotFoundException
     */
    Schema findRecordSchema(String schemaName) throws SchemaNotFoundException {

        if(null==schemaName) {
            throw new IllegalArgumentException("schemaName must not be null");
        }

        List<Schema> schemaList = x837AvroSchema.getTypes();
        for(Schema schema : schemaList) {
            if(schemaName.equalsIgnoreCase(schema.getName())) {
                return schema;
            }
        }

        throw new SchemaNotFoundException("Couldn't find the schema for: "+schemaName);
    }

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
     * @return
     */
    public GenericRecord expand837(GenericRecord flat837Record) throws
            CfSchemaParsingException, IOException, FormatException, SchemaNotFoundException {

        ByteBuffer data = (ByteBuffer)flat837Record.get("data");
        X12 x837 = (X12)x12Parser.parse(new ByteArrayInputStream(data.array()));

        // TODO: expand our generated schema to include the sourceFile, ingestionTimestamp, etc. as well as the expanded x12/837 data

        // Build the GenericRecord by walking the parsed X12 instance
        Schema x12Schema = findRecordSchema(Avro837Util.makeAvroName("X12"));
        GenericRecord x837Record = new GenericData.Record(x12Schema);
        walkTheLoop(x837Record, x837);

        return x837Record;
    }

    void walkTheLoop(GenericRecord x837Record, Loop currentLoop) throws SchemaNotFoundException {

        // An X12 is composed of loops and segments.
        // Segments contain data at this loop level.
        // Loops are nested collections of loops and segments.

        // Set data from segments
        for(Segment segment : currentLoop.getSegments()) {

            System.out.println("Segment: "+segment.toString());
        }

        // For each loop in currentLoop
        for(Loop loop : currentLoop.getLoops()) {

            // Select the proper schema for the next loop
            String loopName = loop.getName();
            Schema schema = findRecordSchema(Avro837Util.makeAvroName(loopName)); // eg. "zX12"

            // Create the nested record representing the loop
            GenericRecord nestedRecord = new GenericData.Record(schema);

            // walkThe nested loop
            walkTheLoop(nestedRecord, loop);

            // set the property of the outer record for this loop
            x837Record.put( loopName, nestedRecord);

            // TODO: investigate whether we need to make (and I think we do) subloops nullable in the schema
        }

        throw new RuntimeException("Not yet implemented.");
    }

}
