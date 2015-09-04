package net.explorys.samhat.avro.mr;

import net.explorys.samhat.AvroSchemaGenerator;
import net.explorys.samhat.CfSchemaParser;
import net.explorys.samhat.CfSchemaParsingException;
import net.explorys.samhat.avro.Avro837Util;
import net.explorys.samhat.avro.SchemaNotFoundException;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.util.Utf8;
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
    private Schema.Parser avroParser;
    private Schema x837AvroSchema;
    private Schema segmentsArraySchema;

    public Avro837FlatToExpandedConverter(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException, IOException {

        this.cfSchemaXML = cfSchemaXML;
        this.x837AvroSchemaStream = x837AvroSchemaStream;

        // Use our Cf schema parser to translate the XML specification into an instance of CfSchema
        cfSchemaParser = new CfSchemaParser();
        schema = cfSchemaParser.parseSchemaFromXml(cfSchemaXML);

        // Instantiate our x12Parser for the given cfSchema
        x12Parser = new X12Parser(schema);

        // Instantiate our Avro schemas.  This is expected to be a Union schema defining all of our record types.
        avroParser = (new Schema.Parser());
        x837AvroSchema = avroParser.parse(x837AvroSchemaStream);
        segmentsArraySchema = AvroSchemaGenerator.getSegmentsArraySchemaDefinition(avroParser);
    }

    /**
     * Our schema defines all of the loop and segment names we expect in an X12.
     * However, it's implemented as a Union Schema and so we need to retrieve the "X12" portion
     * so that the parser knows which record to expect when de/serializing.
     *
     * We return null in the case where we don't find a matching schema.
     *
     * @param schemaName
     * @return
     */
    Schema findRecordSchema(String schemaName) {

        if(null==schemaName) {
            throw new IllegalArgumentException("schemaName must not be null");
        }

        List<Schema> schemaList = x837AvroSchema.getTypes();
        for(Schema schema : schemaList) {
            if(schemaName.equalsIgnoreCase(schema.getName())) {
                return schema;
            }
        }

        return null;
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
        // -- Construct an avro array object to hold the segment info
        GenericArray segmentsArray = new GenericData.Array<Utf8>(currentLoop.getSegments().size(), segmentsArraySchema);
        for(Segment segment : currentLoop.getSegments()) {
            // -- add the segment data into the array
            segmentsArray.add(new Utf8(segment.toString()));
        }
        // -- add the array object as a value of that field
        x837Record.put("zSEGMENTS", segmentsArray);

        // For each loop in currentLoop
        for(Loop loop : currentLoop.getLoops()) {

            // Select the proper schema for the next loop
            String loopName = loop.getName();
            String recordSchemaName = Avro837Util.makeAvroName(loopName);
            Schema recordSchema;

            recordSchema = findRecordSchema(recordSchemaName); // eg. "zX12"
            if(null!=recordSchema) {

                // Create the nested record representing the loop
                GenericRecord nestedRecord = new GenericData.Record(recordSchema);

                // walkThe nested loop
                walkTheLoop(nestedRecord, loop);

                // set the property of the outer record for this loop
                x837Record.put(recordSchemaName, nestedRecord);

            } else {

                // The segment data for this loop (it's a leaf) rolls up into the value of a property
                // of the current record.  For instance, 1000A (Submitter Name) is a property of the enclosing loop
                // and is implemented in the avro schema as an array of strings.

                // Set the segment values of loop into the enclosing GenericRecord, x837Record

                // -- Construct an avro array object to hold the segment info
                segmentsArray = new GenericData.Array<Utf8>(loop.getSegments().size(), segmentsArraySchema);

                // -- Go through the segments and fill the array
                for(Segment segment : loop.getSegments()) {
                    segmentsArray.add(new Utf8(segment.toString()));
                }

                // -- the field of the enclosing x837Record is named the same as the recordSchema
                // -- add the array object as a value of that field
                x837Record.put(recordSchemaName, segmentsArray);
            }

            // TODO: investigate whether we need to make (and I think we do) subloops nullable in the schema
        }
    }
}
