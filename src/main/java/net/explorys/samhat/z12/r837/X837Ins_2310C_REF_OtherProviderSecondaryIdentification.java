/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2310C_REF_OtherProviderSecondaryIdentification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2310C_REF_OtherProviderSecondaryIdentification\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310CREF01ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_2310CREF02OtherProviderSecondaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310CREF01ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _2310CREF02OtherProviderSecondaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2310C_REF_OtherProviderSecondaryIdentification() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2310C_REF_OtherProviderSecondaryIdentification(java.lang.CharSequence _2310CREF01ReferenceIdentificationQualifier, java.lang.CharSequence _2310CREF02OtherProviderSecondaryIdentifier) {
    this._2310CREF01ReferenceIdentificationQualifier = _2310CREF01ReferenceIdentificationQualifier;
    this._2310CREF02OtherProviderSecondaryIdentifier = _2310CREF02OtherProviderSecondaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310CREF01ReferenceIdentificationQualifier;
    case 1: return _2310CREF02OtherProviderSecondaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310CREF01ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2310CREF02OtherProviderSecondaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310CREF01ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence get2310CREF01ReferenceIdentificationQualifier$1() {
    return _2310CREF01ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_2310CREF01ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void set2310CREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._2310CREF01ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_2310CREF02OtherProviderSecondaryIdentifier' field.
   */
  public java.lang.CharSequence get2310CREF02OtherProviderSecondaryIdentifier$1() {
    return _2310CREF02OtherProviderSecondaryIdentifier;
  }

  /**
   * Sets the value of the '_2310CREF02OtherProviderSecondaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2310CREF02OtherProviderSecondaryIdentifier$1(java.lang.CharSequence value) {
    this._2310CREF02OtherProviderSecondaryIdentifier = value;
  }

  /** Creates a new X837Ins_2310C_REF_OtherProviderSecondaryIdentification RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder();
  }
  
  /** Creates a new X837Ins_2310C_REF_OtherProviderSecondaryIdentification RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder(other);
  }
  
  /** Creates a new X837Ins_2310C_REF_OtherProviderSecondaryIdentification RecordBuilder by copying an existing X837Ins_2310C_REF_OtherProviderSecondaryIdentification instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2310C_REF_OtherProviderSecondaryIdentification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2310C_REF_OtherProviderSecondaryIdentification>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2310C_REF_OtherProviderSecondaryIdentification> {

    private java.lang.CharSequence _2310CREF01ReferenceIdentificationQualifier;
    private java.lang.CharSequence _2310CREF02OtherProviderSecondaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310CREF01ReferenceIdentificationQualifier)) {
        this._2310CREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2310CREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310CREF02OtherProviderSecondaryIdentifier)) {
        this._2310CREF02OtherProviderSecondaryIdentifier = data().deepCopy(fields()[1].schema(), other._2310CREF02OtherProviderSecondaryIdentifier);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2310C_REF_OtherProviderSecondaryIdentification instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.SCHEMA$);
      if (isValidValue(fields()[0], other._2310CREF01ReferenceIdentificationQualifier)) {
        this._2310CREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2310CREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310CREF02OtherProviderSecondaryIdentifier)) {
        this._2310CREF02OtherProviderSecondaryIdentifier = data().deepCopy(fields()[1].schema(), other._2310CREF02OtherProviderSecondaryIdentifier);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2310CREF01ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence get2310CREF01ReferenceIdentificationQualifier$1() {
      return _2310CREF01ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_2310CREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder set2310CREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310CREF01ReferenceIdentificationQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310CREF01ReferenceIdentificationQualifier' field has been set */
    public boolean has2310CREF01ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310CREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder clear2310CREF01ReferenceIdentificationQualifier$1() {
      _2310CREF01ReferenceIdentificationQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310CREF02OtherProviderSecondaryIdentifier' field */
    public java.lang.CharSequence get2310CREF02OtherProviderSecondaryIdentifier$1() {
      return _2310CREF02OtherProviderSecondaryIdentifier;
    }
    
    /** Sets the value of the '_2310CREF02OtherProviderSecondaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder set2310CREF02OtherProviderSecondaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310CREF02OtherProviderSecondaryIdentifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310CREF02OtherProviderSecondaryIdentifier' field has been set */
    public boolean has2310CREF02OtherProviderSecondaryIdentifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310CREF02OtherProviderSecondaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2310C_REF_OtherProviderSecondaryIdentification.Builder clear2310CREF02OtherProviderSecondaryIdentifier$1() {
      _2310CREF02OtherProviderSecondaryIdentifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2310C_REF_OtherProviderSecondaryIdentification build() {
      try {
        X837Ins_2310C_REF_OtherProviderSecondaryIdentification record = new X837Ins_2310C_REF_OtherProviderSecondaryIdentification();
        record._2310CREF01ReferenceIdentificationQualifier = fieldSetFlags()[0] ? this._2310CREF01ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310CREF02OtherProviderSecondaryIdentifier = fieldSetFlags()[1] ? this._2310CREF02OtherProviderSecondaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
