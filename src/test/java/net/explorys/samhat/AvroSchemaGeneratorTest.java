package net.explorys.samhat;

import org.apache.avro.Schema;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by stan.campbell on 8/31/15.
 */
public class AvroSchemaGeneratorTest {

    AvroSchemaGenerator instance = new AvroSchemaGenerator();

    @Test
    public void canCreateJsonObjectsFromSchema() {

        try {

            InputStream schemaDefinition = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
            List<ObjectNode> jsonObjects = instance.constructAvroJsonFromXmlSchema(schemaDefinition);

            assertNotNull(jsonObjects);

            System.out.println("JSON Schema:" + jsonObjects.toString());

        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception: "+e);
        }
    }

    @Test
    public void canCreateFullJsonSchemaAsString() {

        try {

            InputStream schemaDefinition = getClass().getResourceAsStream("/x12_schema_837_professional.xml");
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
}
