/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2400_CRC_DMERCConditionIndicator extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2400_CRC_DMERCConditionIndicator\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2400CRC01CodeCategory\",\"type\":\"string\"},{\"name\":\"_2400CRC02CertificationConditionIndicator\",\"type\":\"string\"},{\"name\":\"_2400CRC03ConditionIndicator\",\"type\":\"string\"},{\"name\":\"_2400CRC04ConditionIndicator\",\"type\":\"string\"},{\"name\":\"_2400CRC05ConditionIndicator\",\"type\":\"string\"},{\"name\":\"_2400CRC06ConditionIndicator\",\"type\":\"string\"},{\"name\":\"_2400CRC07ConditionIndicator\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2400CRC01CodeCategory;
  @Deprecated public java.lang.CharSequence _2400CRC02CertificationConditionIndicator;
  @Deprecated public java.lang.CharSequence _2400CRC03ConditionIndicator;
  @Deprecated public java.lang.CharSequence _2400CRC04ConditionIndicator;
  @Deprecated public java.lang.CharSequence _2400CRC05ConditionIndicator;
  @Deprecated public java.lang.CharSequence _2400CRC06ConditionIndicator;
  @Deprecated public java.lang.CharSequence _2400CRC07ConditionIndicator;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2400_CRC_DMERCConditionIndicator() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2400_CRC_DMERCConditionIndicator(java.lang.CharSequence _2400CRC01CodeCategory, java.lang.CharSequence _2400CRC02CertificationConditionIndicator, java.lang.CharSequence _2400CRC03ConditionIndicator, java.lang.CharSequence _2400CRC04ConditionIndicator, java.lang.CharSequence _2400CRC05ConditionIndicator, java.lang.CharSequence _2400CRC06ConditionIndicator, java.lang.CharSequence _2400CRC07ConditionIndicator) {
    this._2400CRC01CodeCategory = _2400CRC01CodeCategory;
    this._2400CRC02CertificationConditionIndicator = _2400CRC02CertificationConditionIndicator;
    this._2400CRC03ConditionIndicator = _2400CRC03ConditionIndicator;
    this._2400CRC04ConditionIndicator = _2400CRC04ConditionIndicator;
    this._2400CRC05ConditionIndicator = _2400CRC05ConditionIndicator;
    this._2400CRC06ConditionIndicator = _2400CRC06ConditionIndicator;
    this._2400CRC07ConditionIndicator = _2400CRC07ConditionIndicator;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2400CRC01CodeCategory;
    case 1: return _2400CRC02CertificationConditionIndicator;
    case 2: return _2400CRC03ConditionIndicator;
    case 3: return _2400CRC04ConditionIndicator;
    case 4: return _2400CRC05ConditionIndicator;
    case 5: return _2400CRC06ConditionIndicator;
    case 6: return _2400CRC07ConditionIndicator;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2400CRC01CodeCategory = (java.lang.CharSequence)value$; break;
    case 1: _2400CRC02CertificationConditionIndicator = (java.lang.CharSequence)value$; break;
    case 2: _2400CRC03ConditionIndicator = (java.lang.CharSequence)value$; break;
    case 3: _2400CRC04ConditionIndicator = (java.lang.CharSequence)value$; break;
    case 4: _2400CRC05ConditionIndicator = (java.lang.CharSequence)value$; break;
    case 5: _2400CRC06ConditionIndicator = (java.lang.CharSequence)value$; break;
    case 6: _2400CRC07ConditionIndicator = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2400CRC01CodeCategory' field.
   */
  public java.lang.CharSequence get2400CRC01CodeCategory$1() {
    return _2400CRC01CodeCategory;
  }

  /**
   * Sets the value of the '_2400CRC01CodeCategory' field.
   * @param value the value to set.
   */
  public void set2400CRC01CodeCategory$1(java.lang.CharSequence value) {
    this._2400CRC01CodeCategory = value;
  }

  /**
   * Gets the value of the '_2400CRC02CertificationConditionIndicator' field.
   */
  public java.lang.CharSequence get2400CRC02CertificationConditionIndicator$1() {
    return _2400CRC02CertificationConditionIndicator;
  }

  /**
   * Sets the value of the '_2400CRC02CertificationConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2400CRC02CertificationConditionIndicator$1(java.lang.CharSequence value) {
    this._2400CRC02CertificationConditionIndicator = value;
  }

  /**
   * Gets the value of the '_2400CRC03ConditionIndicator' field.
   */
  public java.lang.CharSequence get2400CRC03ConditionIndicator$1() {
    return _2400CRC03ConditionIndicator;
  }

  /**
   * Sets the value of the '_2400CRC03ConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2400CRC03ConditionIndicator$1(java.lang.CharSequence value) {
    this._2400CRC03ConditionIndicator = value;
  }

  /**
   * Gets the value of the '_2400CRC04ConditionIndicator' field.
   */
  public java.lang.CharSequence get2400CRC04ConditionIndicator$1() {
    return _2400CRC04ConditionIndicator;
  }

  /**
   * Sets the value of the '_2400CRC04ConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2400CRC04ConditionIndicator$1(java.lang.CharSequence value) {
    this._2400CRC04ConditionIndicator = value;
  }

  /**
   * Gets the value of the '_2400CRC05ConditionIndicator' field.
   */
  public java.lang.CharSequence get2400CRC05ConditionIndicator$1() {
    return _2400CRC05ConditionIndicator;
  }

  /**
   * Sets the value of the '_2400CRC05ConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2400CRC05ConditionIndicator$1(java.lang.CharSequence value) {
    this._2400CRC05ConditionIndicator = value;
  }

  /**
   * Gets the value of the '_2400CRC06ConditionIndicator' field.
   */
  public java.lang.CharSequence get2400CRC06ConditionIndicator$1() {
    return _2400CRC06ConditionIndicator;
  }

  /**
   * Sets the value of the '_2400CRC06ConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2400CRC06ConditionIndicator$1(java.lang.CharSequence value) {
    this._2400CRC06ConditionIndicator = value;
  }

  /**
   * Gets the value of the '_2400CRC07ConditionIndicator' field.
   */
  public java.lang.CharSequence get2400CRC07ConditionIndicator$1() {
    return _2400CRC07ConditionIndicator;
  }

  /**
   * Sets the value of the '_2400CRC07ConditionIndicator' field.
   * @param value the value to set.
   */
  public void set2400CRC07ConditionIndicator$1(java.lang.CharSequence value) {
    this._2400CRC07ConditionIndicator = value;
  }

  /** Creates a new X837Pro_2400_CRC_DMERCConditionIndicator RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder();
  }
  
  /** Creates a new X837Pro_2400_CRC_DMERCConditionIndicator RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder(other);
  }
  
  /** Creates a new X837Pro_2400_CRC_DMERCConditionIndicator RecordBuilder by copying an existing X837Pro_2400_CRC_DMERCConditionIndicator instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2400_CRC_DMERCConditionIndicator instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2400_CRC_DMERCConditionIndicator>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2400_CRC_DMERCConditionIndicator> {

    private java.lang.CharSequence _2400CRC01CodeCategory;
    private java.lang.CharSequence _2400CRC02CertificationConditionIndicator;
    private java.lang.CharSequence _2400CRC03ConditionIndicator;
    private java.lang.CharSequence _2400CRC04ConditionIndicator;
    private java.lang.CharSequence _2400CRC05ConditionIndicator;
    private java.lang.CharSequence _2400CRC06ConditionIndicator;
    private java.lang.CharSequence _2400CRC07ConditionIndicator;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2400CRC01CodeCategory)) {
        this._2400CRC01CodeCategory = data().deepCopy(fields()[0].schema(), other._2400CRC01CodeCategory);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400CRC02CertificationConditionIndicator)) {
        this._2400CRC02CertificationConditionIndicator = data().deepCopy(fields()[1].schema(), other._2400CRC02CertificationConditionIndicator);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400CRC03ConditionIndicator)) {
        this._2400CRC03ConditionIndicator = data().deepCopy(fields()[2].schema(), other._2400CRC03ConditionIndicator);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2400CRC04ConditionIndicator)) {
        this._2400CRC04ConditionIndicator = data().deepCopy(fields()[3].schema(), other._2400CRC04ConditionIndicator);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2400CRC05ConditionIndicator)) {
        this._2400CRC05ConditionIndicator = data().deepCopy(fields()[4].schema(), other._2400CRC05ConditionIndicator);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2400CRC06ConditionIndicator)) {
        this._2400CRC06ConditionIndicator = data().deepCopy(fields()[5].schema(), other._2400CRC06ConditionIndicator);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2400CRC07ConditionIndicator)) {
        this._2400CRC07ConditionIndicator = data().deepCopy(fields()[6].schema(), other._2400CRC07ConditionIndicator);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2400_CRC_DMERCConditionIndicator instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.SCHEMA$);
      if (isValidValue(fields()[0], other._2400CRC01CodeCategory)) {
        this._2400CRC01CodeCategory = data().deepCopy(fields()[0].schema(), other._2400CRC01CodeCategory);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400CRC02CertificationConditionIndicator)) {
        this._2400CRC02CertificationConditionIndicator = data().deepCopy(fields()[1].schema(), other._2400CRC02CertificationConditionIndicator);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400CRC03ConditionIndicator)) {
        this._2400CRC03ConditionIndicator = data().deepCopy(fields()[2].schema(), other._2400CRC03ConditionIndicator);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2400CRC04ConditionIndicator)) {
        this._2400CRC04ConditionIndicator = data().deepCopy(fields()[3].schema(), other._2400CRC04ConditionIndicator);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2400CRC05ConditionIndicator)) {
        this._2400CRC05ConditionIndicator = data().deepCopy(fields()[4].schema(), other._2400CRC05ConditionIndicator);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2400CRC06ConditionIndicator)) {
        this._2400CRC06ConditionIndicator = data().deepCopy(fields()[5].schema(), other._2400CRC06ConditionIndicator);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2400CRC07ConditionIndicator)) {
        this._2400CRC07ConditionIndicator = data().deepCopy(fields()[6].schema(), other._2400CRC07ConditionIndicator);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the '_2400CRC01CodeCategory' field */
    public java.lang.CharSequence get2400CRC01CodeCategory$1() {
      return _2400CRC01CodeCategory;
    }
    
    /** Sets the value of the '_2400CRC01CodeCategory' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC01CodeCategory$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2400CRC01CodeCategory = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC01CodeCategory' field has been set */
    public boolean has2400CRC01CodeCategory$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2400CRC01CodeCategory' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC01CodeCategory$1() {
      _2400CRC01CodeCategory = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2400CRC02CertificationConditionIndicator' field */
    public java.lang.CharSequence get2400CRC02CertificationConditionIndicator$1() {
      return _2400CRC02CertificationConditionIndicator;
    }
    
    /** Sets the value of the '_2400CRC02CertificationConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC02CertificationConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2400CRC02CertificationConditionIndicator = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC02CertificationConditionIndicator' field has been set */
    public boolean has2400CRC02CertificationConditionIndicator$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2400CRC02CertificationConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC02CertificationConditionIndicator$1() {
      _2400CRC02CertificationConditionIndicator = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2400CRC03ConditionIndicator' field */
    public java.lang.CharSequence get2400CRC03ConditionIndicator$1() {
      return _2400CRC03ConditionIndicator;
    }
    
    /** Sets the value of the '_2400CRC03ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC03ConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2400CRC03ConditionIndicator = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC03ConditionIndicator' field has been set */
    public boolean has2400CRC03ConditionIndicator$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2400CRC03ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC03ConditionIndicator$1() {
      _2400CRC03ConditionIndicator = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2400CRC04ConditionIndicator' field */
    public java.lang.CharSequence get2400CRC04ConditionIndicator$1() {
      return _2400CRC04ConditionIndicator;
    }
    
    /** Sets the value of the '_2400CRC04ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC04ConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2400CRC04ConditionIndicator = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC04ConditionIndicator' field has been set */
    public boolean has2400CRC04ConditionIndicator$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2400CRC04ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC04ConditionIndicator$1() {
      _2400CRC04ConditionIndicator = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2400CRC05ConditionIndicator' field */
    public java.lang.CharSequence get2400CRC05ConditionIndicator$1() {
      return _2400CRC05ConditionIndicator;
    }
    
    /** Sets the value of the '_2400CRC05ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC05ConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2400CRC05ConditionIndicator = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC05ConditionIndicator' field has been set */
    public boolean has2400CRC05ConditionIndicator$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2400CRC05ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC05ConditionIndicator$1() {
      _2400CRC05ConditionIndicator = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2400CRC06ConditionIndicator' field */
    public java.lang.CharSequence get2400CRC06ConditionIndicator$1() {
      return _2400CRC06ConditionIndicator;
    }
    
    /** Sets the value of the '_2400CRC06ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC06ConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2400CRC06ConditionIndicator = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC06ConditionIndicator' field has been set */
    public boolean has2400CRC06ConditionIndicator$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2400CRC06ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC06ConditionIndicator$1() {
      _2400CRC06ConditionIndicator = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2400CRC07ConditionIndicator' field */
    public java.lang.CharSequence get2400CRC07ConditionIndicator$1() {
      return _2400CRC07ConditionIndicator;
    }
    
    /** Sets the value of the '_2400CRC07ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder set2400CRC07ConditionIndicator$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2400CRC07ConditionIndicator = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2400CRC07ConditionIndicator' field has been set */
    public boolean has2400CRC07ConditionIndicator$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2400CRC07ConditionIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_CRC_DMERCConditionIndicator.Builder clear2400CRC07ConditionIndicator$1() {
      _2400CRC07ConditionIndicator = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public X837Pro_2400_CRC_DMERCConditionIndicator build() {
      try {
        X837Pro_2400_CRC_DMERCConditionIndicator record = new X837Pro_2400_CRC_DMERCConditionIndicator();
        record._2400CRC01CodeCategory = fieldSetFlags()[0] ? this._2400CRC01CodeCategory : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2400CRC02CertificationConditionIndicator = fieldSetFlags()[1] ? this._2400CRC02CertificationConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2400CRC03ConditionIndicator = fieldSetFlags()[2] ? this._2400CRC03ConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2400CRC04ConditionIndicator = fieldSetFlags()[3] ? this._2400CRC04ConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2400CRC05ConditionIndicator = fieldSetFlags()[4] ? this._2400CRC05ConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2400CRC06ConditionIndicator = fieldSetFlags()[5] ? this._2400CRC06ConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2400CRC07ConditionIndicator = fieldSetFlags()[6] ? this._2400CRC07ConditionIndicator : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
