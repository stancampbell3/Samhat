/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310DREF01ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_2310DREF02LaboratoryOrFacilitySecondaryIdentifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310DREF01ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _2310DREF02LaboratoryOrFacilitySecondaryIdentifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification(java.lang.CharSequence _2310DREF01ReferenceIdentificationQualifier, java.lang.CharSequence _2310DREF02LaboratoryOrFacilitySecondaryIdentifier) {
    this._2310DREF01ReferenceIdentificationQualifier = _2310DREF01ReferenceIdentificationQualifier;
    this._2310DREF02LaboratoryOrFacilitySecondaryIdentifier = _2310DREF02LaboratoryOrFacilitySecondaryIdentifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310DREF01ReferenceIdentificationQualifier;
    case 1: return _2310DREF02LaboratoryOrFacilitySecondaryIdentifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310DREF01ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2310DREF02LaboratoryOrFacilitySecondaryIdentifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310DREF01ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence get2310DREF01ReferenceIdentificationQualifier$1() {
    return _2310DREF01ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_2310DREF01ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void set2310DREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._2310DREF01ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_2310DREF02LaboratoryOrFacilitySecondaryIdentifier' field.
   */
  public java.lang.CharSequence get2310DREF02LaboratoryOrFacilitySecondaryIdentifier$1() {
    return _2310DREF02LaboratoryOrFacilitySecondaryIdentifier;
  }

  /**
   * Sets the value of the '_2310DREF02LaboratoryOrFacilitySecondaryIdentifier' field.
   * @param value the value to set.
   */
  public void set2310DREF02LaboratoryOrFacilitySecondaryIdentifier$1(java.lang.CharSequence value) {
    this._2310DREF02LaboratoryOrFacilitySecondaryIdentifier = value;
  }

  /** Creates a new X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder();
  }
  
  /** Creates a new X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder(other);
  }
  
  /** Creates a new X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification RecordBuilder by copying an existing X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification> {

    private java.lang.CharSequence _2310DREF01ReferenceIdentificationQualifier;
    private java.lang.CharSequence _2310DREF02LaboratoryOrFacilitySecondaryIdentifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310DREF01ReferenceIdentificationQualifier)) {
        this._2310DREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2310DREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310DREF02LaboratoryOrFacilitySecondaryIdentifier)) {
        this._2310DREF02LaboratoryOrFacilitySecondaryIdentifier = data().deepCopy(fields()[1].schema(), other._2310DREF02LaboratoryOrFacilitySecondaryIdentifier);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.SCHEMA$);
      if (isValidValue(fields()[0], other._2310DREF01ReferenceIdentificationQualifier)) {
        this._2310DREF01ReferenceIdentificationQualifier = data().deepCopy(fields()[0].schema(), other._2310DREF01ReferenceIdentificationQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310DREF02LaboratoryOrFacilitySecondaryIdentifier)) {
        this._2310DREF02LaboratoryOrFacilitySecondaryIdentifier = data().deepCopy(fields()[1].schema(), other._2310DREF02LaboratoryOrFacilitySecondaryIdentifier);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2310DREF01ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence get2310DREF01ReferenceIdentificationQualifier$1() {
      return _2310DREF01ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_2310DREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder set2310DREF01ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310DREF01ReferenceIdentificationQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DREF01ReferenceIdentificationQualifier' field has been set */
    public boolean has2310DREF01ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310DREF01ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder clear2310DREF01ReferenceIdentificationQualifier$1() {
      _2310DREF01ReferenceIdentificationQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310DREF02LaboratoryOrFacilitySecondaryIdentifier' field */
    public java.lang.CharSequence get2310DREF02LaboratoryOrFacilitySecondaryIdentifier$1() {
      return _2310DREF02LaboratoryOrFacilitySecondaryIdentifier;
    }
    
    /** Sets the value of the '_2310DREF02LaboratoryOrFacilitySecondaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder set2310DREF02LaboratoryOrFacilitySecondaryIdentifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310DREF02LaboratoryOrFacilitySecondaryIdentifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310DREF02LaboratoryOrFacilitySecondaryIdentifier' field has been set */
    public boolean has2310DREF02LaboratoryOrFacilitySecondaryIdentifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310DREF02LaboratoryOrFacilitySecondaryIdentifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification.Builder clear2310DREF02LaboratoryOrFacilitySecondaryIdentifier$1() {
      _2310DREF02LaboratoryOrFacilitySecondaryIdentifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification build() {
      try {
        X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification record = new X837Pro_2310D_REF_ServiceFacilityLocationSecondaryIdentification();
        record._2310DREF01ReferenceIdentificationQualifier = fieldSetFlags()[0] ? this._2310DREF01ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310DREF02LaboratoryOrFacilitySecondaryIdentifier = fieldSetFlags()[1] ? this._2310DREF02LaboratoryOrFacilitySecondaryIdentifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}