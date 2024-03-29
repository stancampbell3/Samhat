/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2310E_NM1_ServiceFacilityName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2310E_NM1_ServiceFacilityName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310ENM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2310ENM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2310ENM103LaboratoryOrFacilityName\",\"type\":\"string\"},{\"name\":\"_2310ENM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2310ENM109LaboratoryOrFacilityPrimaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310ENM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2310ENM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2310ENM103LaboratoryOrFacilityName;
  @Deprecated public java.lang.CharSequence _2310ENM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2310ENM109LaboratoryOrFacilityPrimaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2310E_NM1_ServiceFacilityName() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2310E_NM1_ServiceFacilityName(java.lang.CharSequence _2310ENM101EntityIdentifierCode, java.lang.CharSequence _2310ENM102EntityTypeQualifier, java.lang.CharSequence _2310ENM103LaboratoryOrFacilityName, java.lang.CharSequence _2310ENM108IdentificationCodeQualifier, java.lang.CharSequence _2310ENM109LaboratoryOrFacilityPrimaryIdentifier) {
    this._2310ENM101EntityIdentifierCode = _2310ENM101EntityIdentifierCode;
    this._2310ENM102EntityTypeQualifier = _2310ENM102EntityTypeQualifier;
    this._2310ENM103LaboratoryOrFacilityName = _2310ENM103LaboratoryOrFacilityName;
    this._2310ENM108IdentificationCodeQualifier = _2310ENM108IdentificationCodeQualifier;
    this._2310ENM109LaboratoryOrFacilityPrimaryIdentifier = _2310ENM109LaboratoryOrFacilityPrimaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310ENM101EntityIdentifierCode;
    case 1: return _2310ENM102EntityTypeQualifier;
    case 2: return _2310ENM103LaboratoryOrFacilityName;
    case 3: return _2310ENM108IdentificationCodeQualifier;
    case 4: return _2310ENM109LaboratoryOrFacilityPrimaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310ENM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2310ENM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2310ENM103LaboratoryOrFacilityName = (java.lang.CharSequence)value$; break;
    case 3: _2310ENM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 4: _2310ENM109LaboratoryOrFacilityPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310ENM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2310ENM101EntityIdentifierCode$1() {
    return _2310ENM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2310ENM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2310ENM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2310ENM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2310ENM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2310ENM102EntityTypeQualifier$1() {
    return _2310ENM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2310ENM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2310ENM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2310ENM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2310ENM103LaboratoryOrFacilityName' field.
   */
  public java.lang.CharSequence get2310ENM103LaboratoryOrFacilityName$1() {
    return _2310ENM103LaboratoryOrFacilityName;
  }

  /**
   * Sets the value of the '_2310ENM103LaboratoryOrFacilityName' field.
   * @param value the value to set.
   */
  public void set2310ENM103LaboratoryOrFacilityName$1(java.lang.CharSequence value) {
    this._2310ENM103LaboratoryOrFacilityName = value;
  }

  /**
   * Gets the value of the '_2310ENM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2310ENM108IdentificationCodeQualifier$1() {
    return _2310ENM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2310ENM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2310ENM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2310ENM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2310ENM109LaboratoryOrFacilityPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get2310ENM109LaboratoryOrFacilityPrimaryIdentifier$1() {
    return _2310ENM109LaboratoryOrFacilityPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_2310ENM109LaboratoryOrFacilityPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2310ENM109LaboratoryOrFacilityPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._2310ENM109LaboratoryOrFacilityPrimaryIdentifier = value;
  }

  /** Creates a new X837Ins_2310E_NM1_ServiceFacilityName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder();
  }
  
  /** Creates a new X837Ins_2310E_NM1_ServiceFacilityName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder(other);
  }
  
  /** Creates a new X837Ins_2310E_NM1_ServiceFacilityName RecordBuilder by copying an existing X837Ins_2310E_NM1_ServiceFacilityName instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2310E_NM1_ServiceFacilityName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2310E_NM1_ServiceFacilityName>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2310E_NM1_ServiceFacilityName> {

    private java.lang.CharSequence _2310ENM101EntityIdentifierCode;
    private java.lang.CharSequence _2310ENM102EntityTypeQualifier;
    private java.lang.CharSequence _2310ENM103LaboratoryOrFacilityName;
    private java.lang.CharSequence _2310ENM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2310ENM109LaboratoryOrFacilityPrimaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310ENM101EntityIdentifierCode)) {
        this._2310ENM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310ENM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310ENM102EntityTypeQualifier)) {
        this._2310ENM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310ENM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310ENM103LaboratoryOrFacilityName)) {
        this._2310ENM103LaboratoryOrFacilityName = data().deepCopy(fields()[2].schema(), other._2310ENM103LaboratoryOrFacilityName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310ENM108IdentificationCodeQualifier)) {
        this._2310ENM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2310ENM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310ENM109LaboratoryOrFacilityPrimaryIdentifier)) {
        this._2310ENM109LaboratoryOrFacilityPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._2310ENM109LaboratoryOrFacilityPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2310E_NM1_ServiceFacilityName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.SCHEMA$);
      if (isValidValue(fields()[0], other._2310ENM101EntityIdentifierCode)) {
        this._2310ENM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310ENM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310ENM102EntityTypeQualifier)) {
        this._2310ENM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310ENM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310ENM103LaboratoryOrFacilityName)) {
        this._2310ENM103LaboratoryOrFacilityName = data().deepCopy(fields()[2].schema(), other._2310ENM103LaboratoryOrFacilityName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310ENM108IdentificationCodeQualifier)) {
        this._2310ENM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2310ENM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310ENM109LaboratoryOrFacilityPrimaryIdentifier)) {
        this._2310ENM109LaboratoryOrFacilityPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._2310ENM109LaboratoryOrFacilityPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2310ENM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2310ENM101EntityIdentifierCode$1() {
      return _2310ENM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2310ENM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder set2310ENM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310ENM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ENM101EntityIdentifierCode' field has been set */
    public boolean has2310ENM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310ENM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder clear2310ENM101EntityIdentifierCode$1() {
      _2310ENM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310ENM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2310ENM102EntityTypeQualifier$1() {
      return _2310ENM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2310ENM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder set2310ENM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310ENM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ENM102EntityTypeQualifier' field has been set */
    public boolean has2310ENM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310ENM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder clear2310ENM102EntityTypeQualifier$1() {
      _2310ENM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2310ENM103LaboratoryOrFacilityName' field */
    public java.lang.CharSequence get2310ENM103LaboratoryOrFacilityName$1() {
      return _2310ENM103LaboratoryOrFacilityName;
    }
    
    /** Sets the value of the '_2310ENM103LaboratoryOrFacilityName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder set2310ENM103LaboratoryOrFacilityName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2310ENM103LaboratoryOrFacilityName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ENM103LaboratoryOrFacilityName' field has been set */
    public boolean has2310ENM103LaboratoryOrFacilityName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2310ENM103LaboratoryOrFacilityName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder clear2310ENM103LaboratoryOrFacilityName$1() {
      _2310ENM103LaboratoryOrFacilityName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2310ENM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2310ENM108IdentificationCodeQualifier$1() {
      return _2310ENM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2310ENM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder set2310ENM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2310ENM108IdentificationCodeQualifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ENM108IdentificationCodeQualifier' field has been set */
    public boolean has2310ENM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2310ENM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder clear2310ENM108IdentificationCodeQualifier$1() {
      _2310ENM108IdentificationCodeQualifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2310ENM109LaboratoryOrFacilityPrimaryIdentifier' field */
    public java.lang.CharSequence get2310ENM109LaboratoryOrFacilityPrimaryIdentifier$1() {
      return _2310ENM109LaboratoryOrFacilityPrimaryIdentifier;
    }
    
    /** Sets the value of the '_2310ENM109LaboratoryOrFacilityPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder set2310ENM109LaboratoryOrFacilityPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2310ENM109LaboratoryOrFacilityPrimaryIdentifier = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ENM109LaboratoryOrFacilityPrimaryIdentifier' field has been set */
    public boolean has2310ENM109LaboratoryOrFacilityPrimaryIdentifier$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2310ENM109LaboratoryOrFacilityPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310E_NM1_ServiceFacilityName.Builder clear2310ENM109LaboratoryOrFacilityPrimaryIdentifier$1() {
      _2310ENM109LaboratoryOrFacilityPrimaryIdentifier = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Ins_2310E_NM1_ServiceFacilityName build() {
      try {
        X837Ins_2310E_NM1_ServiceFacilityName record = new X837Ins_2310E_NM1_ServiceFacilityName();
        record._2310ENM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2310ENM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310ENM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2310ENM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2310ENM103LaboratoryOrFacilityName = fieldSetFlags()[2] ? this._2310ENM103LaboratoryOrFacilityName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2310ENM108IdentificationCodeQualifier = fieldSetFlags()[3] ? this._2310ENM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2310ENM109LaboratoryOrFacilityPrimaryIdentifier = fieldSetFlags()[4] ? this._2310ENM109LaboratoryOrFacilityPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
