package net.explorys.samhat.z12.r837;

import org.pb.x12.Cf;

import java.util.ArrayList;
import java.util.List;

/**
 * Extend X12 parser Cf node to include metadata for segments and loops.
 * Metadata is assumed to be in JSON but is represented as strings.
 */
public class EnhancedCf extends Cf {

    private String metaData;

    private int depth;

    private List<Cf> children = new ArrayList<Cf>();

    public EnhancedCf(String name) {

        super(name);
    }

    public EnhancedCf(String name, String segment) {

        super(name, segment);
    }

    public EnhancedCf(String name, String segment, String segmentQual,
              Integer segmentQualPos) {

        super(name, segment, segmentQual, segmentQualPos);
    }

    public void addChild(EnhancedCf cf) {

        cf.depth = this.depth + 1;
        this.children.add(cf);
        cf.setParent(this);
    }

    @Override
    public Cf addChild(String name, String segment) {

        EnhancedCf cf = new EnhancedCf(name, segment);
        cf.depth = this.depth + 1;
        this.children.add(cf);
        cf.setParent(this);
        return cf;
    }

    @Override
    public Cf addChild(String name, String segment, String segmentQual,
                       Integer segmentQualPos) {

        EnhancedCf cf = new EnhancedCf(name, segment, segmentQual, segmentQualPos);
        cf.depth = this.depth + 1;
        this.children.add(cf);
        cf.setParent(this);
        return cf;
    }

    @Override
    public List<Cf> childList() {
        return children;
    }

    @Override
    public boolean hasChildren() {
        return this.children.size() > 0 ? true : false;
    }

    public void setChildren(List<Cf> cfList) {
        this.children = cfList;
        for (Cf cf : cfList) {
            if(cf instanceof EnhancedCf) {
                ((EnhancedCf)cf).setDepth( this.depth + 1 );
            }
            cf.setParent(this);
        }
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }


    @Override
    public String toString() {
        StringBuilder dump = new StringBuilder();
        for(int i=0; i < depth; i++){
            dump.append("|  ");
        }
        dump.append("+--");
        dump.append(getName());
        if (getSegment() != null)
            dump.append(" - ").append(getSegment());
        if (getSegmentQuals() != null) {
            dump.append(" - ");
            for(String s : getSegmentQuals()) {
                dump.append(s).append(",");
            }
        }
        if (getSegmentQualPos() != null)
            dump.append(" - ").append(getSegmentQualPos());
        dump.append(System.getProperty("line.separator"));
        for (Cf cf : children) {
            dump.append(cf.toString());
        }
        return dump.toString();
    }
}
