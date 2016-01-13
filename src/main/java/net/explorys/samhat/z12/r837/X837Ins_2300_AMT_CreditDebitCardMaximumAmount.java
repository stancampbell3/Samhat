/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2300_AMT_CreditDebitCardMaximumAmount extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2300_AMT_CreditDebitCardMaximumAmount\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300AMT01AmountQualifierCode\",\"type\":\"string\"},{\"name\":\"_2300AMT02CreditOrDebitCardMaximumAmount\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300AMT01AmountQualifierCode;
  @Deprecated public java.lang.CharSequence _2300AMT02CreditOrDebitCardMaximumAmount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2300_AMT_CreditDebitCardMaximumAmount() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2300_AMT_CreditDebitCardMaximumAmount(java.lang.CharSequence _2300AMT01AmountQualifierCode, java.lang.CharSequence _2300AMT02CreditOrDebitCardMaximumAmount) {
    this._2300AMT01AmountQualifierCode = _2300AMT01AmountQualifierCode;
    this._2300AMT02CreditOrDebitCardMaximumAmount = _2300AMT02CreditOrDebitCardMaximumAmount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300AMT01AmountQualifierCode;
    case 1: return _2300AMT02CreditOrDebitCardMaximumAmount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300AMT01AmountQualifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2300AMT02CreditOrDebitCardMaximumAmount = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300AMT01AmountQualifierCode' field.
   */
  public java.lang.CharSequence get2300AMT01AmountQualifierCode$1() {
    return _2300AMT01AmountQualifierCode;
  }

  /**
   * Sets the value of the '_2300AMT01AmountQualifierCode' field.
   * @param value the value to set.
   */
  public void set2300AMT01AmountQualifierCode$1(java.lang.CharSequence value) {
    this._2300AMT01AmountQualifierCode = value;
  }

  /**
   * Gets the value of the '_2300AMT02CreditOrDebitCardMaximumAmount' field.
   */
  public java.lang.CharSequence get2300AMT02CreditOrDebitCardMaximumAmount$1() {
    return _2300AMT02CreditOrDebitCardMaximumAmount;
  }

  /**
   * Sets the value of the '_2300AMT02CreditOrDebitCardMaximumAmount' field.
   * @param value the value to set.
   */
  public void set2300AMT02CreditOrDebitCardMaximumAmount$1(java.lang.CharSequence value) {
    this._2300AMT02CreditOrDebitCardMaximumAmount = value;
  }

  /** Creates a new X837Ins_2300_AMT_CreditDebitCardMaximumAmount RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder();
  }
  
  /** Creates a new X837Ins_2300_AMT_CreditDebitCardMaximumAmount RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder(other);
  }
  
  /** Creates a new X837Ins_2300_AMT_CreditDebitCardMaximumAmount RecordBuilder by copying an existing X837Ins_2300_AMT_CreditDebitCardMaximumAmount instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2300_AMT_CreditDebitCardMaximumAmount instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2300_AMT_CreditDebitCardMaximumAmount>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2300_AMT_CreditDebitCardMaximumAmount> {

    private java.lang.CharSequence _2300AMT01AmountQualifierCode;
    private java.lang.CharSequence _2300AMT02CreditOrDebitCardMaximumAmount;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300AMT01AmountQualifierCode)) {
        this._2300AMT01AmountQualifierCode = data().deepCopy(fields()[0].schema(), other._2300AMT01AmountQualifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300AMT02CreditOrDebitCardMaximumAmount)) {
        this._2300AMT02CreditOrDebitCardMaximumAmount = data().deepCopy(fields()[1].schema(), other._2300AMT02CreditOrDebitCardMaximumAmount);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2300_AMT_CreditDebitCardMaximumAmount instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.SCHEMA$);
      if (isValidValue(fields()[0], other._2300AMT01AmountQualifierCode)) {
        this._2300AMT01AmountQualifierCode = data().deepCopy(fields()[0].schema(), other._2300AMT01AmountQualifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300AMT02CreditOrDebitCardMaximumAmount)) {
        this._2300AMT02CreditOrDebitCardMaximumAmount = data().deepCopy(fields()[1].schema(), other._2300AMT02CreditOrDebitCardMaximumAmount);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2300AMT01AmountQualifierCode' field */
    public java.lang.CharSequence get2300AMT01AmountQualifierCode$1() {
      return _2300AMT01AmountQualifierCode;
    }
    
    /** Sets the value of the '_2300AMT01AmountQualifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder set2300AMT01AmountQualifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300AMT01AmountQualifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300AMT01AmountQualifierCode' field has been set */
    public boolean has2300AMT01AmountQualifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300AMT01AmountQualifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder clear2300AMT01AmountQualifierCode$1() {
      _2300AMT01AmountQualifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300AMT02CreditOrDebitCardMaximumAmount' field */
    public java.lang.CharSequence get2300AMT02CreditOrDebitCardMaximumAmount$1() {
      return _2300AMT02CreditOrDebitCardMaximumAmount;
    }
    
    /** Sets the value of the '_2300AMT02CreditOrDebitCardMaximumAmount' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder set2300AMT02CreditOrDebitCardMaximumAmount$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300AMT02CreditOrDebitCardMaximumAmount = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300AMT02CreditOrDebitCardMaximumAmount' field has been set */
    public boolean has2300AMT02CreditOrDebitCardMaximumAmount$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300AMT02CreditOrDebitCardMaximumAmount' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_AMT_CreditDebitCardMaximumAmount.Builder clear2300AMT02CreditOrDebitCardMaximumAmount$1() {
      _2300AMT02CreditOrDebitCardMaximumAmount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2300_AMT_CreditDebitCardMaximumAmount build() {
      try {
        X837Ins_2300_AMT_CreditDebitCardMaximumAmount record = new X837Ins_2300_AMT_CreditDebitCardMaximumAmount();
        record._2300AMT01AmountQualifierCode = fieldSetFlags()[0] ? this._2300AMT01AmountQualifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300AMT02CreditOrDebitCardMaximumAmount = fieldSetFlags()[1] ? this._2300AMT02CreditOrDebitCardMaximumAmount : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
