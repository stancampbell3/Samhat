/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2300_CRC_HomeHealthFunctionalLimitations extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2300_CRC_HomeHealthFunctionalLimitations\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300CRC01CodeCategory\",\"type\":\"string\"},{\"name\":\"_2300CRC02CertificationConditionIndicator\",\"type\":\"string\"},{\"name\":\"_2300CRC03FunctionalLimitationCode\",\"type\":\"string\"},{\"name\":\"_2300CRC04FunctionalLimitationCode\",\"type\":\"string\"},{\"name\":\"_2300CRC05FunctionalLimitationCode\",\"type\":\"string\"},{\"name\":\"_2300CRC06FunctionalLimitationCode\",\"type\":\"string\"},{\"name\":\"_2300CRC07FunctionalLimitationCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300CRC01CodeCategory;
  @Deprecated public java.lang.CharSequence _2300CRC02CertificationConditionIndicator;
  @Deprecated public java.lang.CharSequence _2300CRC03FunctionalLimitationCode;
  @Deprecated public java.lang.CharSequence _2300CRC04FunctionalLimitationCode;
  @Deprecated public java.lang.CharSequence _2300CRC05FunctionalLimitationCode;
  @Deprecated public java.lang.CharSequence _2300CRC06FunctionalLimitationCode;
  @Deprecated public java.lang.CharSequence _2300CRC07FunctionalLimitationCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2300_CRC_HomeHealthFunctionalLimitations() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2300_CRC_HomeHealthFunctionalLimitations(java.lang.CharSequence _2300CRC01CodeCategory, java.lang.CharSequence _2300CRC02CertificationConditionIndicator, java.lang.CharSequence _2300CRC03FunctionalLimitationCode, java.lang.CharSequence _2300CRC04FunctionalLimitationCode, java.lang.CharSequence _2300CRC05FunctionalLimitationCode, java.lang.CharSequence _2300CRC06FunctionalLimitationCode, java.lang.CharSequence _2300CRC07FunctionalLimitationCode) {
    this._2300CRC01CodeCategory = _2300CRC01CodeCategory;
    this._2300CRC02CertificationConditionIndicator = _2300CRC02CertificationConditionIndicator;
    this._2300CRC03FunctionalLimitationCode = _2300CRC03FunctionalLimitationCode;
    this._2300CRC04FunctionalLimitationCode = _2300CRC04FunctionalLimitationCode;
    this._2300CRC05FunctionalLimitationCode = _2300CRC05FunctionalLimitationCode;
    this._2300CRC06FunctionalLimitationCode = _2300CRC06FunctionalLimitationCode;
    this._2300CRC07FunctionalLimitationCode = _2300CRC07FunctionalLimitationCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300CRC01CodeCategory;
    case 1: return _2300CRC02CertificationConditionIndicator;
    case 2: return _2300CRC03FunctionalLimitationCode;
    case 3: return _2300CRC04FunctionalLimitationCode;
    case 4: return _2300CRC05FunctionalLimitationCode;
    case 5: return _2300CRC06FunctionalLimitationCode;
    case 6: return _2300CRC07FunctionalLimitationCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300CRC01CodeCategory = (java.lang.CharSequence)value$; break;
    case 1: _2300CRC02CertificationConditionIndicator = (java.lang.CharSequence)value$; break;
    case 2: _2300CRC03FunctionalLimitationCode = (java.lang.CharSequence)value$; break;
    case 3: _2300CRC04FunctionalLimitationCode = (java.lang.CharSequence)value$; break;
    case 4: _2300CRC05FunctionalLimitationCode = (java.lang.CharSequence)value$; break;
    case 5: _2300CRC06FunctionalLimitationCode = (java.lang.CharSequence)value$; break;
    case 6: _2300CRC07FunctionalLimitationCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300CRC01CodeCategory' field.
   */
  public java.lang.CharSequence get2300CRC01CodeCategory$1() {
    return _2300CRC01CodeCategory;
  }

  /**
   * Sets the value of the '_2300CRC01CodeCategory' field.
   * @param value the value to set.
   */
  public void set2300CRC01CodeCategory$1(java.lang.CharSequence value) {
    this._2300CRC01CodeCategory = value;
  }

  /**
   * Gets the value of the '_2300CRC02CertificationConditionIndicator' field.
   */
  public java.lang.CharSequence get2300CRC02CertificationConditionIndicator$1() {
    return _2300CRC02CertificationConditionIndicator;
  }

  /**
   * Sets the value of the '_2300CRC02CertificationConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2300CRC02CertificationConditionIndicator$1(java.lang.CharSequence value) {
    this._2300CRC02CertificationConditionIndicator = value;
  }

  /**
   * Gets the value of the '_2300CRC03FunctionalLimitationCode' field.
   */
  public java.lang.CharSequence get2300CRC03FunctionalLimitationCode$1() {
    return _2300CRC03FunctionalLimitationCode;
  }

  /**
   * Sets the value of the '_2300CRC03FunctionalLimitationCode' field.
   * @param value the value to set.
   */
  public void set2300CRC03FunctionalLimitationCode$1(java.lang.CharSequence value) {
    this._2300CRC03FunctionalLimitationCode = value;
  }

  /**
   * Gets the value of the '_2300CRC04FunctionalLimitationCode' field.
   */
  public java.lang.CharSequence get2300CRC04FunctionalLimitationCode$1() {
    return _2300CRC04FunctionalLimitationCode;
  }

  /**
   * Sets the value of the '_2300CRC04FunctionalLimitationCode' field.
   * @param value the value to set.
   */
  public void set2300CRC04FunctionalLimitationCode$1(java.lang.CharSequence value) {
    this._2300CRC04FunctionalLimitationCode = value;
  }

  /**
   * Gets the value of the '_2300CRC05FunctionalLimitationCode' field.
   */
  public java.lang.CharSequence get2300CRC05FunctionalLimitationCode$1() {
    return _2300CRC05FunctionalLimitationCode;
  }

  /**
   * Sets the value of the '_2300CRC05FunctionalLimitationCode' field.
   * @param value the value to set.
   */
  public void set2300CRC05FunctionalLimitationCode$1(java.lang.CharSequence value) {
    this._2300CRC05FunctionalLimitationCode = value;
  }

  /**
   * Gets the value of the '_2300CRC06FunctionalLimitationCode' field.
   */
  public java.lang.CharSequence get2300CRC06FunctionalLimitationCode$1() {
    return _2300CRC06FunctionalLimitationCode;
  }

  /**
   * Sets the value of the '_2300CRC06FunctionalLimitationCode' field.
   * @param value the value to set.
   */
  public void set2300CRC06FunctionalLimitationCode$1(java.lang.CharSequence value) {
    this._2300CRC06FunctionalLimitationCode = value;
  }

  /**
   * Gets the value of the '_2300CRC07FunctionalLimitationCode' field.
   */
  public java.lang.CharSequence get2300CRC07FunctionalLimitationCode$1() {
    return _2300CRC07FunctionalLimitationCode;
  }

  /**
   * Sets the value of the '_2300CRC07FunctionalLimitationCode' field.
   * @param value the value to set.
   */
  public void set2300CRC07FunctionalLimitationCode$1(java.lang.CharSequence value) {
    this._2300CRC07FunctionalLimitationCode = value;
  }

  /** Creates a new X837Ins_2300_CRC_HomeHealthFunctionalLimitations RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder();
  }
  
  /** Creates a new X837Ins_2300_CRC_HomeHealthFunctionalLimitations RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder(other);
  }
  
  /** Creates a new X837Ins_2300_CRC_HomeHealthFunctionalLimitations RecordBuilder by copying an existing X837Ins_2300_CRC_HomeHealthFunctionalLimitations instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2300_CRC_HomeHealthFunctionalLimitations instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2300_CRC_HomeHealthFunctionalLimitations>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2300_CRC_HomeHealthFunctionalLimitations> {

    private java.lang.CharSequence _2300CRC01CodeCategory;
    private java.lang.CharSequence _2300CRC02CertificationConditionIndicator;
    private java.lang.CharSequence _2300CRC03FunctionalLimitationCode;
    private java.lang.CharSequence _2300CRC04FunctionalLimitationCode;
    private java.lang.CharSequence _2300CRC05FunctionalLimitationCode;
    private java.lang.CharSequence _2300CRC06FunctionalLimitationCode;
    private java.lang.CharSequence _2300CRC07FunctionalLimitationCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300CRC01CodeCategory)) {
        this._2300CRC01CodeCategory = data().deepCopy(fields()[0].schema(), other._2300CRC01CodeCategory);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300CRC02CertificationConditionIndicator)) {
        this._2300CRC02CertificationConditionIndicator = data().deepCopy(fields()[1].schema(), other._2300CRC02CertificationConditionIndicator);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2300CRC03FunctionalLimitationCode)) {
        this._2300CRC03FunctionalLimitationCode = data().deepCopy(fields()[2].schema(), other._2300CRC03FunctionalLimitationCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2300CRC04FunctionalLimitationCode)) {
        this._2300CRC04FunctionalLimitationCode = data().deepCopy(fields()[3].schema(), other._2300CRC04FunctionalLimitationCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2300CRC05FunctionalLimitationCode)) {
        this._2300CRC05FunctionalLimitationCode = data().deepCopy(fields()[4].schema(), other._2300CRC05FunctionalLimitationCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2300CRC06FunctionalLimitationCode)) {
        this._2300CRC06FunctionalLimitationCode = data().deepCopy(fields()[5].schema(), other._2300CRC06FunctionalLimitationCode);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2300CRC07FunctionalLimitationCode)) {
        this._2300CRC07FunctionalLimitationCode = data().deepCopy(fields()[6].schema(), other._2300CRC07FunctionalLimitationCode);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2300_CRC_HomeHealthFunctionalLimitations instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.SCHEMA$);
      if (isValidValue(fields()[0], other._2300CRC01CodeCategory)) {
        this._2300CRC01CodeCategory = data().deepCopy(fields()[0].schema(), other._2300CRC01CodeCategory);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300CRC02CertificationConditionIndicator)) {
        this._2300CRC02CertificationConditionIndicator = data().deepCopy(fields()[1].schema(), other._2300CRC02CertificationConditionIndicator);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2300CRC03FunctionalLimitationCode)) {
        this._2300CRC03FunctionalLimitationCode = data().deepCopy(fields()[2].schema(), other._2300CRC03FunctionalLimitationCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2300CRC04FunctionalLimitationCode)) {
        this._2300CRC04FunctionalLimitationCode = data().deepCopy(fields()[3].schema(), other._2300CRC04FunctionalLimitationCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2300CRC05FunctionalLimitationCode)) {
        this._2300CRC05FunctionalLimitationCode = data().deepCopy(fields()[4].schema(), other._2300CRC05FunctionalLimitationCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2300CRC06FunctionalLimitationCode)) {
        this._2300CRC06FunctionalLimitationCode = data().deepCopy(fields()[5].schema(), other._2300CRC06FunctionalLimitationCode);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2300CRC07FunctionalLimitationCode)) {
        this._2300CRC07FunctionalLimitationCode = data().deepCopy(fields()[6].schema(), other._2300CRC07FunctionalLimitationCode);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the '_2300CRC01CodeCategory' field */
    public java.lang.CharSequence get2300CRC01CodeCategory$1() {
      return _2300CRC01CodeCategory;
    }
    
    /** Sets the value of the '_2300CRC01CodeCategory' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC01CodeCategory$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300CRC01CodeCategory = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC01CodeCategory' field has been set */
    public boolean has2300CRC01CodeCategory$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300CRC01CodeCategory' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC01CodeCategory$1() {
      _2300CRC01CodeCategory = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300CRC02CertificationConditionIndicator' field */
    public java.lang.CharSequence get2300CRC02CertificationConditionIndicator$1() {
      return _2300CRC02CertificationConditionIndicator;
    }
    
    /** Sets the value of the '_2300CRC02CertificationConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC02CertificationConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300CRC02CertificationConditionIndicator = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC02CertificationConditionIndicator' field has been set */
    public boolean has2300CRC02CertificationConditionIndicator$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300CRC02CertificationConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC02CertificationConditionIndicator$1() {
      _2300CRC02CertificationConditionIndicator = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2300CRC03FunctionalLimitationCode' field */
    public java.lang.CharSequence get2300CRC03FunctionalLimitationCode$1() {
      return _2300CRC03FunctionalLimitationCode;
    }
    
    /** Sets the value of the '_2300CRC03FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC03FunctionalLimitationCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2300CRC03FunctionalLimitationCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC03FunctionalLimitationCode' field has been set */
    public boolean has2300CRC03FunctionalLimitationCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2300CRC03FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC03FunctionalLimitationCode$1() {
      _2300CRC03FunctionalLimitationCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2300CRC04FunctionalLimitationCode' field */
    public java.lang.CharSequence get2300CRC04FunctionalLimitationCode$1() {
      return _2300CRC04FunctionalLimitationCode;
    }
    
    /** Sets the value of the '_2300CRC04FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC04FunctionalLimitationCode$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2300CRC04FunctionalLimitationCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC04FunctionalLimitationCode' field has been set */
    public boolean has2300CRC04FunctionalLimitationCode$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2300CRC04FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC04FunctionalLimitationCode$1() {
      _2300CRC04FunctionalLimitationCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2300CRC05FunctionalLimitationCode' field */
    public java.lang.CharSequence get2300CRC05FunctionalLimitationCode$1() {
      return _2300CRC05FunctionalLimitationCode;
    }
    
    /** Sets the value of the '_2300CRC05FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC05FunctionalLimitationCode$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2300CRC05FunctionalLimitationCode = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC05FunctionalLimitationCode' field has been set */
    public boolean has2300CRC05FunctionalLimitationCode$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2300CRC05FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC05FunctionalLimitationCode$1() {
      _2300CRC05FunctionalLimitationCode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2300CRC06FunctionalLimitationCode' field */
    public java.lang.CharSequence get2300CRC06FunctionalLimitationCode$1() {
      return _2300CRC06FunctionalLimitationCode;
    }
    
    /** Sets the value of the '_2300CRC06FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC06FunctionalLimitationCode$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2300CRC06FunctionalLimitationCode = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC06FunctionalLimitationCode' field has been set */
    public boolean has2300CRC06FunctionalLimitationCode$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2300CRC06FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC06FunctionalLimitationCode$1() {
      _2300CRC06FunctionalLimitationCode = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2300CRC07FunctionalLimitationCode' field */
    public java.lang.CharSequence get2300CRC07FunctionalLimitationCode$1() {
      return _2300CRC07FunctionalLimitationCode;
    }
    
    /** Sets the value of the '_2300CRC07FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder set2300CRC07FunctionalLimitationCode$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2300CRC07FunctionalLimitationCode = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2300CRC07FunctionalLimitationCode' field has been set */
    public boolean has2300CRC07FunctionalLimitationCode$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2300CRC07FunctionalLimitationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_CRC_HomeHealthFunctionalLimitations.Builder clear2300CRC07FunctionalLimitationCode$1() {
      _2300CRC07FunctionalLimitationCode = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public X837Ins_2300_CRC_HomeHealthFunctionalLimitations build() {
      try {
        X837Ins_2300_CRC_HomeHealthFunctionalLimitations record = new X837Ins_2300_CRC_HomeHealthFunctionalLimitations();
        record._2300CRC01CodeCategory = fieldSetFlags()[0] ? this._2300CRC01CodeCategory : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300CRC02CertificationConditionIndicator = fieldSetFlags()[1] ? this._2300CRC02CertificationConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2300CRC03FunctionalLimitationCode = fieldSetFlags()[2] ? this._2300CRC03FunctionalLimitationCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2300CRC04FunctionalLimitationCode = fieldSetFlags()[3] ? this._2300CRC04FunctionalLimitationCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2300CRC05FunctionalLimitationCode = fieldSetFlags()[4] ? this._2300CRC05FunctionalLimitationCode : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2300CRC06FunctionalLimitationCode = fieldSetFlags()[5] ? this._2300CRC06FunctionalLimitationCode : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2300CRC07FunctionalLimitationCode = fieldSetFlags()[6] ? this._2300CRC07FunctionalLimitationCode : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
