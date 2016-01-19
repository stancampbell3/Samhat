/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2320AMT01AmountQualifierCode\",\"type\":\"string\"},{\"name\":\"_2320AMT02ClaimTotalDeniedChargeAmount\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2320AMT01AmountQualifierCode;
  @Deprecated public java.lang.CharSequence _2320AMT02ClaimTotalDeniedChargeAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount(java.lang.CharSequence _2320AMT01AmountQualifierCode, java.lang.CharSequence _2320AMT02ClaimTotalDeniedChargeAmount) {
    this._2320AMT01AmountQualifierCode = _2320AMT01AmountQualifierCode;
    this._2320AMT02ClaimTotalDeniedChargeAmount = _2320AMT02ClaimTotalDeniedChargeAmount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2320AMT01AmountQualifierCode;
    case 1: return _2320AMT02ClaimTotalDeniedChargeAmount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2320AMT01AmountQualifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2320AMT02ClaimTotalDeniedChargeAmount = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2320AMT01AmountQualifierCode' field.
   */
  public java.lang.CharSequence get2320AMT01AmountQualifierCode$1() {
    return _2320AMT01AmountQualifierCode;
  }

  /**
   * Sets the value of the '_2320AMT01AmountQualifierCode' field.
   * @param value the value to set.
   */
  public void set2320AMT01AmountQualifierCode$1(java.lang.CharSequence value) {
    this._2320AMT01AmountQualifierCode = value;
  }

  /**
   * Gets the value of the '_2320AMT02ClaimTotalDeniedChargeAmount' field.
   */
  public java.lang.CharSequence get2320AMT02ClaimTotalDeniedChargeAmount$1() {
    return _2320AMT02ClaimTotalDeniedChargeAmount;
  }

  /**
   * Sets the value of the '_2320AMT02ClaimTotalDeniedChargeAmount' field.
   * @param value the value to set.
   */
  public void set2320AMT02ClaimTotalDeniedChargeAmount$1(java.lang.CharSequence value) {
    this._2320AMT02ClaimTotalDeniedChargeAmount = value;
  }

  /** Creates a new X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder();
  }
  
  /** Creates a new X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder(other);
  }
  
  /** Creates a new X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount RecordBuilder by copying an existing X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount> {

    private java.lang.CharSequence _2320AMT01AmountQualifierCode;
    private java.lang.CharSequence _2320AMT02ClaimTotalDeniedChargeAmount;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2320AMT01AmountQualifierCode)) {
        this._2320AMT01AmountQualifierCode = data().deepCopy(fields()[0].schema(), other._2320AMT01AmountQualifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2320AMT02ClaimTotalDeniedChargeAmount)) {
        this._2320AMT02ClaimTotalDeniedChargeAmount = data().deepCopy(fields()[1].schema(), other._2320AMT02ClaimTotalDeniedChargeAmount);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.SCHEMA$);
      if (isValidValue(fields()[0], other._2320AMT01AmountQualifierCode)) {
        this._2320AMT01AmountQualifierCode = data().deepCopy(fields()[0].schema(), other._2320AMT01AmountQualifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2320AMT02ClaimTotalDeniedChargeAmount)) {
        this._2320AMT02ClaimTotalDeniedChargeAmount = data().deepCopy(fields()[1].schema(), other._2320AMT02ClaimTotalDeniedChargeAmount);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2320AMT01AmountQualifierCode' field */
    public java.lang.CharSequence get2320AMT01AmountQualifierCode$1() {
      return _2320AMT01AmountQualifierCode;
    }
    
    /** Sets the value of the '_2320AMT01AmountQualifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder set2320AMT01AmountQualifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2320AMT01AmountQualifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2320AMT01AmountQualifierCode' field has been set */
    public boolean has2320AMT01AmountQualifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2320AMT01AmountQualifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder clear2320AMT01AmountQualifierCode$1() {
      _2320AMT01AmountQualifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2320AMT02ClaimTotalDeniedChargeAmount' field */
    public java.lang.CharSequence get2320AMT02ClaimTotalDeniedChargeAmount$1() {
      return _2320AMT02ClaimTotalDeniedChargeAmount;
    }
    
    /** Sets the value of the '_2320AMT02ClaimTotalDeniedChargeAmount' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder set2320AMT02ClaimTotalDeniedChargeAmount$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2320AMT02ClaimTotalDeniedChargeAmount = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2320AMT02ClaimTotalDeniedChargeAmount' field has been set */
    public boolean has2320AMT02ClaimTotalDeniedChargeAmount$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2320AMT02ClaimTotalDeniedChargeAmount' field */
    public net.explorys.samhat.z12.r837.X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount.Builder clear2320AMT02ClaimTotalDeniedChargeAmount$1() {
      _2320AMT02ClaimTotalDeniedChargeAmount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount build() {
      try {
        X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount record = new X837Ins_2320_AMT_CoordinationOfBenefitsCOBTotalDeniedAmount();
        record._2320AMT01AmountQualifierCode = fieldSetFlags()[0] ? this._2320AMT01AmountQualifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2320AMT02ClaimTotalDeniedChargeAmount = fieldSetFlags()[1] ? this._2320AMT02ClaimTotalDeniedChargeAmount : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}