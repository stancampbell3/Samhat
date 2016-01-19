/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2300_REF_RepricedClaimNumber extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2300_REF_RepricedClaimNumber\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300REF01ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_2300REF02RepricedClaimReferenceNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300REF01ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _2300REF02RepricedClaimReferenceNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2300_REF_RepricedClaimNumber() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2300_REF_RepricedClaimNumber(java.lang.CharSequence _2300REF01ReferenceIdentificationQualifier, java.lang.CharSequence _2300REF02RepricedClaimReferenceNumber) {
    this._2300REF01ReferenceIdentificationQualifier = _2300REF01ReferenceIdentificationQualifier;
    this._2300REF02RepricedClaimReferenceNumber = _2300REF02RepricedClaimReferenceNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300REF01ReferenceIdentificationQualifier;
    case 1: return _2300REF02RepricedClaimReferenceNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300REF01ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2300REF02RepricedClaimReferenceNumber = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300REF01ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence get2300REF01ReferenceIdentificationQualifier$1() {
    return _2300REF01ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_2300REF01ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void set2300REF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._2300REF01ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_2300REF02RepricedClaimReferenceNumber' field.
   */
  public java.lang.CharSequence get2300REF02RepricedClaimReferenceNumber$1() {
    return _2300REF02RepricedClaimReferenceNumber;
  }

  /**
   * Sets the value of the '_2300REF02RepricedClaimReferenceNumber' field.
   * @param value the value to set.
   */
  public void set2300REF02RepricedClaimReferenceNumber$1(java.lang.CharSequence value) {
    this._2300REF02RepricedClaimReferenceNumber = value;
  }

  /** Creates a new X837Pro_2300_REF_RepricedClaimNumber RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder();
  }
  
  /** Creates a new X837Pro_2300_REF_RepricedClaimNumber RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder(other);
  }
  
  /** Creates a new X837Pro_2300_REF_RepricedClaimNumber RecordBuilder by copying an existing X837Pro_2300_REF_RepricedClaimNumber instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2300_REF_RepricedClaimNumber instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2300_REF_RepricedClaimNumber>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2300_REF_RepricedClaimNumber> {

    private java.lang.CharSequence _2300REF01ReferenceIdentificationQualifier;
    private java.lang.CharSequence _2300REF02RepricedClaimReferenceNumber;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300REF01ReferenceIdentificationQualifier)) {
        this._2300REF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2300REF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300REF02RepricedClaimReferenceNumber)) {
        this._2300REF02RepricedClaimReferenceNumber = data().deepCopy(fields()[1].schema(), other._2300REF02RepricedClaimReferenceNumber);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2300_REF_RepricedClaimNumber instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.SCHEMA$);
      if (isValidValue(fields()[0], other._2300REF01ReferenceIdentificationQualifier)) {
        this._2300REF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2300REF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300REF02RepricedClaimReferenceNumber)) {
        this._2300REF02RepricedClaimReferenceNumber = data().deepCopy(fields()[1].schema(), other._2300REF02RepricedClaimReferenceNumber);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2300REF01ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence get2300REF01ReferenceIdentificationQualifier$1() {
      return _2300REF01ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_2300REF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder set2300REF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300REF01ReferenceIdentificationQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300REF01ReferenceIdentificationQualifier' field has been set */
    public boolean has2300REF01ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300REF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder clear2300REF01ReferenceIdentificationQualifier$1() {
      _2300REF01ReferenceIdentificationQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300REF02RepricedClaimReferenceNumber' field */
    public java.lang.CharSequence get2300REF02RepricedClaimReferenceNumber$1() {
      return _2300REF02RepricedClaimReferenceNumber;
    }
    
    /** Sets the value of the '_2300REF02RepricedClaimReferenceNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder set2300REF02RepricedClaimReferenceNumber$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300REF02RepricedClaimReferenceNumber = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300REF02RepricedClaimReferenceNumber' field has been set */
    public boolean has2300REF02RepricedClaimReferenceNumber$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300REF02RepricedClaimReferenceNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_REF_RepricedClaimNumber.Builder clear2300REF02RepricedClaimReferenceNumber$1() {
      _2300REF02RepricedClaimReferenceNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Pro_2300_REF_RepricedClaimNumber build() {
      try {
        X837Pro_2300_REF_RepricedClaimNumber record = new X837Pro_2300_REF_RepricedClaimNumber();
        record._2300REF01ReferenceIdentificationQualifier = fieldSetFlags()[0] ? this._2300REF01ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300REF02RepricedClaimReferenceNumber = fieldSetFlags()[1] ? this._2300REF02RepricedClaimReferenceNumber : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}