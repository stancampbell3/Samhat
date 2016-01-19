/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2300_HI_HealthCareDiagnosisCode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2300_HI_HealthCareDiagnosisCode\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[]}");
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

  /** Creates a new X837Pro_2300_HI_HealthCareDiagnosisCode RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder();
  }
  
  /** Creates a new X837Pro_2300_HI_HealthCareDiagnosisCode RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder(other);
  }
  
  /** Creates a new X837Pro_2300_HI_HealthCareDiagnosisCode RecordBuilder by copying an existing X837Pro_2300_HI_HealthCareDiagnosisCode instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2300_HI_HealthCareDiagnosisCode instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2300_HI_HealthCareDiagnosisCode>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2300_HI_HealthCareDiagnosisCode> {


    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing X837Pro_2300_HI_HealthCareDiagnosisCode instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2300_HI_HealthCareDiagnosisCode.SCHEMA$);
    }

    @Override
    public X837Pro_2300_HI_HealthCareDiagnosisCode build() {
      try {
        X837Pro_2300_HI_HealthCareDiagnosisCode record = new X837Pro_2300_HI_HealthCareDiagnosisCode();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}