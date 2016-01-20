package net.explorys.samhat;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Provide concrete information about the class which should be represented in the generated Avro schema.
 */
public class DeclaredTypeInfo {

    private String className;
    private int arity;
    private List<Pattern> patterns;

    private List<String> qualifiedFields;
    private List<String> unqualifiedFields;

    public DeclaredTypeInfo(String className, int arity, List<Pattern> patterns) {
        this.className = className;
        this.arity = arity;
        this.patterns = patterns;
        this.qualifiedFields = new ArrayList<>();
        this.unqualifiedFields = new ArrayList<>();
    }

    public DeclaredTypeInfo(String className, int arity, String[] patterns) {
        this.className = className;
        this.arity = arity;
        this.qualifiedFields = new ArrayList<>();
        this.unqualifiedFields = new ArrayList<>();

        this.patterns = new ArrayList<Pattern>();
        for(String pattern : patterns) {
            this.patterns.add( Pattern.compile(pattern));
        }
    }

    public DeclaredTypeInfo(String className, int arity, List<Pattern> patterns, List<String> qualifiedFields, List<String> unqualifiedFields) {
        this.className = className;
        this.arity = arity;
        this.patterns = patterns;
        this.qualifiedFields = qualifiedFields;
        this.unqualifiedFields = unqualifiedFields;
    }

    public String getClassName() {
        return className;
    }

    public int getArity() {
        return arity;
    }

    public List<Pattern> getPatterns() {
        return patterns;
    }

    public List<String> getQualifiedFields() {
        return qualifiedFields;
    }

    public List<String> getUnqualifiedFields() {
        return unqualifiedFields;
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append(className).append(" : ").append(arity).append(" : {");
        for(Pattern p : patterns) {
            buf.append("\"").append(p).append("\" ");
        }
        buf.append(" }");
        return buf.toString();
    }
}
