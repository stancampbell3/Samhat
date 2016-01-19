/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010AB_N4_PayToProviderCityStateZIPCode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010AB_N4_PayToProviderCityStateZIPCode\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010ABN401PayToProviderCityName\",\"type\":\"string\"},{\"name\":\"_2010ABN402PayToProviderStateCode\",\"type\":\"string\"},{\"name\":\"_2010ABN403PayToProviderPostalZoneOrZIPCode\",\"type\":\"string\"},{\"name\":\"_2010ABN404CountryCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010ABN401PayToProviderCityName;
  @Deprecated public java.lang.CharSequence _2010ABN402PayToProviderStateCode;
  @Deprecated public java.lang.CharSequence _2010ABN403PayToProviderPostalZoneOrZIPCode;
  @Deprecated public java.lang.CharSequence _2010ABN404CountryCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2010AB_N4_PayToProviderCityStateZIPCode() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2010AB_N4_PayToProviderCityStateZIPCode(java.lang.CharSequence _2010ABN401PayToProviderCityName, java.lang.CharSequence _2010ABN402PayToProviderStateCode, java.lang.CharSequence _2010ABN403PayToProviderPostalZoneOrZIPCode, java.lang.CharSequence _2010ABN404CountryCode) {
    this._2010ABN401PayToProviderCityName = _2010ABN401PayToProviderCityName;
    this._2010ABN402PayToProviderStateCode = _2010ABN402PayToProviderStateCode;
    this._2010ABN403PayToProviderPostalZoneOrZIPCode = _2010ABN403PayToProviderPostalZoneOrZIPCode;
    this._2010ABN404CountryCode = _2010ABN404CountryCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010ABN401PayToProviderCityName;
    case 1: return _2010ABN402PayToProviderStateCode;
    case 2: return _2010ABN403PayToProviderPostalZoneOrZIPCode;
    case 3: return _2010ABN404CountryCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010ABN401PayToProviderCityName = (java.lang.CharSequence)value$; break;
    case 1: _2010ABN402PayToProviderStateCode = (java.lang.CharSequence)value$; break;
    case 2: _2010ABN403PayToProviderPostalZoneOrZIPCode = (java.lang.CharSequence)value$; break;
    case 3: _2010ABN404CountryCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010ABN401PayToProviderCityName' field.
   */
  public java.lang.CharSequence get2010ABN401PayToProviderCityName$1() {
    return _2010ABN401PayToProviderCityName;
  }

  /**
   * Sets the value of the '_2010ABN401PayToProviderCityName' field.
   * @param value the value to set.
   */
  public void set2010ABN401PayToProviderCityName$1(java.lang.CharSequence value) {
    this._2010ABN401PayToProviderCityName = value;
  }

  /**
   * Gets the value of the '_2010ABN402PayToProviderStateCode' field.
   */
  public java.lang.CharSequence get2010ABN402PayToProviderStateCode$1() {
    return _2010ABN402PayToProviderStateCode;
  }

  /**
   * Sets the value of the '_2010ABN402PayToProviderStateCode' field.
   * @param value the value to set.
   */
  public void set2010ABN402PayToProviderStateCode$1(java.lang.CharSequence value) {
    this._2010ABN402PayToProviderStateCode = value;
  }

  /**
   * Gets the value of the '_2010ABN403PayToProviderPostalZoneOrZIPCode' field.
   */
  public java.lang.CharSequence get2010ABN403PayToProviderPostalZoneOrZIPCode$1() {
    return _2010ABN403PayToProviderPostalZoneOrZIPCode;
  }

  /**
   * Sets the value of the '_2010ABN403PayToProviderPostalZoneOrZIPCode' field.
   * @param value the value to set.
   */
  public void set2010ABN403PayToProviderPostalZoneOrZIPCode$1(java.lang.CharSequence value) {
    this._2010ABN403PayToProviderPostalZoneOrZIPCode = value;
  }

  /**
   * Gets the value of the '_2010ABN404CountryCode' field.
   */
  public java.lang.CharSequence get2010ABN404CountryCode$1() {
    return _2010ABN404CountryCode;
  }

  /**
   * Sets the value of the '_2010ABN404CountryCode' field.
   * @param value the value to set.
   */
  public void set2010ABN404CountryCode$1(java.lang.CharSequence value) {
    this._2010ABN404CountryCode = value;
  }

  /** Creates a new X837Ins_2010AB_N4_PayToProviderCityStateZIPCode RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder();
  }
  
  /** Creates a new X837Ins_2010AB_N4_PayToProviderCityStateZIPCode RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder(other);
  }
  
  /** Creates a new X837Ins_2010AB_N4_PayToProviderCityStateZIPCode RecordBuilder by copying an existing X837Ins_2010AB_N4_PayToProviderCityStateZIPCode instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010AB_N4_PayToProviderCityStateZIPCode instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010AB_N4_PayToProviderCityStateZIPCode>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010AB_N4_PayToProviderCityStateZIPCode> {

    private java.lang.CharSequence _2010ABN401PayToProviderCityName;
    private java.lang.CharSequence _2010ABN402PayToProviderStateCode;
    private java.lang.CharSequence _2010ABN403PayToProviderPostalZoneOrZIPCode;
    private java.lang.CharSequence _2010ABN404CountryCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010ABN401PayToProviderCityName)) {
        this._2010ABN401PayToProviderCityName = data().deepCopy(fields()[0].schema(), other._2010ABN401PayToProviderCityName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010ABN402PayToProviderStateCode)) {
        this._2010ABN402PayToProviderStateCode = data().deepCopy(fields()[1].schema(), other._2010ABN402PayToProviderStateCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010ABN403PayToProviderPostalZoneOrZIPCode)) {
        this._2010ABN403PayToProviderPostalZoneOrZIPCode = data().deepCopy(fields()[2].schema(), other._2010ABN403PayToProviderPostalZoneOrZIPCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010ABN404CountryCode)) {
        this._2010ABN404CountryCode = data().deepCopy(fields()[3].schema(), other._2010ABN404CountryCode);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010AB_N4_PayToProviderCityStateZIPCode instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.SCHEMA$);
      if (isValidValue(fields()[0], other._2010ABN401PayToProviderCityName)) {
        this._2010ABN401PayToProviderCityName = data().deepCopy(fields()[0].schema(), other._2010ABN401PayToProviderCityName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010ABN402PayToProviderStateCode)) {
        this._2010ABN402PayToProviderStateCode = data().deepCopy(fields()[1].schema(), other._2010ABN402PayToProviderStateCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2010ABN403PayToProviderPostalZoneOrZIPCode)) {
        this._2010ABN403PayToProviderPostalZoneOrZIPCode = data().deepCopy(fields()[2].schema(), other._2010ABN403PayToProviderPostalZoneOrZIPCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2010ABN404CountryCode)) {
        this._2010ABN404CountryCode = data().deepCopy(fields()[3].schema(), other._2010ABN404CountryCode);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2010ABN401PayToProviderCityName' field */
    public java.lang.CharSequence get2010ABN401PayToProviderCityName$1() {
      return _2010ABN401PayToProviderCityName;
    }
    
    /** Sets the value of the '_2010ABN401PayToProviderCityName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder set2010ABN401PayToProviderCityName$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010ABN401PayToProviderCityName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABN401PayToProviderCityName' field has been set */
    public boolean has2010ABN401PayToProviderCityName$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010ABN401PayToProviderCityName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder clear2010ABN401PayToProviderCityName$1() {
      _2010ABN401PayToProviderCityName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010ABN402PayToProviderStateCode' field */
    public java.lang.CharSequence get2010ABN402PayToProviderStateCode$1() {
      return _2010ABN402PayToProviderStateCode;
    }
    
    /** Sets the value of the '_2010ABN402PayToProviderStateCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder set2010ABN402PayToProviderStateCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010ABN402PayToProviderStateCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABN402PayToProviderStateCode' field has been set */
    public boolean has2010ABN402PayToProviderStateCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010ABN402PayToProviderStateCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder clear2010ABN402PayToProviderStateCode$1() {
      _2010ABN402PayToProviderStateCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2010ABN403PayToProviderPostalZoneOrZIPCode' field */
    public java.lang.CharSequence get2010ABN403PayToProviderPostalZoneOrZIPCode$1() {
      return _2010ABN403PayToProviderPostalZoneOrZIPCode;
    }
    
    /** Sets the value of the '_2010ABN403PayToProviderPostalZoneOrZIPCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder set2010ABN403PayToProviderPostalZoneOrZIPCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2010ABN403PayToProviderPostalZoneOrZIPCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABN403PayToProviderPostalZoneOrZIPCode' field has been set */
    public boolean has2010ABN403PayToProviderPostalZoneOrZIPCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2010ABN403PayToProviderPostalZoneOrZIPCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder clear2010ABN403PayToProviderPostalZoneOrZIPCode$1() {
      _2010ABN403PayToProviderPostalZoneOrZIPCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2010ABN404CountryCode' field */
    public java.lang.CharSequence get2010ABN404CountryCode$1() {
      return _2010ABN404CountryCode;
    }
    
    /** Sets the value of the '_2010ABN404CountryCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder set2010ABN404CountryCode$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2010ABN404CountryCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2010ABN404CountryCode' field has been set */
    public boolean has2010ABN404CountryCode$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2010ABN404CountryCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AB_N4_PayToProviderCityStateZIPCode.Builder clear2010ABN404CountryCode$1() {
      _2010ABN404CountryCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Ins_2010AB_N4_PayToProviderCityStateZIPCode build() {
      try {
        X837Ins_2010AB_N4_PayToProviderCityStateZIPCode record = new X837Ins_2010AB_N4_PayToProviderCityStateZIPCode();
        record._2010ABN401PayToProviderCityName = fieldSetFlags()[0] ? this._2010ABN401PayToProviderCityName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010ABN402PayToProviderStateCode = fieldSetFlags()[1] ? this._2010ABN402PayToProviderStateCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2010ABN403PayToProviderPostalZoneOrZIPCode = fieldSetFlags()[2] ? this._2010ABN403PayToProviderPostalZoneOrZIPCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2010ABN404CountryCode = fieldSetFlags()[3] ? this._2010ABN404CountryCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}