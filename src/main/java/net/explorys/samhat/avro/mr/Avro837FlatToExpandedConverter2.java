package net.explorys.samhat.avro.mr;

import net.explorys.samhat.CfSchemaParsingException;
import net.explorys.samhat.DeclaredTypeInfo;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.codehaus.jackson.node.ArrayNode;
import org.pb.x12.Loop;
import org.pb.x12.Segment;

import java.io.InputStream;
import java.util.List;
import java.util.Set;

public class Avro837FlatToExpandedConverter2 extends AbstractAvro837FlatToExpandedConverter {

    public Avro837FlatToExpandedConverter2(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException {
        super(cfSchemaXML, x837AvroSchemaStream);
    }

    @Override
    void createTheCurrentRecord(Schema recordSchema, Loop loop,
                                GenericRecord x837Record,
                                Set<String> schemaFieldsSet, String recordSchemaName) throws Exception {

        // TODO: potentially recognize different types of specified schemas
        if (recordSchema.getType() == Schema.Type.RECORD) {

            // Create the nested record representing the loop
            GenericRecord nestedRecord = new GenericData.Record(recordSchema);

            // walkThe nested loop
            // DEBUG
            // System.out.println("walkTheLoop for " + recordSchemaName);
            walkTheLoop(nestedRecord, loop);

            // set the property of the outer record for this loop
            // DEBUG
            // System.out.println("set value for "+recordSchemaName);
            x837Record.put(recordSchemaName, nestedRecord);
            schemaFieldsSet.remove(recordSchemaName);

        } else {

            // The segment data for this loop (it's a leaf) rolls up into the value of a property
            // of the current record.

            // For instance, 1000A (Submitter Name) is a property of the enclosing loop
            // and is implemented in the avro schema as an array of strings.

            // -- Construct an avro string object to hold the segment info
            ArrayNode segmentsFieldValueJson = mapper.createArrayNode();

            // -- Go through the segments and fill the array
            for (Segment segment : loop.getSegments()) {
                segmentsFieldValueJson.add(segment.toString());
            }

            // -- the field of the enclosing x837Record is named the same as the recordSchema
            // -- add the array object as a value of that field
            // DEBUG
            // System.out.println("set value for "+recordSchemaName);
            x837Record.put(recordSchemaName, segmentsFieldValueJson.toString());
            schemaFieldsSet.remove(recordSchemaName);

        }
    }
}
