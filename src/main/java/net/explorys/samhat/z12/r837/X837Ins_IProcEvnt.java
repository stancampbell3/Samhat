/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_IProcEvnt extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_IProcEvnt\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_src\",\"type\":\"string\"},{\"name\":\"_type\",\"type\":\"string\"},{\"name\":\"_dt\",\"type\":\"string\"},{\"name\":\"_hsh\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _src;
  @Deprecated public java.lang.CharSequence _type;
  @Deprecated public java.lang.CharSequence _dt;
  @Deprecated public java.lang.CharSequence _hsh;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_IProcEvnt() {}

  /**
   * All-args constructor.
   */
  public X837Ins_IProcEvnt(java.lang.CharSequence _src, java.lang.CharSequence _type, java.lang.CharSequence _dt, java.lang.CharSequence _hsh) {
    this._src = _src;
    this._type = _type;
    this._dt = _dt;
    this._hsh = _hsh;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _src;
    case 1: return _type;
    case 2: return _dt;
    case 3: return _hsh;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _src = (java.lang.CharSequence)value$; break;
    case 1: _type = (java.lang.CharSequence)value$; break;
    case 2: _dt = (java.lang.CharSequence)value$; break;
    case 3: _hsh = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_src' field.
   */
  public java.lang.CharSequence getSrc$1() {
    return _src;
  }

  /**
   * Sets the value of the '_src' field.
   * @param value the value to set.
   */
  public void setSrc$1(java.lang.CharSequence value) {
    this._src = value;
  }

  /**
   * Gets the value of the '_type' field.
   */
  public java.lang.CharSequence getType$1() {
    return _type;
  }

  /**
   * Sets the value of the '_type' field.
   * @param value the value to set.
   */
  public void setType$1(java.lang.CharSequence value) {
    this._type = value;
  }

  /**
   * Gets the value of the '_dt' field.
   */
  public java.lang.CharSequence getDt$1() {
    return _dt;
  }

  /**
   * Sets the value of the '_dt' field.
   * @param value the value to set.
   */
  public void setDt$1(java.lang.CharSequence value) {
    this._dt = value;
  }

  /**
   * Gets the value of the '_hsh' field.
   */
  public java.lang.CharSequence getHsh$1() {
    return _hsh;
  }

  /**
   * Sets the value of the '_hsh' field.
   * @param value the value to set.
   */
  public void setHsh$1(java.lang.CharSequence value) {
    this._hsh = value;
  }

  /** Creates a new X837Ins_IProcEvnt RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder();
  }
  
  /** Creates a new X837Ins_IProcEvnt RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder(other);
  }
  
  /** Creates a new X837Ins_IProcEvnt RecordBuilder by copying an existing X837Ins_IProcEvnt instance */
  public static net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_IProcEvnt other) {
    return new net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_IProcEvnt instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_IProcEvnt>
    implements org.apache.avro.data.RecordBuilder<X837Ins_IProcEvnt> {

    private java.lang.CharSequence _src;
    private java.lang.CharSequence _type;
    private java.lang.CharSequence _dt;
    private java.lang.CharSequence _hsh;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._src)) {
        this._src = data().deepCopy(fields()[0].schema(), other._src);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._type)) {
        this._type = data().deepCopy(fields()[1].schema(), other._type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._dt)) {
        this._dt = data().deepCopy(fields()[2].schema(), other._dt);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._hsh)) {
        this._hsh = data().deepCopy(fields()[3].schema(), other._hsh);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_IProcEvnt instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_IProcEvnt other) {
            super(net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.SCHEMA$);
      if (isValidValue(fields()[0], other._src)) {
        this._src = data().deepCopy(fields()[0].schema(), other._src);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._type)) {
        this._type = data().deepCopy(fields()[1].schema(), other._type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._dt)) {
        this._dt = data().deepCopy(fields()[2].schema(), other._dt);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._hsh)) {
        this._hsh = data().deepCopy(fields()[3].schema(), other._hsh);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_src' field */
    public java.lang.CharSequence getSrc$1() {
      return _src;
    }
    
    /** Sets the value of the '_src' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder setSrc$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._src = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_src' field has been set */
    public boolean hasSrc$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_src' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder clearSrc$1() {
      _src = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_type' field */
    public java.lang.CharSequence getType$1() {
      return _type;
    }
    
    /** Sets the value of the '_type' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder setType$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._type = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_type' field has been set */
    public boolean hasType$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_type' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder clearType$1() {
      _type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_dt' field */
    public java.lang.CharSequence getDt$1() {
      return _dt;
    }
    
    /** Sets the value of the '_dt' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder setDt$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._dt = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_dt' field has been set */
    public boolean hasDt$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_dt' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder clearDt$1() {
      _dt = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_hsh' field */
    public java.lang.CharSequence getHsh$1() {
      return _hsh;
    }
    
    /** Sets the value of the '_hsh' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder setHsh$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._hsh = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_hsh' field has been set */
    public boolean hasHsh$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_hsh' field */
    public net.explorys.samhat.z12.r837.X837Ins_IProcEvnt.Builder clearHsh$1() {
      _hsh = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Ins_IProcEvnt build() {
      try {
        X837Ins_IProcEvnt record = new X837Ins_IProcEvnt();
        record._src = fieldSetFlags()[0] ? this._src : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._type = fieldSetFlags()[1] ? this._type : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._dt = fieldSetFlags()[2] ? this._dt : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._hsh = fieldSetFlags()[3] ? this._hsh : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
