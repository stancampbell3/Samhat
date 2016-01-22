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
public class Avro837FlatToExpandedConverter extends AbstractAvro837FlatToExpandedConverter {

    private final Pattern patterns = Pattern.compile("\\[?'([^']+)'.*");

    public Avro837FlatToExpandedConverter(InputStream cfSchemaXML, InputStream x837AvroSchemaStream) throws CfSchemaParsingException {

        super(cfSchemaXML, x837AvroSchemaStream);
    }

    public Avro837FlatToExpandedConverter(String cfSchemaXML, Schema x837AvroSchema) throws CfSchemaParsingException {

        super(cfSchemaXML, x837AvroSchema);
    }

    @Override
    void createTheCurrentRecord(Schema recordSchema, Loop loop,
                                GenericRecord x837Record,
                                Set<String> schemaFieldsSet, String recordSchemaName) throws Exception {

        if (recordSchema.getType() == Schema.Type.RECORD) {

            // todo: fix the crazy multiple path searching silliness here
            DeclaredTypeInfo declaredTypeInfo = getDeclaredTypeInfo(calculateXPath(loop, "loop"));
            if(null==declaredTypeInfo) {
                // try looking it up by loop
                declaredTypeInfo = getDeclaredTypeInfo(calculateXPath(loop, "segment"));
            }

            if(null!=declaredTypeInfo) {
                if (null != declaredTypeInfo.getClassName()) {

                    List<Segment> segments = loop.getSegments();
                    CharSequence[] args = mapSegmentsThroughPatterns(segments, declaredTypeInfo);
                    if (args.length == declaredTypeInfo.getArity()) {

                        // Instantiate the declared type
                        Object obj = instantiateDeclaredType(args, declaredTypeInfo);

                        // Add the record to the enclosing record
                        x837Record.put(recordSchemaName, obj);

                        // Mark the field as being set
                        schemaFieldsSet.remove(recordSchemaName);

                    } else {
                        // TODO: qualify this exception
                        throw new Exception("Declared type arguments list not of arity " + declaredTypeInfo.getArity() + " for " + declaredTypeInfo.getClassName());
                    }

                } else {

                    // Create the nested record representing the loop
                    GenericRecord nestedRecord = new GenericData.Record(recordSchema);

                    // Distinguish between a leaf loop and a loop with subloops
                    if (loop.childList().size() > 0) {

                        // walkThe nested loop
                        // DEBUG
                        // System.out.println("walkTheLoop for " + recordSchemaName);
                        walkTheLoop(nestedRecord, loop);
                    } else {

                        for (Segment segment : loop.getSegments()) {

                            String segmentData = segment.toString();
                            if (null != segmentData && !"".equals(segmentData)) {

                                // Split on the delimiter
                                String[] data = segmentData.split(getX12Delimiter()); // todo: maybe a faster splitter?

                                if (null != data && data.length > 1) {

                                    String id0 = data[0];
                                    String id1 = data[0] + "_" + data[1];

                                    // The first item (exempli gratia "NM1") should either be an unqualified field
                                    if (declaredTypeInfo.getUnqualifiedFields().contains(id0)) {
                                        // Cool, stick it in the proper field
                                        setRecordField(nestedRecord, id0, data);
                                    } else if (declaredTypeInfo.getQualifiedFields().contains(id1)) {
                                        // or the first item underscore the second (exempli gratia "SBR_P") should be an qualified field
                                        setRecordField(nestedRecord, id1, data);
                                    } else {
                                        // otherwise, it's unmapped
                                        addUnmappedRecordField(nestedRecord, "unmapped", data);
                                    }
                                }
                            }
                        } // segment processing
                    }

                    // set the property of the outer record for this loop
                    // DEBUG
                    // System.out.println("set value for "+recordSchemaName);
                    x837Record.put(recordSchemaName, nestedRecord);
                    schemaFieldsSet.remove(recordSchemaName);
                }

            } else {

                throw new Avro837FlatToExpandedException("No type information for "+recordSchemaName);
            }

        } else {

            throw new Avro837FlatToExpandedException("Unsupported non-record type for "+recordSchemaName);
        }
    }


