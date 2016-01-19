/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins__REF_TransmissionTypeIdentification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins__REF_TransmissionTypeIdentification\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_REF01ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_REF02TransmissionTypeCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _REF01ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _REF02TransmissionTypeCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins__REF_TransmissionTypeIdentification() {}

  /**
   * All-args constructor.
   */
  public X837Ins__REF_TransmissionTypeIdentification(java.lang.CharSequence _REF01ReferenceIdentificationQualifier, java.lang.CharSequence _REF02TransmissionTypeCode) {
    this._REF01ReferenceIdentificationQualifier = _REF01ReferenceIdentificationQualifier;
    this._REF02TransmissionTypeCode = _REF02TransmissionTypeCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _REF01ReferenceIdentificationQualifier;
    case 1: return _REF02TransmissionTypeCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _REF01ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 1: _REF02TransmissionTypeCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_REF01ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence getREF01ReferenceIdentificationQualifier$1() {
    return _REF01ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_REF01ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void setREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._REF01ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_REF02TransmissionTypeCode' field.
   */
  public java.lang.CharSequence getREF02TransmissionTypeCode$1() {
    return _REF02TransmissionTypeCode;
  }

  /**
   * Sets the value of the '_REF02TransmissionTypeCode' field.
   * @param value the value to set.
   */
  public void setREF02TransmissionTypeCode$1(java.lang.CharSequence value) {
    this._REF02TransmissionTypeCode = value;
  }

  /** Creates a new X837Ins__REF_TransmissionTypeIdentification RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder();
  }
  
  /** Creates a new X837Ins__REF_TransmissionTypeIdentification RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder(other);
  }
  
  /** Creates a new X837Ins__REF_TransmissionTypeIdentification RecordBuilder by copying an existing X837Ins__REF_TransmissionTypeIdentification instance */
  public static net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification other) {
    return new net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins__REF_TransmissionTypeIdentification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins__REF_TransmissionTypeIdentification>
    implements org.apache.avro.data.RecordBuilder<X837Ins__REF_TransmissionTypeIdentification> {

    private java.lang.CharSequence _REF01ReferenceIdentificationQualifier;
    private java.lang.CharSequence _REF02TransmissionTypeCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._REF01ReferenceIdentificationQualifier)) {
        this._REF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._REF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._REF02TransmissionTypeCode)) {
        this._REF02TransmissionTypeCode = data().deepCopy(fields()[1].schema(), other._REF02TransmissionTypeCode);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins__REF_TransmissionTypeIdentification instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification other) {
            super(net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.SCHEMA$);
      if (isValidValue(fields()[0], other._REF01ReferenceIdentificationQualifier)) {
        this._REF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._REF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._REF02TransmissionTypeCode)) {
        this._REF02TransmissionTypeCode = data().deepCopy(fields()[1].schema(), other._REF02TransmissionTypeCode);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_REF01ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence getREF01ReferenceIdentificationQualifier$1() {
      return _REF01ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_REF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder setREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._REF01ReferenceIdentificationQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_REF01ReferenceIdentificationQualifier' field has been set */
    public boolean hasREF01ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_REF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder clearREF01ReferenceIdentificationQualifier$1() {
      _REF01ReferenceIdentificationQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_REF02TransmissionTypeCode' field */
    public java.lang.CharSequence getREF02TransmissionTypeCode$1() {
      return _REF02TransmissionTypeCode;
    }
    
    /** Sets the value of the '_REF02TransmissionTypeCode' field */
    public net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder setREF02TransmissionTypeCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._REF02TransmissionTypeCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_REF02TransmissionTypeCode' field has been set */
    public boolean hasREF02TransmissionTypeCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_REF02TransmissionTypeCode' field */
    public net.explorys.samhat.z12.r837.X837Ins__REF_TransmissionTypeIdentification.Builder clearREF02TransmissionTypeCode$1() {
      _REF02TransmissionTypeCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins__REF_TransmissionTypeIdentification build() {
      try {
        X837Ins__REF_TransmissionTypeIdentification record = new X837Ins__REF_TransmissionTypeIdentification();
        record._REF01ReferenceIdentificationQualifier = fieldSetFlags()[0] ? this._REF01ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._REF02TransmissionTypeCode = fieldSetFlags()[1] ? this._REF02TransmissionTypeCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}