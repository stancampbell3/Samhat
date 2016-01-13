/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2010AA_N3_BillingProviderAddress extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2010AA_N3_BillingProviderAddress\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2010AAN301BillingProviderAddressLine\",\"type\":\"string\"},{\"name\":\"_2010AAN302BillingProviderAddressLine\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2010AAN301BillingProviderAddressLine;
  @Deprecated public java.lang.CharSequence _2010AAN302BillingProviderAddressLine;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2010AA_N3_BillingProviderAddress() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2010AA_N3_BillingProviderAddress(java.lang.CharSequence _2010AAN301BillingProviderAddressLine, java.lang.CharSequence _2010AAN302BillingProviderAddressLine) {
    this._2010AAN301BillingProviderAddressLine = _2010AAN301BillingProviderAddressLine;
    this._2010AAN302BillingProviderAddressLine = _2010AAN302BillingProviderAddressLine;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2010AAN301BillingProviderAddressLine;
    case 1: return _2010AAN302BillingProviderAddressLine;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2010AAN301BillingProviderAddressLine = (java.lang.CharSequence)value$; break;
    case 1: _2010AAN302BillingProviderAddressLine = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2010AAN301BillingProviderAddressLine' field.
   */
  public java.lang.CharSequence get2010AAN301BillingProviderAddressLine$1() {
    return _2010AAN301BillingProviderAddressLine;
  }

  /**
   * Sets the value of the '_2010AAN301BillingProviderAddressLine' field.
   * @param value the value to set.
   */
  public void set2010AAN301BillingProviderAddressLine$1(java.lang.CharSequence value) {
    this._2010AAN301BillingProviderAddressLine = value;
  }

  /**
   * Gets the value of the '_2010AAN302BillingProviderAddressLine' field.
   */
  public java.lang.CharSequence get2010AAN302BillingProviderAddressLine$1() {
    return _2010AAN302BillingProviderAddressLine;
  }

  /**
   * Sets the value of the '_2010AAN302BillingProviderAddressLine' field.
   * @param value the value to set.
   */
  public void set2010AAN302BillingProviderAddressLine$1(java.lang.CharSequence value) {
    this._2010AAN302BillingProviderAddressLine = value;
  }

  /** Creates a new X837Ins_2010AA_N3_BillingProviderAddress RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder();
  }
  
  /** Creates a new X837Ins_2010AA_N3_BillingProviderAddress RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder(other);
  }
  
  /** Creates a new X837Ins_2010AA_N3_BillingProviderAddress RecordBuilder by copying an existing X837Ins_2010AA_N3_BillingProviderAddress instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2010AA_N3_BillingProviderAddress instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2010AA_N3_BillingProviderAddress>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2010AA_N3_BillingProviderAddress> {

    private java.lang.CharSequence _2010AAN301BillingProviderAddressLine;
    private java.lang.CharSequence _2010AAN302BillingProviderAddressLine;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2010AAN301BillingProviderAddressLine)) {
        this._2010AAN301BillingProviderAddressLine = data().deepCopy(fields()[0].schema(), other._2010AAN301BillingProviderAddressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010AAN302BillingProviderAddressLine)) {
        this._2010AAN302BillingProviderAddressLine = data().deepCopy(fields()[1].schema(), other._2010AAN302BillingProviderAddressLine);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2010AA_N3_BillingProviderAddress instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.SCHEMA$);
      if (isValidValue(fields()[0], other._2010AAN301BillingProviderAddressLine)) {
        this._2010AAN301BillingProviderAddressLine = data().deepCopy(fields()[0].schema(), other._2010AAN301BillingProviderAddressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2010AAN302BillingProviderAddressLine)) {
        this._2010AAN302BillingProviderAddressLine = data().deepCopy(fields()[1].schema(), other._2010AAN302BillingProviderAddressLine);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2010AAN301BillingProviderAddressLine' field */
    public java.lang.CharSequence get2010AAN301BillingProviderAddressLine$1() {
      return _2010AAN301BillingProviderAddressLine;
    }
    
    /** Sets the value of the '_2010AAN301BillingProviderAddressLine' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder set2010AAN301BillingProviderAddressLine$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2010AAN301BillingProviderAddressLine = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AAN301BillingProviderAddressLine' field has been set */
    public boolean has2010AAN301BillingProviderAddressLine$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2010AAN301BillingProviderAddressLine' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder clear2010AAN301BillingProviderAddressLine$1() {
      _2010AAN301BillingProviderAddressLine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2010AAN302BillingProviderAddressLine' field */
    public java.lang.CharSequence get2010AAN302BillingProviderAddressLine$1() {
      return _2010AAN302BillingProviderAddressLine;
    }
    
    /** Sets the value of the '_2010AAN302BillingProviderAddressLine' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder set2010AAN302BillingProviderAddressLine$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2010AAN302BillingProviderAddressLine = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2010AAN302BillingProviderAddressLine' field has been set */
    public boolean has2010AAN302BillingProviderAddressLine$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2010AAN302BillingProviderAddressLine' field */
    public net.explorys.samhat.z12.r837.X837Ins_2010AA_N3_BillingProviderAddress.Builder clear2010AAN302BillingProviderAddressLine$1() {
      _2010AAN302BillingProviderAddressLine = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2010AA_N3_BillingProviderAddress build() {
      try {
        X837Ins_2010AA_N3_BillingProviderAddress record = new X837Ins_2010AA_N3_BillingProviderAddress();
        record._2010AAN301BillingProviderAddressLine = fieldSetFlags()[0] ? this._2010AAN301BillingProviderAddressLine : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2010AAN302BillingProviderAddressLine = fieldSetFlags()[1] ? this._2010AAN302BillingProviderAddressLine : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
