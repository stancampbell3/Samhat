/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2300_QTY03_CompositeUnitOfMeasure extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2300_QTY03_CompositeUnitOfMeasure\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300QTY0301UnitOrBasisForMeasurementCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300QTY0301UnitOrBasisForMeasurementCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2300_QTY03_CompositeUnitOfMeasure() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2300_QTY03_CompositeUnitOfMeasure(java.lang.CharSequence _2300QTY0301UnitOrBasisForMeasurementCode) {
    this._2300QTY0301UnitOrBasisForMeasurementCode = _2300QTY0301UnitOrBasisForMeasurementCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300QTY0301UnitOrBasisForMeasurementCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300QTY0301UnitOrBasisForMeasurementCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300QTY0301UnitOrBasisForMeasurementCode' field.
   */
  public java.lang.CharSequence get2300QTY0301UnitOrBasisForMeasurementCode$1() {
    return _2300QTY0301UnitOrBasisForMeasurementCode;
  }

  /**
   * Sets the value of the '_2300QTY0301UnitOrBasisForMeasurementCode' field.
   * @param value the value to set.
   */
  public void set2300QTY0301UnitOrBasisForMeasurementCode$1(java.lang.CharSequence value) {
    this._2300QTY0301UnitOrBasisForMeasurementCode = value;
  }

  /** Creates a new X837Ins_2300_QTY03_CompositeUnitOfMeasure RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder();
  }
  
  /** Creates a new X837Ins_2300_QTY03_CompositeUnitOfMeasure RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder(other);
  }
  
  /** Creates a new X837Ins_2300_QTY03_CompositeUnitOfMeasure RecordBuilder by copying an existing X837Ins_2300_QTY03_CompositeUnitOfMeasure instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2300_QTY03_CompositeUnitOfMeasure instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2300_QTY03_CompositeUnitOfMeasure>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2300_QTY03_CompositeUnitOfMeasure> {

    private java.lang.CharSequence _2300QTY0301UnitOrBasisForMeasurementCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300QTY0301UnitOrBasisForMeasurementCode)) {
        this._2300QTY0301UnitOrBasisForMeasurementCode = data().deepCopy(fields()[0].schema(), other._2300QTY0301UnitOrBasisForMeasurementCode);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2300_QTY03_CompositeUnitOfMeasure instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.SCHEMA$);
      if (isValidValue(fields()[0], other._2300QTY0301UnitOrBasisForMeasurementCode)) {
        this._2300QTY0301UnitOrBasisForMeasurementCode = data().deepCopy(fields()[0].schema(), other._2300QTY0301UnitOrBasisForMeasurementCode);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the '_2300QTY0301UnitOrBasisForMeasurementCode' field */
    public java.lang.CharSequence get2300QTY0301UnitOrBasisForMeasurementCode$1() {
      return _2300QTY0301UnitOrBasisForMeasurementCode;
    }
    
    /** Sets the value of the '_2300QTY0301UnitOrBasisForMeasurementCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder set2300QTY0301UnitOrBasisForMeasurementCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300QTY0301UnitOrBasisForMeasurementCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300QTY0301UnitOrBasisForMeasurementCode' field has been set */
    public boolean has2300QTY0301UnitOrBasisForMeasurementCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300QTY0301UnitOrBasisForMeasurementCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_QTY03_CompositeUnitOfMeasure.Builder clear2300QTY0301UnitOrBasisForMeasurementCode$1() {
      _2300QTY0301UnitOrBasisForMeasurementCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public X837Ins_2300_QTY03_CompositeUnitOfMeasure build() {
      try {
        X837Ins_2300_QTY03_CompositeUnitOfMeasure record = new X837Ins_2300_QTY03_CompositeUnitOfMeasure();
        record._2300QTY0301UnitOrBasisForMeasurementCode = fieldSetFlags()[0] ? this._2300QTY0301UnitOrBasisForMeasurementCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}