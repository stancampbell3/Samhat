package net.explorys.samhat;

import org.codehaus.jackson.node.ObjectNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by stan.campbell on 8/31/15.
 *
 * Provide a handy way of keeping track of mutual dependencies when compiling the schema from the JSON description.
 */
public class AvroSchemaSymbolTable {

    class SymbolTableEntry {

        private String symbol;
        private ObjectNode objectNode;
        private int usageCount;

        public SymbolTableEntry(String symbol, ObjectNode objectNode) {

            this.symbol = symbol;
            this.objectNode = objectNode;
        }

        public SymbolTableEntry(String symbol, ObjectNode objectNode, int usageCount) {

            this.symbol = symbol;
            this.objectNode = objectNode;
            this.usageCount = usageCount;
        }
    }

    private HashMap<String, SymbolTableEntry> symbolMap = new HashMap<String, SymbolTableEntry>();

    public void put(String key, ObjectNode node) {

        if(!symbolMap.containsKey(key)) {
            symbolMap.put(key, new SymbolTableEntry(key, node, 0));
        } else {
            SymbolTableEntry entry = symbolMap.get(key);
            symbolMap.put(key, new SymbolTableEntry(key, node, entry.usageCount+1));
        }
    }

    public List<ObjectNode> getRecordDefinitions() {

        ArrayList<ObjectNode> list = new ArrayList<ObjectNode>();
        for( SymbolTableEntry entry : symbolMap.values() ) {

            list.add(entry.objectNode);
        }
        return list;
    }
}
