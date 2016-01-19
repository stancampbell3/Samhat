/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2410_CTP_DrugPricing extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2410_CTP_DrugPricing\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2410CTP03DrugUnitPrice\",\"type\":\"string\"},{\"name\":\"_2410CTP04NationalDrugUnitCount\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2410CTP03DrugUnitPrice;
  @Deprecated public java.lang.CharSequence _2410CTP04NationalDrugUnitCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2410_CTP_DrugPricing() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2410_CTP_DrugPricing(java.lang.CharSequence _2410CTP03DrugUnitPrice, java.lang.CharSequence _2410CTP04NationalDrugUnitCount) {
    this._2410CTP03DrugUnitPrice = _2410CTP03DrugUnitPrice;
    this._2410CTP04NationalDrugUnitCount = _2410CTP04NationalDrugUnitCount;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2410CTP03DrugUnitPrice;
    case 1: return _2410CTP04NationalDrugUnitCount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2410CTP03DrugUnitPrice = (java.lang.CharSequence)value$; break;
    case 1: _2410CTP04NationalDrugUnitCount = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2410CTP03DrugUnitPrice' field.
   */
  public java.lang.CharSequence get2410CTP03DrugUnitPrice$1() {
    return _2410CTP03DrugUnitPrice;
  }

  /**
   * Sets the value of the '_2410CTP03DrugUnitPrice' field.
   * @param value the value to set.
   */
  public void set2410CTP03DrugUnitPrice$1(java.lang.CharSequence value) {
    this._2410CTP03DrugUnitPrice = value;
  }

  /**
   * Gets the value of the '_2410CTP04NationalDrugUnitCount' field.
   */
  public java.lang.CharSequence get2410CTP04NationalDrugUnitCount$1() {
    return _2410CTP04NationalDrugUnitCount;
  }

  /**
   * Sets the value of the '_2410CTP04NationalDrugUnitCount' field.
   * @param value the value to set.
   */
  public void set2410CTP04NationalDrugUnitCount$1(java.lang.CharSequence value) {
    this._2410CTP04NationalDrugUnitCount = value;
  }

  /** Creates a new X837Ins_2410_CTP_DrugPricing RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder();
  }
  
  /** Creates a new X837Ins_2410_CTP_DrugPricing RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder(other);
  }
  
  /** Creates a new X837Ins_2410_CTP_DrugPricing RecordBuilder by copying an existing X837Ins_2410_CTP_DrugPricing instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2410_CTP_DrugPricing instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2410_CTP_DrugPricing>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2410_CTP_DrugPricing> {

    private java.lang.CharSequence _2410CTP03DrugUnitPrice;
    private java.lang.CharSequence _2410CTP04NationalDrugUnitCount;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2410CTP03DrugUnitPrice)) {
        this._2410CTP03DrugUnitPrice = data().deepCopy(fields()[0].schema(), other._2410CTP03DrugUnitPrice);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2410CTP04NationalDrugUnitCount)) {
        this._2410CTP04NationalDrugUnitCount = data().deepCopy(fields()[1].schema(), other._2410CTP04NationalDrugUnitCount);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2410_CTP_DrugPricing instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.SCHEMA$);
      if (isValidValue(fields()[0], other._2410CTP03DrugUnitPrice)) {
        this._2410CTP03DrugUnitPrice = data().deepCopy(fields()[0].schema(), other._2410CTP03DrugUnitPrice);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2410CTP04NationalDrugUnitCount)) {
        this._2410CTP04NationalDrugUnitCount = data().deepCopy(fields()[1].schema(), other._2410CTP04NationalDrugUnitCount);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2410CTP03DrugUnitPrice' field */
    public java.lang.CharSequence get2410CTP03DrugUnitPrice$1() {
      return _2410CTP03DrugUnitPrice;
    }
    
    /** Sets the value of the '_2410CTP03DrugUnitPrice' field */
    public net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder set2410CTP03DrugUnitPrice$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2410CTP03DrugUnitPrice = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2410CTP03DrugUnitPrice' field has been set */
    public boolean has2410CTP03DrugUnitPrice$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2410CTP03DrugUnitPrice' field */
    public net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder clear2410CTP03DrugUnitPrice$1() {
      _2410CTP03DrugUnitPrice = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2410CTP04NationalDrugUnitCount' field */
    public java.lang.CharSequence get2410CTP04NationalDrugUnitCount$1() {
      return _2410CTP04NationalDrugUnitCount;
    }
    
    /** Sets the value of the '_2410CTP04NationalDrugUnitCount' field */
    public net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder set2410CTP04NationalDrugUnitCount$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2410CTP04NationalDrugUnitCount = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2410CTP04NationalDrugUnitCount' field has been set */
    public boolean has2410CTP04NationalDrugUnitCount$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2410CTP04NationalDrugUnitCount' field */
    public net.explorys.samhat.z12.r837.X837Ins_2410_CTP_DrugPricing.Builder clear2410CTP04NationalDrugUnitCount$1() {
      _2410CTP04NationalDrugUnitCount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2410_CTP_DrugPricing build() {
      try {
        X837Ins_2410_CTP_DrugPricing record = new X837Ins_2410_CTP_DrugPricing();
        record._2410CTP03DrugUnitPrice = fieldSetFlags()[0] ? this._2410CTP03DrugUnitPrice : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2410CTP04NationalDrugUnitCount = fieldSetFlags()[1] ? this._2410CTP04NationalDrugUnitCount : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}