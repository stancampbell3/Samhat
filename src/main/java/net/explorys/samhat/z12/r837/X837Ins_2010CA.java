/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010CA extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010CA\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /** Creates a new X837Ins_2010CA RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder();
  }
  
  /** Creates a new X837Ins_2010CA RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder(other);
  }
  
  /** Creates a new X837Ins_2010CA RecordBuilder by copying an existing X837Ins_2010CA instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010CA other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010CA instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010CA>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010CA> {


    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010CA.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010CA.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010CA instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010CA other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010CA.SCHEMA$);
    }

    @Override
    public X837Ins_2010CA build() {
      try {
        X837Ins_2010CA record = new X837Ins_2010CA();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
