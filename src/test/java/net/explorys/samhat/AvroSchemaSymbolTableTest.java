package net.explorys.samhat;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stan.campbell on 9/1/15.
 */
public class AvroSchemaSymbolTableTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void canConstructFreshTable() {

        AvroSchemaSymbolTable instance = new AvroSchemaSymbolTable();

        assertNotNull(instance);
    }

    @Test
    public void canPutItemsAndGetThemBack() {

        AvroSchemaSymbolTable instance = new AvroSchemaSymbolTable();
        assertNotNull(instance);

        ObjectNode objectNode = getTestObjectNode();

        String key = objectNode.get("name").getTextValue();
        instance.put(key, objectNode );
        assertTrue( instance.containsKey(key) );

    }

    ObjectNode getTestObjectNode() {
        // {"name":"X12","fields":[{"name":"ISA","type":"ISA"},{"name":"IEA","type":"string"}]}
        ObjectNode node = mapper.createObjectNode();
        node.put("name", "X12");
        ArrayNode fields = mapper.createArrayNode();
        node.put("fields", fields);
        ObjectNode fieldNode = mapper.createObjectNode();
        fieldNode.put("name", "ISA");
        fieldNode.put("type", "ISA");
        fields.add(fieldNode);
        fieldNode = mapper.createObjectNode();
        fieldNode.put("name", "ISA");
        fieldNode.put("type", "ISA");
        fields.add(fieldNode);
        return node;
    }
}
