package net.explorys.samhat;

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
    public void canCreateJsonFromSchema() {

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
}
