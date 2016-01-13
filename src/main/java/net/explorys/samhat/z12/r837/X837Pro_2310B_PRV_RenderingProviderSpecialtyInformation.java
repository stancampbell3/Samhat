/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2310BPRV01ProviderCode\",\"type\":\"string\"},{\"name\":\"_2310BPRV02ReferenceIdentificationQualifier\",\"type\":\"string\"},{\"name\":\"_2310BPRV03ProviderTaxonomyCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2310BPRV01ProviderCode;
  @Deprecated public java.lang.CharSequence _2310BPRV02ReferenceIdentificationQualifier;
  @Deprecated public java.lang.CharSequence _2310BPRV03ProviderTaxonomyCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation(java.lang.CharSequence _2310BPRV01ProviderCode, java.lang.CharSequence _2310BPRV02ReferenceIdentificationQualifier, java.lang.CharSequence _2310BPRV03ProviderTaxonomyCode) {
    this._2310BPRV01ProviderCode = _2310BPRV01ProviderCode;
    this._2310BPRV02ReferenceIdentificationQualifier = _2310BPRV02ReferenceIdentificationQualifier;
    this._2310BPRV03ProviderTaxonomyCode = _2310BPRV03ProviderTaxonomyCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2310BPRV01ProviderCode;
    case 1: return _2310BPRV02ReferenceIdentificationQualifier;
    case 2: return _2310BPRV03ProviderTaxonomyCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2310BPRV01ProviderCode = (java.lang.CharSequence)value$; break;
    case 1: _2310BPRV02ReferenceIdentificationQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2310BPRV03ProviderTaxonomyCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2310BPRV01ProviderCode' field.
   */
  public java.lang.CharSequence get2310BPRV01ProviderCode$1() {
    return _2310BPRV01ProviderCode;
  }

  /**
   * Sets the value of the '_2310BPRV01ProviderCode' field.
   * @param value the value to set.
   */
  public void set2310BPRV01ProviderCode$1(java.lang.CharSequence value) {
    this._2310BPRV01ProviderCode = value;
  }

  /**
   * Gets the value of the '_2310BPRV02ReferenceIdentificationQualifier' field.
   */
  public java.lang.CharSequence get2310BPRV02ReferenceIdentificationQualifier$1() {
    return _2310BPRV02ReferenceIdentificationQualifier;
  }

  /**
   * Sets the value of the '_2310BPRV02ReferenceIdentificationQualifier' field.
   * @param value the value to set.
   */
  public void set2310BPRV02ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
    this._2310BPRV02ReferenceIdentificationQualifier = value;
  }

  /**
   * Gets the value of the '_2310BPRV03ProviderTaxonomyCode' field.
   */
  public java.lang.CharSequence get2310BPRV03ProviderTaxonomyCode$1() {
    return _2310BPRV03ProviderTaxonomyCode;
  }

  /**
   * Sets the value of the '_2310BPRV03ProviderTaxonomyCode' field.
   * @param value the value to set.
   */
  public void set2310BPRV03ProviderTaxonomyCode$1(java.lang.CharSequence value) {
    this._2310BPRV03ProviderTaxonomyCode = value;
  }

  /** Creates a new X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder();
  }
  
  /** Creates a new X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation RecordBuilder by copying an existing X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation> {

    private java.lang.CharSequence _2310BPRV01ProviderCode;
    private java.lang.CharSequence _2310BPRV02ReferenceIdentificationQualifier;
    private java.lang.CharSequence _2310BPRV03ProviderTaxonomyCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2310BPRV01ProviderCode)) {
        this._2310BPRV01ProviderCode = data().deepCopy(fields()[0].schema(), other._2310BPRV01ProviderCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310BPRV02ReferenceIdentificationQualifier)) {
        this._2310BPRV02ReferenceIdentificationQualifier = data().deepCopy(fields()[1].schema(), other._2310BPRV02ReferenceIdentificationQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310BPRV03ProviderTaxonomyCode)) {
        this._2310BPRV03ProviderTaxonomyCode = data().deepCopy(fields()[2].schema(), other._2310BPRV03ProviderTaxonomyCode);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2310BPRV01ProviderCode)) {
        this._2310BPRV01ProviderCode = data().deepCopy(fields()[0].schema(), other._2310BPRV01ProviderCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2310BPRV02ReferenceIdentificationQualifier)) {
        this._2310BPRV02ReferenceIdentificationQualifier = data().deepCopy(fields()[1].schema(), other._2310BPRV02ReferenceIdentificationQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2310BPRV03ProviderTaxonomyCode)) {
        this._2310BPRV03ProviderTaxonomyCode = data().deepCopy(fields()[2].schema(), other._2310BPRV03ProviderTaxonomyCode);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2310BPRV01ProviderCode' field */
    public java.lang.CharSequence get2310BPRV01ProviderCode$1() {
      return _2310BPRV01ProviderCode;
    }
    
    /** Sets the value of the '_2310BPRV01ProviderCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder set2310BPRV01ProviderCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2310BPRV01ProviderCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BPRV01ProviderCode' field has been set */
    public boolean has2310BPRV01ProviderCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2310BPRV01ProviderCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder clear2310BPRV01ProviderCode$1() {
      _2310BPRV01ProviderCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2310BPRV02ReferenceIdentificationQualifier' field */
    public java.lang.CharSequence get2310BPRV02ReferenceIdentificationQualifier$1() {
      return _2310BPRV02ReferenceIdentificationQualifier;
    }
    
    /** Sets the value of the '_2310BPRV02ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder set2310BPRV02ReferenceIdentificationQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2310BPRV02ReferenceIdentificationQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BPRV02ReferenceIdentificationQualifier' field has been set */
    public boolean has2310BPRV02ReferenceIdentificationQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2310BPRV02ReferenceIdentificationQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder clear2310BPRV02ReferenceIdentificationQualifier$1() {
      _2310BPRV02ReferenceIdentificationQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2310BPRV03ProviderTaxonomyCode' field */
    public java.lang.CharSequence get2310BPRV03ProviderTaxonomyCode$1() {
      return _2310BPRV03ProviderTaxonomyCode;
    }
    
    /** Sets the value of the '_2310BPRV03ProviderTaxonomyCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder set2310BPRV03ProviderTaxonomyCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2310BPRV03ProviderTaxonomyCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2310BPRV03ProviderTaxonomyCode' field has been set */
    public boolean has2310BPRV03ProviderTaxonomyCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2310BPRV03ProviderTaxonomyCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation.Builder clear2310BPRV03ProviderTaxonomyCode$1() {
      _2310BPRV03ProviderTaxonomyCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation build() {
      try {
        X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation record = new X837Pro_2310B_PRV_RenderingProviderSpecialtyInformation();
        record._2310BPRV01ProviderCode = fieldSetFlags()[0] ? this._2310BPRV01ProviderCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2310BPRV02ReferenceIdentificationQualifier = fieldSetFlags()[1] ? this._2310BPRV02ReferenceIdentificationQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2310BPRV03ProviderTaxonomyCode = fieldSetFlags()[2] ? this._2310BPRV03ProviderTaxonomyCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
