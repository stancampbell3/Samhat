/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2330F extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2330F\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[]}");
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

  /** Creates a new X837Pro_2330F RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330F.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2330F.Builder();
  }
  
  /** Creates a new X837Pro_2330F RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330F.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330F.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330F.Builder(other);
  }
  
  /** Creates a new X837Pro_2330F RecordBuilder by copying an existing X837Pro_2330F instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2330F.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330F other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330F.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2330F instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2330F>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2330F> {


    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2330F.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330F.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing X837Pro_2330F instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330F other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2330F.SCHEMA$);
    }

    @Override
    public X837Pro_2330F build() {
      try {
        X837Pro_2330F record = new X837Pro_2330F();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
