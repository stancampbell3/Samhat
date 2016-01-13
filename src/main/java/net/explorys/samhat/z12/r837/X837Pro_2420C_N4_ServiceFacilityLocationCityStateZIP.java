/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2420CN401LaboratoryOrFacilityCityName\",\"type\":\"string\"},{\"name\":\"_2420CN402LaboratoryOrFacilityStateOrProvinceCode\",\"type\":\"string\"},{\"name\":\"_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode\",\"type\":\"string\"},{\"name\":\"_2420CN404CountryCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2420CN401LaboratoryOrFacilityCityName;
  @Deprecated public java.lang.CharSequence _2420CN402LaboratoryOrFacilityStateOrProvinceCode;
  @Deprecated public java.lang.CharSequence _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode;
  @Deprecated public java.lang.CharSequence _2420CN404CountryCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP(java.lang.CharSequence _2420CN401LaboratoryOrFacilityCityName, java.lang.CharSequence _2420CN402LaboratoryOrFacilityStateOrProvinceCode, java.lang.CharSequence _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode, java.lang.CharSequence _2420CN404CountryCode) {
    this._2420CN401LaboratoryOrFacilityCityName = _2420CN401LaboratoryOrFacilityCityName;
    this._2420CN402LaboratoryOrFacilityStateOrProvinceCode = _2420CN402LaboratoryOrFacilityStateOrProvinceCode;
    this._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode;
    this._2420CN404CountryCode = _2420CN404CountryCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2420CN401LaboratoryOrFacilityCityName;
    case 1: return _2420CN402LaboratoryOrFacilityStateOrProvinceCode;
    case 2: return _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode;
    case 3: return _2420CN404CountryCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2420CN401LaboratoryOrFacilityCityName = (java.lang.CharSequence)value$; break;
    case 1: _2420CN402LaboratoryOrFacilityStateOrProvinceCode = (java.lang.CharSequence)value$; break;
    case 2: _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = (java.lang.CharSequence)value$; break;
    case 3: _2420CN404CountryCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2420CN401LaboratoryOrFacilityCityName' field.
   */
  public java.lang.CharSequence get2420CN401LaboratoryOrFacilityCityName$1() {
    return _2420CN401LaboratoryOrFacilityCityName;
  }

  /**
   * Sets the value of the '_2420CN401LaboratoryOrFacilityCityName' field.
   * @param value the value to set.
   */
  public void set2420CN401LaboratoryOrFacilityCityName$1(java.lang.CharSequence value) {
    this._2420CN401LaboratoryOrFacilityCityName = value;
  }

  /**
   * Gets the value of the '_2420CN402LaboratoryOrFacilityStateOrProvinceCode' field.
   */
  public java.lang.CharSequence get2420CN402LaboratoryOrFacilityStateOrProvinceCode$1() {
    return _2420CN402LaboratoryOrFacilityStateOrProvinceCode;
  }

  /**
   * Sets the value of the '_2420CN402LaboratoryOrFacilityStateOrProvinceCode' field.
   * @param value the value to set.
   */
  public void set2420CN402LaboratoryOrFacilityStateOrProvinceCode$1(java.lang.CharSequence value) {
    this._2420CN402LaboratoryOrFacilityStateOrProvinceCode = value;
  }

  /**
   * Gets the value of the '_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode' field.
   */
  public java.lang.CharSequence get2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode$1() {
    return _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode;
  }

  /**
   * Sets the value of the '_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode' field.
   * @param value the value to set.
   */
  public void set2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode$1(java.lang.CharSequence value) {
    this._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = value;
  }

  /**
   * Gets the value of the '_2420CN404CountryCode' field.
   */
  public java.lang.CharSequence get2420CN404CountryCode$1() {
    return _2420CN404CountryCode;
  }

  /**
   * Sets the value of the '_2420CN404CountryCode' field.
   * @param value the value to set.
   */
  public void set2420CN404CountryCode$1(java.lang.CharSequence value) {
    this._2420CN404CountryCode = value;
  }

  /** Creates a new X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder();
  }
  
  /** Creates a new X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder(other);
  }
  
  /** Creates a new X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP RecordBuilder by copying an existing X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP> {

    private java.lang.CharSequence _2420CN401LaboratoryOrFacilityCityName;
    private java.lang.CharSequence _2420CN402LaboratoryOrFacilityStateOrProvinceCode;
    private java.lang.CharSequence _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode;
    private java.lang.CharSequence _2420CN404CountryCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2420CN401LaboratoryOrFacilityCityName)) {
        this._2420CN401LaboratoryOrFacilityCityName = data().deepCopy(fields()[0].schema(), other._2420CN401LaboratoryOrFacilityCityName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2420CN402LaboratoryOrFacilityStateOrProvinceCode)) {
        this._2420CN402LaboratoryOrFacilityStateOrProvinceCode = data().deepCopy(fields()[1].schema(), other._2420CN402LaboratoryOrFacilityStateOrProvinceCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode)) {
        this._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = data().deepCopy(fields()[2].schema(), other._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2420CN404CountryCode)) {
        this._2420CN404CountryCode = data().deepCopy(fields()[3].schema(), other._2420CN404CountryCode);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.SCHEMA$);
      if (isValidValue(fields()[0], other._2420CN401LaboratoryOrFacilityCityName)) {
        this._2420CN401LaboratoryOrFacilityCityName = data().deepCopy(fields()[0].schema(), other._2420CN401LaboratoryOrFacilityCityName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2420CN402LaboratoryOrFacilityStateOrProvinceCode)) {
        this._2420CN402LaboratoryOrFacilityStateOrProvinceCode = data().deepCopy(fields()[1].schema(), other._2420CN402LaboratoryOrFacilityStateOrProvinceCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode)) {
        this._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = data().deepCopy(fields()[2].schema(), other._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2420CN404CountryCode)) {
        this._2420CN404CountryCode = data().deepCopy(fields()[3].schema(), other._2420CN404CountryCode);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2420CN401LaboratoryOrFacilityCityName' field */
    public java.lang.CharSequence get2420CN401LaboratoryOrFacilityCityName$1() {
      return _2420CN401LaboratoryOrFacilityCityName;
    }
    
    /** Sets the value of the '_2420CN401LaboratoryOrFacilityCityName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder set2420CN401LaboratoryOrFacilityCityName$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2420CN401LaboratoryOrFacilityCityName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2420CN401LaboratoryOrFacilityCityName' field has been set */
    public boolean has2420CN401LaboratoryOrFacilityCityName$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2420CN401LaboratoryOrFacilityCityName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder clear2420CN401LaboratoryOrFacilityCityName$1() {
      _2420CN401LaboratoryOrFacilityCityName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2420CN402LaboratoryOrFacilityStateOrProvinceCode' field */
    public java.lang.CharSequence get2420CN402LaboratoryOrFacilityStateOrProvinceCode$1() {
      return _2420CN402LaboratoryOrFacilityStateOrProvinceCode;
    }
    
    /** Sets the value of the '_2420CN402LaboratoryOrFacilityStateOrProvinceCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder set2420CN402LaboratoryOrFacilityStateOrProvinceCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2420CN402LaboratoryOrFacilityStateOrProvinceCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2420CN402LaboratoryOrFacilityStateOrProvinceCode' field has been set */
    public boolean has2420CN402LaboratoryOrFacilityStateOrProvinceCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2420CN402LaboratoryOrFacilityStateOrProvinceCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder clear2420CN402LaboratoryOrFacilityStateOrProvinceCode$1() {
      _2420CN402LaboratoryOrFacilityStateOrProvinceCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode' field */
    public java.lang.CharSequence get2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode$1() {
      return _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode;
    }
    
    /** Sets the value of the '_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder set2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode' field has been set */
    public boolean has2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder clear2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode$1() {
      _2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2420CN404CountryCode' field */
    public java.lang.CharSequence get2420CN404CountryCode$1() {
      return _2420CN404CountryCode;
    }
    
    /** Sets the value of the '_2420CN404CountryCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder set2420CN404CountryCode$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2420CN404CountryCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2420CN404CountryCode' field has been set */
    public boolean has2420CN404CountryCode$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2420CN404CountryCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP.Builder clear2420CN404CountryCode$1() {
      _2420CN404CountryCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP build() {
      try {
        X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP record = new X837Pro_2420C_N4_ServiceFacilityLocationCityStateZIP();
        record._2420CN401LaboratoryOrFacilityCityName = fieldSetFlags()[0] ? this._2420CN401LaboratoryOrFacilityCityName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2420CN402LaboratoryOrFacilityStateOrProvinceCode = fieldSetFlags()[1] ? this._2420CN402LaboratoryOrFacilityStateOrProvinceCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode = fieldSetFlags()[2] ? this._2420CN403LaboratoryOrFacilityPostalZoneOrZIPCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2420CN404CountryCode = fieldSetFlags()[3] ? this._2420CN404CountryCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
