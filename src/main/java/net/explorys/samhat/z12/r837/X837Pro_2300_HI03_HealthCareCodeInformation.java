/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2300_HI03_HealthCareCodeInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2300_HI03_HealthCareCodeInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300HI0301DiagnosisTypeCode\",\"type\":\"string\"},{\"name\":\"_2300HI0302DiagnosisCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300HI0301DiagnosisTypeCode;
  @Deprecated public java.lang.CharSequence _2300HI0302DiagnosisCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2300_HI03_HealthCareCodeInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2300_HI03_HealthCareCodeInformation(java.lang.CharSequence _2300HI0301DiagnosisTypeCode, java.lang.CharSequence _2300HI0302DiagnosisCode) {
    this._2300HI0301DiagnosisTypeCode = _2300HI0301DiagnosisTypeCode;
    this._2300HI0302DiagnosisCode = _2300HI0302DiagnosisCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300HI0301DiagnosisTypeCode;
    case 1: return _2300HI0302DiagnosisCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300HI0301DiagnosisTypeCode = (java.lang.CharSequence)value$; break;
    case 1: _2300HI0302DiagnosisCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300HI0301DiagnosisTypeCode' field.
   */
  public java.lang.CharSequence get2300HI0301DiagnosisTypeCode$1() {
    return _2300HI0301DiagnosisTypeCode;
  }

  /**
   * Sets the value of the '_2300HI0301DiagnosisTypeCode' field.
   * @param value the value to set.
   */
  public void set2300HI0301DiagnosisTypeCode$1(java.lang.CharSequence value) {
    this._2300HI0301DiagnosisTypeCode = value;
  }

  /**
   * Gets the value of the '_2300HI0302DiagnosisCode' field.
   */
  public java.lang.CharSequence get2300HI0302DiagnosisCode$1() {
    return _2300HI0302DiagnosisCode;
  }

  /**
   * Sets the value of the '_2300HI0302DiagnosisCode' field.
   * @param value the value to set.
   */
  public void set2300HI0302DiagnosisCode$1(java.lang.CharSequence value) {
    this._2300HI0302DiagnosisCode = value;
  }

  /** Creates a new X837Pro_2300_HI03_HealthCareCodeInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder();
  }
  
  /** Creates a new X837Pro_2300_HI03_HealthCareCodeInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2300_HI03_HealthCareCodeInformation RecordBuilder by copying an existing X837Pro_2300_HI03_HealthCareCodeInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2300_HI03_HealthCareCodeInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2300_HI03_HealthCareCodeInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2300_HI03_HealthCareCodeInformation> {

    private java.lang.CharSequence _2300HI0301DiagnosisTypeCode;
    private java.lang.CharSequence _2300HI0302DiagnosisCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300HI0301DiagnosisTypeCode)) {
        this._2300HI0301DiagnosisTypeCode = data().deepCopy(fields()[0].schema(), other._2300HI0301DiagnosisTypeCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300HI0302DiagnosisCode)) {
        this._2300HI0302DiagnosisCode = data().deepCopy(fields()[1].schema(), other._2300HI0302DiagnosisCode);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2300_HI03_HealthCareCodeInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2300HI0301DiagnosisTypeCode)) {
        this._2300HI0301DiagnosisTypeCode = data().deepCopy(fields()[0].schema(), other._2300HI0301DiagnosisTypeCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300HI0302DiagnosisCode)) {
        this._2300HI0302DiagnosisCode = data().deepCopy(fields()[1].schema(), other._2300HI0302DiagnosisCode);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2300HI0301DiagnosisTypeCode' field */
    public java.lang.CharSequence get2300HI0301DiagnosisTypeCode$1() {
      return _2300HI0301DiagnosisTypeCode;
    }
    
    /** Sets the value of the '_2300HI0301DiagnosisTypeCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder set2300HI0301DiagnosisTypeCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300HI0301DiagnosisTypeCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300HI0301DiagnosisTypeCode' field has been set */
    public boolean has2300HI0301DiagnosisTypeCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300HI0301DiagnosisTypeCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder clear2300HI0301DiagnosisTypeCode$1() {
      _2300HI0301DiagnosisTypeCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300HI0302DiagnosisCode' field */
    public java.lang.CharSequence get2300HI0302DiagnosisCode$1() {
      return _2300HI0302DiagnosisCode;
    }
    
    /** Sets the value of the '_2300HI0302DiagnosisCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder set2300HI0302DiagnosisCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300HI0302DiagnosisCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300HI0302DiagnosisCode' field has been set */
    public boolean has2300HI0302DiagnosisCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300HI0302DiagnosisCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_HI03_HealthCareCodeInformation.Builder clear2300HI0302DiagnosisCode$1() {
      _2300HI0302DiagnosisCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Pro_2300_HI03_HealthCareCodeInformation build() {
      try {
        X837Pro_2300_HI03_HealthCareCodeInformation record = new X837Pro_2300_HI03_HealthCareCodeInformation();
        record._2300HI0301DiagnosisTypeCode = fieldSetFlags()[0] ? this._2300HI0301DiagnosisTypeCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300HI0302DiagnosisCode = fieldSetFlags()[1] ? this._2300HI0302DiagnosisCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
