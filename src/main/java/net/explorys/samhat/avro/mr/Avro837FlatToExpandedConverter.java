package net.explorys.samhat.avro.mr;

import net.explorys.samhat.*;
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
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.*;
import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    // Cached XML document containing the target X12 Schema (used for resolving declared types for segments)
    private Document document = null;
    private XPath xPath;
    private Pattern patterns = Pattern.compile("\\[?'([^']+)'.*");

    public Avro837FlatToExpandedConverter(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException {

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
            Schema.Parser avroParser = (new Schema.Parser());
            x837AvroSchema = avroParser.parse(x837AvroSchemaStream);
            segmentsArraySchema = AvroSchemaGenerator.getSegmentsArraySchemaDefinition(avroParser);

        } catch(Exception e) {

            throw new CfSchemaParsingException("Error setting up schema information", e);
        }
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
        // System.out.println("x837: " + x837.toXML());

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

    String calculateXPath(Loop currentLoop) {

        // Build the xpath expression
        Stack<String> pathStack = new Stack<String>();
        Loop loopPtr = currentLoop;
        while(loopPtr!=null) {
            String currentLoopName = loopPtr.getName();
            if(null==loopPtr.getParent()) {
                pathStack.push("x12_schema[@name=\""+currentLoopName+"\"]");
            } else {
                if(loopPtr.getLoops().size()==0) {
                    pathStack.push("segment[@name=\""+currentLoopName+"\"]");
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


    List<Pattern> compilePatterns(String rawPatterns) {

        ArrayList<Pattern> patternArrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(rawPatterns, ",");
        while(st.hasMoreTokens()) {

            String rawEntry = st.nextToken().trim();
            Matcher m = patterns.matcher(rawEntry);
            if(!m.matches()) {
                throw new IllegalArgumentException("Pattern misformed: "+rawEntry);
            }
            String entry = m.group(1);
            Pattern pattern = Pattern.compile(entry);
            patternArrayList.add(pattern);
        }
        return patternArrayList;
    }

    DeclaredTypeInfo getDeclaredTypeInfo(String xPathStr) throws XPathExpressionException {

        XPathExpression xPathExpression = xPath.compile(xPathStr);
        NodeList nodeList = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);
        if(null==nodeList || nodeList.getLength()==0) {
            return null;
        } else {
            // TODO: add exception if more than one path is defined (dupe segment under same loop) or malformed attributes
            Node node = nodeList.item(0); // Just take the first item
            NamedNodeMap attribMap = node.getAttributes();

            // If the element has no declared type info, return null
            if(null==attribMap.getNamedItem("classname")) {
                return null;
            }

            String className = attribMap.getNamedItem("classname").getNodeValue();
            int arity = Integer.parseInt(attribMap.getNamedItem("arity").getNodeValue());

            // Compile the patterns
            String rawPatterns = attribMap.getNamedItem("patterns").getNodeValue();
            List<Pattern> compiledPatterns = compilePatterns(rawPatterns);
            DeclaredTypeInfo ret = new DeclaredTypeInfo(className, arity, compiledPatterns);
            return ret;
        }
    }

    /**
     * Take the current node's segments and apply the DeclaredTypeInfo patterns, yielding the arguments
     * needed for the class's constructor of the given arity.
     *
     * Throw an exception if the number of segments doesn't match the DeclaredTypeInfo patterns length.
     * TODO: Investigate whether the order of segments may vary, meaning more difficult matching.
     *
     * Throw an exception if the number of returned groups doesn't match the arity. This indicates a problem with the
     * schema's regular expressions for the declared type.
     *
     * @param segments
     * @param declaredTypeInfo
     * @return
     */
    CharSequence[] mapSegmentsThroughPatterns(List<Segment> segments, DeclaredTypeInfo declaredTypeInfo) {

        List<Pattern> patterns = declaredTypeInfo.getPatterns();
        if(null==patterns || segments.size() != patterns.size() ) {
            throw new IllegalArgumentException("Patterns length and segments length must be equal.");
        }

        // Apply the patterns to each corresponding segment (1 for 1 in order for now), collecting the group information
        CharSequence[] arguments = new CharSequence[declaredTypeInfo.getArity()];
        Iterator<Segment> segmentItr = segments.iterator();
        int argCount = 0;
        for(Pattern pattern : patterns) {

            Segment segment = segmentItr.next();
            Matcher matcher = pattern.matcher(segment.toString());
            if(matcher.matches()) {

                int groupCount = matcher.groupCount();
                for(int g=0;g<groupCount;g++) {

                    arguments[argCount++] = (matcher.group(g));
                }

            } else {
                // Could be normal for a non-occuring element?
                arguments[argCount++] = "";
            }
        }

        return arguments;
    }

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

            // TODO: pass current path on param list rather than building it each time
            String currentXPath = calculateXPath(currentLoop);

            // DEBUG
            System.out.println("xpath: "+currentXPath);
            int numSegments = currentLoop.getSegments().size();
            System.out.println("--> segment count: "+numSegments);
            int numSubloops = currentLoop.getLoops().size();
            System.out.println("--> loop count: "+numSubloops);

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

                // TODO: potentially recognize different types of specified schemas
                if (recordSchema.getType() == Schema.Type.RECORD) {

                    String loopXpath = calculateXPath(loop);
                    DeclaredTypeInfo declaredTypeInfo = getDeclaredTypeInfo(loopXpath);
                    if(null!=declaredTypeInfo) {

                        CharSequence[] args = mapSegmentsThroughPatterns(loop.getSegments(), declaredTypeInfo);
                        System.out.println("*** PING PING PING ***");

                    } else {

                        // Create the nested record representing the loop
                        GenericRecord nestedRecord = new GenericData.Record(recordSchema);

                        // walkThe nested loop
                        // DEBUG
                        System.out.println("walkTheLoop for " + recordSchemaName);
                        walkTheLoop(nestedRecord, loop);

                        // set the property of the outer record for this loop
                        // DEBUG
                        // System.out.println("set value for "+recordSchemaName);
                        x837Record.put(recordSchemaName, nestedRecord);
                        schemaFieldsSet.remove(recordSchemaName);
                    }

                } else {

                    // The segment data for this loop (it's a leaf) rolls up into the value of a property
                    // of the current record.

                    // For instance, 1000A (Submitter Name) is a property of the enclosing loop
                    // and is implemented in the avro schema as an array of strings.


                    // Set the segment values of loop into the enclosing GenericRecord, x837Record
                    String subloopXpath = calculateXPath(loop);
                    System.out.println("*** *** : "+subloopXpath );

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
            } // loop processing

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
