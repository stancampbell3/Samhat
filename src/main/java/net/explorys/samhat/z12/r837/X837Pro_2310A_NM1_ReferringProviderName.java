/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2310A_NM1_ReferringProviderName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2310A_NM1_ReferringProviderName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310ANM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2310ANM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2310ANM103ReferringProviderLastName\",\"type\":\"string\"},{\"name\":\"_2310ANM104ReferringProviderFirstName\",\"type\":\"string\"},{\"name\":\"_2310ANM105ReferringProviderMiddleName\",\"type\":\"string\"},{\"name\":\"_2310ANM107ReferringProviderNameSuffix\",\"type\":\"string\"},{\"name\":\"_2310ANM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2310ANM109ReferringProviderIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310ANM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2310ANM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2310ANM103ReferringProviderLastName;
  @Deprecated public java.lang.CharSequence _2310ANM104ReferringProviderFirstName;
  @Deprecated public java.lang.CharSequence _2310ANM105ReferringProviderMiddleName;
  @Deprecated public java.lang.CharSequence _2310ANM107ReferringProviderNameSuffix;
  @Deprecated public java.lang.CharSequence _2310ANM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2310ANM109ReferringProviderIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2310A_NM1_ReferringProviderName() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2310A_NM1_ReferringProviderName(java.lang.CharSequence _2310ANM101EntityIdentifierCode, java.lang.CharSequence _2310ANM102EntityTypeQualifier, java.lang.CharSequence _2310ANM103ReferringProviderLastName, java.lang.CharSequence _2310ANM104ReferringProviderFirstName, java.lang.CharSequence _2310ANM105ReferringProviderMiddleName, java.lang.CharSequence _2310ANM107ReferringProviderNameSuffix, java.lang.CharSequence _2310ANM108IdentificationCodeQualifier, java.lang.CharSequence _2310ANM109ReferringProviderIdentifier) {
    this._2310ANM101EntityIdentifierCode = _2310ANM101EntityIdentifierCode;
    this._2310ANM102EntityTypeQualifier = _2310ANM102EntityTypeQualifier;
    this._2310ANM103ReferringProviderLastName = _2310ANM103ReferringProviderLastName;
    this._2310ANM104ReferringProviderFirstName = _2310ANM104ReferringProviderFirstName;
    this._2310ANM105ReferringProviderMiddleName = _2310ANM105ReferringProviderMiddleName;
    this._2310ANM107ReferringProviderNameSuffix = _2310ANM107ReferringProviderNameSuffix;
    this._2310ANM108IdentificationCodeQualifier = _2310ANM108IdentificationCodeQualifier;
    this._2310ANM109ReferringProviderIdentifier = _2310ANM109ReferringProviderIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310ANM101EntityIdentifierCode;
    case 1: return _2310ANM102EntityTypeQualifier;
    case 2: return _2310ANM103ReferringProviderLastName;
    case 3: return _2310ANM104ReferringProviderFirstName;
    case 4: return _2310ANM105ReferringProviderMiddleName;
    case 5: return _2310ANM107ReferringProviderNameSuffix;
    case 6: return _2310ANM108IdentificationCodeQualifier;
    case 7: return _2310ANM109ReferringProviderIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310ANM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2310ANM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2310ANM103ReferringProviderLastName = (java.lang.CharSequence)value$; break;
    case 3: _2310ANM104ReferringProviderFirstName = (java.lang.CharSequence)value$; break;
    case 4: _2310ANM105ReferringProviderMiddleName = (java.lang.CharSequence)value$; break;
    case 5: _2310ANM107ReferringProviderNameSuffix = (java.lang.CharSequence)value$; break;
    case 6: _2310ANM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 7: _2310ANM109ReferringProviderIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310ANM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2310ANM101EntityIdentifierCode$1() {
    return _2310ANM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2310ANM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2310ANM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2310ANM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2310ANM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2310ANM102EntityTypeQualifier$1() {
    return _2310ANM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2310ANM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2310ANM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2310ANM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2310ANM103ReferringProviderLastName' field.
   */
  public java.lang.CharSequence get2310ANM103ReferringProviderLastName$1() {
    return _2310ANM103ReferringProviderLastName;
  }

  /**
   * Sets the value of the '_2310ANM103ReferringProviderLastName' field.
   * @param value the value to set.
   */
  public void set2310ANM103ReferringProviderLastName$1(java.lang.CharSequence value) {
    this._2310ANM103ReferringProviderLastName = value;
  }

  /**
   * Gets the value of the '_2310ANM104ReferringProviderFirstName' field.
   */
  public java.lang.CharSequence get2310ANM104ReferringProviderFirstName$1() {
    return _2310ANM104ReferringProviderFirstName;
  }

  /**
   * Sets the value of the '_2310ANM104ReferringProviderFirstName' field.
   * @param value the value to set.
   */
  public void set2310ANM104ReferringProviderFirstName$1(java.lang.CharSequence value) {
    this._2310ANM104ReferringProviderFirstName = value;
  }

  /**
   * Gets the value of the '_2310ANM105ReferringProviderMiddleName' field.
   */
  public java.lang.CharSequence get2310ANM105ReferringProviderMiddleName$1() {
    return _2310ANM105ReferringProviderMiddleName;
  }

  /**
   * Sets the value of the '_2310ANM105ReferringProviderMiddleName' field.
   * @param value the value to set.
   */
  public void set2310ANM105ReferringProviderMiddleName$1(java.lang.CharSequence value) {
    this._2310ANM105ReferringProviderMiddleName = value;
  }

  /**
   * Gets the value of the '_2310ANM107ReferringProviderNameSuffix' field.
   */
  public java.lang.CharSequence get2310ANM107ReferringProviderNameSuffix$1() {
    return _2310ANM107ReferringProviderNameSuffix;
  }

  /**
   * Sets the value of the '_2310ANM107ReferringProviderNameSuffix' field.
   * @param value the value to set.
   */
  public void set2310ANM107ReferringProviderNameSuffix$1(java.lang.CharSequence value) {
    this._2310ANM107ReferringProviderNameSuffix = value;
  }

  /**
   * Gets the value of the '_2310ANM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2310ANM108IdentificationCodeQualifier$1() {
    return _2310ANM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2310ANM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2310ANM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2310ANM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2310ANM109ReferringProviderIdentifier' field.
   */
  public java.lang.CharSequence get2310ANM109ReferringProviderIdentifier$1() {
    return _2310ANM109ReferringProviderIdentifier;
  }

  /**
   * Sets the value of the '_2310ANM109ReferringProviderIdentifier' field.
   * @param value the value to set.
   */
  public void set2310ANM109ReferringProviderIdentifier$1(java.lang.CharSequence value) {
    this._2310ANM109ReferringProviderIdentifier = value;
  }

  /** Creates a new X837Pro_2310A_NM1_ReferringProviderName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder();
  }
  
  /** Creates a new X837Pro_2310A_NM1_ReferringProviderName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder(other);
  }
  
  /** Creates a new X837Pro_2310A_NM1_ReferringProviderName RecordBuilder by copying an existing X837Pro_2310A_NM1_ReferringProviderName instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2310A_NM1_ReferringProviderName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2310A_NM1_ReferringProviderName>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2310A_NM1_ReferringProviderName> {

    private java.lang.CharSequence _2310ANM101EntityIdentifierCode;
    private java.lang.CharSequence _2310ANM102EntityTypeQualifier;
    private java.lang.CharSequence _2310ANM103ReferringProviderLastName;
    private java.lang.CharSequence _2310ANM104ReferringProviderFirstName;
    private java.lang.CharSequence _2310ANM105ReferringProviderMiddleName;
    private java.lang.CharSequence _2310ANM107ReferringProviderNameSuffix;
    private java.lang.CharSequence _2310ANM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2310ANM109ReferringProviderIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310ANM101EntityIdentifierCode)) {
        this._2310ANM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310ANM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310ANM102EntityTypeQualifier)) {
        this._2310ANM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310ANM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310ANM103ReferringProviderLastName)) {
        this._2310ANM103ReferringProviderLastName = data().deepCopy(fields()[2].schema(), other._2310ANM103ReferringProviderLastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310ANM104ReferringProviderFirstName)) {
        this._2310ANM104ReferringProviderFirstName = data().deepCopy(fields()[3].schema(), other._2310ANM104ReferringProviderFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310ANM105ReferringProviderMiddleName)) {
        this._2310ANM105ReferringProviderMiddleName = data().deepCopy(fields()[4].schema(), other._2310ANM105ReferringProviderMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2310ANM107ReferringProviderNameSuffix)) {
        this._2310ANM107ReferringProviderNameSuffix = data().deepCopy(fields()[5].schema(), other._2310ANM107ReferringProviderNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2310ANM108IdentificationCodeQualifier)) {
        this._2310ANM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2310ANM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2310ANM109ReferringProviderIdentifier)) {
        this._2310ANM109ReferringProviderIdentifier = data().deepCopy(fields()[7].schema(), other._2310ANM109ReferringProviderIdentifier);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2310A_NM1_ReferringProviderName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.SCHEMA$);
      if (isValidValue(fields()[0], other._2310ANM101EntityIdentifierCode)) {
        this._2310ANM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2310ANM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310ANM102EntityTypeQualifier)) {
        this._2310ANM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2310ANM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310ANM103ReferringProviderLastName)) {
        this._2310ANM103ReferringProviderLastName = data().deepCopy(fields()[2].schema(), other._2310ANM103ReferringProviderLastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2310ANM104ReferringProviderFirstName)) {
        this._2310ANM104ReferringProviderFirstName = data().deepCopy(fields()[3].schema(), other._2310ANM104ReferringProviderFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2310ANM105ReferringProviderMiddleName)) {
        this._2310ANM105ReferringProviderMiddleName = data().deepCopy(fields()[4].schema(), other._2310ANM105ReferringProviderMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2310ANM107ReferringProviderNameSuffix)) {
        this._2310ANM107ReferringProviderNameSuffix = data().deepCopy(fields()[5].schema(), other._2310ANM107ReferringProviderNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2310ANM108IdentificationCodeQualifier)) {
        this._2310ANM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2310ANM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2310ANM109ReferringProviderIdentifier)) {
        this._2310ANM109ReferringProviderIdentifier = data().deepCopy(fields()[7].schema(), other._2310ANM109ReferringProviderIdentifier);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the '_2310ANM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2310ANM101EntityIdentifierCode$1() {
      return _2310ANM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2310ANM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310ANM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM101EntityIdentifierCode' field has been set */
    public boolean has2310ANM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310ANM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM101EntityIdentifierCode$1() {
      _2310ANM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2310ANM102EntityTypeQualifier$1() {
      return _2310ANM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2310ANM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310ANM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM102EntityTypeQualifier' field has been set */
    public boolean has2310ANM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310ANM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM102EntityTypeQualifier$1() {
      _2310ANM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM103ReferringProviderLastName' field */
    public java.lang.CharSequence get2310ANM103ReferringProviderLastName$1() {
      return _2310ANM103ReferringProviderLastName;
    }
    
    /** Sets the value of the '_2310ANM103ReferringProviderLastName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM103ReferringProviderLastName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2310ANM103ReferringProviderLastName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM103ReferringProviderLastName' field has been set */
    public boolean has2310ANM103ReferringProviderLastName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2310ANM103ReferringProviderLastName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM103ReferringProviderLastName$1() {
      _2310ANM103ReferringProviderLastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM104ReferringProviderFirstName' field */
    public java.lang.CharSequence get2310ANM104ReferringProviderFirstName$1() {
      return _2310ANM104ReferringProviderFirstName;
    }
    
    /** Sets the value of the '_2310ANM104ReferringProviderFirstName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM104ReferringProviderFirstName$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2310ANM104ReferringProviderFirstName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM104ReferringProviderFirstName' field has been set */
    public boolean has2310ANM104ReferringProviderFirstName$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2310ANM104ReferringProviderFirstName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM104ReferringProviderFirstName$1() {
      _2310ANM104ReferringProviderFirstName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM105ReferringProviderMiddleName' field */
    public java.lang.CharSequence get2310ANM105ReferringProviderMiddleName$1() {
      return _2310ANM105ReferringProviderMiddleName;
    }
    
    /** Sets the value of the '_2310ANM105ReferringProviderMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM105ReferringProviderMiddleName$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2310ANM105ReferringProviderMiddleName = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM105ReferringProviderMiddleName' field has been set */
    public boolean has2310ANM105ReferringProviderMiddleName$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2310ANM105ReferringProviderMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM105ReferringProviderMiddleName$1() {
      _2310ANM105ReferringProviderMiddleName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM107ReferringProviderNameSuffix' field */
    public java.lang.CharSequence get2310ANM107ReferringProviderNameSuffix$1() {
      return _2310ANM107ReferringProviderNameSuffix;
    }
    
    /** Sets the value of the '_2310ANM107ReferringProviderNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM107ReferringProviderNameSuffix$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2310ANM107ReferringProviderNameSuffix = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM107ReferringProviderNameSuffix' field has been set */
    public boolean has2310ANM107ReferringProviderNameSuffix$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2310ANM107ReferringProviderNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM107ReferringProviderNameSuffix$1() {
      _2310ANM107ReferringProviderNameSuffix = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2310ANM108IdentificationCodeQualifier$1() {
      return _2310ANM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2310ANM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2310ANM108IdentificationCodeQualifier = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM108IdentificationCodeQualifier' field has been set */
    public boolean has2310ANM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2310ANM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM108IdentificationCodeQualifier$1() {
      _2310ANM108IdentificationCodeQualifier = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the '_2310ANM109ReferringProviderIdentifier' field */
    public java.lang.CharSequence get2310ANM109ReferringProviderIdentifier$1() {
      return _2310ANM109ReferringProviderIdentifier;
    }
    
    /** Sets the value of the '_2310ANM109ReferringProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder set2310ANM109ReferringProviderIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this._2310ANM109ReferringProviderIdentifier = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the '_2310ANM109ReferringProviderIdentifier' field has been set */
    public boolean has2310ANM109ReferringProviderIdentifier$1() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the '_2310ANM109ReferringProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310A_NM1_ReferringProviderName.Builder clear2310ANM109ReferringProviderIdentifier$1() {
      _2310ANM109ReferringProviderIdentifier = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public X837Pro_2310A_NM1_ReferringProviderName build() {
      try {
        X837Pro_2310A_NM1_ReferringProviderName record = new X837Pro_2310A_NM1_ReferringProviderName();
        record._2310ANM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2310ANM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310ANM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2310ANM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2310ANM103ReferringProviderLastName = fieldSetFlags()[2] ? this._2310ANM103ReferringProviderLastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2310ANM104ReferringProviderFirstName = fieldSetFlags()[3] ? this._2310ANM104ReferringProviderFirstName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2310ANM105ReferringProviderMiddleName = fieldSetFlags()[4] ? this._2310ANM105ReferringProviderMiddleName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2310ANM107ReferringProviderNameSuffix = fieldSetFlags()[5] ? this._2310ANM107ReferringProviderNameSuffix : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2310ANM108IdentificationCodeQualifier = fieldSetFlags()[6] ? this._2310ANM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[6]);
        record._2310ANM109ReferringProviderIdentifier = fieldSetFlags()[7] ? this._2310ANM109ReferringProviderIdentifier : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
