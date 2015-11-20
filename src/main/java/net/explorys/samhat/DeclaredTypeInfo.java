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

    public DeclaredTypeInfo(String className, int arity, List<Pattern> patterns) {
        this.className = className;
        this.arity = arity;
        this.patterns = patterns;
    }

    public DeclaredTypeInfo(String className, int arity, String[] patterns) {
        this.className = className;
        this.arity = arity;
        this.patterns = new ArrayList<Pattern>();
        for(String pattern : patterns) {
            this.patterns.add( Pattern.compile(pattern));
        }
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
}