    /**
     * Determine the declared type information for a given XPath.  Return null if no declared type exists in the
     * schema at the given xPath.
     *
     * @param xPathStr
     * @return
     * @throws XPathExpressionException
     */
    DeclaredTypeInfo getDeclaredTypeInfo(String xPathStr) throws XPathExpressionException {

        XPathExpression xPathExpression = xPath.compile(xPathStr);
        NodeList nodeList = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);
        if(null==nodeList || nodeList.getLength()==0) {
            return null;
        } else {
            // TODO: add exception if more than one path is defined (dupe segment under same loop) or malformed attributes
            Node node = nodeList.item(0); // Just take the first item
            NamedNodeMap attribMap = node.getAttributes();

            String className = null;
            List<Pattern> compiledPatterns = new ArrayList<Pattern>();
            int arity = 0;

            if(null!=attribMap.getNamedItem("classname")) {


                className = attribMap.getNamedItem("classname").getNodeValue();
                arity = Integer.parseInt(attribMap.getNamedItem("arity").getNodeValue());

                // Compile the patterns
                String rawPatterns = attribMap.getNamedItem("patterns").getNodeValue();
                compiledPatterns = compilePatterns(rawPatterns);
            }

            ArrayList<String> qualifiedFields = new ArrayList<>();
            ArrayList<String> unqualifiedFields = new ArrayList<>();

            if(null!=attribMap.getNamedItem("qualifiedFields")) {
                String rawQualifiedFields = attribMap.getNamedItem("qualifiedFields").getNodeValue();
                if(!"".equals(rawQualifiedFields)) {
                    for(String field : rawQualifiedFields.split(",( )?")) {
                        qualifiedFields.add(field);
                    }
                }
            }

            if(null!=attribMap.getNamedItem("unqualifiedFields")) {
                String rawUnqualifiedFields = attribMap.getNamedItem("unqualifiedFields").getNodeValue();
                if(!"".equals(rawUnqualifiedFields)) {
                    for(String field : rawUnqualifiedFields.split(",( )?")) {
                        unqualifiedFields.add(field);
                    }
                }
            }

            DeclaredTypeInfo ret = new DeclaredTypeInfo(className, arity, compiledPatterns, qualifiedFields, unqualifiedFields);
            return ret;
        }
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
                for(int g=1;g<=groupCount;g++) {

                    arguments[argCount++] = (matcher.group(g));
                }

            } else {
                // Could be normal for a non-occuring element?
                arguments[argCount++] = "";
            }
        }

        return arguments;
    }

    Object instantiateDeclaredType(CharSequence[] args, DeclaredTypeInfo declaredTypeInfo) throws Avro837FlatToExpandedException {

        try {

            Class clazz = Class.forName(declaredTypeInfo.getClassName());

            // find the appropriate constructor with arity arguments
            Constructor[] constructors = clazz.getConstructors();
            for(Constructor constructor : constructors ) {

                if(constructor.getParameterTypes().length == declaredTypeInfo.getArity()) {

                    // First matching constructor
                    switch(declaredTypeInfo.getArity()) {

                        case 0 : throw new IllegalArgumentException("No matching constructor for "+declaredTypeInfo.getClassName());
                        case 1 : return constructor.newInstance(args[0]);
                        case 2 : return constructor.newInstance(args[0], args[1]);
                        case 3 : return constructor.newInstance(args[0], args[1], args[2]);
                        case 4 : return constructor.newInstance(args[0], args[1], args[2], args[3]);
                        case 5 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4]);
                        case 6 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5]);
                        case 7 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
                        case 8 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
                        case 9 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8]);
                        case 10 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9]);
                        case 11 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10]);
                        case 12 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11]);
                        case 13 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12]);
                        case 14 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13]);
                        case 15 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14]);
                        case 16 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15]);
                        case 17 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16]);
                        case 18 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17]);
                        case 19 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18]);
                        case 20 : return constructor.newInstance(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], args[12], args[13], args[14], args[15], args[16], args[17], args[18], args[19]);
                        default :
                            throw new IllegalArgumentException("No matching constructor for "+declaredTypeInfo.getClassName());
                    }
                }
            }

            throw new IllegalArgumentException("No matching constructor for "+declaredTypeInfo.getClassName());

        } catch(Exception e) {

            throw new Avro837FlatToExpandedException("Error constructing Avro record instance", e);
        }
    }
}
