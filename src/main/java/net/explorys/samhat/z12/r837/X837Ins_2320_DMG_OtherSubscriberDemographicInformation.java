/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2320_DMG_OtherSubscriberDemographicInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2320_DMG_OtherSubscriberDemographicInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2320DMG01DateTimePeriodFormatQualifier\",\"type\":\"string\"},{\"name\":\"_2320DMG02OtherInsuredBirthDate\",\"type\":\"string\"},{\"name\":\"_2320DMG03OtherInsuredGenderCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2320DMG01DateTimePeriodFormatQualifier;
  @Deprecated public java.lang.CharSequence _2320DMG02OtherInsuredBirthDate;
  @Deprecated public java.lang.CharSequence _2320DMG03OtherInsuredGenderCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2320_DMG_OtherSubscriberDemographicInformation() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2320_DMG_OtherSubscriberDemographicInformation(java.lang.CharSequence _2320DMG01DateTimePeriodFormatQualifier, java.lang.CharSequence _2320DMG02OtherInsuredBirthDate, java.lang.CharSequence _2320DMG03OtherInsuredGenderCode) {
    this._2320DMG01DateTimePeriodFormatQualifier = _2320DMG01DateTimePeriodFormatQualifier;
    this._2320DMG02OtherInsuredBirthDate = _2320DMG02OtherInsuredBirthDate;
    this._2320DMG03OtherInsuredGenderCode = _2320DMG03OtherInsuredGenderCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2320DMG01DateTimePeriodFormatQualifier;
    case 1: return _2320DMG02OtherInsuredBirthDate;
    case 2: return _2320DMG03OtherInsuredGenderCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2320DMG01DateTimePeriodFormatQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2320DMG02OtherInsuredBirthDate = (java.lang.CharSequence)value$; break;
    case 2: _2320DMG03OtherInsuredGenderCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2320DMG01DateTimePeriodFormatQualifier' field.
   */
  public java.lang.CharSequence get2320DMG01DateTimePeriodFormatQualifier$1() {
    return _2320DMG01DateTimePeriodFormatQualifier;
  }

  /**
   * Sets the value of the '_2320DMG01DateTimePeriodFormatQualifier' field.
   * @param value the value to set.
   */
  public void set2320DMG01DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
    this._2320DMG01DateTimePeriodFormatQualifier = value;
  }

  /**
   * Gets the value of the '_2320DMG02OtherInsuredBirthDate' field.
   */
  public java.lang.CharSequence get2320DMG02OtherInsuredBirthDate$1() {
    return _2320DMG02OtherInsuredBirthDate;
  }

  /**
   * Sets the value of the '_2320DMG02OtherInsuredBirthDate' field.
   * @param value the value to set.
   */
  public void set2320DMG02OtherInsuredBirthDate$1(java.lang.CharSequence value) {
    this._2320DMG02OtherInsuredBirthDate = value;
  }

  /**
   * Gets the value of the '_2320DMG03OtherInsuredGenderCode' field.
   */
  public java.lang.CharSequence get2320DMG03OtherInsuredGenderCode$1() {
    return _2320DMG03OtherInsuredGenderCode;
  }

  /**
   * Sets the value of the '_2320DMG03OtherInsuredGenderCode' field.
   * @param value the value to set.
   */
  public void set2320DMG03OtherInsuredGenderCode$1(java.lang.CharSequence value) {
    this._2320DMG03OtherInsuredGenderCode = value;
  }

  /** Creates a new X837Ins_2320_DMG_OtherSubscriberDemographicInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder();
  }
  
  /** Creates a new X837Ins_2320_DMG_OtherSubscriberDemographicInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder(other);
  }
  
  /** Creates a new X837Ins_2320_DMG_OtherSubscriberDemographicInformation RecordBuilder by copying an existing X837Ins_2320_DMG_OtherSubscriberDemographicInformation instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2320_DMG_OtherSubscriberDemographicInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2320_DMG_OtherSubscriberDemographicInformation>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2320_DMG_OtherSubscriberDemographicInformation> {

    private java.lang.CharSequence _2320DMG01DateTimePeriodFormatQualifier;
    private java.lang.CharSequence _2320DMG02OtherInsuredBirthDate;
    private java.lang.CharSequence _2320DMG03OtherInsuredGenderCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2320DMG01DateTimePeriodFormatQualifier)) {
        this._2320DMG01DateTimePeriodFormatQualifier = data().deepCopy(fields()[0].schema(), other._2320DMG01DateTimePeriodFormatQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2320DMG02OtherInsuredBirthDate)) {
        this._2320DMG02OtherInsuredBirthDate = data().deepCopy(fields()[1].schema(), other._2320DMG02OtherInsuredBirthDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2320DMG03OtherInsuredGenderCode)) {
        this._2320DMG03OtherInsuredGenderCode = data().deepCopy(fields()[2].schema(), other._2320DMG03OtherInsuredGenderCode);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2320_DMG_OtherSubscriberDemographicInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2320DMG01DateTimePeriodFormatQualifier)) {
        this._2320DMG01DateTimePeriodFormatQualifier = data().deepCopy(fields()[0].schema(), other._2320DMG01DateTimePeriodFormatQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2320DMG02OtherInsuredBirthDate)) {
        this._2320DMG02OtherInsuredBirthDate = data().deepCopy(fields()[1].schema(), other._2320DMG02OtherInsuredBirthDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2320DMG03OtherInsuredGenderCode)) {
        this._2320DMG03OtherInsuredGenderCode = data().deepCopy(fields()[2].schema(), other._2320DMG03OtherInsuredGenderCode);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2320DMG01DateTimePeriodFormatQualifier' field */
    public java.lang.CharSequence get2320DMG01DateTimePeriodFormatQualifier$1() {
      return _2320DMG01DateTimePeriodFormatQualifier;
    }
    
    /** Sets the value of the '_2320DMG01DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder set2320DMG01DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2320DMG01DateTimePeriodFormatQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2320DMG01DateTimePeriodFormatQualifier' field has been set */
    public boolean has2320DMG01DateTimePeriodFormatQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2320DMG01DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder clear2320DMG01DateTimePeriodFormatQualifier$1() {
      _2320DMG01DateTimePeriodFormatQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2320DMG02OtherInsuredBirthDate' field */
    public java.lang.CharSequence get2320DMG02OtherInsuredBirthDate$1() {
      return _2320DMG02OtherInsuredBirthDate;
    }
    
    /** Sets the value of the '_2320DMG02OtherInsuredBirthDate' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder set2320DMG02OtherInsuredBirthDate$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2320DMG02OtherInsuredBirthDate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2320DMG02OtherInsuredBirthDate' field has been set */
    public boolean has2320DMG02OtherInsuredBirthDate$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2320DMG02OtherInsuredBirthDate' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder clear2320DMG02OtherInsuredBirthDate$1() {
      _2320DMG02OtherInsuredBirthDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2320DMG03OtherInsuredGenderCode' field */
    public java.lang.CharSequence get2320DMG03OtherInsuredGenderCode$1() {
      return _2320DMG03OtherInsuredGenderCode;
    }
    
    /** Sets the value of the '_2320DMG03OtherInsuredGenderCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder set2320DMG03OtherInsuredGenderCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2320DMG03OtherInsuredGenderCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2320DMG03OtherInsuredGenderCode' field has been set */
    public boolean has2320DMG03OtherInsuredGenderCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2320DMG03OtherInsuredGenderCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_DMG_OtherSubscriberDemographicInformation.Builder clear2320DMG03OtherInsuredGenderCode$1() {
      _2320DMG03OtherInsuredGenderCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Ins_2320_DMG_OtherSubscriberDemographicInformation build() {
      try {
        X837Ins_2320_DMG_OtherSubscriberDemographicInformation record = new X837Ins_2320_DMG_OtherSubscriberDemographicInformation();
        record._2320DMG01DateTimePeriodFormatQualifier = fieldSetFlags()[0] ? this._2320DMG01DateTimePeriodFormatQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2320DMG02OtherInsuredBirthDate = fieldSetFlags()[1] ? this._2320DMG02OtherInsuredBirthDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2320DMG03OtherInsuredGenderCode = fieldSetFlags()[2] ? this._2320DMG03OtherInsuredGenderCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
