/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010CA_DMG_PatientDemographicInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010CA_DMG_PatientDemographicInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010CADMG01DateTimePeriodFormatQualifier\",\"type\":\"string\"},{\"name\":\"_2010CADMG02PatientBirthDate\",\"type\":\"string\"},{\"name\":\"_2010CADMG03PatientGenderCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010CADMG01DateTimePeriodFormatQualifier;
  @Deprecated public java.lang.CharSequence _2010CADMG02PatientBirthDate;
  @Deprecated public java.lang.CharSequence _2010CADMG03PatientGenderCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2010CA_DMG_PatientDemographicInformation() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2010CA_DMG_PatientDemographicInformation(java.lang.CharSequence _2010CADMG01DateTimePeriodFormatQualifier, java.lang.CharSequence _2010CADMG02PatientBirthDate, java.lang.CharSequence _2010CADMG03PatientGenderCode) {
    this._2010CADMG01DateTimePeriodFormatQualifier = _2010CADMG01DateTimePeriodFormatQualifier;
    this._2010CADMG02PatientBirthDate = _2010CADMG02PatientBirthDate;
    this._2010CADMG03PatientGenderCode = _2010CADMG03PatientGenderCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010CADMG01DateTimePeriodFormatQualifier;
    case 1: return _2010CADMG02PatientBirthDate;
    case 2: return _2010CADMG03PatientGenderCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010CADMG01DateTimePeriodFormatQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2010CADMG02PatientBirthDate = (java.lang.CharSequence)value$; break;
    case 2: _2010CADMG03PatientGenderCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010CADMG01DateTimePeriodFormatQualifier' field.
   */
  public java.lang.CharSequence get2010CADMG01DateTimePeriodFormatQualifier$1() {
    return _2010CADMG01DateTimePeriodFormatQualifier;
  }

  /**
   * Sets the value of the '_2010CADMG01DateTimePeriodFormatQualifier' field.
   * @param value the value to set.
   */
  public void set2010CADMG01DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
    this._2010CADMG01DateTimePeriodFormatQualifier = value;
  }

  /**
   * Gets the value of the '_2010CADMG02PatientBirthDate' field.
   */
  public java.lang.CharSequence get2010CADMG02PatientBirthDate$1() {
    return _2010CADMG02PatientBirthDate;
  }

  /**
   * Sets the value of the '_2010CADMG02PatientBirthDate' field.
   * @param value the value to set.
   */
  public void set2010CADMG02PatientBirthDate$1(java.lang.CharSequence value) {
    this._2010CADMG02PatientBirthDate = value;
  }

  /**
   * Gets the value of the '_2010CADMG03PatientGenderCode' field.
   */
  public java.lang.CharSequence get2010CADMG03PatientGenderCode$1() {
    return _2010CADMG03PatientGenderCode;
  }

  /**
   * Sets the value of the '_2010CADMG03PatientGenderCode' field.
   * @param value the value to set.
   */
  public void set2010CADMG03PatientGenderCode$1(java.lang.CharSequence value) {
    this._2010CADMG03PatientGenderCode = value;
  }

  /** Creates a new X837Ins_2010CA_DMG_PatientDemographicInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder();
  }
  
  /** Creates a new X837Ins_2010CA_DMG_PatientDemographicInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder(other);
  }
  
  /** Creates a new X837Ins_2010CA_DMG_PatientDemographicInformation RecordBuilder by copying an existing X837Ins_2010CA_DMG_PatientDemographicInformation instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010CA_DMG_PatientDemographicInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010CA_DMG_PatientDemographicInformation>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010CA_DMG_PatientDemographicInformation> {

    private java.lang.CharSequence _2010CADMG01DateTimePeriodFormatQualifier;
    private java.lang.CharSequence _2010CADMG02PatientBirthDate;
    private java.lang.CharSequence _2010CADMG03PatientGenderCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010CADMG01DateTimePeriodFormatQualifier)) {
        this._2010CADMG01DateTimePeriodFormatQualifier = data().deepCopy(fields()[0].schema(), other._2010CADMG01DateTimePeriodFormatQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010CADMG02PatientBirthDate)) {
        this._2010CADMG02PatientBirthDate = data().deepCopy(fields()[1].schema(), other._2010CADMG02PatientBirthDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010CADMG03PatientGenderCode)) {
        this._2010CADMG03PatientGenderCode = data().deepCopy(fields()[2].schema(), other._2010CADMG03PatientGenderCode);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010CA_DMG_PatientDemographicInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2010CADMG01DateTimePeriodFormatQualifier)) {
        this._2010CADMG01DateTimePeriodFormatQualifier = data().deepCopy(fields()[0].schema(), other._2010CADMG01DateTimePeriodFormatQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010CADMG02PatientBirthDate)) {
        this._2010CADMG02PatientBirthDate = data().deepCopy(fields()[1].schema(), other._2010CADMG02PatientBirthDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010CADMG03PatientGenderCode)) {
        this._2010CADMG03PatientGenderCode = data().deepCopy(fields()[2].schema(), other._2010CADMG03PatientGenderCode);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2010CADMG01DateTimePeriodFormatQualifier' field */
    public java.lang.CharSequence get2010CADMG01DateTimePeriodFormatQualifier$1() {
      return _2010CADMG01DateTimePeriodFormatQualifier;
    }
    
    /** Sets the value of the '_2010CADMG01DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder set2010CADMG01DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010CADMG01DateTimePeriodFormatQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010CADMG01DateTimePeriodFormatQualifier' field has been set */
    public boolean has2010CADMG01DateTimePeriodFormatQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010CADMG01DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder clear2010CADMG01DateTimePeriodFormatQualifier$1() {
      _2010CADMG01DateTimePeriodFormatQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010CADMG02PatientBirthDate' field */
    public java.lang.CharSequence get2010CADMG02PatientBirthDate$1() {
      return _2010CADMG02PatientBirthDate;
    }
    
    /** Sets the value of the '_2010CADMG02PatientBirthDate' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder set2010CADMG02PatientBirthDate$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010CADMG02PatientBirthDate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010CADMG02PatientBirthDate' field has been set */
    public boolean has2010CADMG02PatientBirthDate$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010CADMG02PatientBirthDate' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder clear2010CADMG02PatientBirthDate$1() {
      _2010CADMG02PatientBirthDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010CADMG03PatientGenderCode' field */
    public java.lang.CharSequence get2010CADMG03PatientGenderCode$1() {
      return _2010CADMG03PatientGenderCode;
    }
    
    /** Sets the value of the '_2010CADMG03PatientGenderCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder set2010CADMG03PatientGenderCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010CADMG03PatientGenderCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010CADMG03PatientGenderCode' field has been set */
    public boolean has2010CADMG03PatientGenderCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010CADMG03PatientGenderCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010CA_DMG_PatientDemographicInformation.Builder clear2010CADMG03PatientGenderCode$1() {
      _2010CADMG03PatientGenderCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Ins_2010CA_DMG_PatientDemographicInformation build() {
      try {
        X837Ins_2010CA_DMG_PatientDemographicInformation record = new X837Ins_2010CA_DMG_PatientDemographicInformation();
        record._2010CADMG01DateTimePeriodFormatQualifier = fieldSetFlags()[0] ? this._2010CADMG01DateTimePeriodFormatQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010CADMG02PatientBirthDate = fieldSetFlags()[1] ? this._2010CADMG02PatientBirthDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010CADMG03PatientGenderCode = fieldSetFlags()[2] ? this._2010CADMG03PatientGenderCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
