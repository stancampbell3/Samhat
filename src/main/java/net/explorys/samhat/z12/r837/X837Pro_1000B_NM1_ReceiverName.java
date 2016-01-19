/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_1000B_NM1_ReceiverName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_1000B_NM1_ReceiverName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_1000BNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_1000BNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_1000BNM103ReceiverName\",\"type\":\"string\"},{\"name\":\"_1000BNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_1000BNM109ReceiverPrimaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _1000BNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _1000BNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _1000BNM103ReceiverName;
  @Deprecated public java.lang.CharSequence _1000BNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _1000BNM109ReceiverPrimaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_1000B_NM1_ReceiverName() {}

  /**
   * All-args constructor.
   */
  public X837Pro_1000B_NM1_ReceiverName(java.lang.CharSequence _1000BNM101EntityIdentifierCode, java.lang.CharSequence _1000BNM102EntityTypeQualifier, java.lang.CharSequence _1000BNM103ReceiverName, java.lang.CharSequence _1000BNM108IdentificationCodeQualifier, java.lang.CharSequence _1000BNM109ReceiverPrimaryIdentifier) {
    this._1000BNM101EntityIdentifierCode = _1000BNM101EntityIdentifierCode;
    this._1000BNM102EntityTypeQualifier = _1000BNM102EntityTypeQualifier;
    this._1000BNM103ReceiverName = _1000BNM103ReceiverName;
    this._1000BNM108IdentificationCodeQualifier = _1000BNM108IdentificationCodeQualifier;
    this._1000BNM109ReceiverPrimaryIdentifier = _1000BNM109ReceiverPrimaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _1000BNM101EntityIdentifierCode;
    case 1: return _1000BNM102EntityTypeQualifier;
    case 2: return _1000BNM103ReceiverName;
    case 3: return _1000BNM108IdentificationCodeQualifier;
    case 4: return _1000BNM109ReceiverPrimaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _1000BNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _1000BNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _1000BNM103ReceiverName = (java.lang.CharSequence)value$; break;
    case 3: _1000BNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 4: _1000BNM109ReceiverPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_1000BNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get1000BNM101EntityIdentifierCode$1() {
    return _1000BNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_1000BNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set1000BNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._1000BNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_1000BNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get1000BNM102EntityTypeQualifier$1() {
    return _1000BNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_1000BNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set1000BNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._1000BNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_1000BNM103ReceiverName' field.
   */
  public java.lang.CharSequence get1000BNM103ReceiverName$1() {
    return _1000BNM103ReceiverName;
  }

  /**
   * Sets the value of the '_1000BNM103ReceiverName' field.
   * @param value the value to set.
   */
  public void set1000BNM103ReceiverName$1(java.lang.CharSequence value) {
    this._1000BNM103ReceiverName = value;
  }

  /**
   * Gets the value of the '_1000BNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get1000BNM108IdentificationCodeQualifier$1() {
    return _1000BNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_1000BNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set1000BNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._1000BNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_1000BNM109ReceiverPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get1000BNM109ReceiverPrimaryIdentifier$1() {
    return _1000BNM109ReceiverPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_1000BNM109ReceiverPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set1000BNM109ReceiverPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._1000BNM109ReceiverPrimaryIdentifier = value;
  }

  /** Creates a new X837Pro_1000B_NM1_ReceiverName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder();
  }
  
  /** Creates a new X837Pro_1000B_NM1_ReceiverName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder(other);
  }
  
  /** Creates a new X837Pro_1000B_NM1_ReceiverName RecordBuilder by copying an existing X837Pro_1000B_NM1_ReceiverName instance */
  public static net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName other) {
    return new net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_1000B_NM1_ReceiverName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_1000B_NM1_ReceiverName>
    implements org.apache.avro.data.RecordBuilder<X837Pro_1000B_NM1_ReceiverName> {

    private java.lang.CharSequence _1000BNM101EntityIdentifierCode;
    private java.lang.CharSequence _1000BNM102EntityTypeQualifier;
    private java.lang.CharSequence _1000BNM103ReceiverName;
    private java.lang.CharSequence _1000BNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _1000BNM109ReceiverPrimaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._1000BNM101EntityIdentifierCode)) {
        this._1000BNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._1000BNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._1000BNM102EntityTypeQualifier)) {
        this._1000BNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._1000BNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._1000BNM103ReceiverName)) {
        this._1000BNM103ReceiverName = data().deepCopy(fields()[2].schema(), other._1000BNM103ReceiverName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._1000BNM108IdentificationCodeQualifier)) {
        this._1000BNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._1000BNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._1000BNM109ReceiverPrimaryIdentifier)) {
        this._1000BNM109ReceiverPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._1000BNM109ReceiverPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_1000B_NM1_ReceiverName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName other) {
            super(net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.SCHEMA$);
      if (isValidValue(fields()[0], other._1000BNM101EntityIdentifierCode)) {
        this._1000BNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._1000BNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._1000BNM102EntityTypeQualifier)) {
        this._1000BNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._1000BNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._1000BNM103ReceiverName)) {
        this._1000BNM103ReceiverName = data().deepCopy(fields()[2].schema(), other._1000BNM103ReceiverName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._1000BNM108IdentificationCodeQualifier)) {
        this._1000BNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._1000BNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._1000BNM109ReceiverPrimaryIdentifier)) {
        this._1000BNM109ReceiverPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._1000BNM109ReceiverPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_1000BNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get1000BNM101EntityIdentifierCode$1() {
      return _1000BNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_1000BNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder set1000BNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._1000BNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_1000BNM101EntityIdentifierCode' field has been set */
    public boolean has1000BNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_1000BNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder clear1000BNM101EntityIdentifierCode$1() {
      _1000BNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_1000BNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get1000BNM102EntityTypeQualifier$1() {
      return _1000BNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_1000BNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder set1000BNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._1000BNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_1000BNM102EntityTypeQualifier' field has been set */
    public boolean has1000BNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_1000BNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder clear1000BNM102EntityTypeQualifier$1() {
      _1000BNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_1000BNM103ReceiverName' field */
    public java.lang.CharSequence get1000BNM103ReceiverName$1() {
      return _1000BNM103ReceiverName;
    }
    
    /** Sets the value of the '_1000BNM103ReceiverName' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder set1000BNM103ReceiverName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._1000BNM103ReceiverName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_1000BNM103ReceiverName' field has been set */
    public boolean has1000BNM103ReceiverName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_1000BNM103ReceiverName' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder clear1000BNM103ReceiverName$1() {
      _1000BNM103ReceiverName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_1000BNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get1000BNM108IdentificationCodeQualifier$1() {
      return _1000BNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_1000BNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder set1000BNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._1000BNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_1000BNM108IdentificationCodeQualifier' field has been set */
    public boolean has1000BNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_1000BNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder clear1000BNM108IdentificationCodeQualifier$1() {
      _1000BNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_1000BNM109ReceiverPrimaryIdentifier' field */
    public java.lang.CharSequence get1000BNM109ReceiverPrimaryIdentifier$1() {
      return _1000BNM109ReceiverPrimaryIdentifier;
    }
    
    /** Sets the value of the '_1000BNM109ReceiverPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder set1000BNM109ReceiverPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._1000BNM109ReceiverPrimaryIdentifier = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_1000BNM109ReceiverPrimaryIdentifier' field has been set */
    public boolean has1000BNM109ReceiverPrimaryIdentifier$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_1000BNM109ReceiverPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_1000B_NM1_ReceiverName.Builder clear1000BNM109ReceiverPrimaryIdentifier$1() {
      _1000BNM109ReceiverPrimaryIdentifier = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Pro_1000B_NM1_ReceiverName build() {
      try {
        X837Pro_1000B_NM1_ReceiverName record = new X837Pro_1000B_NM1_ReceiverName();
        record._1000BNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._1000BNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._1000BNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._1000BNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._1000BNM103ReceiverName = fieldSetFlags()[2] ? this._1000BNM103ReceiverName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._1000BNM108IdentificationCodeQualifier = fieldSetFlags()[3] ? this._1000BNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._1000BNM109ReceiverPrimaryIdentifier = fieldSetFlags()[4] ? this._1000BNM109ReceiverPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}