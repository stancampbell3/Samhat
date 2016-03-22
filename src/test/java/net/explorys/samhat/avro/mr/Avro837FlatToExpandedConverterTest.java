package net.explorys.samhat.avro.mr;

import net.explorys.samhat.AvroSchemaGenerator;
import net.explorys.samhat.AvroSchemaParsingException;
import net.explorys.samhat.CfSchemaParsingException;
import net.explorys.samhat.DeclaredTypeInfo;
import net.explorys.samhat.z12.r837.Flat837;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.junit.Ignore;
import org.junit.Test;
import org.pb.x12.Context;
import org.pb.x12.Segment;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static org.junit.Assert.*;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stan.campbell on 9/3/15.
 */
public class Avro837FlatToExpandedConverterTest {

    @Test
    public void canInstantiateDeclaredTypeInformation() {

        try {


            InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");

            AvroSchemaGenerator schemaGenerator = new AvroSchemaGenerator();
            String jsonSchema = schemaGenerator.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schema837Pro);
            InputStream schem837ProAvro = new ByteArrayInputStream(jsonSchema.getBytes());

            schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional_custom.xml");
            Avro837FlatToExpandedConverter instance = new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);

            String xPath = "x12_schema[@name=\"X12\"]/loop[@name=\"ISA\"]/loop[@name=\"GS\"]/loop[@name=\"ST\"]/loop[@name=\"2000A\"]/segment[@name=\"2010AA\"]";
            DeclaredTypeInfo declaredTypeInfo = instance.getDeclaredTypeInfo(xPath);

            assertNotNull(declaredTypeInfo);
            assertEquals(declaredTypeInfo.getClassName(), "net.explorys.samhat.z12.r837.ContactInfo");
            assertEquals(declaredTypeInfo.getArity(), 7);
            assertNotNull(declaredTypeInfo.getPatterns());
            assertEquals(declaredTypeInfo.getPatterns().size(), 4);

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    /**
     * Repeat the test, but use the institutional schema.
     */
    @Test
    public void canInstantiateDeclaredTypeInformation2() {

        try {


            InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_institutional.xml");

            AvroSchemaGenerator schemaGenerator = new AvroSchemaGenerator();
            String jsonSchema = schemaGenerator.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schema837Pro);
            InputStream schem837ProAvro = new ByteArrayInputStream(jsonSchema.getBytes());

            schema837Pro = getClass().getResourceAsStream("/x12_schema_837_institutional.xml");
            Avro837FlatToExpandedConverter instance = new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);

            String xPath = "x12_schema[@name=\"X12\"]/loop[@name=\"ISA\"]/loop[@name=\"GS\"]/loop[@name=\"ST\"]/loop[@name=\"2000A\"]/segment[@name=\"2010AA\"]";
            DeclaredTypeInfo declaredTypeInfo = instance.getDeclaredTypeInfo(xPath);

