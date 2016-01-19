/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010AA_NM1_BillingProviderName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010AA_NM1_BillingProviderName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010AANM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2010AANM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2010AANM103BillingProviderLastOrOrganizationalName\",\"type\":\"string\"},{\"name\":\"_2010AANM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2010AANM109BillingProviderIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010AANM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2010AANM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2010AANM103BillingProviderLastOrOrganizationalName;
  @Deprecated public java.lang.CharSequence _2010AANM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2010AANM109BillingProviderIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2010AA_NM1_BillingProviderName() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2010AA_NM1_BillingProviderName(java.lang.CharSequence _2010AANM101EntityIdentifierCode, java.lang.CharSequence _2010AANM102EntityTypeQualifier, java.lang.CharSequence _2010AANM103BillingProviderLastOrOrganizationalName, java.lang.CharSequence _2010AANM108IdentificationCodeQualifier, java.lang.CharSequence _2010AANM109BillingProviderIdentifier) {
    this._2010AANM101EntityIdentifierCode = _2010AANM101EntityIdentifierCode;
    this._2010AANM102EntityTypeQualifier = _2010AANM102EntityTypeQualifier;
    this._2010AANM103BillingProviderLastOrOrganizationalName = _2010AANM103BillingProviderLastOrOrganizationalName;
    this._2010AANM108IdentificationCodeQualifier = _2010AANM108IdentificationCodeQualifier;
    this._2010AANM109BillingProviderIdentifier = _2010AANM109BillingProviderIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010AANM101EntityIdentifierCode;
    case 1: return _2010AANM102EntityTypeQualifier;
    case 2: return _2010AANM103BillingProviderLastOrOrganizationalName;
    case 3: return _2010AANM108IdentificationCodeQualifier;
    case 4: return _2010AANM109BillingProviderIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010AANM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2010AANM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2010AANM103BillingProviderLastOrOrganizationalName = (java.lang.CharSequence)value$; break;
    case 3: _2010AANM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 4: _2010AANM109BillingProviderIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010AANM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2010AANM101EntityIdentifierCode$1() {
    return _2010AANM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2010AANM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2010AANM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2010AANM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2010AANM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2010AANM102EntityTypeQualifier$1() {
    return _2010AANM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2010AANM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2010AANM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2010AANM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2010AANM103BillingProviderLastOrOrganizationalName' field.
   */
  public java.lang.CharSequence get2010AANM103BillingProviderLastOrOrganizationalName$1() {
    return _2010AANM103BillingProviderLastOrOrganizationalName;
  }

  /**
   * Sets the value of the '_2010AANM103BillingProviderLastOrOrganizationalName' field.
   * @param value the value to set.
   */
  public void set2010AANM103BillingProviderLastOrOrganizationalName$1(java.lang.CharSequence value) {
    this._2010AANM103BillingProviderLastOrOrganizationalName = value;
  }

  /**
   * Gets the value of the '_2010AANM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2010AANM108IdentificationCodeQualifier$1() {
    return _2010AANM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2010AANM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2010AANM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2010AANM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2010AANM109BillingProviderIdentifier' field.
   */
  public java.lang.CharSequence get2010AANM109BillingProviderIdentifier$1() {
    return _2010AANM109BillingProviderIdentifier;
  }

  /**
   * Sets the value of the '_2010AANM109BillingProviderIdentifier' field.
   * @param value the value to set.
   */
  public void set2010AANM109BillingProviderIdentifier$1(java.lang.CharSequence value) {
    this._2010AANM109BillingProviderIdentifier = value;
  }

  /** Creates a new X837Ins_2010AA_NM1_BillingProviderName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder();
  }
  
  /** Creates a new X837Ins_2010AA_NM1_BillingProviderName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder(other);
  }
  
  /** Creates a new X837Ins_2010AA_NM1_BillingProviderName RecordBuilder by copying an existing X837Ins_2010AA_NM1_BillingProviderName instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010AA_NM1_BillingProviderName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010AA_NM1_BillingProviderName>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010AA_NM1_BillingProviderName> {

    private java.lang.CharSequence _2010AANM101EntityIdentifierCode;
    private java.lang.CharSequence _2010AANM102EntityTypeQualifier;
    private java.lang.CharSequence _2010AANM103BillingProviderLastOrOrganizationalName;
    private java.lang.CharSequence _2010AANM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2010AANM109BillingProviderIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010AANM101EntityIdentifierCode)) {
        this._2010AANM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2010AANM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010AANM102EntityTypeQualifier)) {
        this._2010AANM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2010AANM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010AANM103BillingProviderLastOrOrganizationalName)) {
        this._2010AANM103BillingProviderLastOrOrganizationalName = data().deepCopy(fields()[2].schema(), other._2010AANM103BillingProviderLastOrOrganizationalName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010AANM108IdentificationCodeQualifier)) {
        this._2010AANM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2010AANM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2010AANM109BillingProviderIdentifier)) {
        this._2010AANM109BillingProviderIdentifier = data().deepCopy(fields()[4].schema(), other._2010AANM109BillingProviderIdentifier);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010AA_NM1_BillingProviderName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.SCHEMA$);
      if (isValidValue(fields()[0], other._2010AANM101EntityIdentifierCode)) {
        this._2010AANM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2010AANM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010AANM102EntityTypeQualifier)) {
        this._2010AANM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2010AANM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010AANM103BillingProviderLastOrOrganizationalName)) {
        this._2010AANM103BillingProviderLastOrOrganizationalName = data().deepCopy(fields()[2].schema(), other._2010AANM103BillingProviderLastOrOrganizationalName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010AANM108IdentificationCodeQualifier)) {
        this._2010AANM108IdentificationCodeQualifier = data().deepCopy(fields()[3].schema(), other._2010AANM108IdentificationCodeQualifier);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2010AANM109BillingProviderIdentifier)) {
        this._2010AANM109BillingProviderIdentifier = data().deepCopy(fields()[4].schema(), other._2010AANM109BillingProviderIdentifier);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2010AANM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2010AANM101EntityIdentifierCode$1() {
      return _2010AANM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2010AANM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder set2010AANM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010AANM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AANM101EntityIdentifierCode' field has been set */
    public boolean has2010AANM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010AANM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder clear2010AANM101EntityIdentifierCode$1() {
      _2010AANM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010AANM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2010AANM102EntityTypeQualifier$1() {
      return _2010AANM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2010AANM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder set2010AANM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010AANM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AANM102EntityTypeQualifier' field has been set */
    public boolean has2010AANM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010AANM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder clear2010AANM102EntityTypeQualifier$1() {
      _2010AANM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010AANM103BillingProviderLastOrOrganizationalName' field */
    public java.lang.CharSequence get2010AANM103BillingProviderLastOrOrganizationalName$1() {
      return _2010AANM103BillingProviderLastOrOrganizationalName;
    }
    
    /** Sets the value of the '_2010AANM103BillingProviderLastOrOrganizationalName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder set2010AANM103BillingProviderLastOrOrganizationalName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010AANM103BillingProviderLastOrOrganizationalName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AANM103BillingProviderLastOrOrganizationalName' field has been set */
    public boolean has2010AANM103BillingProviderLastOrOrganizationalName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010AANM103BillingProviderLastOrOrganizationalName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder clear2010AANM103BillingProviderLastOrOrganizationalName$1() {
      _2010AANM103BillingProviderLastOrOrganizationalName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2010AANM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2010AANM108IdentificationCodeQualifier$1() {
      return _2010AANM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2010AANM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder set2010AANM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2010AANM108IdentificationCodeQualifier = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AANM108IdentificationCodeQualifier' field has been set */
    public boolean has2010AANM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2010AANM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder clear2010AANM108IdentificationCodeQualifier$1() {
      _2010AANM108IdentificationCodeQualifier = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2010AANM109BillingProviderIdentifier' field */
    public java.lang.CharSequence get2010AANM109BillingProviderIdentifier$1() {
      return _2010AANM109BillingProviderIdentifier;
    }
    
    /** Sets the value of the '_2010AANM109BillingProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder set2010AANM109BillingProviderIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2010AANM109BillingProviderIdentifier = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AANM109BillingProviderIdentifier' field has been set */
    public boolean has2010AANM109BillingProviderIdentifier$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2010AANM109BillingProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_NM1_BillingProviderName.Builder clear2010AANM109BillingProviderIdentifier$1() {
      _2010AANM109BillingProviderIdentifier = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Ins_2010AA_NM1_BillingProviderName build() {
      try {
        X837Ins_2010AA_NM1_BillingProviderName record = new X837Ins_2010AA_NM1_BillingProviderName();
        record._2010AANM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2010AANM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010AANM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2010AANM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010AANM103BillingProviderLastOrOrganizationalName = fieldSetFlags()[2] ? this._2010AANM103BillingProviderLastOrOrganizationalName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2010AANM108IdentificationCodeQualifier = fieldSetFlags()[3] ? this._2010AANM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2010AANM109BillingProviderIdentifier = fieldSetFlags()[4] ? this._2010AANM109BillingProviderIdentifier : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}