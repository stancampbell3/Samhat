/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2330C_NM1_OtherPayerPatientInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2330C_NM1_OtherPayerPatientInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2330CNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2330CNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2330CNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2330CNM109OtherPayerPatientPrimaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2330CNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2330CNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2330CNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2330CNM109OtherPayerPatientPrimaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2330C_NM1_OtherPayerPatientInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2330C_NM1_OtherPayerPatientInformation(java.lang.CharSequence _2330CNM101EntityIdentifierCode, java.lang.CharSequence _2330CNM102EntityTypeQualifier, java.lang.CharSequence _2330CNM108IdentificationCodeQualifier, java.lang.CharSequence _2330CNM109OtherPayerPatientPrimaryIdentifier) {
    this._2330CNM101EntityIdentifierCode = _2330CNM101EntityIdentifierCode;
    this._2330CNM102EntityTypeQualifier = _2330CNM102EntityTypeQualifier;
    this._2330CNM108IdentificationCodeQualifier = _2330CNM108IdentificationCodeQualifier;
    this._2330CNM109OtherPayerPatientPrimaryIdentifier = _2330CNM109OtherPayerPatientPrimaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2330CNM101EntityIdentifierCode;
    case 1: return _2330CNM102EntityTypeQualifier;
    case 2: return _2330CNM108IdentificationCodeQualifier;
    case 3: return _2330CNM109OtherPayerPatientPrimaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2330CNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2330CNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2330CNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 3: _2330CNM109OtherPayerPatientPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2330CNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2330CNM101EntityIdentifierCode$1() {
    return _2330CNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2330CNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2330CNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2330CNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2330CNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2330CNM102EntityTypeQualifier$1() {
    return _2330CNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2330CNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2330CNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2330CNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2330CNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2330CNM108IdentificationCodeQualifier$1() {
    return _2330CNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2330CNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2330CNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2330CNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2330CNM109OtherPayerPatientPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get2330CNM109OtherPayerPatientPrimaryIdentifier$1() {
    return _2330CNM109OtherPayerPatientPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_2330CNM109OtherPayerPatientPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2330CNM109OtherPayerPatientPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._2330CNM109OtherPayerPatientPrimaryIdentifier = value;
  }

  /** Creates a new X837Pro_2330C_NM1_OtherPayerPatientInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder();
  }
  
  /** Creates a new X837Pro_2330C_NM1_OtherPayerPatientInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2330C_NM1_OtherPayerPatientInformation RecordBuilder by copying an existing X837Pro_2330C_NM1_OtherPayerPatientInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2330C_NM1_OtherPayerPatientInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2330C_NM1_OtherPayerPatientInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2330C_NM1_OtherPayerPatientInformation> {

    private java.lang.CharSequence _2330CNM101EntityIdentifierCode;
    private java.lang.CharSequence _2330CNM102EntityTypeQualifier;
    private java.lang.CharSequence _2330CNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2330CNM109OtherPayerPatientPrimaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2330CNM101EntityIdentifierCode)) {
        this._2330CNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2330CNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330CNM102EntityTypeQualifier)) {
        this._2330CNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2330CNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2330CNM108IdentificationCodeQualifier)) {
        this._2330CNM108IdentificationCodeQualifier = data().deepCopy(fields()[2].schema(), other._2330CNM108IdentificationCodeQualifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2330CNM109OtherPayerPatientPrimaryIdentifier)) {
        this._2330CNM109OtherPayerPatientPrimaryIdentifier = data().deepCopy(fields()[3].schema(), other._2330CNM109OtherPayerPatientPrimaryIdentifier);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2330C_NM1_OtherPayerPatientInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2330CNM101EntityIdentifierCode)) {
        this._2330CNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2330CNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330CNM102EntityTypeQualifier)) {
        this._2330CNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2330CNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2330CNM108IdentificationCodeQualifier)) {
        this._2330CNM108IdentificationCodeQualifier = data().deepCopy(fields()[2].schema(), other._2330CNM108IdentificationCodeQualifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2330CNM109OtherPayerPatientPrimaryIdentifier)) {
        this._2330CNM109OtherPayerPatientPrimaryIdentifier = data().deepCopy(fields()[3].schema(), other._2330CNM109OtherPayerPatientPrimaryIdentifier);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2330CNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2330CNM101EntityIdentifierCode$1() {
      return _2330CNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2330CNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder set2330CNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2330CNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2330CNM101EntityIdentifierCode' field has been set */
    public boolean has2330CNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2330CNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder clear2330CNM101EntityIdentifierCode$1() {
      _2330CNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2330CNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2330CNM102EntityTypeQualifier$1() {
      return _2330CNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2330CNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder set2330CNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2330CNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2330CNM102EntityTypeQualifier' field has been set */
    public boolean has2330CNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2330CNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder clear2330CNM102EntityTypeQualifier$1() {
      _2330CNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2330CNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2330CNM108IdentificationCodeQualifier$1() {
      return _2330CNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2330CNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder set2330CNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2330CNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2330CNM108IdentificationCodeQualifier' field has been set */
    public boolean has2330CNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2330CNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder clear2330CNM108IdentificationCodeQualifier$1() {
      _2330CNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2330CNM109OtherPayerPatientPrimaryIdentifier' field */
    public java.lang.CharSequence get2330CNM109OtherPayerPatientPrimaryIdentifier$1() {
      return _2330CNM109OtherPayerPatientPrimaryIdentifier;
    }
    
    /** Sets the value of the '_2330CNM109OtherPayerPatientPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder set2330CNM109OtherPayerPatientPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2330CNM109OtherPayerPatientPrimaryIdentifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2330CNM109OtherPayerPatientPrimaryIdentifier' field has been set */
    public boolean has2330CNM109OtherPayerPatientPrimaryIdentifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2330CNM109OtherPayerPatientPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330C_NM1_OtherPayerPatientInformation.Builder clear2330CNM109OtherPayerPatientPrimaryIdentifier$1() {
      _2330CNM109OtherPayerPatientPrimaryIdentifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Pro_2330C_NM1_OtherPayerPatientInformation build() {
      try {
        X837Pro_2330C_NM1_OtherPayerPatientInformation record = new X837Pro_2330C_NM1_OtherPayerPatientInformation();
        record._2330CNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2330CNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2330CNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2330CNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2330CNM108IdentificationCodeQualifier = fieldSetFlags()[2] ? this._2330CNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2330CNM109OtherPayerPatientPrimaryIdentifier = fieldSetFlags()[3] ? this._2330CNM109OtherPayerPatientPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
