package net.explorys.samhat;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

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

        ObjectNode objectNode = getTestObjectNode("X12", Arrays.asList("ISA", "IEA"), Arrays.asList("ISA", "string"));

        String key = objectNode.get("name").getTextValue();
        instance.put(key, objectNode );
        assertTrue(instance.containsKey(key));

    }

    @Test
    public void returnsEntriesInProperOrder() {
        /**
         * The symbol table must be able to resolve dependencies among the type descriptions.
         * For instance, if record type A refers to B which refers to C and D and there are no other
         * restrictions.. we'd expect to get records back in C,D,B,A or D,C,B,A.  Referred-to types must
         * appear (and be defined in the schema) before referrent types.
         */
        try {

            AvroSchemaSymbolTable instance = new AvroSchemaSymbolTable();
            assertNotNull(instance);

            ObjectNode node = getTestObjectNode("zX12", Arrays.asList("zISA", "zIEA"), Arrays.asList("zISA", "string"));
            instance.put("zX12", node);
            node = getTestObjectNode("zISA", Arrays.asList("zGS", "zGE"), Arrays.asList("zGS", "string"));
            instance.put("zISA", node, new HashSet<String>(Arrays.asList("zX12")));
            node = getTestObjectNode("zGS", Arrays.asList("zXYZ", "zABC"), Arrays.asList("string", "string"));
            instance.put("zGS", node, new HashSet<String>(Arrays.asList("zISA")));

            List<ObjectNode> recordDefinitionsInDeclarativeOrder = instance.getRecordDefinitionsInDeclarativeOrder();
            // We expect zGS, zISA, zX12
            assertTrue( recordDefinitionsInDeclarativeOrder.size() == 3);

            ObjectNode item = recordDefinitionsInDeclarativeOrder.get(0);
            assertEquals(item.get("name").getTextValue(), "zGS");
            item = recordDefinitionsInDeclarativeOrder.get(1);
            assertEquals(item.get("name").getTextValue(), "zISA");
            item = recordDefinitionsInDeclarativeOrder.get(2);
            assertEquals(item.get("name").getTextValue(), "zX12");

        } catch (Exception e) {

            fail("Exception detected: "+e);
        }
    }

    ObjectNode getTestObjectNode(String typeName, List<String> fieldNames, List<String> fieldTypes) {

        // Example..
        // Calling getTestObjectNode with "X12", List("ISA", "IEA"), List("ISA", "string")) should yield an objectnode like
        // {"name":"X12","fields":[{"name":"ISA","type":"ISA"},{"name":"IEA","type":"string"}]}

        if(null==typeName || null==fieldNames || null==fieldTypes) {
            throw new IllegalArgumentException("typeName and fieldNames and fieldTypes lists must not be null");
        }
        if(fieldNames.size() != fieldTypes.size()) {
            throw new IllegalArgumentException("fieldNames length must match fieldTypes length");
        }

        ObjectNode node = mapper.createObjectNode();
        node.put("name", typeName);
        ArrayNode fields = mapper.createArrayNode();
        node.put("fields", fields);

        Iterator<String> fieldTypesItr = fieldTypes.iterator();
        for(String fieldName : fieldNames) {
            String fieldType = fieldTypesItr.next();
            ObjectNode fieldNode = mapper.createObjectNode();
            fieldNode.put("name", fieldName);
            fieldNode.put("type", fieldType);
            fields.add(fieldNode);
        }

        return node;
    }
}
