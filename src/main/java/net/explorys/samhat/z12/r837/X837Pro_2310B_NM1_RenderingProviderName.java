/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2310B_NM1_RenderingProviderName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2310B_NM1_RenderingProviderName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310BNM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2310BNM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2310BNM103RenderingProviderLastOrOrganizationName\",\"type\":\"string\"},{\"name\":\"_2310BNM104RenderingProviderFirstName\",\"type\":\"string\"},{\"name\":\"_2310BNM105RenderingProviderMiddleName\",\"type\":\"string\"},{\"name\":\"_2310BNM107RenderingProviderNameSuffix\",\"type\":\"string\"},{\"name\":\"_2310BNM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2310BNM109RenderingProviderIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310BNM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2310BNM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2310BNM103RenderingProviderLastOrOrganizationName;
  @Deprecated public java.lang.CharSequence _2310BNM104RenderingProviderFirstName;
  @Deprecated public java.lang.CharSequence _2310BNM105RenderingProviderMiddleName;
  @Deprecated public java.lang.CharSequence _2310BNM107RenderingProviderNameSuffix;
  @Deprecated public java.lang.CharSequence _2310BNM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2310BNM109RenderingProviderIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2310B_NM1_RenderingProviderName() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2310B_NM1_RenderingProviderName(java.lang.CharSequence _2310BNM101EntityIdentifierCode, java.lang.CharSequence _2310BNM102EntityTypeQualifier, java.lang.CharSequence _2310BNM103RenderingProviderLastOrOrganizationName, java.lang.CharSequence _2310BNM104RenderingProviderFirstName, java.lang.CharSequence _2310BNM105RenderingProviderMiddleName, java.lang.CharSequence _2310BNM107RenderingProviderNameSuffix, java.lang.CharSequence _2310BNM108IdentificationCodeQualifier, java.lang.CharSequence _2310BNM109RenderingProviderIdentifier) {
    this._2310BNM101EntityIdentifierCode = _2310BNM101EntityIdentifierCode;
    this._2310BNM102EntityTypeQualifier = _2310BNM102EntityTypeQualifier;
    this._2310BNM103RenderingProviderLastOrOrganizationName = _2310BNM103RenderingProviderLastOrOrganizationName;
    this._2310BNM104RenderingProviderFirstName = _2310BNM104RenderingProviderFirstName;
    this._2310BNM105RenderingProviderMiddleName = _2310BNM105RenderingProviderMiddleName;
    this._2310BNM107RenderingProviderNameSuffix = _2310BNM107RenderingProviderNameSuffix;
    this._2310BNM108IdentificationCodeQualifier = _2310BNM108IdentificationCodeQualifier;
    this._2310BNM109RenderingProviderIdentifier = _2310BNM109RenderingProviderIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310BNM101EntityIdentifierCode;
    case 1: return _2310BNM102EntityTypeQualifier;
    case 2: return _2310BNM103RenderingProviderLastOrOrganizationName;
    case 3: return _2310BNM104RenderingProviderFirstName;
    case 4: return _2310BNM105RenderingProviderMiddleName;
    case 5: return _2310BNM107RenderingProviderNameSuffix;
    case 6: return _2310BNM108IdentificationCodeQualifier;
    case 7: return _2310BNM109RenderingProviderIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310BNM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2310BNM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2310BNM103RenderingProviderLastOrOrganizationName = (java.lang.CharSequence)value$; break;
    case 3: _2310BNM104RenderingProviderFirstName = (java.lang.CharSequence)value$; break;
    case 4: _2310BNM105RenderingProviderMiddleName = (java.lang.CharSequence)value$; break;
    case 5: _2310BNM107RenderingProviderNameSuffix = (java.lang.CharSequence)value$; break;
    case 6: _2310BNM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 7: _2310BNM109RenderingProviderIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310BNM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2310BNM101EntityIdentifierCode$1() {
    return _2310BNM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2310BNM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2310BNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2310BNM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2310BNM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2310BNM102EntityTypeQualifier$1() {
    return _2310BNM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2310BNM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2310BNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2310BNM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2310BNM103RenderingProviderLastOrOrganizationName' field.
   */
  public java.lang.CharSequence get2310BNM103RenderingProviderLastOrOrganizationName$1() {
    return _2310BNM103RenderingProviderLastOrOrganizationName;
  }

  /**
   * Sets the value of the '_2310BNM103RenderingProviderLastOrOrganizationName' field.
   * @param value the value to set.
   */
  public void set2310BNM103RenderingProviderLastOrOrganizationName$1(java.lang.CharSequence value) {
    this._2310BNM103RenderingProviderLastOrOrganizationName = value;
  }

  /**
   * Gets the value of the '_2310BNM104RenderingProviderFirstName' field.
   */
  public java.lang.CharSequence get2310BNM104RenderingProviderFirstName$1() {
    return _2310BNM104RenderingProviderFirstName;
  }

  /**
   * Sets the value of the '_2310BNM104RenderingProviderFirstName' field.
   * @param value the value to set.
   */
  public void set2310BNM104RenderingProviderFirstName$1(java.lang.CharSequence value) {
    this._2310BNM104RenderingProviderFirstName = value;
  }

  /**
   * Gets the value of the '_2310BNM105RenderingProviderMiddleName' field.
   */
  public java.lang.CharSequence get2310BNM105RenderingProviderMiddleName$1() {
    return _2310BNM105RenderingProviderMiddleName;
  }

  /**
   * Sets the value of the '_2310BNM105RenderingProviderMiddleName' field.
   * @param value the value to set.
   */
  public void set2310BNM105RenderingProviderMiddleName$1(java.lang.CharSequence value) {
    this._2310BNM105RenderingProviderMiddleName = value;
  }

  /**
   * Gets the value of the '_2310BNM107RenderingProviderNameSuffix' field.
   */
  public java.lang.CharSequence get2310BNM107RenderingProviderNameSuffix$1() {
    return _2310BNM107RenderingProviderNameSuffix;
  }

  /**
   * Sets the value of the '_2310BNM107RenderingProviderNameSuffix' field.
   * @param value the value to set.
   */
  public void set2310BNM107RenderingProviderNameSuffix$1(java.lang.CharSequence value) {
    this._2310BNM107RenderingProviderNameSuffix = value;
  }

  /**
   * Gets the value of the '_2310BNM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2310BNM108IdentificationCodeQualifier$1() {
    return _2310BNM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2310BNM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2310BNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2310BNM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2310BNM109RenderingProviderIdentifier' field.
   */
  public java.lang.CharSequence get2310BNM109RenderingProviderIdentifier$1() {
    return _2310BNM109RenderingProviderIdentifier;
  }

  /**
   * Sets the value of the '_2310BNM109RenderingProviderIdentifier' field.
   * @param value the value to set.
   */
  public void set2310BNM109RenderingProviderIdentifier$1(java.lang.CharSequence value) {
    this._2310BNM109RenderingProviderIdentifier = value;
  }

  /** Creates a new X837Pro_2310B_NM1_RenderingProviderName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder();
  }
  
  /** Creates a new X837Pro_2310B_NM1_RenderingProviderName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder(other);
  }
  
  /** Creates a new X837Pro_2310B_NM1_RenderingProviderName RecordBuilder by copying an existing X837Pro_2310B_NM1_RenderingProviderName instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2310B_NM1_RenderingProviderName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2310B_NM1_RenderingProviderName>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2310B_NM1_RenderingProviderName> {

    private java.lang.CharSequence _2310BNM101EntityIdentifierCode;
    private java.lang.CharSequence _2310BNM102EntityTypeQualifier;
    private java.lang.CharSequence _2310BNM103RenderingProviderLastOrOrganizationName;
    private java.lang.CharSequence _2310BNM104RenderingProviderFirstName;
    private java.lang.CharSequence _2310BNM105RenderingProviderMiddleName;
    private java.lang.CharSequence _2310BNM107RenderingProviderNameSuffix;
    private java.lang.CharSequence _2310BNM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2310BNM109RenderingProviderIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310BNM101EntityIdentifierCode)) {
        this._2310BNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310BNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310BNM102EntityTypeQualifier)) {
        this._2310BNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310BNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310BNM103RenderingProviderLastOrOrganizationName)) {
        this._2310BNM103RenderingProviderLastOrOrganizationName = data().deepCopy(fields()[2].schema(), other._2310BNM103RenderingProviderLastOrOrganizationName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310BNM104RenderingProviderFirstName)) {
        this._2310BNM104RenderingProviderFirstName = data().deepCopy(fields()[3].schema(), other._2310BNM104RenderingProviderFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310BNM105RenderingProviderMiddleName)) {
        this._2310BNM105RenderingProviderMiddleName = data().deepCopy(fields()[4].schema(), other._2310BNM105RenderingProviderMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2310BNM107RenderingProviderNameSuffix)) {
        this._2310BNM107RenderingProviderNameSuffix = data().deepCopy(fields()[5].schema(), other._2310BNM107RenderingProviderNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2310BNM108IdentificationCodeQualifier)) {
        this._2310BNM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2310BNM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2310BNM109RenderingProviderIdentifier)) {
        this._2310BNM109RenderingProviderIdentifier = data().deepCopy(fields()[7].schema(), other._2310BNM109RenderingProviderIdentifier);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2310B_NM1_RenderingProviderName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.SCHEMA$);
      if (isValidValue(fields()[0], other._2310BNM101EntityIdentifierCode)) {
        this._2310BNM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310BNM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310BNM102EntityTypeQualifier)) {
        this._2310BNM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310BNM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310BNM103RenderingProviderLastOrOrganizationName)) {
        this._2310BNM103RenderingProviderLastOrOrganizationName = data().deepCopy(fields()[2].schema(), other._2310BNM103RenderingProviderLastOrOrganizationName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310BNM104RenderingProviderFirstName)) {
        this._2310BNM104RenderingProviderFirstName = data().deepCopy(fields()[3].schema(), other._2310BNM104RenderingProviderFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310BNM105RenderingProviderMiddleName)) {
        this._2310BNM105RenderingProviderMiddleName = data().deepCopy(fields()[4].schema(), other._2310BNM105RenderingProviderMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2310BNM107RenderingProviderNameSuffix)) {
        this._2310BNM107RenderingProviderNameSuffix = data().deepCopy(fields()[5].schema(), other._2310BNM107RenderingProviderNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2310BNM108IdentificationCodeQualifier)) {
        this._2310BNM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2310BNM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2310BNM109RenderingProviderIdentifier)) {
        this._2310BNM109RenderingProviderIdentifier = data().deepCopy(fields()[7].schema(), other._2310BNM109RenderingProviderIdentifier);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the '_2310BNM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2310BNM101EntityIdentifierCode$1() {
      return _2310BNM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2310BNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310BNM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM101EntityIdentifierCode' field has been set */
    public boolean has2310BNM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310BNM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM101EntityIdentifierCode$1() {
      _2310BNM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2310BNM102EntityTypeQualifier$1() {
      return _2310BNM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2310BNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310BNM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM102EntityTypeQualifier' field has been set */
    public boolean has2310BNM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310BNM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM102EntityTypeQualifier$1() {
      _2310BNM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM103RenderingProviderLastOrOrganizationName' field */
    public java.lang.CharSequence get2310BNM103RenderingProviderLastOrOrganizationName$1() {
      return _2310BNM103RenderingProviderLastOrOrganizationName;
    }
    
    /** Sets the value of the '_2310BNM103RenderingProviderLastOrOrganizationName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM103RenderingProviderLastOrOrganizationName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2310BNM103RenderingProviderLastOrOrganizationName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM103RenderingProviderLastOrOrganizationName' field has been set */
    public boolean has2310BNM103RenderingProviderLastOrOrganizationName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2310BNM103RenderingProviderLastOrOrganizationName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM103RenderingProviderLastOrOrganizationName$1() {
      _2310BNM103RenderingProviderLastOrOrganizationName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM104RenderingProviderFirstName' field */
    public java.lang.CharSequence get2310BNM104RenderingProviderFirstName$1() {
      return _2310BNM104RenderingProviderFirstName;
    }
    
    /** Sets the value of the '_2310BNM104RenderingProviderFirstName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM104RenderingProviderFirstName$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2310BNM104RenderingProviderFirstName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM104RenderingProviderFirstName' field has been set */
    public boolean has2310BNM104RenderingProviderFirstName$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2310BNM104RenderingProviderFirstName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM104RenderingProviderFirstName$1() {
      _2310BNM104RenderingProviderFirstName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM105RenderingProviderMiddleName' field */
    public java.lang.CharSequence get2310BNM105RenderingProviderMiddleName$1() {
      return _2310BNM105RenderingProviderMiddleName;
    }
    
    /** Sets the value of the '_2310BNM105RenderingProviderMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM105RenderingProviderMiddleName$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2310BNM105RenderingProviderMiddleName = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM105RenderingProviderMiddleName' field has been set */
    public boolean has2310BNM105RenderingProviderMiddleName$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2310BNM105RenderingProviderMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM105RenderingProviderMiddleName$1() {
      _2310BNM105RenderingProviderMiddleName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM107RenderingProviderNameSuffix' field */
    public java.lang.CharSequence get2310BNM107RenderingProviderNameSuffix$1() {
      return _2310BNM107RenderingProviderNameSuffix;
    }
    
    /** Sets the value of the '_2310BNM107RenderingProviderNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM107RenderingProviderNameSuffix$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2310BNM107RenderingProviderNameSuffix = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM107RenderingProviderNameSuffix' field has been set */
    public boolean has2310BNM107RenderingProviderNameSuffix$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2310BNM107RenderingProviderNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM107RenderingProviderNameSuffix$1() {
      _2310BNM107RenderingProviderNameSuffix = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2310BNM108IdentificationCodeQualifier$1() {
      return _2310BNM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2310BNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2310BNM108IdentificationCodeQualifier = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM108IdentificationCodeQualifier' field has been set */
    public boolean has2310BNM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2310BNM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM108IdentificationCodeQualifier$1() {
      _2310BNM108IdentificationCodeQualifier = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the '_2310BNM109RenderingProviderIdentifier' field */
    public java.lang.CharSequence get2310BNM109RenderingProviderIdentifier$1() {
      return _2310BNM109RenderingProviderIdentifier;
    }
    
    /** Sets the value of the '_2310BNM109RenderingProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder set2310BNM109RenderingProviderIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this._2310BNM109RenderingProviderIdentifier = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BNM109RenderingProviderIdentifier' field has been set */
    public boolean has2310BNM109RenderingProviderIdentifier$1() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the '_2310BNM109RenderingProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_NM1_RenderingProviderName.Builder clear2310BNM109RenderingProviderIdentifier$1() {
      _2310BNM109RenderingProviderIdentifier = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public X837Pro_2310B_NM1_RenderingProviderName build() {
      try {
        X837Pro_2310B_NM1_RenderingProviderName record = new X837Pro_2310B_NM1_RenderingProviderName();
        record._2310BNM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2310BNM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310BNM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2310BNM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2310BNM103RenderingProviderLastOrOrganizationName = fieldSetFlags()[2] ? this._2310BNM103RenderingProviderLastOrOrganizationName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2310BNM104RenderingProviderFirstName = fieldSetFlags()[3] ? this._2310BNM104RenderingProviderFirstName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2310BNM105RenderingProviderMiddleName = fieldSetFlags()[4] ? this._2310BNM105RenderingProviderMiddleName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2310BNM107RenderingProviderNameSuffix = fieldSetFlags()[5] ? this._2310BNM107RenderingProviderNameSuffix : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2310BNM108IdentificationCodeQualifier = fieldSetFlags()[6] ? this._2310BNM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[6]);
        record._2310BNM109RenderingProviderIdentifier = fieldSetFlags()[7] ? this._2310BNM109RenderingProviderIdentifier : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
