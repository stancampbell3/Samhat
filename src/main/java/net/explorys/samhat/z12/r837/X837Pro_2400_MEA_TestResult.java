/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2400_MEA_TestResult extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2400_MEA_TestResult\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2400MEA01MeasurementReferenceIdentificationCode\",\"type\":\"string\"},{\"name\":\"_2400MEA02MeasurementQualifier\",\"type\":\"string\"},{\"name\":\"_2400MEA03TestResults\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2400MEA01MeasurementReferenceIdentificationCode;
  @Deprecated public java.lang.CharSequence _2400MEA02MeasurementQualifier;
  @Deprecated public java.lang.CharSequence _2400MEA03TestResults;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2400_MEA_TestResult() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2400_MEA_TestResult(java.lang.CharSequence _2400MEA01MeasurementReferenceIdentificationCode, java.lang.CharSequence _2400MEA02MeasurementQualifier, java.lang.CharSequence _2400MEA03TestResults) {
    this._2400MEA01MeasurementReferenceIdentificationCode = _2400MEA01MeasurementReferenceIdentificationCode;
    this._2400MEA02MeasurementQualifier = _2400MEA02MeasurementQualifier;
    this._2400MEA03TestResults = _2400MEA03TestResults;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2400MEA01MeasurementReferenceIdentificationCode;
    case 1: return _2400MEA02MeasurementQualifier;
    case 2: return _2400MEA03TestResults;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2400MEA01MeasurementReferenceIdentificationCode = (java.lang.CharSequence)value$; break;
    case 1: _2400MEA02MeasurementQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2400MEA03TestResults = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2400MEA01MeasurementReferenceIdentificationCode' field.
   */
  public java.lang.CharSequence get2400MEA01MeasurementReferenceIdentificationCode$1() {
    return _2400MEA01MeasurementReferenceIdentificationCode;
  }

  /**
   * Sets the value of the '_2400MEA01MeasurementReferenceIdentificationCode' field.
   * @param value the value to set.
   */
  public void set2400MEA01MeasurementReferenceIdentificationCode$1(java.lang.CharSequence value) {
    this._2400MEA01MeasurementReferenceIdentificationCode = value;
  }

  /**
   * Gets the value of the '_2400MEA02MeasurementQualifier' field.
   */
  public java.lang.CharSequence get2400MEA02MeasurementQualifier$1() {
    return _2400MEA02MeasurementQualifier;
  }

  /**
   * Sets the value of the '_2400MEA02MeasurementQualifier' field.
   * @param value the value to set.
   */
  public void set2400MEA02MeasurementQualifier$1(java.lang.CharSequence value) {
    this._2400MEA02MeasurementQualifier = value;
  }

  /**
   * Gets the value of the '_2400MEA03TestResults' field.
   */
  public java.lang.CharSequence get2400MEA03TestResults$1() {
    return _2400MEA03TestResults;
  }

  /**
   * Sets the value of the '_2400MEA03TestResults' field.
   * @param value the value to set.
   */
  public void set2400MEA03TestResults$1(java.lang.CharSequence value) {
    this._2400MEA03TestResults = value;
  }

  /** Creates a new X837Pro_2400_MEA_TestResult RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder();
  }
  
  /** Creates a new X837Pro_2400_MEA_TestResult RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder(other);
  }
  
  /** Creates a new X837Pro_2400_MEA_TestResult RecordBuilder by copying an existing X837Pro_2400_MEA_TestResult instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2400_MEA_TestResult instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2400_MEA_TestResult>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2400_MEA_TestResult> {

    private java.lang.CharSequence _2400MEA01MeasurementReferenceIdentificationCode;
    private java.lang.CharSequence _2400MEA02MeasurementQualifier;
    private java.lang.CharSequence _2400MEA03TestResults;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2400MEA01MeasurementReferenceIdentificationCode)) {
        this._2400MEA01MeasurementReferenceIdentificationCode = data().deepCopy(fields()[0].schema(), other._2400MEA01MeasurementReferenceIdentificationCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400MEA02MeasurementQualifier)) {
        this._2400MEA02MeasurementQualifier = data().deepCopy(fields()[1].schema(), other._2400MEA02MeasurementQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400MEA03TestResults)) {
        this._2400MEA03TestResults = data().deepCopy(fields()[2].schema(), other._2400MEA03TestResults);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2400_MEA_TestResult instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.SCHEMA$);
      if (isValidValue(fields()[0], other._2400MEA01MeasurementReferenceIdentificationCode)) {
        this._2400MEA01MeasurementReferenceIdentificationCode = data().deepCopy(fields()[0].schema(), other._2400MEA01MeasurementReferenceIdentificationCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400MEA02MeasurementQualifier)) {
        this._2400MEA02MeasurementQualifier = data().deepCopy(fields()[1].schema(), other._2400MEA02MeasurementQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400MEA03TestResults)) {
        this._2400MEA03TestResults = data().deepCopy(fields()[2].schema(), other._2400MEA03TestResults);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2400MEA01MeasurementReferenceIdentificationCode' field */
    public java.lang.CharSequence get2400MEA01MeasurementReferenceIdentificationCode$1() {
      return _2400MEA01MeasurementReferenceIdentificationCode;
    }
    
    /** Sets the value of the '_2400MEA01MeasurementReferenceIdentificationCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder set2400MEA01MeasurementReferenceIdentificationCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2400MEA01MeasurementReferenceIdentificationCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2400MEA01MeasurementReferenceIdentificationCode' field has been set */
    public boolean has2400MEA01MeasurementReferenceIdentificationCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2400MEA01MeasurementReferenceIdentificationCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder clear2400MEA01MeasurementReferenceIdentificationCode$1() {
      _2400MEA01MeasurementReferenceIdentificationCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2400MEA02MeasurementQualifier' field */
    public java.lang.CharSequence get2400MEA02MeasurementQualifier$1() {
      return _2400MEA02MeasurementQualifier;
    }
    
    /** Sets the value of the '_2400MEA02MeasurementQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder set2400MEA02MeasurementQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2400MEA02MeasurementQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2400MEA02MeasurementQualifier' field has been set */
    public boolean has2400MEA02MeasurementQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2400MEA02MeasurementQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder clear2400MEA02MeasurementQualifier$1() {
      _2400MEA02MeasurementQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2400MEA03TestResults' field */
    public java.lang.CharSequence get2400MEA03TestResults$1() {
      return _2400MEA03TestResults;
    }
    
    /** Sets the value of the '_2400MEA03TestResults' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder set2400MEA03TestResults$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2400MEA03TestResults = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2400MEA03TestResults' field has been set */
    public boolean has2400MEA03TestResults$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2400MEA03TestResults' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_MEA_TestResult.Builder clear2400MEA03TestResults$1() {
      _2400MEA03TestResults = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Pro_2400_MEA_TestResult build() {
      try {
        X837Pro_2400_MEA_TestResult record = new X837Pro_2400_MEA_TestResult();
        record._2400MEA01MeasurementReferenceIdentificationCode = fieldSetFlags()[0] ? this._2400MEA01MeasurementReferenceIdentificationCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2400MEA02MeasurementQualifier = fieldSetFlags()[1] ? this._2400MEA02MeasurementQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2400MEA03TestResults = fieldSetFlags()[2] ? this._2400MEA03TestResults : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
