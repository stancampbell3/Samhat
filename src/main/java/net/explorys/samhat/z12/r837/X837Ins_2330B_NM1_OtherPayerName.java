/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2330B_NM1_OtherPayerName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2330B_NM1_OtherPayerName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2330BNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2330BNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2330BNM103OtherPayerLastOrOrganizationName\",\"type\":\"string\"},{\"name\":\"_2330BNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2330BNM109OtherPayerPrimaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2330BNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2330BNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2330BNM103OtherPayerLastOrOrganizationName;
  @Deprecated public java.lang.CharSequence _2330BNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2330BNM109OtherPayerPrimaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2330B_NM1_OtherPayerName() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2330B_NM1_OtherPayerName(java.lang.CharSequence _2330BNM101EntityIdentifierCode, java.lang.CharSequence _2330BNM102EntityTypeQualifier, java.lang.CharSequence _2330BNM103OtherPayerLastOrOrganizationName, java.lang.CharSequence _2330BNM108IdentificationCodeQualifier, java.lang.CharSequence _2330BNM109OtherPayerPrimaryIdentifier) {
    this._2330BNM101EntityIdentifierCode = _2330BNM101EntityIdentifierCode;
    this._2330BNM102EntityTypeQualifier = _2330BNM102EntityTypeQualifier;
    this._2330BNM103OtherPayerLastOrOrganizationName = _2330BNM103OtherPayerLastOrOrganizationName;
    this._2330BNM108IdentificationCodeQualifier = _2330BNM108IdentificationCodeQualifier;
    this._2330BNM109OtherPayerPrimaryIdentifier = _2330BNM109OtherPayerPrimaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2330BNM101EntityIdentifierCode;
    case 1: return _2330BNM102EntityTypeQualifier;
    case 2: return _2330BNM103OtherPayerLastOrOrganizationName;
    case 3: return _2330BNM108IdentificationCodeQualifier;
    case 4: return _2330BNM109OtherPayerPrimaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2330BNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2330BNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2330BNM103OtherPayerLastOrOrganizationName = (java.lang.CharSequence)value$; break;
    case 3: _2330BNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 4: _2330BNM109OtherPayerPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2330BNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2330BNM101EntityIdentifierCode$1() {
    return _2330BNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2330BNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2330BNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2330BNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2330BNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2330BNM102EntityTypeQualifier$1() {
    return _2330BNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2330BNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2330BNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2330BNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2330BNM103OtherPayerLastOrOrganizationName' field.
   */
  public java.lang.CharSequence get2330BNM103OtherPayerLastOrOrganizationName$1() {
    return _2330BNM103OtherPayerLastOrOrganizationName;
  }

  /**
   * Sets the value of the '_2330BNM103OtherPayerLastOrOrganizationName' field.
   * @param value the value to set.
   */
  public void set2330BNM103OtherPayerLastOrOrganizationName$1(java.lang.CharSequence value) {
    this._2330BNM103OtherPayerLastOrOrganizationName = value;
  }

  /**
   * Gets the value of the '_2330BNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2330BNM108IdentificationCodeQualifier$1() {
    return _2330BNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2330BNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2330BNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2330BNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2330BNM109OtherPayerPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get2330BNM109OtherPayerPrimaryIdentifier$1() {
    return _2330BNM109OtherPayerPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_2330BNM109OtherPayerPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2330BNM109OtherPayerPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._2330BNM109OtherPayerPrimaryIdentifier = value;
  }

  /** Creates a new X837Ins_2330B_NM1_OtherPayerName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder();
  }
  
  /** Creates a new X837Ins_2330B_NM1_OtherPayerName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder(other);
  }
  
  /** Creates a new X837Ins_2330B_NM1_OtherPayerName RecordBuilder by copying an existing X837Ins_2330B_NM1_OtherPayerName instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2330B_NM1_OtherPayerName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2330B_NM1_OtherPayerName>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2330B_NM1_OtherPayerName> {

    private java.lang.CharSequence _2330BNM101EntityIdentifierCode;
    private java.lang.CharSequence _2330BNM102EntityTypeQualifier;
    private java.lang.CharSequence _2330BNM103OtherPayerLastOrOrganizationName;
    private java.lang.CharSequence _2330BNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2330BNM109OtherPayerPrimaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2330BNM101EntityIdentifierCode)) {
        this._2330BNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2330BNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330BNM102EntityTypeQualifier)) {
        this._2330BNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2330BNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2330BNM103OtherPayerLastOrOrganizationName)) {
        this._2330BNM103OtherPayerLastOrOrganizationName = data().deepCopy(fields()[2].schema(), other._2330BNM103OtherPayerLastOrOrganizationName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2330BNM108IdentificationCodeQualifier)) {
        this._2330BNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2330BNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2330BNM109OtherPayerPrimaryIdentifier)) {
        this._2330BNM109OtherPayerPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._2330BNM109OtherPayerPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2330B_NM1_OtherPayerName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.SCHEMA$);
      if (isValidValue(fields()[0], other._2330BNM101EntityIdentifierCode)) {
        this._2330BNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2330BNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330BNM102EntityTypeQualifier)) {
        this._2330BNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2330BNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2330BNM103OtherPayerLastOrOrganizationName)) {
        this._2330BNM103OtherPayerLastOrOrganizationName = data().deepCopy(fields()[2].schema(), other._2330BNM103OtherPayerLastOrOrganizationName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2330BNM108IdentificationCodeQualifier)) {
        this._2330BNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2330BNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2330BNM109OtherPayerPrimaryIdentifier)) {
        this._2330BNM109OtherPayerPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._2330BNM109OtherPayerPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2330BNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2330BNM101EntityIdentifierCode$1() {
      return _2330BNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2330BNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder set2330BNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2330BNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BNM101EntityIdentifierCode' field has been set */
    public boolean has2330BNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2330BNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder clear2330BNM101EntityIdentifierCode$1() {
      _2330BNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2330BNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2330BNM102EntityTypeQualifier$1() {
      return _2330BNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2330BNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder set2330BNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2330BNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BNM102EntityTypeQualifier' field has been set */
    public boolean has2330BNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2330BNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder clear2330BNM102EntityTypeQualifier$1() {
      _2330BNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2330BNM103OtherPayerLastOrOrganizationName' field */
    public java.lang.CharSequence get2330BNM103OtherPayerLastOrOrganizationName$1() {
      return _2330BNM103OtherPayerLastOrOrganizationName;
    }
    
    /** Sets the value of the '_2330BNM103OtherPayerLastOrOrganizationName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder set2330BNM103OtherPayerLastOrOrganizationName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2330BNM103OtherPayerLastOrOrganizationName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BNM103OtherPayerLastOrOrganizationName' field has been set */
    public boolean has2330BNM103OtherPayerLastOrOrganizationName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2330BNM103OtherPayerLastOrOrganizationName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder clear2330BNM103OtherPayerLastOrOrganizationName$1() {
      _2330BNM103OtherPayerLastOrOrganizationName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2330BNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2330BNM108IdentificationCodeQualifier$1() {
      return _2330BNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2330BNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder set2330BNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2330BNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BNM108IdentificationCodeQualifier' field has been set */
    public boolean has2330BNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2330BNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder clear2330BNM108IdentificationCodeQualifier$1() {
      _2330BNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2330BNM109OtherPayerPrimaryIdentifier' field */
    public java.lang.CharSequence get2330BNM109OtherPayerPrimaryIdentifier$1() {
      return _2330BNM109OtherPayerPrimaryIdentifier;
    }
    
    /** Sets the value of the '_2330BNM109OtherPayerPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder set2330BNM109OtherPayerPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2330BNM109OtherPayerPrimaryIdentifier = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BNM109OtherPayerPrimaryIdentifier' field has been set */
    public boolean has2330BNM109OtherPayerPrimaryIdentifier$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2330BNM109OtherPayerPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330B_NM1_OtherPayerName.Builder clear2330BNM109OtherPayerPrimaryIdentifier$1() {
      _2330BNM109OtherPayerPrimaryIdentifier = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Ins_2330B_NM1_OtherPayerName build() {
      try {
        X837Ins_2330B_NM1_OtherPayerName record = new X837Ins_2330B_NM1_OtherPayerName();
        record._2330BNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2330BNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2330BNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2330BNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2330BNM103OtherPayerLastOrOrganizationName = fieldSetFlags()[2] ? this._2330BNM103OtherPayerLastOrOrganizationName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2330BNM108IdentificationCodeQualifier = fieldSetFlags()[3] ? this._2330BNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2330BNM109OtherPayerPrimaryIdentifier = fieldSetFlags()[4] ? this._2330BNM109OtherPayerPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
