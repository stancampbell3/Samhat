/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2320_OI_OtherInsuranceCoverageInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2320_OI_OtherInsuranceCoverageInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2320OI03BenefitsAssignmentCertificationIndicator\",\"type\":\"string\"},{\"name\":\"_2320OI06ReleaseOfInformationCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2320OI03BenefitsAssignmentCertificationIndicator;
  @Deprecated public java.lang.CharSequence _2320OI06ReleaseOfInformationCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2320_OI_OtherInsuranceCoverageInformation() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2320_OI_OtherInsuranceCoverageInformation(java.lang.CharSequence _2320OI03BenefitsAssignmentCertificationIndicator, java.lang.CharSequence _2320OI06ReleaseOfInformationCode) {
    this._2320OI03BenefitsAssignmentCertificationIndicator = _2320OI03BenefitsAssignmentCertificationIndicator;
    this._2320OI06ReleaseOfInformationCode = _2320OI06ReleaseOfInformationCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2320OI03BenefitsAssignmentCertificationIndicator;
    case 1: return _2320OI06ReleaseOfInformationCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2320OI03BenefitsAssignmentCertificationIndicator = (java.lang.CharSequence)value$; break;
    case 1: _2320OI06ReleaseOfInformationCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2320OI03BenefitsAssignmentCertificationIndicator' field.
   */
  public java.lang.CharSequence get2320OI03BenefitsAssignmentCertificationIndicator$1() {
    return _2320OI03BenefitsAssignmentCertificationIndicator;
  }

  /**
   * Sets the value of the '_2320OI03BenefitsAssignmentCertificationIndicator' field.
   * @param value the value to set.
   */
  public void set2320OI03BenefitsAssignmentCertificationIndicator$1(java.lang.CharSequence value) {
    this._2320OI03BenefitsAssignmentCertificationIndicator = value;
  }

  /**
   * Gets the value of the '_2320OI06ReleaseOfInformationCode' field.
   */
  public java.lang.CharSequence get2320OI06ReleaseOfInformationCode$1() {
    return _2320OI06ReleaseOfInformationCode;
  }

  /**
   * Sets the value of the '_2320OI06ReleaseOfInformationCode' field.
   * @param value the value to set.
   */
  public void set2320OI06ReleaseOfInformationCode$1(java.lang.CharSequence value) {
    this._2320OI06ReleaseOfInformationCode = value;
  }

  /** Creates a new X837Ins_2320_OI_OtherInsuranceCoverageInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder();
  }
  
  /** Creates a new X837Ins_2320_OI_OtherInsuranceCoverageInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder(other);
  }
  
  /** Creates a new X837Ins_2320_OI_OtherInsuranceCoverageInformation RecordBuilder by copying an existing X837Ins_2320_OI_OtherInsuranceCoverageInformation instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2320_OI_OtherInsuranceCoverageInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2320_OI_OtherInsuranceCoverageInformation>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2320_OI_OtherInsuranceCoverageInformation> {

    private java.lang.CharSequence _2320OI03BenefitsAssignmentCertificationIndicator;
    private java.lang.CharSequence _2320OI06ReleaseOfInformationCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2320OI03BenefitsAssignmentCertificationIndicator)) {
        this._2320OI03BenefitsAssignmentCertificationIndicator = data().deepCopy(fields()[0].schema(), other._2320OI03BenefitsAssignmentCertificationIndicator);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2320OI06ReleaseOfInformationCode)) {
        this._2320OI06ReleaseOfInformationCode = data().deepCopy(fields()[1].schema(), other._2320OI06ReleaseOfInformationCode);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2320_OI_OtherInsuranceCoverageInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2320OI03BenefitsAssignmentCertificationIndicator)) {
        this._2320OI03BenefitsAssignmentCertificationIndicator = data().deepCopy(fields()[0].schema(), other._2320OI03BenefitsAssignmentCertificationIndicator);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2320OI06ReleaseOfInformationCode)) {
        this._2320OI06ReleaseOfInformationCode = data().deepCopy(fields()[1].schema(), other._2320OI06ReleaseOfInformationCode);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2320OI03BenefitsAssignmentCertificationIndicator' field */
    public java.lang.CharSequence get2320OI03BenefitsAssignmentCertificationIndicator$1() {
      return _2320OI03BenefitsAssignmentCertificationIndicator;
    }
    
    /** Sets the value of the '_2320OI03BenefitsAssignmentCertificationIndicator' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder set2320OI03BenefitsAssignmentCertificationIndicator$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2320OI03BenefitsAssignmentCertificationIndicator = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2320OI03BenefitsAssignmentCertificationIndicator' field has been set */
    public boolean has2320OI03BenefitsAssignmentCertificationIndicator$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2320OI03BenefitsAssignmentCertificationIndicator' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder clear2320OI03BenefitsAssignmentCertificationIndicator$1() {
      _2320OI03BenefitsAssignmentCertificationIndicator = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2320OI06ReleaseOfInformationCode' field */
    public java.lang.CharSequence get2320OI06ReleaseOfInformationCode$1() {
      return _2320OI06ReleaseOfInformationCode;
    }
    
    /** Sets the value of the '_2320OI06ReleaseOfInformationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder set2320OI06ReleaseOfInformationCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2320OI06ReleaseOfInformationCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2320OI06ReleaseOfInformationCode' field has been set */
    public boolean has2320OI06ReleaseOfInformationCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2320OI06ReleaseOfInformationCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_OI_OtherInsuranceCoverageInformation.Builder clear2320OI06ReleaseOfInformationCode$1() {
      _2320OI06ReleaseOfInformationCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2320_OI_OtherInsuranceCoverageInformation build() {
      try {
        X837Ins_2320_OI_OtherInsuranceCoverageInformation record = new X837Ins_2320_OI_OtherInsuranceCoverageInformation();
        record._2320OI03BenefitsAssignmentCertificationIndicator = fieldSetFlags()[0] ? this._2320OI03BenefitsAssignmentCertificationIndicator : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2320OI06ReleaseOfInformationCode = fieldSetFlags()[1] ? this._2320OI06ReleaseOfInformationCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}