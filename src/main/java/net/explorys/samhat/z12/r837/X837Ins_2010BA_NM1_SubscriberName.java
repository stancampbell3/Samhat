/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010BA_NM1_SubscriberName extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010BA_NM1_SubscriberName\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010BANM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2010BANM102EntityTypeQualifier\",\"type\":\"string\"},{\"name\":\"_2010BANM103SubscriberLastName\",\"type\":\"string\"},{\"name\":\"_2010BANM104SubscriberFirstName\",\"type\":\"string\"},{\"name\":\"_2010BANM105SubscriberMiddleName\",\"type\":\"string\"},{\"name\":\"_2010BANM107SubscriberNameSuffix\",\"type\":\"string\"},{\"name\":\"_2010BANM108IdentificationCodeQualifier\",\"type\":\"string\"},{\"name\":\"_2010BANM109SubscriberPrimaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010BANM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2010BANM102EntityTypeQualifier;
  @Deprecated public java.lang.CharSequence _2010BANM103SubscriberLastName;
  @Deprecated public java.lang.CharSequence _2010BANM104SubscriberFirstName;
  @Deprecated public java.lang.CharSequence _2010BANM105SubscriberMiddleName;
  @Deprecated public java.lang.CharSequence _2010BANM107SubscriberNameSuffix;
  @Deprecated public java.lang.CharSequence _2010BANM108IdentificationCodeQualifier;
  @Deprecated public java.lang.CharSequence _2010BANM109SubscriberPrimaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2010BA_NM1_SubscriberName() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2010BA_NM1_SubscriberName(java.lang.CharSequence _2010BANM101EntityIdentifierCode, java.lang.CharSequence _2010BANM102EntityTypeQualifier, java.lang.CharSequence _2010BANM103SubscriberLastName, java.lang.CharSequence _2010BANM104SubscriberFirstName, java.lang.CharSequence _2010BANM105SubscriberMiddleName, java.lang.CharSequence _2010BANM107SubscriberNameSuffix, java.lang.CharSequence _2010BANM108IdentificationCodeQualifier, java.lang.CharSequence _2010BANM109SubscriberPrimaryIdentifier) {
    this._2010BANM101EntityIdentifierCode = _2010BANM101EntityIdentifierCode;
    this._2010BANM102EntityTypeQualifier = _2010BANM102EntityTypeQualifier;
    this._2010BANM103SubscriberLastName = _2010BANM103SubscriberLastName;
    this._2010BANM104SubscriberFirstName = _2010BANM104SubscriberFirstName;
    this._2010BANM105SubscriberMiddleName = _2010BANM105SubscriberMiddleName;
    this._2010BANM107SubscriberNameSuffix = _2010BANM107SubscriberNameSuffix;
    this._2010BANM108IdentificationCodeQualifier = _2010BANM108IdentificationCodeQualifier;
    this._2010BANM109SubscriberPrimaryIdentifier = _2010BANM109SubscriberPrimaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010BANM101EntityIdentifierCode;
    case 1: return _2010BANM102EntityTypeQualifier;
    case 2: return _2010BANM103SubscriberLastName;
    case 3: return _2010BANM104SubscriberFirstName;
    case 4: return _2010BANM105SubscriberMiddleName;
    case 5: return _2010BANM107SubscriberNameSuffix;
    case 6: return _2010BANM108IdentificationCodeQualifier;
    case 7: return _2010BANM109SubscriberPrimaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010BANM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2010BANM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2010BANM103SubscriberLastName = (java.lang.CharSequence)value$; break;
    case 3: _2010BANM104SubscriberFirstName = (java.lang.CharSequence)value$; break;
    case 4: _2010BANM105SubscriberMiddleName = (java.lang.CharSequence)value$; break;
    case 5: _2010BANM107SubscriberNameSuffix = (java.lang.CharSequence)value$; break;
    case 6: _2010BANM108IdentificationCodeQualifier = (java.lang.CharSequence)value$; break;
    case 7: _2010BANM109SubscriberPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010BANM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2010BANM101EntityIdentifierCode$1() {
    return _2010BANM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2010BANM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2010BANM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2010BANM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2010BANM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2010BANM102EntityTypeQualifier$1() {
    return _2010BANM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2010BANM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2010BANM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2010BANM102EntityTypeQualifier = value;
  }

  /**
   * Gets the value of the '_2010BANM103SubscriberLastName' field.
   */
  public java.lang.CharSequence get2010BANM103SubscriberLastName$1() {
    return _2010BANM103SubscriberLastName;
  }

  /**
   * Sets the value of the '_2010BANM103SubscriberLastName' field.
   * @param value the value to set.
   */
  public void set2010BANM103SubscriberLastName$1(java.lang.CharSequence value) {
    this._2010BANM103SubscriberLastName = value;
  }

  /**
   * Gets the value of the '_2010BANM104SubscriberFirstName' field.
   */
  public java.lang.CharSequence get2010BANM104SubscriberFirstName$1() {
    return _2010BANM104SubscriberFirstName;
  }

  /**
   * Sets the value of the '_2010BANM104SubscriberFirstName' field.
   * @param value the value to set.
   */
  public void set2010BANM104SubscriberFirstName$1(java.lang.CharSequence value) {
    this._2010BANM104SubscriberFirstName = value;
  }

  /**
   * Gets the value of the '_2010BANM105SubscriberMiddleName' field.
   */
  public java.lang.CharSequence get2010BANM105SubscriberMiddleName$1() {
    return _2010BANM105SubscriberMiddleName;
  }

  /**
   * Sets the value of the '_2010BANM105SubscriberMiddleName' field.
   * @param value the value to set.
   */
  public void set2010BANM105SubscriberMiddleName$1(java.lang.CharSequence value) {
    this._2010BANM105SubscriberMiddleName = value;
  }

  /**
   * Gets the value of the '_2010BANM107SubscriberNameSuffix' field.
   */
  public java.lang.CharSequence get2010BANM107SubscriberNameSuffix$1() {
    return _2010BANM107SubscriberNameSuffix;
  }

  /**
   * Sets the value of the '_2010BANM107SubscriberNameSuffix' field.
   * @param value the value to set.
   */
  public void set2010BANM107SubscriberNameSuffix$1(java.lang.CharSequence value) {
    this._2010BANM107SubscriberNameSuffix = value;
  }

  /**
   * Gets the value of the '_2010BANM108IdentificationCodeQualifier' field.
   */
  public java.lang.CharSequence get2010BANM108IdentificationCodeQualifier$1() {
    return _2010BANM108IdentificationCodeQualifier;
  }

  /**
   * Sets the value of the '_2010BANM108IdentificationCodeQualifier' field.
   * @param value the value to set.
   */
  public void set2010BANM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
    this._2010BANM108IdentificationCodeQualifier = value;
  }

  /**
   * Gets the value of the '_2010BANM109SubscriberPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get2010BANM109SubscriberPrimaryIdentifier$1() {
    return _2010BANM109SubscriberPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_2010BANM109SubscriberPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2010BANM109SubscriberPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._2010BANM109SubscriberPrimaryIdentifier = value;
  }

  /** Creates a new X837Ins_2010BA_NM1_SubscriberName RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder();
  }
  
  /** Creates a new X837Ins_2010BA_NM1_SubscriberName RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder(other);
  }
  
  /** Creates a new X837Ins_2010BA_NM1_SubscriberName RecordBuilder by copying an existing X837Ins_2010BA_NM1_SubscriberName instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010BA_NM1_SubscriberName instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010BA_NM1_SubscriberName>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010BA_NM1_SubscriberName> {

    private java.lang.CharSequence _2010BANM101EntityIdentifierCode;
    private java.lang.CharSequence _2010BANM102EntityTypeQualifier;
    private java.lang.CharSequence _2010BANM103SubscriberLastName;
    private java.lang.CharSequence _2010BANM104SubscriberFirstName;
    private java.lang.CharSequence _2010BANM105SubscriberMiddleName;
    private java.lang.CharSequence _2010BANM107SubscriberNameSuffix;
    private java.lang.CharSequence _2010BANM108IdentificationCodeQualifier;
    private java.lang.CharSequence _2010BANM109SubscriberPrimaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010BANM101EntityIdentifierCode)) {
        this._2010BANM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2010BANM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010BANM102EntityTypeQualifier)) {
        this._2010BANM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2010BANM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010BANM103SubscriberLastName)) {
        this._2010BANM103SubscriberLastName = data().deepCopy(fields()[2].schema(), other._2010BANM103SubscriberLastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010BANM104SubscriberFirstName)) {
        this._2010BANM104SubscriberFirstName = data().deepCopy(fields()[3].schema(), other._2010BANM104SubscriberFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2010BANM105SubscriberMiddleName)) {
        this._2010BANM105SubscriberMiddleName = data().deepCopy(fields()[4].schema(), other._2010BANM105SubscriberMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2010BANM107SubscriberNameSuffix)) {
        this._2010BANM107SubscriberNameSuffix = data().deepCopy(fields()[5].schema(), other._2010BANM107SubscriberNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2010BANM108IdentificationCodeQualifier)) {
        this._2010BANM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2010BANM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2010BANM109SubscriberPrimaryIdentifier)) {
        this._2010BANM109SubscriberPrimaryIdentifier = data().deepCopy(fields()[7].schema(), other._2010BANM109SubscriberPrimaryIdentifier);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010BA_NM1_SubscriberName instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.SCHEMA$);
      if (isValidValue(fields()[0], other._2010BANM101EntityIdentifierCode)) {
        this._2010BANM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2010BANM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010BANM102EntityTypeQualifier)) {
        this._2010BANM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2010BANM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010BANM103SubscriberLastName)) {
        this._2010BANM103SubscriberLastName = data().deepCopy(fields()[2].schema(), other._2010BANM103SubscriberLastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010BANM104SubscriberFirstName)) {
        this._2010BANM104SubscriberFirstName = data().deepCopy(fields()[3].schema(), other._2010BANM104SubscriberFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2010BANM105SubscriberMiddleName)) {
        this._2010BANM105SubscriberMiddleName = data().deepCopy(fields()[4].schema(), other._2010BANM105SubscriberMiddleName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2010BANM107SubscriberNameSuffix)) {
        this._2010BANM107SubscriberNameSuffix = data().deepCopy(fields()[5].schema(), other._2010BANM107SubscriberNameSuffix);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2010BANM108IdentificationCodeQualifier)) {
        this._2010BANM108IdentificationCodeQualifier = data().deepCopy(fields()[6].schema(), other._2010BANM108IdentificationCodeQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2010BANM109SubscriberPrimaryIdentifier)) {
        this._2010BANM109SubscriberPrimaryIdentifier = data().deepCopy(fields()[7].schema(), other._2010BANM109SubscriberPrimaryIdentifier);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the '_2010BANM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2010BANM101EntityIdentifierCode$1() {
      return _2010BANM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2010BANM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010BANM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM101EntityIdentifierCode' field has been set */
    public boolean has2010BANM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010BANM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM101EntityIdentifierCode$1() {
      _2010BANM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2010BANM102EntityTypeQualifier$1() {
      return _2010BANM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2010BANM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010BANM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM102EntityTypeQualifier' field has been set */
    public boolean has2010BANM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010BANM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM102EntityTypeQualifier$1() {
      _2010BANM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM103SubscriberLastName' field */
    public java.lang.CharSequence get2010BANM103SubscriberLastName$1() {
      return _2010BANM103SubscriberLastName;
    }
    
    /** Sets the value of the '_2010BANM103SubscriberLastName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM103SubscriberLastName$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010BANM103SubscriberLastName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM103SubscriberLastName' field has been set */
    public boolean has2010BANM103SubscriberLastName$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010BANM103SubscriberLastName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM103SubscriberLastName$1() {
      _2010BANM103SubscriberLastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM104SubscriberFirstName' field */
    public java.lang.CharSequence get2010BANM104SubscriberFirstName$1() {
      return _2010BANM104SubscriberFirstName;
    }
    
    /** Sets the value of the '_2010BANM104SubscriberFirstName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM104SubscriberFirstName$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2010BANM104SubscriberFirstName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM104SubscriberFirstName' field has been set */
    public boolean has2010BANM104SubscriberFirstName$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2010BANM104SubscriberFirstName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM104SubscriberFirstName$1() {
      _2010BANM104SubscriberFirstName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM105SubscriberMiddleName' field */
    public java.lang.CharSequence get2010BANM105SubscriberMiddleName$1() {
      return _2010BANM105SubscriberMiddleName;
    }
    
    /** Sets the value of the '_2010BANM105SubscriberMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM105SubscriberMiddleName$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2010BANM105SubscriberMiddleName = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM105SubscriberMiddleName' field has been set */
    public boolean has2010BANM105SubscriberMiddleName$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2010BANM105SubscriberMiddleName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM105SubscriberMiddleName$1() {
      _2010BANM105SubscriberMiddleName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM107SubscriberNameSuffix' field */
    public java.lang.CharSequence get2010BANM107SubscriberNameSuffix$1() {
      return _2010BANM107SubscriberNameSuffix;
    }
    
    /** Sets the value of the '_2010BANM107SubscriberNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM107SubscriberNameSuffix$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2010BANM107SubscriberNameSuffix = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM107SubscriberNameSuffix' field has been set */
    public boolean has2010BANM107SubscriberNameSuffix$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2010BANM107SubscriberNameSuffix' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM107SubscriberNameSuffix$1() {
      _2010BANM107SubscriberNameSuffix = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM108IdentificationCodeQualifier' field */
    public java.lang.CharSequence get2010BANM108IdentificationCodeQualifier$1() {
      return _2010BANM108IdentificationCodeQualifier;
    }
    
    /** Sets the value of the '_2010BANM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM108IdentificationCodeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2010BANM108IdentificationCodeQualifier = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM108IdentificationCodeQualifier' field has been set */
    public boolean has2010BANM108IdentificationCodeQualifier$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2010BANM108IdentificationCodeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM108IdentificationCodeQualifier$1() {
      _2010BANM108IdentificationCodeQualifier = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the '_2010BANM109SubscriberPrimaryIdentifier' field */
    public java.lang.CharSequence get2010BANM109SubscriberPrimaryIdentifier$1() {
      return _2010BANM109SubscriberPrimaryIdentifier;
    }
    
    /** Sets the value of the '_2010BANM109SubscriberPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder set2010BANM109SubscriberPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this._2010BANM109SubscriberPrimaryIdentifier = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BANM109SubscriberPrimaryIdentifier' field has been set */
    public boolean has2010BANM109SubscriberPrimaryIdentifier$1() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the '_2010BANM109SubscriberPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010BA_NM1_SubscriberName.Builder clear2010BANM109SubscriberPrimaryIdentifier$1() {
      _2010BANM109SubscriberPrimaryIdentifier = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public X837Ins_2010BA_NM1_SubscriberName build() {
      try {
        X837Ins_2010BA_NM1_SubscriberName record = new X837Ins_2010BA_NM1_SubscriberName();
        record._2010BANM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2010BANM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010BANM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2010BANM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010BANM103SubscriberLastName = fieldSetFlags()[2] ? this._2010BANM103SubscriberLastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2010BANM104SubscriberFirstName = fieldSetFlags()[3] ? this._2010BANM104SubscriberFirstName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2010BANM105SubscriberMiddleName = fieldSetFlags()[4] ? this._2010BANM105SubscriberMiddleName : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2010BANM107SubscriberNameSuffix = fieldSetFlags()[5] ? this._2010BANM107SubscriberNameSuffix : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2010BANM108IdentificationCodeQualifier = fieldSetFlags()[6] ? this._2010BANM108IdentificationCodeQualifier : (java.lang.CharSequence) defaultValue(fields()[6]);
        record._2010BANM109SubscriberPrimaryIdentifier = fieldSetFlags()[7] ? this._2010BANM109SubscriberPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
