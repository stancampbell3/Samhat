package net.explorys.samhat.avro.mr;

import net.explorys.samhat.*;
import net.explorys.samhat.avro.Avro837FlatToExpandedException;
import net.explorys.samhat.avro.Avro837Util;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.codehaus.jackson.map.ObjectMapper;
import org.pb.x12.*;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.*;

/**
 * Created by stan.campbell on 1/15/16.
 */
abstract public class AbstractAvro837FlatToExpandedConverter {

    // Provide for overriding the X12 delimiter
    private String x12Delimiter = "\\*";

    X12Parser x12Parser;
    Schema.Parser avroParser = (new Schema.Parser());
    Schema x837AvroSchema;
    ObjectMapper mapper = new ObjectMapper();

    // Cached XML document containing the target X12 Schema
    Document document = null;
    XPath xPath;

    public AbstractAvro837FlatToExpandedConverter(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException {

        try {
            // Cache the cfSchemaXML input stream since we'll use it twice
            ByteBuffer xmlBytes = xmlStreamToByteBuffer(cfSchemaXML);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xmlBytes.array());

            // Use our Cf schema parser to translate the XML specification into an instance of CfSchema
            ICfSchemaParser ICfSchemaParser = new XmlBasedCfSchemaParser();
            Cf schema = ICfSchemaParser.parseSchema(byteArrayInputStream);

            // Reset the xml input stream
            byteArrayInputStream.reset();

            // Load the DOM
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            document = dBuilder.parse(byteArrayInputStream);

            // Normalize to compensate for stray whitespace in the spec
            document.getDocumentElement().normalize();

            // Create our XPath
            XPathFactory xPathFactory = XPathFactory.newInstance();
            xPath = xPathFactory.newXPath();

            // Instantiate our x12Parser for the given cfSchema
            x12Parser = new X12Parser(schema);

            // Instantiate our Avro schemas.
            x837AvroSchema = avroParser.parse(x837AvroSchemaStream);
        } catch(Exception e) {

            throw new CfSchemaParsingException("Error setting up schema information", e);
        }
    }

    public X12Parser getX12Parser() {
        return x12Parser;
    }

    public Schema getX837AvroSchema() {
        return x837AvroSchema;
    }

    public ObjectMapper getMapper() {
        return mapper;
    }

    public Document getDocument() {
        return document;
    }

    public XPath getxPath() {
        return xPath;
    }

    /**
     * For the given subrecord, place the data in the given field.
     * If the field already has data, add to it.
     *
     * @param nestedRecord
     * @param fieldName
     * @param data
     */
    public void setRecordField(GenericRecord nestedRecord, String fieldName, String[] data) throws Avro837FlatToExpandedException {
        GenericData.Array<String> array;
        Object currentContents = nestedRecord.get("unmapped");
        if(null==currentContents) {
            array = new GenericData.Array<String>(data.length, AvroSchemaGenerator.SEGMENTS_ELEMENT_SCHEMA);
        } else {
            array = (GenericData.Array<String>)currentContents;
        }

        for(String datum : data) {
            array.add(datum);
        }

        try {
            nestedRecord.put(fieldName, array);
        } catch(Exception e) {
            throw new Avro837FlatToExpandedException("Error setting record field for "+fieldName, e);
        }
    }

    /**
     * Read an XML document into a bytebuffer for convenient handling.
     *
     * @param xmlInputStream
     * @return
     * @throws IOException
     */
    ByteBuffer xmlStreamToByteBuffer(InputStream xmlInputStream) throws IOException {

        InputStreamReader rdr = new InputStreamReader( xmlInputStream );
        ArrayList<Byte> arr = new ArrayList<>();

        int datum = rdr.read();
        while(datum>=0) {
            arr.add((byte)datum);
            datum = rdr.read();
        }
        ByteBuffer ret = ByteBuffer.allocate(arr.size());
        for(Byte b : arr) {
            ret.put(b.byteValue());
        }
        return ret;
    }

    /**
     * Determine the xpath query to locate the schema information for the Loop.
     *
     * @param currentLoop
     * @return
     */
    String calculateXPath(Loop currentLoop, String elementType) {

        // Build the xpath expression
        Stack<String> pathStack = new Stack<String>();
        Loop loopPtr = currentLoop;
        while(loopPtr!=null) {
            String currentLoopName = loopPtr.getName();
            if(null==loopPtr.getParent()) {
                pathStack.push("x12_schema[@name=\""+currentLoopName+"\"]");
            } else {
                if(loopPtr.getLoops().size()==0) {
                    pathStack.push(elementType + "[@name=\""+currentLoopName+"\"]");
                } else {
                    pathStack.push("loop[@name=\""+currentLoopName+"\"]");
                }
            }
            loopPtr = loopPtr.getParent();
        }
        StringBuilder bld = new StringBuilder();
        do {
            bld.append(pathStack.pop());
            if(!pathStack.empty()) {
                bld.append("/");
            }
        } while(!pathStack.empty());
        return bld.toString();
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

        ByteBuffer data = flat837Record.getData();
        X12 x837 = (X12)x12Parser.parse(new ByteArrayInputStream(data.array()));

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

    abstract void createTheCurrentRecord(Schema recordSchema, Loop loop,
                                                GenericRecord x837Record,
                                                Set<String> schemaFieldsSet, String recordSchemaName) throws Exception;

    /**
     * Recursive method for building an expanded (nested) Avro record instance from the given X12 Loop
     *
     * @param x837Record
     * @param currentLoop
     */
    void walkTheLoop(GenericRecord x837Record, Loop currentLoop) throws Avro837FlatToExpandedException {

        try {

            // An X12 is composed of loops and segments.
            // Segments contain data at this loop level.
            // Loops are nested collections of loops and segments.

            // For any fields which don't get set, we want to null them in the generic record.
            Set<String> schemaFieldsSet = new HashSet<>();
            for (Schema.Field field : x837Record.getSchema().getFields()) {

                schemaFieldsSet.add(field.name());
            }
            schemaFieldsSet.remove("zSEGMENTS"); // this one is optional

            // For each loop in currentLoop
            for (Loop loop : currentLoop.getLoops()) {

                // Select the proper schema for the next loop
                String loopName = loop.getName();
                String recordSchemaName = Avro837Util.makeAvroName(loopName);
                Schema.Field field = x837Record.getSchema().getField(recordSchemaName);
                if (null == field) {
                    throw new Avro837FlatToExpandedException("Couldn't locate a field for: " + recordSchemaName);
                }
                // For Union types (nullable fields), we'll take the second type in the array
                Schema recordSchema = field.schema().getType() == Schema.Type.UNION ? field.schema().getTypes().get(1) : field.schema();

                // Loop processing
                createTheCurrentRecord(recordSchema, loop, x837Record, schemaFieldsSet, recordSchemaName);
            }

            // Check for missing fields
            if (!schemaFieldsSet.isEmpty()) {

                for (String fieldName : schemaFieldsSet) {

                    // DEBUG
                    // System.out.println("Setting "+fieldName+" to empty.");
                    x837Record.put(fieldName, null);
                }
            }
        } catch(Exception e) {
            throw new Avro837FlatToExpandedException("Error constructing Avro record instance", e);
        }
    }

    public String getX12Delimiter() {
        return x12Delimiter;
    }

    public void setX12Delimiter(String x12Delimiter) {
        this.x12Delimiter = x12Delimiter;
    }
}
