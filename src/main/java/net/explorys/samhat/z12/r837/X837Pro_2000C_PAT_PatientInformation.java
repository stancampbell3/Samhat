/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2000C_PAT_PatientInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2000C_PAT_PatientInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2000CPAT01IndividualRelationshipCode\",\"type\":\"string\"},{\"name\":\"_2000CPAT05DateTimePeriodFormatQualifier\",\"type\":\"string\"},{\"name\":\"_2000CPAT06PatientDeathDate\",\"type\":\"string\"},{\"name\":\"_2000CPAT07UnitOrBasisForMeasurementCode\",\"type\":\"string\"},{\"name\":\"_2000CPAT08PatientWeight\",\"type\":\"string\"},{\"name\":\"_2000CPAT09PregnancyIndicator\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2000CPAT01IndividualRelationshipCode;
  @Deprecated public java.lang.CharSequence _2000CPAT05DateTimePeriodFormatQualifier;
  @Deprecated public java.lang.CharSequence _2000CPAT06PatientDeathDate;
  @Deprecated public java.lang.CharSequence _2000CPAT07UnitOrBasisForMeasurementCode;
  @Deprecated public java.lang.CharSequence _2000CPAT08PatientWeight;
  @Deprecated public java.lang.CharSequence _2000CPAT09PregnancyIndicator;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2000C_PAT_PatientInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2000C_PAT_PatientInformation(java.lang.CharSequence _2000CPAT01IndividualRelationshipCode, java.lang.CharSequence _2000CPAT05DateTimePeriodFormatQualifier, java.lang.CharSequence _2000CPAT06PatientDeathDate, java.lang.CharSequence _2000CPAT07UnitOrBasisForMeasurementCode, java.lang.CharSequence _2000CPAT08PatientWeight, java.lang.CharSequence _2000CPAT09PregnancyIndicator) {
    this._2000CPAT01IndividualRelationshipCode = _2000CPAT01IndividualRelationshipCode;
    this._2000CPAT05DateTimePeriodFormatQualifier = _2000CPAT05DateTimePeriodFormatQualifier;
    this._2000CPAT06PatientDeathDate = _2000CPAT06PatientDeathDate;
    this._2000CPAT07UnitOrBasisForMeasurementCode = _2000CPAT07UnitOrBasisForMeasurementCode;
    this._2000CPAT08PatientWeight = _2000CPAT08PatientWeight;
    this._2000CPAT09PregnancyIndicator = _2000CPAT09PregnancyIndicator;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2000CPAT01IndividualRelationshipCode;
    case 1: return _2000CPAT05DateTimePeriodFormatQualifier;
    case 2: return _2000CPAT06PatientDeathDate;
    case 3: return _2000CPAT07UnitOrBasisForMeasurementCode;
    case 4: return _2000CPAT08PatientWeight;
    case 5: return _2000CPAT09PregnancyIndicator;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2000CPAT01IndividualRelationshipCode = (java.lang.CharSequence)value$; break;
    case 1: _2000CPAT05DateTimePeriodFormatQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2000CPAT06PatientDeathDate = (java.lang.CharSequence)value$; break;
    case 3: _2000CPAT07UnitOrBasisForMeasurementCode = (java.lang.CharSequence)value$; break;
    case 4: _2000CPAT08PatientWeight = (java.lang.CharSequence)value$; break;
    case 5: _2000CPAT09PregnancyIndicator = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2000CPAT01IndividualRelationshipCode' field.
   */
  public java.lang.CharSequence get2000CPAT01IndividualRelationshipCode$1() {
    return _2000CPAT01IndividualRelationshipCode;
  }

  /**
   * Sets the value of the '_2000CPAT01IndividualRelationshipCode' field.
   * @param value the value to set.
   */
  public void set2000CPAT01IndividualRelationshipCode$1(java.lang.CharSequence value) {
    this._2000CPAT01IndividualRelationshipCode = value;
  }

  /**
   * Gets the value of the '_2000CPAT05DateTimePeriodFormatQualifier' field.
   */
  public java.lang.CharSequence get2000CPAT05DateTimePeriodFormatQualifier$1() {
    return _2000CPAT05DateTimePeriodFormatQualifier;
  }

  /**
   * Sets the value of the '_2000CPAT05DateTimePeriodFormatQualifier' field.
   * @param value the value to set.
   */
  public void set2000CPAT05DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
    this._2000CPAT05DateTimePeriodFormatQualifier = value;
  }

  /**
   * Gets the value of the '_2000CPAT06PatientDeathDate' field.
   */
  public java.lang.CharSequence get2000CPAT06PatientDeathDate$1() {
    return _2000CPAT06PatientDeathDate;
  }

  /**
   * Sets the value of the '_2000CPAT06PatientDeathDate' field.
   * @param value the value to set.
   */
  public void set2000CPAT06PatientDeathDate$1(java.lang.CharSequence value) {
    this._2000CPAT06PatientDeathDate = value;
  }

  /**
   * Gets the value of the '_2000CPAT07UnitOrBasisForMeasurementCode' field.
   */
  public java.lang.CharSequence get2000CPAT07UnitOrBasisForMeasurementCode$1() {
    return _2000CPAT07UnitOrBasisForMeasurementCode;
  }

  /**
   * Sets the value of the '_2000CPAT07UnitOrBasisForMeasurementCode' field.
   * @param value the value to set.
   */
  public void set2000CPAT07UnitOrBasisForMeasurementCode$1(java.lang.CharSequence value) {
    this._2000CPAT07UnitOrBasisForMeasurementCode = value;
  }

  /**
   * Gets the value of the '_2000CPAT08PatientWeight' field.
   */
  public java.lang.CharSequence get2000CPAT08PatientWeight$1() {
    return _2000CPAT08PatientWeight;
  }

  /**
   * Sets the value of the '_2000CPAT08PatientWeight' field.
   * @param value the value to set.
   */
  public void set2000CPAT08PatientWeight$1(java.lang.CharSequence value) {
    this._2000CPAT08PatientWeight = value;
  }

  /**
   * Gets the value of the '_2000CPAT09PregnancyIndicator' field.
   */
  public java.lang.CharSequence get2000CPAT09PregnancyIndicator$1() {
    return _2000CPAT09PregnancyIndicator;
  }

  /**
   * Sets the value of the '_2000CPAT09PregnancyIndicator' field.
   * @param value the value to set.
   */
  public void set2000CPAT09PregnancyIndicator$1(java.lang.CharSequence value) {
    this._2000CPAT09PregnancyIndicator = value;
  }

  /** Creates a new X837Pro_2000C_PAT_PatientInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder();
  }
  
  /** Creates a new X837Pro_2000C_PAT_PatientInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2000C_PAT_PatientInformation RecordBuilder by copying an existing X837Pro_2000C_PAT_PatientInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2000C_PAT_PatientInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2000C_PAT_PatientInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2000C_PAT_PatientInformation> {

    private java.lang.CharSequence _2000CPAT01IndividualRelationshipCode;
    private java.lang.CharSequence _2000CPAT05DateTimePeriodFormatQualifier;
    private java.lang.CharSequence _2000CPAT06PatientDeathDate;
    private java.lang.CharSequence _2000CPAT07UnitOrBasisForMeasurementCode;
    private java.lang.CharSequence _2000CPAT08PatientWeight;
    private java.lang.CharSequence _2000CPAT09PregnancyIndicator;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2000CPAT01IndividualRelationshipCode)) {
        this._2000CPAT01IndividualRelationshipCode = data().deepCopy(fields()[0].schema(), other._2000CPAT01IndividualRelationshipCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2000CPAT05DateTimePeriodFormatQualifier)) {
        this._2000CPAT05DateTimePeriodFormatQualifier = data().deepCopy(fields()[1].schema(), other._2000CPAT05DateTimePeriodFormatQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2000CPAT06PatientDeathDate)) {
        this._2000CPAT06PatientDeathDate = data().deepCopy(fields()[2].schema(), other._2000CPAT06PatientDeathDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2000CPAT07UnitOrBasisForMeasurementCode)) {
        this._2000CPAT07UnitOrBasisForMeasurementCode = data().deepCopy(fields()[3].schema(), other._2000CPAT07UnitOrBasisForMeasurementCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2000CPAT08PatientWeight)) {
        this._2000CPAT08PatientWeight = data().deepCopy(fields()[4].schema(), other._2000CPAT08PatientWeight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2000CPAT09PregnancyIndicator)) {
        this._2000CPAT09PregnancyIndicator = data().deepCopy(fields()[5].schema(), other._2000CPAT09PregnancyIndicator);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2000C_PAT_PatientInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2000CPAT01IndividualRelationshipCode)) {
        this._2000CPAT01IndividualRelationshipCode = data().deepCopy(fields()[0].schema(), other._2000CPAT01IndividualRelationshipCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2000CPAT05DateTimePeriodFormatQualifier)) {
        this._2000CPAT05DateTimePeriodFormatQualifier = data().deepCopy(fields()[1].schema(), other._2000CPAT05DateTimePeriodFormatQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2000CPAT06PatientDeathDate)) {
        this._2000CPAT06PatientDeathDate = data().deepCopy(fields()[2].schema(), other._2000CPAT06PatientDeathDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2000CPAT07UnitOrBasisForMeasurementCode)) {
        this._2000CPAT07UnitOrBasisForMeasurementCode = data().deepCopy(fields()[3].schema(), other._2000CPAT07UnitOrBasisForMeasurementCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2000CPAT08PatientWeight)) {
        this._2000CPAT08PatientWeight = data().deepCopy(fields()[4].schema(), other._2000CPAT08PatientWeight);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2000CPAT09PregnancyIndicator)) {
        this._2000CPAT09PregnancyIndicator = data().deepCopy(fields()[5].schema(), other._2000CPAT09PregnancyIndicator);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the '_2000CPAT01IndividualRelationshipCode' field */
    public java.lang.CharSequence get2000CPAT01IndividualRelationshipCode$1() {
      return _2000CPAT01IndividualRelationshipCode;
    }
    
    /** Sets the value of the '_2000CPAT01IndividualRelationshipCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder set2000CPAT01IndividualRelationshipCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2000CPAT01IndividualRelationshipCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2000CPAT01IndividualRelationshipCode' field has been set */
    public boolean has2000CPAT01IndividualRelationshipCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2000CPAT01IndividualRelationshipCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder clear2000CPAT01IndividualRelationshipCode$1() {
      _2000CPAT01IndividualRelationshipCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2000CPAT05DateTimePeriodFormatQualifier' field */
    public java.lang.CharSequence get2000CPAT05DateTimePeriodFormatQualifier$1() {
      return _2000CPAT05DateTimePeriodFormatQualifier;
    }
    
    /** Sets the value of the '_2000CPAT05DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder set2000CPAT05DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2000CPAT05DateTimePeriodFormatQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2000CPAT05DateTimePeriodFormatQualifier' field has been set */
    public boolean has2000CPAT05DateTimePeriodFormatQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2000CPAT05DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder clear2000CPAT05DateTimePeriodFormatQualifier$1() {
      _2000CPAT05DateTimePeriodFormatQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2000CPAT06PatientDeathDate' field */
    public java.lang.CharSequence get2000CPAT06PatientDeathDate$1() {
      return _2000CPAT06PatientDeathDate;
    }
    
    /** Sets the value of the '_2000CPAT06PatientDeathDate' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder set2000CPAT06PatientDeathDate$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2000CPAT06PatientDeathDate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2000CPAT06PatientDeathDate' field has been set */
    public boolean has2000CPAT06PatientDeathDate$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2000CPAT06PatientDeathDate' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder clear2000CPAT06PatientDeathDate$1() {
      _2000CPAT06PatientDeathDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2000CPAT07UnitOrBasisForMeasurementCode' field */
    public java.lang.CharSequence get2000CPAT07UnitOrBasisForMeasurementCode$1() {
      return _2000CPAT07UnitOrBasisForMeasurementCode;
    }
    
    /** Sets the value of the '_2000CPAT07UnitOrBasisForMeasurementCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder set2000CPAT07UnitOrBasisForMeasurementCode$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2000CPAT07UnitOrBasisForMeasurementCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2000CPAT07UnitOrBasisForMeasurementCode' field has been set */
    public boolean has2000CPAT07UnitOrBasisForMeasurementCode$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2000CPAT07UnitOrBasisForMeasurementCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder clear2000CPAT07UnitOrBasisForMeasurementCode$1() {
      _2000CPAT07UnitOrBasisForMeasurementCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2000CPAT08PatientWeight' field */
    public java.lang.CharSequence get2000CPAT08PatientWeight$1() {
      return _2000CPAT08PatientWeight;
    }
    
    /** Sets the value of the '_2000CPAT08PatientWeight' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder set2000CPAT08PatientWeight$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2000CPAT08PatientWeight = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2000CPAT08PatientWeight' field has been set */
    public boolean has2000CPAT08PatientWeight$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2000CPAT08PatientWeight' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder clear2000CPAT08PatientWeight$1() {
      _2000CPAT08PatientWeight = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2000CPAT09PregnancyIndicator' field */
    public java.lang.CharSequence get2000CPAT09PregnancyIndicator$1() {
      return _2000CPAT09PregnancyIndicator;
    }
    
    /** Sets the value of the '_2000CPAT09PregnancyIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder set2000CPAT09PregnancyIndicator$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2000CPAT09PregnancyIndicator = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2000CPAT09PregnancyIndicator' field has been set */
    public boolean has2000CPAT09PregnancyIndicator$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2000CPAT09PregnancyIndicator' field */
    public net.explorys.samhat.z12.r837.X837Pro_2000C_PAT_PatientInformation.Builder clear2000CPAT09PregnancyIndicator$1() {
      _2000CPAT09PregnancyIndicator = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public X837Pro_2000C_PAT_PatientInformation build() {
      try {
        X837Pro_2000C_PAT_PatientInformation record = new X837Pro_2000C_PAT_PatientInformation();
        record._2000CPAT01IndividualRelationshipCode = fieldSetFlags()[0] ? this._2000CPAT01IndividualRelationshipCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2000CPAT05DateTimePeriodFormatQualifier = fieldSetFlags()[1] ? this._2000CPAT05DateTimePeriodFormatQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2000CPAT06PatientDeathDate = fieldSetFlags()[2] ? this._2000CPAT06PatientDeathDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2000CPAT07UnitOrBasisForMeasurementCode = fieldSetFlags()[3] ? this._2000CPAT07UnitOrBasisForMeasurementCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2000CPAT08PatientWeight = fieldSetFlags()[4] ? this._2000CPAT08PatientWeight : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2000CPAT09PregnancyIndicator = fieldSetFlags()[5] ? this._2000CPAT09PregnancyIndicator : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}