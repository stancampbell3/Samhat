/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2300_HI10_HealthCareCodeInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2300_HI10_HealthCareCodeInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300HI1001CodeListQualifierCode\",\"type\":\"string\"},{\"name\":\"_2300HI1002TreatmentCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300HI1001CodeListQualifierCode;
  @Deprecated public java.lang.CharSequence _2300HI1002TreatmentCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2300_HI10_HealthCareCodeInformation() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2300_HI10_HealthCareCodeInformation(java.lang.CharSequence _2300HI1001CodeListQualifierCode, java.lang.CharSequence _2300HI1002TreatmentCode) {
    this._2300HI1001CodeListQualifierCode = _2300HI1001CodeListQualifierCode;
    this._2300HI1002TreatmentCode = _2300HI1002TreatmentCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300HI1001CodeListQualifierCode;
    case 1: return _2300HI1002TreatmentCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300HI1001CodeListQualifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2300HI1002TreatmentCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300HI1001CodeListQualifierCode' field.
   */
  public java.lang.CharSequence get2300HI1001CodeListQualifierCode$1() {
    return _2300HI1001CodeListQualifierCode;
  }

  /**
   * Sets the value of the '_2300HI1001CodeListQualifierCode' field.
   * @param value the value to set.
   */
  public void set2300HI1001CodeListQualifierCode$1(java.lang.CharSequence value) {
    this._2300HI1001CodeListQualifierCode = value;
  }

  /**
   * Gets the value of the '_2300HI1002TreatmentCode' field.
   */
  public java.lang.CharSequence get2300HI1002TreatmentCode$1() {
    return _2300HI1002TreatmentCode;
  }

  /**
   * Sets the value of the '_2300HI1002TreatmentCode' field.
   * @param value the value to set.
   */
  public void set2300HI1002TreatmentCode$1(java.lang.CharSequence value) {
    this._2300HI1002TreatmentCode = value;
  }

  /** Creates a new X837Ins_2300_HI10_HealthCareCodeInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder();
  }
  
  /** Creates a new X837Ins_2300_HI10_HealthCareCodeInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder(other);
  }
  
  /** Creates a new X837Ins_2300_HI10_HealthCareCodeInformation RecordBuilder by copying an existing X837Ins_2300_HI10_HealthCareCodeInformation instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2300_HI10_HealthCareCodeInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2300_HI10_HealthCareCodeInformation>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2300_HI10_HealthCareCodeInformation> {

    private java.lang.CharSequence _2300HI1001CodeListQualifierCode;
    private java.lang.CharSequence _2300HI1002TreatmentCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300HI1001CodeListQualifierCode)) {
        this._2300HI1001CodeListQualifierCode = data().deepCopy(fields()[0].schema(), other._2300HI1001CodeListQualifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300HI1002TreatmentCode)) {
        this._2300HI1002TreatmentCode = data().deepCopy(fields()[1].schema(), other._2300HI1002TreatmentCode);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2300_HI10_HealthCareCodeInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2300HI1001CodeListQualifierCode)) {
        this._2300HI1001CodeListQualifierCode = data().deepCopy(fields()[0].schema(), other._2300HI1001CodeListQualifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300HI1002TreatmentCode)) {
        this._2300HI1002TreatmentCode = data().deepCopy(fields()[1].schema(), other._2300HI1002TreatmentCode);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2300HI1001CodeListQualifierCode' field */
    public java.lang.CharSequence get2300HI1001CodeListQualifierCode$1() {
      return _2300HI1001CodeListQualifierCode;
    }
    
    /** Sets the value of the '_2300HI1001CodeListQualifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder set2300HI1001CodeListQualifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300HI1001CodeListQualifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300HI1001CodeListQualifierCode' field has been set */
    public boolean has2300HI1001CodeListQualifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300HI1001CodeListQualifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder clear2300HI1001CodeListQualifierCode$1() {
      _2300HI1001CodeListQualifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300HI1002TreatmentCode' field */
    public java.lang.CharSequence get2300HI1002TreatmentCode$1() {
      return _2300HI1002TreatmentCode;
    }
    
    /** Sets the value of the '_2300HI1002TreatmentCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder set2300HI1002TreatmentCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300HI1002TreatmentCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300HI1002TreatmentCode' field has been set */
    public boolean has2300HI1002TreatmentCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300HI1002TreatmentCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_HI10_HealthCareCodeInformation.Builder clear2300HI1002TreatmentCode$1() {
      _2300HI1002TreatmentCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2300_HI10_HealthCareCodeInformation build() {
      try {
        X837Ins_2300_HI10_HealthCareCodeInformation record = new X837Ins_2300_HI10_HealthCareCodeInformation();
        record._2300HI1001CodeListQualifierCode = fieldSetFlags()[0] ? this._2300HI1001CodeListQualifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300HI1002TreatmentCode = fieldSetFlags()[1] ? this._2300HI1002TreatmentCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
