/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2420GNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2420GNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2420GNM103PayerName\",\"type\":\"string\"},{\"name\":\"_2420GNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2420GNM109OtherPayerIdentificationNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2420GNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2420GNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2420GNM103PayerName;
  @Deprecated public java.lang.CharSequence _2420GNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2420GNM109OtherPayerIdentificationNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber(java.lang.CharSequence _2420GNM101EntityIdentifierCode, java.lang.CharSequence _2420GNM102EntityTypeQualifier, java.lang.CharSequence _2420GNM103PayerName, java.lang.CharSequence _2420GNM108IdentificationCodeQualifier, java.lang.CharSequence _2420GNM109OtherPayerIdentificationNumber) {
    this._2420GNM101EntityIdentifierCode = _2420GNM101EntityIdentifierCode;
    this._2420GNM102EntityTypeQualifier = _2420GNM102EntityTypeQualifier;
    this._2420GNM103PayerName = _2420GNM103PayerName;
    this._2420GNM108IdentificationCodeQualifier = _2420GNM108IdentificationCodeQualifier;
    this._2420GNM109OtherPayerIdentificationNumber = _2420GNM109OtherPayerIdentificationNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2420GNM101EntityIdentifierCode;
    case 1: return _2420GNM102EntityTypeQualifier;
    case 2: return _2420GNM103PayerName;
    case 3: return _2420GNM108IdentificationCodeQualifier;
    case 4: return _2420GNM109OtherPayerIdentificationNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2420GNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2420GNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2420GNM103PayerName = (java.lang.CharSequence)value$; break;
    case 3: _2420GNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 4: _2420GNM109OtherPayerIdentificationNumber = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2420GNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2420GNM101EntityIdentifierCode$1() {
    return _2420GNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2420GNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2420GNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2420GNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2420GNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2420GNM102EntityTypeQualifier$1() {
    return _2420GNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2420GNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2420GNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2420GNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2420GNM103PayerName' field.
   */
  public java.lang.CharSequence get2420GNM103PayerName$1() {
    return _2420GNM103PayerName;
  }

  /**
   * Sets the value of the '_2420GNM103PayerName' field.
   * @param value the value to set.
   */
  public void set2420GNM103PayerName$1(java.lang.CharSequence value) {
    this._2420GNM103PayerName = value;
  }

  /**
   * Gets the value of the '_2420GNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2420GNM108IdentificationCodeQualifier$1() {
    return _2420GNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2420GNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2420GNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2420GNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2420GNM109OtherPayerIdentificationNumber' field.
   */
  public java.lang.CharSequence get2420GNM109OtherPayerIdentificationNumber$1() {
    return _2420GNM109OtherPayerIdentificationNumber;
  }

  /**
   * Sets the value of the '_2420GNM109OtherPayerIdentificationNumber' field.
   * @param value the value to set.
   */
  public void set2420GNM109OtherPayerIdentificationNumber$1(java.lang.CharSequence value) {
    this._2420GNM109OtherPayerIdentificationNumber = value;
  }

  /** Creates a new X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder();
  }
  
  /** Creates a new X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder(other);
  }
  
  /** Creates a new X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber RecordBuilder by copying an existing X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber> {

    private java.lang.CharSequence _2420GNM101EntityIdentifierCode;
    private java.lang.CharSequence _2420GNM102EntityTypeQualifier;
    private java.lang.CharSequence _2420GNM103PayerName;
    private java.lang.CharSequence _2420GNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2420GNM109OtherPayerIdentificationNumber;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2420GNM101EntityIdentifierCode)) {
        this._2420GNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2420GNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2420GNM102EntityTypeQualifier)) {
        this._2420GNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2420GNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2420GNM103PayerName)) {
        this._2420GNM103PayerName = data().deepCopy(fields()[2].schema(), other._2420GNM103PayerName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2420GNM108IdentificationCodeQualifier)) {
        this._2420GNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2420GNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2420GNM109OtherPayerIdentificationNumber)) {
        this._2420GNM109OtherPayerIdentificationNumber = data().deepCopy(fields()[4].schema(), other._2420GNM109OtherPayerIdentificationNumber);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.SCHEMA$);
      if (isValidValue(fields()[0], other._2420GNM101EntityIdentifierCode)) {
        this._2420GNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2420GNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2420GNM102EntityTypeQualifier)) {
        this._2420GNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2420GNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2420GNM103PayerName)) {
        this._2420GNM103PayerName = data().deepCopy(fields()[2].schema(), other._2420GNM103PayerName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2420GNM108IdentificationCodeQualifier)) {
        this._2420GNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2420GNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2420GNM109OtherPayerIdentificationNumber)) {
        this._2420GNM109OtherPayerIdentificationNumber = data().deepCopy(fields()[4].schema(), other._2420GNM109OtherPayerIdentificationNumber);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2420GNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2420GNM101EntityIdentifierCode$1() {
      return _2420GNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2420GNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder set2420GNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2420GNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2420GNM101EntityIdentifierCode' field has been set */
    public boolean has2420GNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2420GNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder clear2420GNM101EntityIdentifierCode$1() {
      _2420GNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2420GNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2420GNM102EntityTypeQualifier$1() {
      return _2420GNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2420GNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder set2420GNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2420GNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2420GNM102EntityTypeQualifier' field has been set */
    public boolean has2420GNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2420GNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder clear2420GNM102EntityTypeQualifier$1() {
      _2420GNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2420GNM103PayerName' field */
    public java.lang.CharSequence get2420GNM103PayerName$1() {
      return _2420GNM103PayerName;
    }
    
    /** Sets the value of the '_2420GNM103PayerName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder set2420GNM103PayerName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2420GNM103PayerName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2420GNM103PayerName' field has been set */
    public boolean has2420GNM103PayerName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2420GNM103PayerName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder clear2420GNM103PayerName$1() {
      _2420GNM103PayerName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2420GNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2420GNM108IdentificationCodeQualifier$1() {
      return _2420GNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2420GNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder set2420GNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2420GNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2420GNM108IdentificationCodeQualifier' field has been set */
    public boolean has2420GNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2420GNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder clear2420GNM108IdentificationCodeQualifier$1() {
      _2420GNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2420GNM109OtherPayerIdentificationNumber' field */
    public java.lang.CharSequence get2420GNM109OtherPayerIdentificationNumber$1() {
      return _2420GNM109OtherPayerIdentificationNumber;
    }
    
    /** Sets the value of the '_2420GNM109OtherPayerIdentificationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder set2420GNM109OtherPayerIdentificationNumber$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2420GNM109OtherPayerIdentificationNumber = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2420GNM109OtherPayerIdentificationNumber' field has been set */
    public boolean has2420GNM109OtherPayerIdentificationNumber$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2420GNM109OtherPayerIdentificationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber.Builder clear2420GNM109OtherPayerIdentificationNumber$1() {
      _2420GNM109OtherPayerIdentificationNumber = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber build() {
      try {
        X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber record = new X837Pro_2420G_NM1_OtherPayerPriorAuthorizationOrReferralNumber();
        record._2420GNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2420GNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2420GNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2420GNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2420GNM103PayerName = fieldSetFlags()[2] ? this._2420GNM103PayerName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2420GNM108IdentificationCodeQualifier = fieldSetFlags()[3] ? this._2420GNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2420GNM109OtherPayerIdentificationNumber = fieldSetFlags()[4] ? this._2420GNM109OtherPayerIdentificationNumber : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}