package net.explorys.samhat;

import org.codehaus.jackson.node.ObjectNode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by stan.campbell on 9/1/15.
 */
class SymbolTableEntry {

    private String symbol;
    private ObjectNode objectNode;
    private Set<String> referringTypes;

    public SymbolTableEntry(String symbol, ObjectNode objectNode) {

        this.symbol = symbol;
        this.objectNode = objectNode;
        referringTypes = new HashSet<String>();
    }

    public SymbolTableEntry(String symbol, ObjectNode objectNode, Set<String> referringTypes) {

        this.symbol = symbol;
        this.objectNode = objectNode;
        this.referringTypes = referringTypes;
    }

    public String getSymbol() {
        return symbol;
    }

    public ObjectNode getObjectNode() {
        return objectNode;
    }

    public Set<String> getReferringTypes() {
        return referringTypes;
    }

    public SymbolTableEntry addReferringType(String type) {
        if(referringTypes==null) {
            referringTypes = new HashSet(this.referringTypes);
        }
        referringTypes.add(type);
        SymbolTableEntry entry = new SymbolTableEntry(this.symbol, this.objectNode, referringTypes);
        return entry;
    }

    public SymbolTableEntry addAllReferringTypes(Collection<String> types) {
        if(referringTypes==null) {
            referringTypes = new HashSet(this.referringTypes);
        }
        referringTypes.addAll(types);
        SymbolTableEntry entry = new SymbolTableEntry(this.symbol, this.objectNode, referringTypes);
        return entry;
    }

    @Override
    public String toString() {
        return (new StringBuilder()).append(symbol).
                append("\t").append(objectNode!=null ? objectNode.toString() : "NULL").
                append("\t").append(referringTypes!=null ? referringTypes.toString() : "NONE").toString();
    }


}
