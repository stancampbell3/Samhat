/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2010AB_NM1_PayToProviderName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2010AB_NM1_PayToProviderName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010ABNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2010ABNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2010ABNM103PayToProviderLastOrOrganizationalName\",\"type\":\"string\"},{\"name\":\"_2010ABNM104PayToProviderFirstName\",\"type\":\"string\"},{\"name\":\"_2010ABNM105PayToProviderMiddleName\",\"type\":\"string\"},{\"name\":\"_2010ABNM107PayToProviderNameSuffix\",\"type\":\"string\"},{\"name\":\"_2010ABNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2010ABNM109PayToProviderIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010ABNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2010ABNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2010ABNM103PayToProviderLastOrOrganizationalName;
  @Deprecated public java.lang.CharSequence _2010ABNM104PayToProviderFirstName;
  @Deprecated public java.lang.CharSequence _2010ABNM105PayToProviderMiddleName;
  @Deprecated public java.lang.CharSequence _2010ABNM107PayToProviderNameSuffix;
  @Deprecated public java.lang.CharSequence _2010ABNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2010ABNM109PayToProviderIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2010AB_NM1_PayToProviderName() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2010AB_NM1_PayToProviderName(java.lang.CharSequence _2010ABNM101EntityIdentifierCode, java.lang.CharSequence _2010ABNM102EntityTypeQualifier, java.lang.CharSequence _2010ABNM103PayToProviderLastOrOrganizationalName, java.lang.CharSequence _2010ABNM104PayToProviderFirstName, java.lang.CharSequence _2010ABNM105PayToProviderMiddleName, java.lang.CharSequence _2010ABNM107PayToProviderNameSuffix, java.lang.CharSequence _2010ABNM108IdentificationCodeQualifier, java.lang.CharSequence _2010ABNM109PayToProviderIdentifier) {
    this._2010ABNM101EntityIdentifierCode = _2010ABNM101EntityIdentifierCode;
    this._2010ABNM102EntityTypeQualifier = _2010ABNM102EntityTypeQualifier;
    this._2010ABNM103PayToProviderLastOrOrganizationalName = _2010ABNM103PayToProviderLastOrOrganizationalName;
    this._2010ABNM104PayToProviderFirstName = _2010ABNM104PayToProviderFirstName;
    this._2010ABNM105PayToProviderMiddleName = _2010ABNM105PayToProviderMiddleName;
    this._2010ABNM107PayToProviderNameSuffix = _2010ABNM107PayToProviderNameSuffix;
    this._2010ABNM108IdentificationCodeQualifier = _2010ABNM108IdentificationCodeQualifier;
    this._2010ABNM109PayToProviderIdentifier = _2010ABNM109PayToProviderIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010ABNM101EntityIdentifierCode;
    case 1: return _2010ABNM102EntityTypeQualifier;
    case 2: return _2010ABNM103PayToProviderLastOrOrganizationalName;
    case 3: return _2010ABNM104PayToProviderFirstName;
    case 4: return _2010ABNM105PayToProviderMiddleName;
    case 5: return _2010ABNM107PayToProviderNameSuffix;
    case 6: return _2010ABNM108IdentificationCodeQualifier;
    case 7: return _2010ABNM109PayToProviderIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010ABNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2010ABNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2010ABNM103PayToProviderLastOrOrganizationalName = (java.lang.CharSequence)value$; break;
    case 3: _2010ABNM104PayToProviderFirstName = (java.lang.CharSequence)value$; break;
    case 4: _2010ABNM105PayToProviderMiddleName = (java.lang.CharSequence)value$; break;
    case 5: _2010ABNM107PayToProviderNameSuffix = (java.lang.CharSequence)value$; break;
    case 6: _2010ABNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 7: _2010ABNM109PayToProviderIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010ABNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2010ABNM101EntityIdentifierCode$1() {
    return _2010ABNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2010ABNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2010ABNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2010ABNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2010ABNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2010ABNM102EntityTypeQualifier$1() {
    return _2010ABNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2010ABNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2010ABNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2010ABNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2010ABNM103PayToProviderLastOrOrganizationalName' field.
   */
  public java.lang.CharSequence get2010ABNM103PayToProviderLastOrOrganizationalName$1() {
    return _2010ABNM103PayToProviderLastOrOrganizationalName;
  }

  /**
   * Sets the value of the '_2010ABNM103PayToProviderLastOrOrganizationalName' field.
   * @param value the value to set.
   */
  public void set2010ABNM103PayToProviderLastOrOrganizationalName$1(java.lang.CharSequence value) {
    this._2010ABNM103PayToProviderLastOrOrganizationalName = value;
  }

  /**
   * Gets the value of the '_2010ABNM104PayToProviderFirstName' field.
   */
  public java.lang.CharSequence get2010ABNM104PayToProviderFirstName$1() {
    return _2010ABNM104PayToProviderFirstName;
  }

  /**
   * Sets the value of the '_2010ABNM104PayToProviderFirstName' field.
   * @param value the value to set.
   */
  public void set2010ABNM104PayToProviderFirstName$1(java.lang.CharSequence value) {
    this._2010ABNM104PayToProviderFirstName = value;
  }

  /**
   * Gets the value of the '_2010ABNM105PayToProviderMiddleName' field.
   */
  public java.lang.CharSequence get2010ABNM105PayToProviderMiddleName$1() {
    return _2010ABNM105PayToProviderMiddleName;
  }

  /**
   * Sets the value of the '_2010ABNM105PayToProviderMiddleName' field.
   * @param value the value to set.
   */
  public void set2010ABNM105PayToProviderMiddleName$1(java.lang.CharSequence value) {
    this._2010ABNM105PayToProviderMiddleName = value;
  }

  /**
   * Gets the value of the '_2010ABNM107PayToProviderNameSuffix' field.
   */
  public java.lang.CharSequence get2010ABNM107PayToProviderNameSuffix$1() {
    return _2010ABNM107PayToProviderNameSuffix;
  }

  /**
   * Sets the value of the '_2010ABNM107PayToProviderNameSuffix' field.
   * @param value the value to set.
   */
  public void set2010ABNM107PayToProviderNameSuffix$1(java.lang.CharSequence value) {
    this._2010ABNM107PayToProviderNameSuffix = value;
  }

  /**
   * Gets the value of the '_2010ABNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2010ABNM108IdentificationCodeQualifier$1() {
    return _2010ABNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2010ABNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2010ABNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2010ABNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2010ABNM109PayToProviderIdentifier' field.
   */
  public java.lang.CharSequence get2010ABNM109PayToProviderIdentifier$1() {
    return _2010ABNM109PayToProviderIdentifier;
  }

  /**
   * Sets the value of the '_2010ABNM109PayToProviderIdentifier' field.
   * @param value the value to set.
   */
  public void set2010ABNM109PayToProviderIdentifier$1(java.lang.CharSequence value) {
    this._2010ABNM109PayToProviderIdentifier = value;
  }

  /** Creates a new X837Pro_2010AB_NM1_PayToProviderName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder();
  }
  
  /** Creates a new X837Pro_2010AB_NM1_PayToProviderName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder(other);
  }
  
  /** Creates a new X837Pro_2010AB_NM1_PayToProviderName RecordBuilder by copying an existing X837Pro_2010AB_NM1_PayToProviderName instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2010AB_NM1_PayToProviderName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2010AB_NM1_PayToProviderName>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2010AB_NM1_PayToProviderName> {

    private java.lang.CharSequence _2010ABNM101EntityIdentifierCode;
    private java.lang.CharSequence _2010ABNM102EntityTypeQualifier;
    private java.lang.CharSequence _2010ABNM103PayToProviderLastOrOrganizationalName;
    private java.lang.CharSequence _2010ABNM104PayToProviderFirstName;
    private java.lang.CharSequence _2010ABNM105PayToProviderMiddleName;
    private java.lang.CharSequence _2010ABNM107PayToProviderNameSuffix;
    private java.lang.CharSequence _2010ABNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2010ABNM109PayToProviderIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010ABNM101EntityIdentifierCode)) {
        this._2010ABNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2010ABNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010ABNM102EntityTypeQualifier)) {
        this._2010ABNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2010ABNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010ABNM103PayToProviderLastOrOrganizationalName)) {
        this._2010ABNM103PayToProviderLastOrOrganizationalName = data().deepCopy(fields()[2].schema(), other._2010ABNM103PayToProviderLastOrOrganizationalName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010ABNM104PayToProviderFirstName)) {
        this._2010ABNM104PayToProviderFirstName = data().deepCopy(fields()[3].schema(), other._2010ABNM104PayToProviderFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2010ABNM105PayToProviderMiddleName)) {
        this._2010ABNM105PayToProviderMiddleName = data().deepCopy(fields()[4].schema(), other._2010ABNM105PayToProviderMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2010ABNM107PayToProviderNameSuffix)) {
        this._2010ABNM107PayToProviderNameSuffix = data().deepCopy(fields()[5].schema(), other._2010ABNM107PayToProviderNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2010ABNM108IdentificationCodeQualifier)) {
        this._2010ABNM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2010ABNM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2010ABNM109PayToProviderIdentifier)) {
        this._2010ABNM109PayToProviderIdentifier = data().deepCopy(fields()[7].schema(), other._2010ABNM109PayToProviderIdentifier);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2010AB_NM1_PayToProviderName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.SCHEMA$);
      if (isValidValue(fields()[0], other._2010ABNM101EntityIdentifierCode)) {
        this._2010ABNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2010ABNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010ABNM102EntityTypeQualifier)) {
        this._2010ABNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2010ABNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010ABNM103PayToProviderLastOrOrganizationalName)) {
        this._2010ABNM103PayToProviderLastOrOrganizationalName = data().deepCopy(fields()[2].schema(), other._2010ABNM103PayToProviderLastOrOrganizationalName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010ABNM104PayToProviderFirstName)) {
        this._2010ABNM104PayToProviderFirstName = data().deepCopy(fields()[3].schema(), other._2010ABNM104PayToProviderFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2010ABNM105PayToProviderMiddleName)) {
        this._2010ABNM105PayToProviderMiddleName = data().deepCopy(fields()[4].schema(), other._2010ABNM105PayToProviderMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2010ABNM107PayToProviderNameSuffix)) {
        this._2010ABNM107PayToProviderNameSuffix = data().deepCopy(fields()[5].schema(), other._2010ABNM107PayToProviderNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2010ABNM108IdentificationCodeQualifier)) {
        this._2010ABNM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2010ABNM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2010ABNM109PayToProviderIdentifier)) {
        this._2010ABNM109PayToProviderIdentifier = data().deepCopy(fields()[7].schema(), other._2010ABNM109PayToProviderIdentifier);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the '_2010ABNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2010ABNM101EntityIdentifierCode$1() {
      return _2010ABNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2010ABNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010ABNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM101EntityIdentifierCode' field has been set */
    public boolean has2010ABNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010ABNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM101EntityIdentifierCode$1() {
      _2010ABNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2010ABNM102EntityTypeQualifier$1() {
      return _2010ABNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2010ABNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010ABNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM102EntityTypeQualifier' field has been set */
    public boolean has2010ABNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010ABNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM102EntityTypeQualifier$1() {
      _2010ABNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM103PayToProviderLastOrOrganizationalName' field */
    public java.lang.CharSequence get2010ABNM103PayToProviderLastOrOrganizationalName$1() {
      return _2010ABNM103PayToProviderLastOrOrganizationalName;
    }
    
    /** Sets the value of the '_2010ABNM103PayToProviderLastOrOrganizationalName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM103PayToProviderLastOrOrganizationalName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010ABNM103PayToProviderLastOrOrganizationalName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM103PayToProviderLastOrOrganizationalName' field has been set */
    public boolean has2010ABNM103PayToProviderLastOrOrganizationalName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010ABNM103PayToProviderLastOrOrganizationalName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM103PayToProviderLastOrOrganizationalName$1() {
      _2010ABNM103PayToProviderLastOrOrganizationalName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM104PayToProviderFirstName' field */
    public java.lang.CharSequence get2010ABNM104PayToProviderFirstName$1() {
      return _2010ABNM104PayToProviderFirstName;
    }
    
    /** Sets the value of the '_2010ABNM104PayToProviderFirstName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM104PayToProviderFirstName$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2010ABNM104PayToProviderFirstName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM104PayToProviderFirstName' field has been set */
    public boolean has2010ABNM104PayToProviderFirstName$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2010ABNM104PayToProviderFirstName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM104PayToProviderFirstName$1() {
      _2010ABNM104PayToProviderFirstName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM105PayToProviderMiddleName' field */
    public java.lang.CharSequence get2010ABNM105PayToProviderMiddleName$1() {
      return _2010ABNM105PayToProviderMiddleName;
    }
    
    /** Sets the value of the '_2010ABNM105PayToProviderMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM105PayToProviderMiddleName$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2010ABNM105PayToProviderMiddleName = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM105PayToProviderMiddleName' field has been set */
    public boolean has2010ABNM105PayToProviderMiddleName$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2010ABNM105PayToProviderMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM105PayToProviderMiddleName$1() {
      _2010ABNM105PayToProviderMiddleName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM107PayToProviderNameSuffix' field */
    public java.lang.CharSequence get2010ABNM107PayToProviderNameSuffix$1() {
      return _2010ABNM107PayToProviderNameSuffix;
    }
    
    /** Sets the value of the '_2010ABNM107PayToProviderNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM107PayToProviderNameSuffix$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2010ABNM107PayToProviderNameSuffix = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM107PayToProviderNameSuffix' field has been set */
    public boolean has2010ABNM107PayToProviderNameSuffix$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2010ABNM107PayToProviderNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM107PayToProviderNameSuffix$1() {
      _2010ABNM107PayToProviderNameSuffix = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2010ABNM108IdentificationCodeQualifier$1() {
      return _2010ABNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2010ABNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2010ABNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM108IdentificationCodeQualifier' field has been set */
    public boolean has2010ABNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2010ABNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM108IdentificationCodeQualifier$1() {
      _2010ABNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the '_2010ABNM109PayToProviderIdentifier' field */
    public java.lang.CharSequence get2010ABNM109PayToProviderIdentifier$1() {
      return _2010ABNM109PayToProviderIdentifier;
    }
    
    /** Sets the value of the '_2010ABNM109PayToProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder set2010ABNM109PayToProviderIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this._2010ABNM109PayToProviderIdentifier = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABNM109PayToProviderIdentifier' field has been set */
    public boolean has2010ABNM109PayToProviderIdentifier$1() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the '_2010ABNM109PayToProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010AB_NM1_PayToProviderName.Builder clear2010ABNM109PayToProviderIdentifier$1() {
      _2010ABNM109PayToProviderIdentifier = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public X837Pro_2010AB_NM1_PayToProviderName build() {
      try {
        X837Pro_2010AB_NM1_PayToProviderName record = new X837Pro_2010AB_NM1_PayToProviderName();
        record._2010ABNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2010ABNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010ABNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2010ABNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010ABNM103PayToProviderLastOrOrganizationalName = fieldSetFlags()[2] ? this._2010ABNM103PayToProviderLastOrOrganizationalName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2010ABNM104PayToProviderFirstName = fieldSetFlags()[3] ? this._2010ABNM104PayToProviderFirstName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2010ABNM105PayToProviderMiddleName = fieldSetFlags()[4] ? this._2010ABNM105PayToProviderMiddleName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2010ABNM107PayToProviderNameSuffix = fieldSetFlags()[5] ? this._2010ABNM107PayToProviderNameSuffix : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2010ABNM108IdentificationCodeQualifier = fieldSetFlags()[6] ? this._2010ABNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[6]);
        record._2010ABNM109PayToProviderIdentifier = fieldSetFlags()[7] ? this._2010ABNM109PayToProviderIdentifier : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
