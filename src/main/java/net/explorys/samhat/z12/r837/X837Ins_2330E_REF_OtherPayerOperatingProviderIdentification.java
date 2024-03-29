/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2330EREF01ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_2330EREF02OtherPayerOperatingProviderIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2330EREF01ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _2330EREF02OtherPayerOperatingProviderIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification(java.lang.CharSequence _2330EREF01ReferenceIdentificationQualifier, java.lang.CharSequence _2330EREF02OtherPayerOperatingProviderIdentifier) {
    this._2330EREF01ReferenceIdentificationQualifier = _2330EREF01ReferenceIdentificationQualifier;
    this._2330EREF02OtherPayerOperatingProviderIdentifier = _2330EREF02OtherPayerOperatingProviderIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2330EREF01ReferenceIdentificationQualifier;
    case 1: return _2330EREF02OtherPayerOperatingProviderIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2330EREF01ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2330EREF02OtherPayerOperatingProviderIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2330EREF01ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence get2330EREF01ReferenceIdentificationQualifier$1() {
    return _2330EREF01ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_2330EREF01ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void set2330EREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._2330EREF01ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_2330EREF02OtherPayerOperatingProviderIdentifier' field.
   */
  public java.lang.CharSequence get2330EREF02OtherPayerOperatingProviderIdentifier$1() {
    return _2330EREF02OtherPayerOperatingProviderIdentifier;
  }

  /**
   * Sets the value of the '_2330EREF02OtherPayerOperatingProviderIdentifier' field.
   * @param value the value to set.
   */
  public void set2330EREF02OtherPayerOperatingProviderIdentifier$1(java.lang.CharSequence value) {
    this._2330EREF02OtherPayerOperatingProviderIdentifier = value;
  }

  /** Creates a new X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder();
  }
  
  /** Creates a new X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder(other);
  }
  
  /** Creates a new X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification RecordBuilder by copying an existing X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification> {

    private java.lang.CharSequence _2330EREF01ReferenceIdentificationQualifier;
    private java.lang.CharSequence _2330EREF02OtherPayerOperatingProviderIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2330EREF01ReferenceIdentificationQualifier)) {
        this._2330EREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2330EREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330EREF02OtherPayerOperatingProviderIdentifier)) {
        this._2330EREF02OtherPayerOperatingProviderIdentifier = data().deepCopy(fields()[1].schema(), other._2330EREF02OtherPayerOperatingProviderIdentifier);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.SCHEMA$);
      if (isValidValue(fields()[0], other._2330EREF01ReferenceIdentificationQualifier)) {
        this._2330EREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2330EREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330EREF02OtherPayerOperatingProviderIdentifier)) {
        this._2330EREF02OtherPayerOperatingProviderIdentifier = data().deepCopy(fields()[1].schema(), other._2330EREF02OtherPayerOperatingProviderIdentifier);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2330EREF01ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence get2330EREF01ReferenceIdentificationQualifier$1() {
      return _2330EREF01ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_2330EREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder set2330EREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2330EREF01ReferenceIdentificationQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2330EREF01ReferenceIdentificationQualifier' field has been set */
    public boolean has2330EREF01ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2330EREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder clear2330EREF01ReferenceIdentificationQualifier$1() {
      _2330EREF01ReferenceIdentificationQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2330EREF02OtherPayerOperatingProviderIdentifier' field */
    public java.lang.CharSequence get2330EREF02OtherPayerOperatingProviderIdentifier$1() {
      return _2330EREF02OtherPayerOperatingProviderIdentifier;
    }
    
    /** Sets the value of the '_2330EREF02OtherPayerOperatingProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder set2330EREF02OtherPayerOperatingProviderIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2330EREF02OtherPayerOperatingProviderIdentifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2330EREF02OtherPayerOperatingProviderIdentifier' field has been set */
    public boolean has2330EREF02OtherPayerOperatingProviderIdentifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2330EREF02OtherPayerOperatingProviderIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification.Builder clear2330EREF02OtherPayerOperatingProviderIdentifier$1() {
      _2330EREF02OtherPayerOperatingProviderIdentifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification build() {
      try {
        X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification record = new X837Ins_2330E_REF_OtherPayerOperatingProviderIdentification();
        record._2330EREF01ReferenceIdentificationQualifier = fieldSetFlags()[0] ? this._2330EREF01ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2330EREF02OtherPayerOperatingProviderIdentifier = fieldSetFlags()[1] ? this._2330EREF02OtherPayerOperatingProviderIdentifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
