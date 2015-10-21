package net.explorys.samhat.avro.mr;

import net.explorys.samhat.AvroSchemaGenerator;
import net.explorys.samhat.XmlBasedCfSchemaParser;
import net.explorys.samhat.CfSchemaParsingException;
import net.explorys.samhat.ICfSchemaParser;
import net.explorys.samhat.avro.Avro837FlatToExpandedException;
import net.explorys.samhat.avro.Avro837Util;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.util.Utf8;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.pb.x12.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.*;

/**
 * Created by stan.campbell on 9/3/15.
 *
 * Construct a class from a given Cf schema definition and an Avro schema definition capable of blowing our flat
 * Avro record definition of an 837 instance into a fully nested Avro record.  For use in the MR Mapper.
 *
 */
public class Avro837FlatToExpandedConverter {

    private X12Parser x12Parser;
    private Schema x837AvroSchema;
    private Schema segmentsArraySchema;
    private ObjectMapper mapper = new ObjectMapper();

    public Avro837FlatToExpandedConverter(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException, IOException {

        // Use our Cf schema parser to translate the XML specification into an instance of CfSchema
        ICfSchemaParser ICfSchemaParser = new XmlBasedCfSchemaParser();
        Cf schema = ICfSchemaParser.parseSchema(cfSchemaXML);

        // Instantiate our x12Parser for the given cfSchema
        x12Parser = new X12Parser(schema);

        // Instantiate our Avro schemas.
        Schema.Parser avroParser = (new Schema.Parser());
        x837AvroSchema = avroParser.parse(x837AvroSchemaStream);
        segmentsArraySchema = AvroSchemaGenerator.getSegmentsArraySchemaDefinition(avroParser);
    }

    /**
     * Take an instance of an Avro record in flat format, parse it using the appropriate X12/837 Cf schema and
     * return an expanded GenericRecord containing the same data as the original wrapped in an envelope.
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
    public GenericRecord expand837(Flat837 flat837Record) throws
            CfSchemaParsingException, IOException, FormatException, Avro837FlatToExpandedException {

        ByteBuffer data = (ByteBuffer)flat837Record.get("data");
        X12 x837 = (X12)x12Parser.parse(new ByteArrayInputStream(data.array()));

        // DEBUG
        System.out.println("x837: " + x837.toXML());

        // Build the envelope and copy over the source_file, ingestion timestamp, etc.
        Schema envSchema = x837AvroSchema;
        GenericRecord envRecord = new GenericData.Record(envSchema);

        // TODO: use the proper accessors
        String sourceFilename = flat837Record.getSourceFilename().toString();
        Long ingestedTimestamp = flat837Record.getIngestedTimestamp();
        String organization = flat837Record.getOrganization().toString();

        envRecord.put("source_filename", sourceFilename);
        envRecord.put("ingested_timestamp", ingestedTimestamp);
        envRecord.put("organization", organization);

        // Build the GenericRecord by walking the parsed X12 instance

        // Create the envelope record
        Schema.Field dataField = getX837AvroSchema().getField("data");
        // -- schema has this field nullable so it's a union of "null" and a record type
        // -- take the second element in the array's schema
        Iterator<Schema> typeSchemaItr = dataField.schema().getTypes().iterator();
        if(!typeSchemaItr.hasNext()) {
            throw new Avro837FlatToExpandedException("Expected a nullable field definition.");
        }
        // -- Discard the "null"
        typeSchemaItr.next();
        if(!typeSchemaItr.hasNext()) {
            throw new Avro837FlatToExpandedException("Expected a nullable field definition.");
        }
        Schema recordSchema = typeSchemaItr.next();
        GenericRecord x837Record = new GenericData.Record(recordSchema);

        // Stick it in the envelope
        envRecord.put("data", x837Record);

        // Build the rest of the nested records
        walkTheLoop(x837Record, x837);

        return envRecord;
    }

    /**
     * Recursive method for building an expanded (nested) Avro record instance from the given X12 Loop
     *
     * @param x837Record
     * @param currentLoop
     */
    void walkTheLoop(GenericRecord x837Record, Loop currentLoop) throws Avro837FlatToExpandedException {

        // An X12 is composed of loops and segments.
        // Segments contain data at this loop level.
        // Loops are nested collections of loops and segments.

        // Set data from segments
        // -- Construct an avro array object to hold the segment info
        GenericArray<Utf8> segmentsArray = new GenericData.Array<>(currentLoop.getSegments().size(), segmentsArraySchema);
        for(Segment segment : currentLoop.getSegments()) {

            // -- add the segment data into the array
            segmentsArray.add(new Utf8(segment.toString()));
        }

        // For any fields which don't get set, we want to null them in the generic record.
        Set<String> schemaFieldsSet = new HashSet<>();
        for (Schema.Field field : x837Record.getSchema().getFields()) {

            schemaFieldsSet.add(field.name());
        }
        schemaFieldsSet.remove("zSEGMENTS"); // this one is optional

        // -- add the array object as a value of that field
        if(segmentsArray.size()>0) {
            x837Record.put("zSEGMENTS", segmentsArray);
        }

        // For each loop in currentLoop
        for(Loop loop : currentLoop.getLoops()) {

            // Select the proper schema for the next loop
            String loopName = loop.getName();
            String recordSchemaName = Avro837Util.makeAvroName(loopName);
            Schema.Field field = x837Record.getSchema().getField(recordSchemaName);
            if(null==field) {
                throw new Avro837FlatToExpandedException("Couldn't locate a field for: "+recordSchemaName);
            }
            Schema recordSchema = field.schema();

            // TODO: potentially recognize different types of specified schemas
            if(recordSchema.getType()==Schema.Type.RECORD) {

                // Create the nested record representing the loop
                GenericRecord nestedRecord = new GenericData.Record(recordSchema);

                // walkThe nested loop
                // DEBUG
                System.out.println("walkTheLoop for "+recordSchemaName);
                walkTheLoop(nestedRecord, loop);

                // set the property of the outer record for this loop
                x837Record.put(recordSchemaName, nestedRecord);
                schemaFieldsSet.remove(recordSchemaName);
            } else {

                // The segment data for this loop (it's a leaf) rolls up into the value of a property
                // of the current record.  For instance, 1000A (Submitter Name) is a property of the enclosing loop
                // and is implemented in the avro schema as an array of strings.

                // Set the segment values of loop into the enclosing GenericRecord, x837Record

                // -- Construct an avro string object to hold the segment info
                ArrayNode segmentsFieldValueJson = mapper.createArrayNode();

                // -- Go through the segments and fill the array
                for(Segment segment : loop.getSegments()) {
                    segmentsFieldValueJson.add(segment.toString());
                }

                // -- the field of the enclosing x837Record is named the same as the recordSchema
                // -- add the array object as a value of that field
                // DEBUG
                System.out.println("set value for "+recordSchemaName);
                x837Record.put(recordSchemaName, segmentsFieldValueJson.toString());
                schemaFieldsSet.remove(recordSchemaName);
            }
        } // loop processing

        // Check for missing fields
        if(!schemaFieldsSet.isEmpty()) {

            for (String fieldName : schemaFieldsSet) {

                // DEBUG
                System.out.println("Setting "+fieldName+" to empty.");
                x837Record.put(fieldName, null);
            }
        }
    }

    public X12Parser getX12Parser() {
        return x12Parser;
    }

    public Schema getX837AvroSchema() {
        return x837AvroSchema;
    }

    public Schema getSegmentsArraySchema() {
        return segmentsArraySchema;
    }
}
