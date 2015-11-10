package net.explorys.samhat.z12.r837;

import org.pb.x12.Cf;

/**
 * Extend X12 parser Cf node to include metadata for segments and loops.
 * Metadata is assumed to be in JSON but is represented as strings.
 */
public class EnhancedCf extends Cf {

    private String metaData;

    public EnhancedCf(String name) {
        super(name);
    }

    public EnhancedCf(String name, String segment) {
        super(name, segment);
    }

    public EnhancedCf(String name, String segment, String segmentQual, Integer segmentQualPos) {
        super(name, segment, segmentQual, segmentQualPos);
    }

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }
}