            assertNotNull(declaredTypeInfo);
            assertEquals(declaredTypeInfo.getClassName(), "net.explorys.samhat.z12.r837.ContactInfo");
            assertEquals(declaredTypeInfo.getArity(), 7);
            assertNotNull(declaredTypeInfo.getPatterns());
            assertEquals(declaredTypeInfo.getPatterns().size(), 4);

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canConvertFlatToExpanded() {

        try {

            Avro837FlatToExpandedConverter instance = createInstance();

            Flat837 flatAvroRecord = createFlatTestRecordPro();

            GenericRecord expandedAvroRecord = instance.expand837(flatAvroRecord);

            assertNotNull(expandedAvroRecord);

            // TODO: check contents
            // -- should be an envelope
            String data = (String)expandedAvroRecord.get("source_filename");
            assertNotNull(data);
            assertEquals(data, "BigHospital_Subsystem_1441214822957.edi");

            Long longData = (Long)expandedAvroRecord.get("ingested_timestamp");
            assertNotNull(longData);
            assertEquals(longData.longValue(), 1441229222420L);

            data = (String)expandedAvroRecord.get("organization");
            assertNotNull(data);
            assertEquals(data, "80");

            // -- subrecord
            GenericData.Record x12 = (GenericData.Record)expandedAvroRecord.get("data");
            assertNotNull(x12);

        } catch (Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void testMapSegmentsThroughPatterns() {

        try {

            Avro837FlatToExpandedConverter instance = createInstance();

            String[] patternStrs = {"NM1\\*\\w\\w\\*\\d+\\*([^\\*]+)\\*([^\\*]+)\\*.*",
                    "N3\\*([^\\*]+).*",
                    "N4\\*([^\\*]+)\\*([^\\*]+)\\*([^\\*]+)",
                    "DMG\\*[^\\*]+\\*(\\d+)\\*F.*"
            };

            DeclaredTypeInfo declaredTypeInfo = new DeclaredTypeInfo("net.explorys.samhat.z12.r837.ContactInfo", 7, patternStrs);

            List<Segment> segmentsList = createTestSegments();

            CharSequence[] args = instance.mapSegmentsThroughPatterns(segmentsList, declaredTypeInfo);

            assertNotNull(args);
            assertEquals(args.length, declaredTypeInfo.getArity());

        } catch(Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void testInstantiateDeclaredType() {

        try {

            Avro837FlatToExpandedConverter instance = createInstance();

            String[] patternStrs = {"NM1\\*\\w\\w\\*\\d+\\*([^\\*]+)\\*([^\\*]+)\\*.*",
                    "N3\\*([^\\*]+).*",
                    "N4\\*([^\\*]+)\\*([^\\*]+)\\*([^\\*]+)",
                    "DMG\\*[^\\*]+\\*(\\d+)\\*F.*"
            };

            DeclaredTypeInfo declaredTypeInfo = new DeclaredTypeInfo("net.explorys.samhat.z12.r837.ContactInfo", 7, patternStrs);
            List<Segment> segmentsList = createTestSegments();

            CharSequence[] args = instance.mapSegmentsThroughPatterns(segmentsList, declaredTypeInfo);

            Object target = instance.instantiateDeclaredType(args, declaredTypeInfo);

            assertNotNull(target);

        } catch(Exception e) {

            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    Avro837FlatToExpandedConverter createInstance() throws IllegalAccessException, ParserConfigurationException, AvroSchemaParsingException, IOException, ClassNotFoundException, SAXException, NoSuchFieldException, CfSchemaParsingException {
        InputStream schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");

        AvroSchemaGenerator schemaGenerator = new AvroSchemaGenerator();
        String jsonSchema = schemaGenerator.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schema837Pro);
        InputStream schem837ProAvro = new ByteArrayInputStream(jsonSchema.getBytes());

        schema837Pro = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
        return new Avro837FlatToExpandedConverter(schema837Pro, schem837ProAvro);
    }

    List<Segment> createTestSegments() {

        ArrayList<Segment> segmentsList = new ArrayList<>();
        Context context = new Context('~', '*', ':');
        Segment segment = new Segment(context);
        String[] segmentElements = { "NM1","85","2","BEN KILDARE SERVICE","","","","","XX","9876543210" };
        for(String segmentElement : segmentElements) {
            segment.addElement(segmentElement);
        }
        segmentsList.add(segment);

        segment = new Segment(context);
        String[] segmentElements2 = { "N3","234 SEAWAY ST" };
        for(String segmentElement : segmentElements2) {
            segment.addElement(segmentElement);
        }
        segmentsList.add(segment);

        segment = new Segment(context);
        String[] segmentElements4 = { "N4","MIAMI","FL","33111" };
        for(String segmentElement : segmentElements4) {
            segment.addElement(segmentElement);
        }
        segmentsList.add(segment);

        segment = new Segment(context);
        String[] segmentElements5 = { "REF","EI","587654321" };
        for(String segmentElement : segmentElements5) {
            segment.addElement(segmentElement);
        }
        segmentsList.add(segment);
        return segmentsList;
    }

    /**
     * Create a flat GenericRecord (Avro) for testing.
     *
     * @return
     */
    Flat837 createFlatTestRecordPro() throws IOException {

        String data = loadResourceDocument("/ASC X12/005010/Technical Reports/Type 3/Finals/Examples/005010X222 Health Care Claim Professional/X222-commercial-health-insurance.edi");

        Flat837 outRecord = Flat837.newBuilder().
                setSourceFilename("BigHospital_Subsystem_1441214822957.edi").
                setOrganization("80").
                setIngestedTimestamp(1441229222420L).
                setData(data).
                build();

        return outRecord;
    }

    /**
     * Utility.  Read the file at path, yielding a String with its contents.
     *
     * @param path
     * @return
     * @throws IOException
     */
    String loadResourceDocument(String path) throws IOException {

        StringBuilder bld = new StringBuilder();
        BufferedReader rdr = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
        String line;
        do {
            line = rdr.readLine();
            bld.append(line);
            bld.append("\n");
        } while(line!=null);
        return bld.toString();
    }
}
