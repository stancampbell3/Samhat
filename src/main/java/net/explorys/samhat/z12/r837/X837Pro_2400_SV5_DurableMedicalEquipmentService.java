/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2400_SV5_DurableMedicalEquipmentService extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2400_SV5_DurableMedicalEquipmentService\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2400SV502UnitOrBasisForMeasurementCode\",\"type\":\"string\"},{\"name\":\"_2400SV503Quantity\",\"type\":\"string\"},{\"name\":\"_2400SV504MonetaryAmount\",\"type\":\"string\"},{\"name\":\"_2400SV505MonetaryAmount\",\"type\":\"string\"},{\"name\":\"_2400SV506FrequencyCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2400SV502UnitOrBasisForMeasurementCode;
  @Deprecated public java.lang.CharSequence _2400SV503Quantity;
  @Deprecated public java.lang.CharSequence _2400SV504MonetaryAmount;
  @Deprecated public java.lang.CharSequence _2400SV505MonetaryAmount;
  @Deprecated public java.lang.CharSequence _2400SV506FrequencyCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2400_SV5_DurableMedicalEquipmentService() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2400_SV5_DurableMedicalEquipmentService(java.lang.CharSequence _2400SV502UnitOrBasisForMeasurementCode, java.lang.CharSequence _2400SV503Quantity, java.lang.CharSequence _2400SV504MonetaryAmount, java.lang.CharSequence _2400SV505MonetaryAmount, java.lang.CharSequence _2400SV506FrequencyCode) {
    this._2400SV502UnitOrBasisForMeasurementCode = _2400SV502UnitOrBasisForMeasurementCode;
    this._2400SV503Quantity = _2400SV503Quantity;
    this._2400SV504MonetaryAmount = _2400SV504MonetaryAmount;
    this._2400SV505MonetaryAmount = _2400SV505MonetaryAmount;
    this._2400SV506FrequencyCode = _2400SV506FrequencyCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2400SV502UnitOrBasisForMeasurementCode;
    case 1: return _2400SV503Quantity;
    case 2: return _2400SV504MonetaryAmount;
    case 3: return _2400SV505MonetaryAmount;
    case 4: return _2400SV506FrequencyCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2400SV502UnitOrBasisForMeasurementCode = (java.lang.CharSequence)value$; break;
    case 1: _2400SV503Quantity = (java.lang.CharSequence)value$; break;
    case 2: _2400SV504MonetaryAmount = (java.lang.CharSequence)value$; break;
    case 3: _2400SV505MonetaryAmount = (java.lang.CharSequence)value$; break;
    case 4: _2400SV506FrequencyCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2400SV502UnitOrBasisForMeasurementCode' field.
   */
  public java.lang.CharSequence get2400SV502UnitOrBasisForMeasurementCode$1() {
    return _2400SV502UnitOrBasisForMeasurementCode;
  }

  /**
   * Sets the value of the '_2400SV502UnitOrBasisForMeasurementCode' field.
   * @param value the value to set.
   */
  public void set2400SV502UnitOrBasisForMeasurementCode$1(java.lang.CharSequence value) {
    this._2400SV502UnitOrBasisForMeasurementCode = value;
  }

  /**
   * Gets the value of the '_2400SV503Quantity' field.
   */
  public java.lang.CharSequence get2400SV503Quantity$1() {
    return _2400SV503Quantity;
  }

  /**
   * Sets the value of the '_2400SV503Quantity' field.
   * @param value the value to set.
   */
  public void set2400SV503Quantity$1(java.lang.CharSequence value) {
    this._2400SV503Quantity = value;
  }

  /**
   * Gets the value of the '_2400SV504MonetaryAmount' field.
   */
  public java.lang.CharSequence get2400SV504MonetaryAmount$1() {
    return _2400SV504MonetaryAmount;
  }

  /**
   * Sets the value of the '_2400SV504MonetaryAmount' field.
   * @param value the value to set.
   */
  public void set2400SV504MonetaryAmount$1(java.lang.CharSequence value) {
    this._2400SV504MonetaryAmount = value;
  }

  /**
   * Gets the value of the '_2400SV505MonetaryAmount' field.
   */
  public java.lang.CharSequence get2400SV505MonetaryAmount$1() {
    return _2400SV505MonetaryAmount;
  }

  /**
   * Sets the value of the '_2400SV505MonetaryAmount' field.
   * @param value the value to set.
   */
  public void set2400SV505MonetaryAmount$1(java.lang.CharSequence value) {
    this._2400SV505MonetaryAmount = value;
  }

  /**
   * Gets the value of the '_2400SV506FrequencyCode' field.
   */
  public java.lang.CharSequence get2400SV506FrequencyCode$1() {
    return _2400SV506FrequencyCode;
  }

  /**
   * Sets the value of the '_2400SV506FrequencyCode' field.
   * @param value the value to set.
   */
  public void set2400SV506FrequencyCode$1(java.lang.CharSequence value) {
    this._2400SV506FrequencyCode = value;
  }

  /** Creates a new X837Pro_2400_SV5_DurableMedicalEquipmentService RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder();
  }
  
  /** Creates a new X837Pro_2400_SV5_DurableMedicalEquipmentService RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder(other);
  }
  
  /** Creates a new X837Pro_2400_SV5_DurableMedicalEquipmentService RecordBuilder by copying an existing X837Pro_2400_SV5_DurableMedicalEquipmentService instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2400_SV5_DurableMedicalEquipmentService instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2400_SV5_DurableMedicalEquipmentService>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2400_SV5_DurableMedicalEquipmentService> {

    private java.lang.CharSequence _2400SV502UnitOrBasisForMeasurementCode;
    private java.lang.CharSequence _2400SV503Quantity;
    private java.lang.CharSequence _2400SV504MonetaryAmount;
    private java.lang.CharSequence _2400SV505MonetaryAmount;
    private java.lang.CharSequence _2400SV506FrequencyCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2400SV502UnitOrBasisForMeasurementCode)) {
        this._2400SV502UnitOrBasisForMeasurementCode = data().deepCopy(fields()[0].schema(), other._2400SV502UnitOrBasisForMeasurementCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400SV503Quantity)) {
        this._2400SV503Quantity = data().deepCopy(fields()[1].schema(), other._2400SV503Quantity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400SV504MonetaryAmount)) {
        this._2400SV504MonetaryAmount = data().deepCopy(fields()[2].schema(), other._2400SV504MonetaryAmount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2400SV505MonetaryAmount)) {
        this._2400SV505MonetaryAmount = data().deepCopy(fields()[3].schema(), other._2400SV505MonetaryAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2400SV506FrequencyCode)) {
        this._2400SV506FrequencyCode = data().deepCopy(fields()[4].schema(), other._2400SV506FrequencyCode);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2400_SV5_DurableMedicalEquipmentService instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.SCHEMA$);
      if (isValidValue(fields()[0], other._2400SV502UnitOrBasisForMeasurementCode)) {
        this._2400SV502UnitOrBasisForMeasurementCode = data().deepCopy(fields()[0].schema(), other._2400SV502UnitOrBasisForMeasurementCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400SV503Quantity)) {
        this._2400SV503Quantity = data().deepCopy(fields()[1].schema(), other._2400SV503Quantity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400SV504MonetaryAmount)) {
        this._2400SV504MonetaryAmount = data().deepCopy(fields()[2].schema(), other._2400SV504MonetaryAmount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2400SV505MonetaryAmount)) {
        this._2400SV505MonetaryAmount = data().deepCopy(fields()[3].schema(), other._2400SV505MonetaryAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2400SV506FrequencyCode)) {
        this._2400SV506FrequencyCode = data().deepCopy(fields()[4].schema(), other._2400SV506FrequencyCode);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2400SV502UnitOrBasisForMeasurementCode' field */
    public java.lang.CharSequence get2400SV502UnitOrBasisForMeasurementCode$1() {
      return _2400SV502UnitOrBasisForMeasurementCode;
    }
    
    /** Sets the value of the '_2400SV502UnitOrBasisForMeasurementCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder set2400SV502UnitOrBasisForMeasurementCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2400SV502UnitOrBasisForMeasurementCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV502UnitOrBasisForMeasurementCode' field has been set */
    public boolean has2400SV502UnitOrBasisForMeasurementCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2400SV502UnitOrBasisForMeasurementCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder clear2400SV502UnitOrBasisForMeasurementCode$1() {
      _2400SV502UnitOrBasisForMeasurementCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2400SV503Quantity' field */
    public java.lang.CharSequence get2400SV503Quantity$1() {
      return _2400SV503Quantity;
    }
    
    /** Sets the value of the '_2400SV503Quantity' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder set2400SV503Quantity$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2400SV503Quantity = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV503Quantity' field has been set */
    public boolean has2400SV503Quantity$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2400SV503Quantity' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder clear2400SV503Quantity$1() {
      _2400SV503Quantity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2400SV504MonetaryAmount' field */
    public java.lang.CharSequence get2400SV504MonetaryAmount$1() {
      return _2400SV504MonetaryAmount;
    }
    
    /** Sets the value of the '_2400SV504MonetaryAmount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder set2400SV504MonetaryAmount$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2400SV504MonetaryAmount = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV504MonetaryAmount' field has been set */
    public boolean has2400SV504MonetaryAmount$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2400SV504MonetaryAmount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder clear2400SV504MonetaryAmount$1() {
      _2400SV504MonetaryAmount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2400SV505MonetaryAmount' field */
    public java.lang.CharSequence get2400SV505MonetaryAmount$1() {
      return _2400SV505MonetaryAmount;
    }
    
    /** Sets the value of the '_2400SV505MonetaryAmount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder set2400SV505MonetaryAmount$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2400SV505MonetaryAmount = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV505MonetaryAmount' field has been set */
    public boolean has2400SV505MonetaryAmount$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2400SV505MonetaryAmount' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder clear2400SV505MonetaryAmount$1() {
      _2400SV505MonetaryAmount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2400SV506FrequencyCode' field */
    public java.lang.CharSequence get2400SV506FrequencyCode$1() {
      return _2400SV506FrequencyCode;
    }
    
    /** Sets the value of the '_2400SV506FrequencyCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder set2400SV506FrequencyCode$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2400SV506FrequencyCode = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2400SV506FrequencyCode' field has been set */
    public boolean has2400SV506FrequencyCode$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2400SV506FrequencyCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_SV5_DurableMedicalEquipmentService.Builder clear2400SV506FrequencyCode$1() {
      _2400SV506FrequencyCode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Pro_2400_SV5_DurableMedicalEquipmentService build() {
      try {
        X837Pro_2400_SV5_DurableMedicalEquipmentService record = new X837Pro_2400_SV5_DurableMedicalEquipmentService();
        record._2400SV502UnitOrBasisForMeasurementCode = fieldSetFlags()[0] ? this._2400SV502UnitOrBasisForMeasurementCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2400SV503Quantity = fieldSetFlags()[1] ? this._2400SV503Quantity : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2400SV504MonetaryAmount = fieldSetFlags()[2] ? this._2400SV504MonetaryAmount : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2400SV505MonetaryAmount = fieldSetFlags()[3] ? this._2400SV505MonetaryAmount : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2400SV506FrequencyCode = fieldSetFlags()[4] ? this._2400SV506FrequencyCode : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}