/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2420G extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2420G\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[]}");
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

  /** Creates a new X837Pro_2420G RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420G.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2420G.Builder();
  }
  
  /** Creates a new X837Pro_2420G RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420G.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420G.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420G.Builder(other);
  }
  
  /** Creates a new X837Pro_2420G RecordBuilder by copying an existing X837Pro_2420G instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2420G.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420G other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420G.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2420G instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2420G>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2420G> {


    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2420G.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420G.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing X837Pro_2420G instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420G other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2420G.SCHEMA$);
    }

    @Override
    public X837Pro_2420G build() {
      try {
        X837Pro_2420G record = new X837Pro_2420G();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
