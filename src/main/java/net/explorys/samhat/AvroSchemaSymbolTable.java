package net.explorys.samhat;

import org.codehaus.jackson.node.ObjectNode;

import java.util.*;

/**
 * Created by stan.campbell on 8/31/15.
 *
 * Provide a handy way of keeping track of mutual dependencies when compiling the schema from the JSON description.
 */
public class AvroSchemaSymbolTable {

    private HashMap<String, SymbolTableEntry> symbolMap = new HashMap<>();

    public void put(String key, ObjectNode node) {

        if(!symbolMap.containsKey(key)) {
            symbolMap.put(key, new SymbolTableEntry(key, node, new HashSet<String>()));
        } else {
            SymbolTableEntry oldEntry = symbolMap.get(key);
            HashSet<String> referringTypes = new HashSet<>();
            if(oldEntry.getReferringTypes()!=null) {
                referringTypes.addAll(oldEntry.getReferringTypes());
            }
            symbolMap.put(key, new SymbolTableEntry(key, node, referringTypes));
        }
    }

    public void put(String key, ObjectNode node, Set<String> referringTypes) {

        if(!symbolMap.containsKey(key)) {
            symbolMap.put(key, new SymbolTableEntry(key, node, referringTypes));
        } else {
            SymbolTableEntry entry = symbolMap.get(key);
            HashSet<String> knownReferringTypes = new HashSet(entry.getReferringTypes());
            knownReferringTypes.addAll(referringTypes);
            symbolMap.put(key, new SymbolTableEntry(key, node, knownReferringTypes));
        }
    }

    public void put(String key, String referrent) {

        if(!symbolMap.containsKey(key)) {
            HashSet<String> referringTypes = new HashSet<>();
            referringTypes.add(referrent);
            symbolMap.put(key, new SymbolTableEntry(key, null, referringTypes));
        } else {
            SymbolTableEntry entry = symbolMap.get(key);
            symbolMap.put(key, entry.addReferringType(referrent));
        }
    }

    public Set<String> getReferringTypes(String key) throws NoSuchElementException {
        if(!symbolMap.containsKey(key)) {
            throw new NoSuchElementException("No entry for: "+key);
        } else {
            return symbolMap.get(key).getReferringTypes();
        }
    }

    public List<ObjectNode> getRecordDefinitions() {

        ArrayList<ObjectNode> list = new ArrayList<ObjectNode>();
        for( SymbolTableEntry entry : symbolMap.values() ) {

            list.add(entry.getObjectNode());
        }
        return list;
    }

    /**
     * Return any associated record definition for this key.  If no record exists throw NoSuchElementException.
     * Note the returned object node could be null.
     *
     * @param key
     * @return
     * @throws NoSuchElementException
     */
    public ObjectNode getRecordDefinition(String key) throws NoSuchElementException {

        if(symbolMap.containsKey(key)) {
            return symbolMap.get(key).getObjectNode();
        } else {
            throw new NoSuchElementException("No such record definition for: "+key);
        }
    }

    public boolean containsKey(String key) {
        return symbolMap.containsKey(key);
    }

    public Set<String> keySet() {
        return symbolMap.keySet();
    }

    /**
     * Return a List of ObjectNode's defining the types so that forward references are resolved.
     * For instance, if Record2300 is referred to by Record200C then the former will appear in the list *before*
     * the latter.
     *
     * @return
     */
    public List<ObjectNode> getRecordDefinitionsInDeclarativeOrder() throws AvroSchemaParsingException {

        LinkedList<SymbolTableEntry> entries = new LinkedList<>();
        for(SymbolTableEntry entry : symbolMap.values()) {
            if(entry.getReferringTypes().size()==0) {
                System.out.println("Adding "+entry.getSymbol()+" to end of list.  Referring types: "+entry.getReferringTypes());
                entries.addLast(entry);
            } else {
                // find the first entry which refers to this entry
                String firstReferring = entry.getReferringTypes().toArray()[0].toString();
                int targetPos = entries.indexOf( symbolMap.get(""+firstReferring) );
                if(targetPos>=0) {
                    // insert this item before that entry
                    System.out.println("Adding "+entry.getSymbol()+" to position "+targetPos+".  Referring types: "+entry.getReferringTypes());
                    entries.add(targetPos, entry);
                } else {
                    // haven't seen the referring type yet, just insert the entry at the end
                    System.out.println("Couldn't find " + firstReferring + " adding " + entry.getSymbol() + " to end of list.  Referring types: "+entry.getReferringTypes());
                    entries.addLast(entry);
                }
            }
        }
        ArrayList<ObjectNode> nodes = new ArrayList<>();
        for(SymbolTableEntry entry : entries) {
            nodes.add(entry.getObjectNode());
        }
        return nodes;
    }

    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        for(SymbolTableEntry entry : symbolMap.values()) {
            bld.append(entry.toString()).append("\n");
        }
        return bld.toString();
    }
}
