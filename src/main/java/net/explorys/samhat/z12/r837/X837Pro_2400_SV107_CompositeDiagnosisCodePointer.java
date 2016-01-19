/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2400_SV107_CompositeDiagnosisCodePointer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2400_SV107_CompositeDiagnosisCodePointer\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2400SV10701DiagnosisCodePointer\",\"type\":\"string\"},{\"name\":\"_2400SV10702DiagnosisCodePointer\",\"type\":\"string\"},{\"name\":\"_2400SV10703DiagnosisCodePointer\",\"type\":\"string\"},{\"name\":\"_2400SV10704DiagnosisCodePointer\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2400SV10701DiagnosisCodePointer;
  @Deprecated public java.lang.CharSequence _2400SV10702DiagnosisCodePointer;
  @Deprecated public java.lang.CharSequence _2400SV10703DiagnosisCodePointer;
  @Deprecated public java.lang.CharSequence _2400SV10704DiagnosisCodePointer;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2400_SV107_CompositeDiagnosisCodePointer() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2400_SV107_CompositeDiagnosisCodePointer(java.lang.CharSequence _2400SV10701DiagnosisCodePointer, java.lang.CharSequence _2400SV10702DiagnosisCodePointer, java.lang.CharSequence _2400SV10703DiagnosisCodePointer, java.lang.CharSequence _2400SV10704DiagnosisCodePointer) {
    this._2400SV10701DiagnosisCodePointer = _2400SV10701DiagnosisCodePointer;
    this._2400SV10702DiagnosisCodePointer = _2400SV10702DiagnosisCodePointer;
    this._2400SV10703DiagnosisCodePointer = _2400SV10703DiagnosisCodePointer;
    this._2400SV10704DiagnosisCodePointer = _2400SV10704DiagnosisCodePointer;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2400SV10701DiagnosisCodePointer;
    case 1: return _2400SV10702DiagnosisCodePointer;
    case 2: return _2400SV10703DiagnosisCodePointer;
    case 3: return _2400SV10704DiagnosisCodePointer;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2400SV10701DiagnosisCodePointer = (java.lang.CharSequence)value$; break;
    case 1: _2400SV10702DiagnosisCodePointer = (java.lang.CharSequence)value$; break;
    case 2: _2400SV10703DiagnosisCodePointer = (java.lang.CharSequence)value$; break;
    case 3: _2400SV10704DiagnosisCodePointer = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2400SV10701DiagnosisCodePointer' field.
   */
  public java.lang.CharSequence get2400SV10701DiagnosisCodePointer$1() {
    return _2400SV10701DiagnosisCodePointer;
  }

  /**
   * Sets the value of the '_2400SV10701DiagnosisCodePointer' field.
   * @param value the value to set.
   */
  public void set2400SV10701DiagnosisCodePointer$1(java.lang.CharSequence value) {
    this._2400SV10701DiagnosisCodePointer = value;
  }

  /**
   * Gets the value of the '_2400SV10702DiagnosisCodePointer' field.
   */
  public java.lang.CharSequence get2400SV10702DiagnosisCodePointer$1() {
    return _2400SV10702DiagnosisCodePointer;
  }

  /**
   * Sets the value of the '_2400SV10702DiagnosisCodePointer' field.
   * @param value the value to set.
   */
  public void set2400SV10702DiagnosisCodePointer$1(java.lang.CharSequence value) {
    this._2400SV10702DiagnosisCodePointer = value;
  }

  /**
   * Gets the value of the '_2400SV10703DiagnosisCodePointer' field.
   */
  public java.lang.CharSequence get2400SV10703DiagnosisCodePointer$1() {
    return _2400SV10703DiagnosisCodePointer;
  }

  /**
   * Sets the value of the '_2400SV10703DiagnosisCodePointer' field.
   * @param value the value to set.
   */
  public void set2400SV10703DiagnosisCodePointer$1(java.lang.CharSequence value) {
    this._2400SV10703DiagnosisCodePointer = value;
  }

  /**
   * Gets the value of the '_2400SV10704DiagnosisCodePointer' field.
   */
  public java.lang.CharSequence get2400SV10704DiagnosisCodePointer$1() {
    return _2400SV10704DiagnosisCodePointer;
  }

  /**
   * Sets the value of the '_2400SV10704DiagnosisCodePointer' field.
   * @param value the value to set.
   */
  public void set2400SV10704DiagnosisCodePointer$1(java.lang.CharSequence value) {
    this._2400SV10704DiagnosisCodePointer = value;
  }

  /** Creates a new X837Pro_2400_SV107_CompositeDiagnosisCodePointer RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder();
  }
  
  /** Creates a new X837Pro_2400_SV107_CompositeDiagnosisCodePointer RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder(other);
  }
  
  /** Creates a new X837Pro_2400_SV107_CompositeDiagnosisCodePointer RecordBuilder by copying an existing X837Pro_2400_SV107_CompositeDiagnosisCodePointer instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2400_SV107_CompositeDiagnosisCodePointer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2400_SV107_CompositeDiagnosisCodePointer>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2400_SV107_CompositeDiagnosisCodePointer> {

    private java.lang.CharSequence _2400SV10701DiagnosisCodePointer;
    private java.lang.CharSequence _2400SV10702DiagnosisCodePointer;
    private java.lang.CharSequence _2400SV10703DiagnosisCodePointer;
    private java.lang.CharSequence _2400SV10704DiagnosisCodePointer;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2400SV10701DiagnosisCodePointer)) {
        this._2400SV10701DiagnosisCodePointer = data().deepCopy(fields()[0].schema(), other._2400SV10701DiagnosisCodePointer);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400SV10702DiagnosisCodePointer)) {
        this._2400SV10702DiagnosisCodePointer = data().deepCopy(fields()[1].schema(), other._2400SV10702DiagnosisCodePointer);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400SV10703DiagnosisCodePointer)) {
        this._2400SV10703DiagnosisCodePointer = data().deepCopy(fields()[2].schema(), other._2400SV10703DiagnosisCodePointer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2400SV10704DiagnosisCodePointer)) {
        this._2400SV10704DiagnosisCodePointer = data().deepCopy(fields()[3].schema(), other._2400SV10704DiagnosisCodePointer);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2400_SV107_CompositeDiagnosisCodePointer instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.SCHEMA$);
      if (isValidValue(fields()[0], other._2400SV10701DiagnosisCodePointer)) {
        this._2400SV10701DiagnosisCodePointer = data().deepCopy(fields()[0].schema(), other._2400SV10701DiagnosisCodePointer);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400SV10702DiagnosisCodePointer)) {
        this._2400SV10702DiagnosisCodePointer = data().deepCopy(fields()[1].schema(), other._2400SV10702DiagnosisCodePointer);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400SV10703DiagnosisCodePointer)) {
        this._2400SV10703DiagnosisCodePointer = data().deepCopy(fields()[2].schema(), other._2400SV10703DiagnosisCodePointer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2400SV10704DiagnosisCodePointer)) {
        this._2400SV10704DiagnosisCodePointer = data().deepCopy(fields()[3].schema(), other._2400SV10704DiagnosisCodePointer);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2400SV10701DiagnosisCodePointer' field */
    public java.lang.CharSequence get2400SV10701DiagnosisCodePointer$1() {
      return _2400SV10701DiagnosisCodePointer;
    }
    
    /** Sets the value of the '_2400SV10701DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder set2400SV10701DiagnosisCodePointer$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2400SV10701DiagnosisCodePointer = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV10701DiagnosisCodePointer' field has been set */
    public boolean has2400SV10701DiagnosisCodePointer$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2400SV10701DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder clear2400SV10701DiagnosisCodePointer$1() {
      _2400SV10701DiagnosisCodePointer = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2400SV10702DiagnosisCodePointer' field */
    public java.lang.CharSequence get2400SV10702DiagnosisCodePointer$1() {
      return _2400SV10702DiagnosisCodePointer;
    }
    
    /** Sets the value of the '_2400SV10702DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder set2400SV10702DiagnosisCodePointer$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2400SV10702DiagnosisCodePointer = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV10702DiagnosisCodePointer' field has been set */
    public boolean has2400SV10702DiagnosisCodePointer$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2400SV10702DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder clear2400SV10702DiagnosisCodePointer$1() {
      _2400SV10702DiagnosisCodePointer = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2400SV10703DiagnosisCodePointer' field */
    public java.lang.CharSequence get2400SV10703DiagnosisCodePointer$1() {
      return _2400SV10703DiagnosisCodePointer;
    }
    
    /** Sets the value of the '_2400SV10703DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder set2400SV10703DiagnosisCodePointer$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2400SV10703DiagnosisCodePointer = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV10703DiagnosisCodePointer' field has been set */
    public boolean has2400SV10703DiagnosisCodePointer$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2400SV10703DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder clear2400SV10703DiagnosisCodePointer$1() {
      _2400SV10703DiagnosisCodePointer = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2400SV10704DiagnosisCodePointer' field */
    public java.lang.CharSequence get2400SV10704DiagnosisCodePointer$1() {
      return _2400SV10704DiagnosisCodePointer;
    }
    
    /** Sets the value of the '_2400SV10704DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder set2400SV10704DiagnosisCodePointer$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2400SV10704DiagnosisCodePointer = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV10704DiagnosisCodePointer' field has been set */
    public boolean has2400SV10704DiagnosisCodePointer$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2400SV10704DiagnosisCodePointer' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV107_CompositeDiagnosisCodePointer.Builder clear2400SV10704DiagnosisCodePointer$1() {
      _2400SV10704DiagnosisCodePointer = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Pro_2400_SV107_CompositeDiagnosisCodePointer build() {
      try {
        X837Pro_2400_SV107_CompositeDiagnosisCodePointer record = new X837Pro_2400_SV107_CompositeDiagnosisCodePointer();
        record._2400SV10701DiagnosisCodePointer = fieldSetFlags()[0] ? this._2400SV10701DiagnosisCodePointer : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2400SV10702DiagnosisCodePointer = fieldSetFlags()[1] ? this._2400SV10702DiagnosisCodePointer : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2400SV10703DiagnosisCodePointer = fieldSetFlags()[2] ? this._2400SV10703DiagnosisCodePointer : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2400SV10704DiagnosisCodePointer = fieldSetFlags()[3] ? this._2400SV10704DiagnosisCodePointer : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}