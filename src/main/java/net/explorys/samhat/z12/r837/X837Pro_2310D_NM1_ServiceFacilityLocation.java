/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2310D_NM1_ServiceFacilityLocation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2310D_NM1_ServiceFacilityLocation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310DNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2310DNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2310DNM103LaboratoryOrFacilityName\",\"type\":\"string\"},{\"name\":\"_2310DNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2310DNM109LaboratoryOrFacilityPrimaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310DNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2310DNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2310DNM103LaboratoryOrFacilityName;
  @Deprecated public java.lang.CharSequence _2310DNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2310DNM109LaboratoryOrFacilityPrimaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2310D_NM1_ServiceFacilityLocation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2310D_NM1_ServiceFacilityLocation(java.lang.CharSequence _2310DNM101EntityIdentifierCode, java.lang.CharSequence _2310DNM102EntityTypeQualifier, java.lang.CharSequence _2310DNM103LaboratoryOrFacilityName, java.lang.CharSequence _2310DNM108IdentificationCodeQualifier, java.lang.CharSequence _2310DNM109LaboratoryOrFacilityPrimaryIdentifier) {
    this._2310DNM101EntityIdentifierCode = _2310DNM101EntityIdentifierCode;
    this._2310DNM102EntityTypeQualifier = _2310DNM102EntityTypeQualifier;
    this._2310DNM103LaboratoryOrFacilityName = _2310DNM103LaboratoryOrFacilityName;
    this._2310DNM108IdentificationCodeQualifier = _2310DNM108IdentificationCodeQualifier;
    this._2310DNM109LaboratoryOrFacilityPrimaryIdentifier = _2310DNM109LaboratoryOrFacilityPrimaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310DNM101EntityIdentifierCode;
    case 1: return _2310DNM102EntityTypeQualifier;
    case 2: return _2310DNM103LaboratoryOrFacilityName;
    case 3: return _2310DNM108IdentificationCodeQualifier;
    case 4: return _2310DNM109LaboratoryOrFacilityPrimaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310DNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2310DNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2310DNM103LaboratoryOrFacilityName = (java.lang.CharSequence)value$; break;
    case 3: _2310DNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 4: _2310DNM109LaboratoryOrFacilityPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310DNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2310DNM101EntityIdentifierCode$1() {
    return _2310DNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2310DNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2310DNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2310DNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2310DNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2310DNM102EntityTypeQualifier$1() {
    return _2310DNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2310DNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2310DNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2310DNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2310DNM103LaboratoryOrFacilityName' field.
   */
  public java.lang.CharSequence get2310DNM103LaboratoryOrFacilityName$1() {
    return _2310DNM103LaboratoryOrFacilityName;
  }

  /**
   * Sets the value of the '_2310DNM103LaboratoryOrFacilityName' field.
   * @param value the value to set.
   */
  public void set2310DNM103LaboratoryOrFacilityName$1(java.lang.CharSequence value) {
    this._2310DNM103LaboratoryOrFacilityName = value;
  }

  /**
   * Gets the value of the '_2310DNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2310DNM108IdentificationCodeQualifier$1() {
    return _2310DNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2310DNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2310DNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2310DNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2310DNM109LaboratoryOrFacilityPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get2310DNM109LaboratoryOrFacilityPrimaryIdentifier$1() {
    return _2310DNM109LaboratoryOrFacilityPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_2310DNM109LaboratoryOrFacilityPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2310DNM109LaboratoryOrFacilityPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._2310DNM109LaboratoryOrFacilityPrimaryIdentifier = value;
  }

  /** Creates a new X837Pro_2310D_NM1_ServiceFacilityLocation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder();
  }
  
  /** Creates a new X837Pro_2310D_NM1_ServiceFacilityLocation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder(other);
  }
  
  /** Creates a new X837Pro_2310D_NM1_ServiceFacilityLocation RecordBuilder by copying an existing X837Pro_2310D_NM1_ServiceFacilityLocation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2310D_NM1_ServiceFacilityLocation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2310D_NM1_ServiceFacilityLocation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2310D_NM1_ServiceFacilityLocation> {

    private java.lang.CharSequence _2310DNM101EntityIdentifierCode;
    private java.lang.CharSequence _2310DNM102EntityTypeQualifier;
    private java.lang.CharSequence _2310DNM103LaboratoryOrFacilityName;
    private java.lang.CharSequence _2310DNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2310DNM109LaboratoryOrFacilityPrimaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310DNM101EntityIdentifierCode)) {
        this._2310DNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310DNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310DNM102EntityTypeQualifier)) {
        this._2310DNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310DNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310DNM103LaboratoryOrFacilityName)) {
        this._2310DNM103LaboratoryOrFacilityName = data().deepCopy(fields()[2].schema(), other._2310DNM103LaboratoryOrFacilityName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310DNM108IdentificationCodeQualifier)) {
        this._2310DNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2310DNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310DNM109LaboratoryOrFacilityPrimaryIdentifier)) {
        this._2310DNM109LaboratoryOrFacilityPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._2310DNM109LaboratoryOrFacilityPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2310D_NM1_ServiceFacilityLocation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.SCHEMA$);
      if (isValidValue(fields()[0], other._2310DNM101EntityIdentifierCode)) {
        this._2310DNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310DNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310DNM102EntityTypeQualifier)) {
        this._2310DNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310DNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310DNM103LaboratoryOrFacilityName)) {
        this._2310DNM103LaboratoryOrFacilityName = data().deepCopy(fields()[2].schema(), other._2310DNM103LaboratoryOrFacilityName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310DNM108IdentificationCodeQualifier)) {
        this._2310DNM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2310DNM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310DNM109LaboratoryOrFacilityPrimaryIdentifier)) {
        this._2310DNM109LaboratoryOrFacilityPrimaryIdentifier = data().deepCopy(fields()[4].schema(), other._2310DNM109LaboratoryOrFacilityPrimaryIdentifier);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2310DNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2310DNM101EntityIdentifierCode$1() {
      return _2310DNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2310DNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder set2310DNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310DNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DNM101EntityIdentifierCode' field has been set */
    public boolean has2310DNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310DNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder clear2310DNM101EntityIdentifierCode$1() {
      _2310DNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310DNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2310DNM102EntityTypeQualifier$1() {
      return _2310DNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2310DNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder set2310DNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310DNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DNM102EntityTypeQualifier' field has been set */
    public boolean has2310DNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310DNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder clear2310DNM102EntityTypeQualifier$1() {
      _2310DNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2310DNM103LaboratoryOrFacilityName' field */
    public java.lang.CharSequence get2310DNM103LaboratoryOrFacilityName$1() {
      return _2310DNM103LaboratoryOrFacilityName;
    }
    
    /** Sets the value of the '_2310DNM103LaboratoryOrFacilityName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder set2310DNM103LaboratoryOrFacilityName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2310DNM103LaboratoryOrFacilityName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DNM103LaboratoryOrFacilityName' field has been set */
    public boolean has2310DNM103LaboratoryOrFacilityName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2310DNM103LaboratoryOrFacilityName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder clear2310DNM103LaboratoryOrFacilityName$1() {
      _2310DNM103LaboratoryOrFacilityName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2310DNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2310DNM108IdentificationCodeQualifier$1() {
      return _2310DNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2310DNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder set2310DNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2310DNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DNM108IdentificationCodeQualifier' field has been set */
    public boolean has2310DNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2310DNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder clear2310DNM108IdentificationCodeQualifier$1() {
      _2310DNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2310DNM109LaboratoryOrFacilityPrimaryIdentifier' field */
    public java.lang.CharSequence get2310DNM109LaboratoryOrFacilityPrimaryIdentifier$1() {
      return _2310DNM109LaboratoryOrFacilityPrimaryIdentifier;
    }
    
    /** Sets the value of the '_2310DNM109LaboratoryOrFacilityPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder set2310DNM109LaboratoryOrFacilityPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2310DNM109LaboratoryOrFacilityPrimaryIdentifier = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DNM109LaboratoryOrFacilityPrimaryIdentifier' field has been set */
    public boolean has2310DNM109LaboratoryOrFacilityPrimaryIdentifier$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2310DNM109LaboratoryOrFacilityPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_NM1_ServiceFacilityLocation.Builder clear2310DNM109LaboratoryOrFacilityPrimaryIdentifier$1() {
      _2310DNM109LaboratoryOrFacilityPrimaryIdentifier = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Pro_2310D_NM1_ServiceFacilityLocation build() {
      try {
        X837Pro_2310D_NM1_ServiceFacilityLocation record = new X837Pro_2310D_NM1_ServiceFacilityLocation();
        record._2310DNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2310DNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310DNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2310DNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2310DNM103LaboratoryOrFacilityName = fieldSetFlags()[2] ? this._2310DNM103LaboratoryOrFacilityName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2310DNM108IdentificationCodeQualifier = fieldSetFlags()[3] ? this._2310DNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2310DNM109LaboratoryOrFacilityPrimaryIdentifier = fieldSetFlags()[4] ? this._2310DNM109LaboratoryOrFacilityPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
