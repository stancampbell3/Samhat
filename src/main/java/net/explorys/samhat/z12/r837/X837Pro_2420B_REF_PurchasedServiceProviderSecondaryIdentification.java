/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2420BREF01ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_2420BREF02PurchasedServiceProviderSecondaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2420BREF01ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _2420BREF02PurchasedServiceProviderSecondaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification(java.lang.CharSequence _2420BREF01ReferenceIdentificationQualifier, java.lang.CharSequence _2420BREF02PurchasedServiceProviderSecondaryIdentifier) {
    this._2420BREF01ReferenceIdentificationQualifier = _2420BREF01ReferenceIdentificationQualifier;
    this._2420BREF02PurchasedServiceProviderSecondaryIdentifier = _2420BREF02PurchasedServiceProviderSecondaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2420BREF01ReferenceIdentificationQualifier;
    case 1: return _2420BREF02PurchasedServiceProviderSecondaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2420BREF01ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2420BREF02PurchasedServiceProviderSecondaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2420BREF01ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence get2420BREF01ReferenceIdentificationQualifier$1() {
    return _2420BREF01ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_2420BREF01ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void set2420BREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._2420BREF01ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_2420BREF02PurchasedServiceProviderSecondaryIdentifier' field.
   */
  public java.lang.CharSequence get2420BREF02PurchasedServiceProviderSecondaryIdentifier$1() {
    return _2420BREF02PurchasedServiceProviderSecondaryIdentifier;
  }

  /**
   * Sets the value of the '_2420BREF02PurchasedServiceProviderSecondaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2420BREF02PurchasedServiceProviderSecondaryIdentifier$1(java.lang.CharSequence value) {
    this._2420BREF02PurchasedServiceProviderSecondaryIdentifier = value;
  }

  /** Creates a new X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder();
  }
  
  /** Creates a new X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder(other);
  }
  
  /** Creates a new X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification RecordBuilder by copying an existing X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification> {

    private java.lang.CharSequence _2420BREF01ReferenceIdentificationQualifier;
    private java.lang.CharSequence _2420BREF02PurchasedServiceProviderSecondaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2420BREF01ReferenceIdentificationQualifier)) {
        this._2420BREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2420BREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2420BREF02PurchasedServiceProviderSecondaryIdentifier)) {
        this._2420BREF02PurchasedServiceProviderSecondaryIdentifier = data().deepCopy(fields()[1].schema(), other._2420BREF02PurchasedServiceProviderSecondaryIdentifier);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.SCHEMA$);
      if (isValidValue(fields()[0], other._2420BREF01ReferenceIdentificationQualifier)) {
        this._2420BREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2420BREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2420BREF02PurchasedServiceProviderSecondaryIdentifier)) {
        this._2420BREF02PurchasedServiceProviderSecondaryIdentifier = data().deepCopy(fields()[1].schema(), other._2420BREF02PurchasedServiceProviderSecondaryIdentifier);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2420BREF01ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence get2420BREF01ReferenceIdentificationQualifier$1() {
      return _2420BREF01ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_2420BREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder set2420BREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2420BREF01ReferenceIdentificationQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2420BREF01ReferenceIdentificationQualifier' field has been set */
    public boolean has2420BREF01ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2420BREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder clear2420BREF01ReferenceIdentificationQualifier$1() {
      _2420BREF01ReferenceIdentificationQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2420BREF02PurchasedServiceProviderSecondaryIdentifier' field */
    public java.lang.CharSequence get2420BREF02PurchasedServiceProviderSecondaryIdentifier$1() {
      return _2420BREF02PurchasedServiceProviderSecondaryIdentifier;
    }
    
    /** Sets the value of the '_2420BREF02PurchasedServiceProviderSecondaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder set2420BREF02PurchasedServiceProviderSecondaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2420BREF02PurchasedServiceProviderSecondaryIdentifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2420BREF02PurchasedServiceProviderSecondaryIdentifier' field has been set */
    public boolean has2420BREF02PurchasedServiceProviderSecondaryIdentifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2420BREF02PurchasedServiceProviderSecondaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification.Builder clear2420BREF02PurchasedServiceProviderSecondaryIdentifier$1() {
      _2420BREF02PurchasedServiceProviderSecondaryIdentifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification build() {
      try {
        X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification record = new X837Pro_2420B_REF_PurchasedServiceProviderSecondaryIdentification();
        record._2420BREF01ReferenceIdentificationQualifier = fieldSetFlags()[0] ? this._2420BREF01ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2420BREF02PurchasedServiceProviderSecondaryIdentifier = fieldSetFlags()[1] ? this._2420BREF02PurchasedServiceProviderSecondaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
