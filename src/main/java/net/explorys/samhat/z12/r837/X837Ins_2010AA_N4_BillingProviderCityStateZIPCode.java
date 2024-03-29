/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010AA_N4_BillingProviderCityStateZIPCode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010AA_N4_BillingProviderCityStateZIPCode\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010AAN401BillingProviderCityName\",\"type\":\"string\"},{\"name\":\"_2010AAN402BillingProviderStateOrProvinceCode\",\"type\":\"string\"},{\"name\":\"_2010AAN403BillingProviderPostalZoneOrZIPCode\",\"type\":\"string\"},{\"name\":\"_2010AAN404CountryCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010AAN401BillingProviderCityName;
  @Deprecated public java.lang.CharSequence _2010AAN402BillingProviderStateOrProvinceCode;
  @Deprecated public java.lang.CharSequence _2010AAN403BillingProviderPostalZoneOrZIPCode;
  @Deprecated public java.lang.CharSequence _2010AAN404CountryCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2010AA_N4_BillingProviderCityStateZIPCode() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2010AA_N4_BillingProviderCityStateZIPCode(java.lang.CharSequence _2010AAN401BillingProviderCityName, java.lang.CharSequence _2010AAN402BillingProviderStateOrProvinceCode, java.lang.CharSequence _2010AAN403BillingProviderPostalZoneOrZIPCode, java.lang.CharSequence _2010AAN404CountryCode) {
    this._2010AAN401BillingProviderCityName = _2010AAN401BillingProviderCityName;
    this._2010AAN402BillingProviderStateOrProvinceCode = _2010AAN402BillingProviderStateOrProvinceCode;
    this._2010AAN403BillingProviderPostalZoneOrZIPCode = _2010AAN403BillingProviderPostalZoneOrZIPCode;
    this._2010AAN404CountryCode = _2010AAN404CountryCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010AAN401BillingProviderCityName;
    case 1: return _2010AAN402BillingProviderStateOrProvinceCode;
    case 2: return _2010AAN403BillingProviderPostalZoneOrZIPCode;
    case 3: return _2010AAN404CountryCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010AAN401BillingProviderCityName = (java.lang.CharSequence)value$; break;
    case 1: _2010AAN402BillingProviderStateOrProvinceCode = (java.lang.CharSequence)value$; break;
    case 2: _2010AAN403BillingProviderPostalZoneOrZIPCode = (java.lang.CharSequence)value$; break;
    case 3: _2010AAN404CountryCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010AAN401BillingProviderCityName' field.
   */
  public java.lang.CharSequence get2010AAN401BillingProviderCityName$1() {
    return _2010AAN401BillingProviderCityName;
  }

  /**
   * Sets the value of the '_2010AAN401BillingProviderCityName' field.
   * @param value the value to set.
   */
  public void set2010AAN401BillingProviderCityName$1(java.lang.CharSequence value) {
    this._2010AAN401BillingProviderCityName = value;
  }

  /**
   * Gets the value of the '_2010AAN402BillingProviderStateOrProvinceCode' field.
   */
  public java.lang.CharSequence get2010AAN402BillingProviderStateOrProvinceCode$1() {
    return _2010AAN402BillingProviderStateOrProvinceCode;
  }

  /**
   * Sets the value of the '_2010AAN402BillingProviderStateOrProvinceCode' field.
   * @param value the value to set.
   */
  public void set2010AAN402BillingProviderStateOrProvinceCode$1(java.lang.CharSequence value) {
    this._2010AAN402BillingProviderStateOrProvinceCode = value;
  }

  /**
   * Gets the value of the '_2010AAN403BillingProviderPostalZoneOrZIPCode' field.
   */
  public java.lang.CharSequence get2010AAN403BillingProviderPostalZoneOrZIPCode$1() {
    return _2010AAN403BillingProviderPostalZoneOrZIPCode;
  }

  /**
   * Sets the value of the '_2010AAN403BillingProviderPostalZoneOrZIPCode' field.
   * @param value the value to set.
   */
  public void set2010AAN403BillingProviderPostalZoneOrZIPCode$1(java.lang.CharSequence value) {
    this._2010AAN403BillingProviderPostalZoneOrZIPCode = value;
  }

  /**
   * Gets the value of the '_2010AAN404CountryCode' field.
   */
  public java.lang.CharSequence get2010AAN404CountryCode$1() {
    return _2010AAN404CountryCode;
  }

  /**
   * Sets the value of the '_2010AAN404CountryCode' field.
   * @param value the value to set.
   */
  public void set2010AAN404CountryCode$1(java.lang.CharSequence value) {
    this._2010AAN404CountryCode = value;
  }

  /** Creates a new X837Ins_2010AA_N4_BillingProviderCityStateZIPCode RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder();
  }
  
  /** Creates a new X837Ins_2010AA_N4_BillingProviderCityStateZIPCode RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder(other);
  }
  
  /** Creates a new X837Ins_2010AA_N4_BillingProviderCityStateZIPCode RecordBuilder by copying an existing X837Ins_2010AA_N4_BillingProviderCityStateZIPCode instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010AA_N4_BillingProviderCityStateZIPCode instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010AA_N4_BillingProviderCityStateZIPCode>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010AA_N4_BillingProviderCityStateZIPCode> {

    private java.lang.CharSequence _2010AAN401BillingProviderCityName;
    private java.lang.CharSequence _2010AAN402BillingProviderStateOrProvinceCode;
    private java.lang.CharSequence _2010AAN403BillingProviderPostalZoneOrZIPCode;
    private java.lang.CharSequence _2010AAN404CountryCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010AAN401BillingProviderCityName)) {
        this._2010AAN401BillingProviderCityName = data().deepCopy(fields()[0].schema(), other._2010AAN401BillingProviderCityName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010AAN402BillingProviderStateOrProvinceCode)) {
        this._2010AAN402BillingProviderStateOrProvinceCode = data().deepCopy(fields()[1].schema(), other._2010AAN402BillingProviderStateOrProvinceCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010AAN403BillingProviderPostalZoneOrZIPCode)) {
        this._2010AAN403BillingProviderPostalZoneOrZIPCode = data().deepCopy(fields()[2].schema(), other._2010AAN403BillingProviderPostalZoneOrZIPCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010AAN404CountryCode)) {
        this._2010AAN404CountryCode = data().deepCopy(fields()[3].schema(), other._2010AAN404CountryCode);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010AA_N4_BillingProviderCityStateZIPCode instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.SCHEMA$);
      if (isValidValue(fields()[0], other._2010AAN401BillingProviderCityName)) {
        this._2010AAN401BillingProviderCityName = data().deepCopy(fields()[0].schema(), other._2010AAN401BillingProviderCityName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010AAN402BillingProviderStateOrProvinceCode)) {
        this._2010AAN402BillingProviderStateOrProvinceCode = data().deepCopy(fields()[1].schema(), other._2010AAN402BillingProviderStateOrProvinceCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010AAN403BillingProviderPostalZoneOrZIPCode)) {
        this._2010AAN403BillingProviderPostalZoneOrZIPCode = data().deepCopy(fields()[2].schema(), other._2010AAN403BillingProviderPostalZoneOrZIPCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010AAN404CountryCode)) {
        this._2010AAN404CountryCode = data().deepCopy(fields()[3].schema(), other._2010AAN404CountryCode);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2010AAN401BillingProviderCityName' field */
    public java.lang.CharSequence get2010AAN401BillingProviderCityName$1() {
      return _2010AAN401BillingProviderCityName;
    }
    
    /** Sets the value of the '_2010AAN401BillingProviderCityName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder set2010AAN401BillingProviderCityName$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010AAN401BillingProviderCityName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AAN401BillingProviderCityName' field has been set */
    public boolean has2010AAN401BillingProviderCityName$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010AAN401BillingProviderCityName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder clear2010AAN401BillingProviderCityName$1() {
      _2010AAN401BillingProviderCityName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010AAN402BillingProviderStateOrProvinceCode' field */
    public java.lang.CharSequence get2010AAN402BillingProviderStateOrProvinceCode$1() {
      return _2010AAN402BillingProviderStateOrProvinceCode;
    }
    
    /** Sets the value of the '_2010AAN402BillingProviderStateOrProvinceCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder set2010AAN402BillingProviderStateOrProvinceCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010AAN402BillingProviderStateOrProvinceCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AAN402BillingProviderStateOrProvinceCode' field has been set */
    public boolean has2010AAN402BillingProviderStateOrProvinceCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010AAN402BillingProviderStateOrProvinceCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder clear2010AAN402BillingProviderStateOrProvinceCode$1() {
      _2010AAN402BillingProviderStateOrProvinceCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010AAN403BillingProviderPostalZoneOrZIPCode' field */
    public java.lang.CharSequence get2010AAN403BillingProviderPostalZoneOrZIPCode$1() {
      return _2010AAN403BillingProviderPostalZoneOrZIPCode;
    }
    
    /** Sets the value of the '_2010AAN403BillingProviderPostalZoneOrZIPCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder set2010AAN403BillingProviderPostalZoneOrZIPCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010AAN403BillingProviderPostalZoneOrZIPCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AAN403BillingProviderPostalZoneOrZIPCode' field has been set */
    public boolean has2010AAN403BillingProviderPostalZoneOrZIPCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010AAN403BillingProviderPostalZoneOrZIPCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder clear2010AAN403BillingProviderPostalZoneOrZIPCode$1() {
      _2010AAN403BillingProviderPostalZoneOrZIPCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2010AAN404CountryCode' field */
    public java.lang.CharSequence get2010AAN404CountryCode$1() {
      return _2010AAN404CountryCode;
    }
    
    /** Sets the value of the '_2010AAN404CountryCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder set2010AAN404CountryCode$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2010AAN404CountryCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AAN404CountryCode' field has been set */
    public boolean has2010AAN404CountryCode$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2010AAN404CountryCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N4_BillingProviderCityStateZIPCode.Builder clear2010AAN404CountryCode$1() {
      _2010AAN404CountryCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Ins_2010AA_N4_BillingProviderCityStateZIPCode build() {
      try {
        X837Ins_2010AA_N4_BillingProviderCityStateZIPCode record = new X837Ins_2010AA_N4_BillingProviderCityStateZIPCode();
        record._2010AAN401BillingProviderCityName = fieldSetFlags()[0] ? this._2010AAN401BillingProviderCityName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010AAN402BillingProviderStateOrProvinceCode = fieldSetFlags()[1] ? this._2010AAN402BillingProviderStateOrProvinceCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010AAN403BillingProviderPostalZoneOrZIPCode = fieldSetFlags()[2] ? this._2010AAN403BillingProviderPostalZoneOrZIPCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2010AAN404CountryCode = fieldSetFlags()[3] ? this._2010AAN404CountryCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
