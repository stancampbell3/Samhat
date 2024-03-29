/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2010BA_DMG_SubscriberDemographicInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2010BA_DMG_SubscriberDemographicInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010BADMG01DateTimePeriodFormatQualifier\",\"type\":\"string\"},{\"name\":\"_2010BADMG02SubscriberBirthDate\",\"type\":\"string\"},{\"name\":\"_2010BADMG03SubscriberGenderCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010BADMG01DateTimePeriodFormatQualifier;
  @Deprecated public java.lang.CharSequence _2010BADMG02SubscriberBirthDate;
  @Deprecated public java.lang.CharSequence _2010BADMG03SubscriberGenderCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2010BA_DMG_SubscriberDemographicInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2010BA_DMG_SubscriberDemographicInformation(java.lang.CharSequence _2010BADMG01DateTimePeriodFormatQualifier, java.lang.CharSequence _2010BADMG02SubscriberBirthDate, java.lang.CharSequence _2010BADMG03SubscriberGenderCode) {
    this._2010BADMG01DateTimePeriodFormatQualifier = _2010BADMG01DateTimePeriodFormatQualifier;
    this._2010BADMG02SubscriberBirthDate = _2010BADMG02SubscriberBirthDate;
    this._2010BADMG03SubscriberGenderCode = _2010BADMG03SubscriberGenderCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010BADMG01DateTimePeriodFormatQualifier;
    case 1: return _2010BADMG02SubscriberBirthDate;
    case 2: return _2010BADMG03SubscriberGenderCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010BADMG01DateTimePeriodFormatQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2010BADMG02SubscriberBirthDate = (java.lang.CharSequence)value$; break;
    case 2: _2010BADMG03SubscriberGenderCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010BADMG01DateTimePeriodFormatQualifier' field.
   */
  public java.lang.CharSequence get2010BADMG01DateTimePeriodFormatQualifier$1() {
    return _2010BADMG01DateTimePeriodFormatQualifier;
  }

  /**
   * Sets the value of the '_2010BADMG01DateTimePeriodFormatQualifier' field.
   * @param value the value to set.
   */
  public void set2010BADMG01DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
    this._2010BADMG01DateTimePeriodFormatQualifier = value;
  }

  /**
   * Gets the value of the '_2010BADMG02SubscriberBirthDate' field.
   */
  public java.lang.CharSequence get2010BADMG02SubscriberBirthDate$1() {
    return _2010BADMG02SubscriberBirthDate;
  }

  /**
   * Sets the value of the '_2010BADMG02SubscriberBirthDate' field.
   * @param value the value to set.
   */
  public void set2010BADMG02SubscriberBirthDate$1(java.lang.CharSequence value) {
    this._2010BADMG02SubscriberBirthDate = value;
  }

  /**
   * Gets the value of the '_2010BADMG03SubscriberGenderCode' field.
   */
  public java.lang.CharSequence get2010BADMG03SubscriberGenderCode$1() {
    return _2010BADMG03SubscriberGenderCode;
  }

  /**
   * Sets the value of the '_2010BADMG03SubscriberGenderCode' field.
   * @param value the value to set.
   */
  public void set2010BADMG03SubscriberGenderCode$1(java.lang.CharSequence value) {
    this._2010BADMG03SubscriberGenderCode = value;
  }

  /** Creates a new X837Pro_2010BA_DMG_SubscriberDemographicInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder();
  }
  
  /** Creates a new X837Pro_2010BA_DMG_SubscriberDemographicInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2010BA_DMG_SubscriberDemographicInformation RecordBuilder by copying an existing X837Pro_2010BA_DMG_SubscriberDemographicInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2010BA_DMG_SubscriberDemographicInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2010BA_DMG_SubscriberDemographicInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2010BA_DMG_SubscriberDemographicInformation> {

    private java.lang.CharSequence _2010BADMG01DateTimePeriodFormatQualifier;
    private java.lang.CharSequence _2010BADMG02SubscriberBirthDate;
    private java.lang.CharSequence _2010BADMG03SubscriberGenderCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010BADMG01DateTimePeriodFormatQualifier)) {
        this._2010BADMG01DateTimePeriodFormatQualifier = data().deepCopy(fields()[0].schema(), other._2010BADMG01DateTimePeriodFormatQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010BADMG02SubscriberBirthDate)) {
        this._2010BADMG02SubscriberBirthDate = data().deepCopy(fields()[1].schema(), other._2010BADMG02SubscriberBirthDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010BADMG03SubscriberGenderCode)) {
        this._2010BADMG03SubscriberGenderCode = data().deepCopy(fields()[2].schema(), other._2010BADMG03SubscriberGenderCode);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2010BA_DMG_SubscriberDemographicInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2010BADMG01DateTimePeriodFormatQualifier)) {
        this._2010BADMG01DateTimePeriodFormatQualifier = data().deepCopy(fields()[0].schema(), other._2010BADMG01DateTimePeriodFormatQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010BADMG02SubscriberBirthDate)) {
        this._2010BADMG02SubscriberBirthDate = data().deepCopy(fields()[1].schema(), other._2010BADMG02SubscriberBirthDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010BADMG03SubscriberGenderCode)) {
        this._2010BADMG03SubscriberGenderCode = data().deepCopy(fields()[2].schema(), other._2010BADMG03SubscriberGenderCode);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2010BADMG01DateTimePeriodFormatQualifier' field */
    public java.lang.CharSequence get2010BADMG01DateTimePeriodFormatQualifier$1() {
      return _2010BADMG01DateTimePeriodFormatQualifier;
    }
    
    /** Sets the value of the '_2010BADMG01DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder set2010BADMG01DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010BADMG01DateTimePeriodFormatQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BADMG01DateTimePeriodFormatQualifier' field has been set */
    public boolean has2010BADMG01DateTimePeriodFormatQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010BADMG01DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder clear2010BADMG01DateTimePeriodFormatQualifier$1() {
      _2010BADMG01DateTimePeriodFormatQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010BADMG02SubscriberBirthDate' field */
    public java.lang.CharSequence get2010BADMG02SubscriberBirthDate$1() {
      return _2010BADMG02SubscriberBirthDate;
    }
    
    /** Sets the value of the '_2010BADMG02SubscriberBirthDate' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder set2010BADMG02SubscriberBirthDate$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010BADMG02SubscriberBirthDate = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BADMG02SubscriberBirthDate' field has been set */
    public boolean has2010BADMG02SubscriberBirthDate$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010BADMG02SubscriberBirthDate' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder clear2010BADMG02SubscriberBirthDate$1() {
      _2010BADMG02SubscriberBirthDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010BADMG03SubscriberGenderCode' field */
    public java.lang.CharSequence get2010BADMG03SubscriberGenderCode$1() {
      return _2010BADMG03SubscriberGenderCode;
    }
    
    /** Sets the value of the '_2010BADMG03SubscriberGenderCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder set2010BADMG03SubscriberGenderCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010BADMG03SubscriberGenderCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010BADMG03SubscriberGenderCode' field has been set */
    public boolean has2010BADMG03SubscriberGenderCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010BADMG03SubscriberGenderCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2010BA_DMG_SubscriberDemographicInformation.Builder clear2010BADMG03SubscriberGenderCode$1() {
      _2010BADMG03SubscriberGenderCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Pro_2010BA_DMG_SubscriberDemographicInformation build() {
      try {
        X837Pro_2010BA_DMG_SubscriberDemographicInformation record = new X837Pro_2010BA_DMG_SubscriberDemographicInformation();
        record._2010BADMG01DateTimePeriodFormatQualifier = fieldSetFlags()[0] ? this._2010BADMG01DateTimePeriodFormatQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010BADMG02SubscriberBirthDate = fieldSetFlags()[1] ? this._2010BADMG02SubscriberBirthDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010BADMG03SubscriberGenderCode = fieldSetFlags()[2] ? this._2010BADMG03SubscriberGenderCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
