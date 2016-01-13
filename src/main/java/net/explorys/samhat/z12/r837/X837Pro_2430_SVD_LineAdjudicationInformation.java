/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2430_SVD_LineAdjudicationInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2430_SVD_LineAdjudicationInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2430SVD01OtherPayerPrimaryIdentifier\",\"type\":\"string\"},{\"name\":\"_2430SVD02ServiceLinePaidAmount\",\"type\":\"string\"},{\"name\":\"_2430SVD05PaidServiceUnitCount\",\"type\":\"string\"},{\"name\":\"_2430SVD06BundledOrUnbundledLineNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2430SVD01OtherPayerPrimaryIdentifier;
  @Deprecated public java.lang.CharSequence _2430SVD02ServiceLinePaidAmount;
  @Deprecated public java.lang.CharSequence _2430SVD05PaidServiceUnitCount;
  @Deprecated public java.lang.CharSequence _2430SVD06BundledOrUnbundledLineNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2430_SVD_LineAdjudicationInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2430_SVD_LineAdjudicationInformation(java.lang.CharSequence _2430SVD01OtherPayerPrimaryIdentifier, java.lang.CharSequence _2430SVD02ServiceLinePaidAmount, java.lang.CharSequence _2430SVD05PaidServiceUnitCount, java.lang.CharSequence _2430SVD06BundledOrUnbundledLineNumber) {
    this._2430SVD01OtherPayerPrimaryIdentifier = _2430SVD01OtherPayerPrimaryIdentifier;
    this._2430SVD02ServiceLinePaidAmount = _2430SVD02ServiceLinePaidAmount;
    this._2430SVD05PaidServiceUnitCount = _2430SVD05PaidServiceUnitCount;
    this._2430SVD06BundledOrUnbundledLineNumber = _2430SVD06BundledOrUnbundledLineNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2430SVD01OtherPayerPrimaryIdentifier;
    case 1: return _2430SVD02ServiceLinePaidAmount;
    case 2: return _2430SVD05PaidServiceUnitCount;
    case 3: return _2430SVD06BundledOrUnbundledLineNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2430SVD01OtherPayerPrimaryIdentifier = (java.lang.CharSequence)value$; break;
    case 1: _2430SVD02ServiceLinePaidAmount = (java.lang.CharSequence)value$; break;
    case 2: _2430SVD05PaidServiceUnitCount = (java.lang.CharSequence)value$; break;
    case 3: _2430SVD06BundledOrUnbundledLineNumber = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2430SVD01OtherPayerPrimaryIdentifier' field.
   */
  public java.lang.CharSequence get2430SVD01OtherPayerPrimaryIdentifier$1() {
    return _2430SVD01OtherPayerPrimaryIdentifier;
  }

  /**
   * Sets the value of the '_2430SVD01OtherPayerPrimaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2430SVD01OtherPayerPrimaryIdentifier$1(java.lang.CharSequence value) {
    this._2430SVD01OtherPayerPrimaryIdentifier = value;
  }

  /**
   * Gets the value of the '_2430SVD02ServiceLinePaidAmount' field.
   */
  public java.lang.CharSequence get2430SVD02ServiceLinePaidAmount$1() {
    return _2430SVD02ServiceLinePaidAmount;
  }

  /**
   * Sets the value of the '_2430SVD02ServiceLinePaidAmount' field.
   * @param value the value to set.
   */
  public void set2430SVD02ServiceLinePaidAmount$1(java.lang.CharSequence value) {
    this._2430SVD02ServiceLinePaidAmount = value;
  }

  /**
   * Gets the value of the '_2430SVD05PaidServiceUnitCount' field.
   */
  public java.lang.CharSequence get2430SVD05PaidServiceUnitCount$1() {
    return _2430SVD05PaidServiceUnitCount;
  }

  /**
   * Sets the value of the '_2430SVD05PaidServiceUnitCount' field.
   * @param value the value to set.
   */
  public void set2430SVD05PaidServiceUnitCount$1(java.lang.CharSequence value) {
    this._2430SVD05PaidServiceUnitCount = value;
  }

  /**
   * Gets the value of the '_2430SVD06BundledOrUnbundledLineNumber' field.
   */
  public java.lang.CharSequence get2430SVD06BundledOrUnbundledLineNumber$1() {
    return _2430SVD06BundledOrUnbundledLineNumber;
  }

  /**
   * Sets the value of the '_2430SVD06BundledOrUnbundledLineNumber' field.
   * @param value the value to set.
   */
  public void set2430SVD06BundledOrUnbundledLineNumber$1(java.lang.CharSequence value) {
    this._2430SVD06BundledOrUnbundledLineNumber = value;
  }

  /** Creates a new X837Pro_2430_SVD_LineAdjudicationInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder();
  }
  
  /** Creates a new X837Pro_2430_SVD_LineAdjudicationInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2430_SVD_LineAdjudicationInformation RecordBuilder by copying an existing X837Pro_2430_SVD_LineAdjudicationInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2430_SVD_LineAdjudicationInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2430_SVD_LineAdjudicationInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2430_SVD_LineAdjudicationInformation> {

    private java.lang.CharSequence _2430SVD01OtherPayerPrimaryIdentifier;
    private java.lang.CharSequence _2430SVD02ServiceLinePaidAmount;
    private java.lang.CharSequence _2430SVD05PaidServiceUnitCount;
    private java.lang.CharSequence _2430SVD06BundledOrUnbundledLineNumber;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2430SVD01OtherPayerPrimaryIdentifier)) {
        this._2430SVD01OtherPayerPrimaryIdentifier = data().deepCopy(fields()[0].schema(), other._2430SVD01OtherPayerPrimaryIdentifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2430SVD02ServiceLinePaidAmount)) {
        this._2430SVD02ServiceLinePaidAmount = data().deepCopy(fields()[1].schema(), other._2430SVD02ServiceLinePaidAmount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2430SVD05PaidServiceUnitCount)) {
        this._2430SVD05PaidServiceUnitCount = data().deepCopy(fields()[2].schema(), other._2430SVD05PaidServiceUnitCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2430SVD06BundledOrUnbundledLineNumber)) {
        this._2430SVD06BundledOrUnbundledLineNumber = data().deepCopy(fields()[3].schema(), other._2430SVD06BundledOrUnbundledLineNumber);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2430_SVD_LineAdjudicationInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2430SVD01OtherPayerPrimaryIdentifier)) {
        this._2430SVD01OtherPayerPrimaryIdentifier = data().deepCopy(fields()[0].schema(), other._2430SVD01OtherPayerPrimaryIdentifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2430SVD02ServiceLinePaidAmount)) {
        this._2430SVD02ServiceLinePaidAmount = data().deepCopy(fields()[1].schema(), other._2430SVD02ServiceLinePaidAmount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2430SVD05PaidServiceUnitCount)) {
        this._2430SVD05PaidServiceUnitCount = data().deepCopy(fields()[2].schema(), other._2430SVD05PaidServiceUnitCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2430SVD06BundledOrUnbundledLineNumber)) {
        this._2430SVD06BundledOrUnbundledLineNumber = data().deepCopy(fields()[3].schema(), other._2430SVD06BundledOrUnbundledLineNumber);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2430SVD01OtherPayerPrimaryIdentifier' field */
    public java.lang.CharSequence get2430SVD01OtherPayerPrimaryIdentifier$1() {
      return _2430SVD01OtherPayerPrimaryIdentifier;
    }
    
    /** Sets the value of the '_2430SVD01OtherPayerPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder set2430SVD01OtherPayerPrimaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2430SVD01OtherPayerPrimaryIdentifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2430SVD01OtherPayerPrimaryIdentifier' field has been set */
    public boolean has2430SVD01OtherPayerPrimaryIdentifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2430SVD01OtherPayerPrimaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder clear2430SVD01OtherPayerPrimaryIdentifier$1() {
      _2430SVD01OtherPayerPrimaryIdentifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2430SVD02ServiceLinePaidAmount' field */
    public java.lang.CharSequence get2430SVD02ServiceLinePaidAmount$1() {
      return _2430SVD02ServiceLinePaidAmount;
    }
    
    /** Sets the value of the '_2430SVD02ServiceLinePaidAmount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder set2430SVD02ServiceLinePaidAmount$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2430SVD02ServiceLinePaidAmount = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2430SVD02ServiceLinePaidAmount' field has been set */
    public boolean has2430SVD02ServiceLinePaidAmount$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2430SVD02ServiceLinePaidAmount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder clear2430SVD02ServiceLinePaidAmount$1() {
      _2430SVD02ServiceLinePaidAmount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2430SVD05PaidServiceUnitCount' field */
    public java.lang.CharSequence get2430SVD05PaidServiceUnitCount$1() {
      return _2430SVD05PaidServiceUnitCount;
    }
    
    /** Sets the value of the '_2430SVD05PaidServiceUnitCount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder set2430SVD05PaidServiceUnitCount$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2430SVD05PaidServiceUnitCount = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2430SVD05PaidServiceUnitCount' field has been set */
    public boolean has2430SVD05PaidServiceUnitCount$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2430SVD05PaidServiceUnitCount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder clear2430SVD05PaidServiceUnitCount$1() {
      _2430SVD05PaidServiceUnitCount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2430SVD06BundledOrUnbundledLineNumber' field */
    public java.lang.CharSequence get2430SVD06BundledOrUnbundledLineNumber$1() {
      return _2430SVD06BundledOrUnbundledLineNumber;
    }
    
    /** Sets the value of the '_2430SVD06BundledOrUnbundledLineNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder set2430SVD06BundledOrUnbundledLineNumber$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2430SVD06BundledOrUnbundledLineNumber = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2430SVD06BundledOrUnbundledLineNumber' field has been set */
    public boolean has2430SVD06BundledOrUnbundledLineNumber$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2430SVD06BundledOrUnbundledLineNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2430_SVD_LineAdjudicationInformation.Builder clear2430SVD06BundledOrUnbundledLineNumber$1() {
      _2430SVD06BundledOrUnbundledLineNumber = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Pro_2430_SVD_LineAdjudicationInformation build() {
      try {
        X837Pro_2430_SVD_LineAdjudicationInformation record = new X837Pro_2430_SVD_LineAdjudicationInformation();
        record._2430SVD01OtherPayerPrimaryIdentifier = fieldSetFlags()[0] ? this._2430SVD01OtherPayerPrimaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2430SVD02ServiceLinePaidAmount = fieldSetFlags()[1] ? this._2430SVD02ServiceLinePaidAmount : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2430SVD05PaidServiceUnitCount = fieldSetFlags()[2] ? this._2430SVD05PaidServiceUnitCount : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2430SVD06BundledOrUnbundledLineNumber = fieldSetFlags()[3] ? this._2430SVD06BundledOrUnbundledLineNumber : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
