package net.explorys.samhat;

import net.explorys.samhat.avro.Avro837Util;
import org.apache.avro.Schema;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by stan.campbell on 8/31/15.
 */
public class AvroSchemaGeneratorTest {

    AvroSchemaGenerator instance = new AvroSchemaGenerator();

    @Test
    public void canCreateJsonObjectsFromSchema() {

        try {

            InputStream schemaDefinition = getClass().getResourceAsStream("/x12_schema_837_professional2.xml");
            ObjectNode avroSchemaDef = instance.constructAvroJsonFromXmlSchema("net.explorys.samhat.z12.r837", schemaDefinition);

            assertNotNull(avroSchemaDef);

            System.out.println("JSON Schema:" + avroSchemaDef.toString());

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canCreateFullJsonSchemaAsString() {

        try {

            InputStream schemaDefinition = getClass().getResourceAsStream("/x12_schema_837_professional2.xml");
            String jsonSchema = instance.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schemaDefinition);

            assertNotNull(jsonSchema);

            System.out.println(jsonSchema);

            // Try to compile the schema
            Schema.Parser avroParser = new Schema.Parser();
            Schema schemaCooked = avroParser.parse(jsonSchema);

            assertNotNull(schemaCooked);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    /**
     * This test is primarily intended to ensure that our target schema format is compatible with the Avro parser.
     * If the parser is upgraded and our code generation becomes invalid, this test will begin to fail.
     *
     */
    @Test
    public void avroSchemaIsCompilable() {

        try {

            InputStream schemaDefinition = getClass().getResourceAsStream("/x12_schema_837_professional2.xml");
            String jsonSchema = instance.constructAvroSchemaFromXmlSchema("net.explorys.samhat.z12.r837", schemaDefinition);
            ByteArrayInputStream testSchema = new ByteArrayInputStream(jsonSchema.getBytes());

            StringBuffer buf = new StringBuffer();
            BufferedReader rdr = new BufferedReader( new InputStreamReader(testSchema));
            String line;
            do {
                line = rdr.readLine();
                buf.append(line);
                buf.append("\n");
            } while(line!=null);

            String schema = buf.toString();

            assertNotNull(schema);

            // Try to compile the schema
            Schema.Parser avroParser = new Schema.Parser();
            Schema schemaCooked = avroParser.parse(schema);

            assertNotNull(schemaCooked);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: " + e);
        }
    }

    ObjectNode getTestNode() {

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode sampleNode = mapper.createObjectNode();
        sampleNode.put("name", "X12");
        ArrayNode fieldsArray = mapper.createArrayNode();
        sampleNode.put("fields", fieldsArray);
        ObjectNode fieldDef = mapper.createObjectNode();
        fieldDef.put("name", "zISA");
        fieldDef.put("type", "ISA");
        fieldsArray.add(fieldDef);
        fieldDef = mapper.createObjectNode();
        fieldDef.put("name", "IEA");
        fieldDef.put("type", "string");
        fieldsArray.add(fieldDef);
        return sampleNode;
    }

    @Test
    public void canMakeAvroNames() {

        // Ensure we're properly formatting identifiers using a prefix

        ObjectNode sampleNode = getTestNode();

        String name = Avro837Util.makeAvroName(sampleNode.get("name").getTextValue());

        assertEquals("zX12", name);
    }
}
