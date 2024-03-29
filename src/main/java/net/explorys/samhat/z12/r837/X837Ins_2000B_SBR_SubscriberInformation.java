/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2000B_SBR_SubscriberInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2000B_SBR_SubscriberInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2000BSBR01PayerResponsibilitySequenceNumberCode\",\"type\":\"string\"},{\"name\":\"_2000BSBR02IndividualRelationshipCode\",\"type\":\"string\"},{\"name\":\"_2000BSBR03InsuredGroupOrPolicyNumber\",\"type\":\"string\"},{\"name\":\"_2000BSBR04InsuredGroupName\",\"type\":\"string\"},{\"name\":\"_2000BSBR09ClaimFilingIndicatorCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2000BSBR01PayerResponsibilitySequenceNumberCode;
  @Deprecated public java.lang.CharSequence _2000BSBR02IndividualRelationshipCode;
  @Deprecated public java.lang.CharSequence _2000BSBR03InsuredGroupOrPolicyNumber;
  @Deprecated public java.lang.CharSequence _2000BSBR04InsuredGroupName;
  @Deprecated public java.lang.CharSequence _2000BSBR09ClaimFilingIndicatorCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2000B_SBR_SubscriberInformation() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2000B_SBR_SubscriberInformation(java.lang.CharSequence _2000BSBR01PayerResponsibilitySequenceNumberCode, java.lang.CharSequence _2000BSBR02IndividualRelationshipCode, java.lang.CharSequence _2000BSBR03InsuredGroupOrPolicyNumber, java.lang.CharSequence _2000BSBR04InsuredGroupName, java.lang.CharSequence _2000BSBR09ClaimFilingIndicatorCode) {
    this._2000BSBR01PayerResponsibilitySequenceNumberCode = _2000BSBR01PayerResponsibilitySequenceNumberCode;
    this._2000BSBR02IndividualRelationshipCode = _2000BSBR02IndividualRelationshipCode;
    this._2000BSBR03InsuredGroupOrPolicyNumber = _2000BSBR03InsuredGroupOrPolicyNumber;
    this._2000BSBR04InsuredGroupName = _2000BSBR04InsuredGroupName;
    this._2000BSBR09ClaimFilingIndicatorCode = _2000BSBR09ClaimFilingIndicatorCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2000BSBR01PayerResponsibilitySequenceNumberCode;
    case 1: return _2000BSBR02IndividualRelationshipCode;
    case 2: return _2000BSBR03InsuredGroupOrPolicyNumber;
    case 3: return _2000BSBR04InsuredGroupName;
    case 4: return _2000BSBR09ClaimFilingIndicatorCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2000BSBR01PayerResponsibilitySequenceNumberCode = (java.lang.CharSequence)value$; break;
    case 1: _2000BSBR02IndividualRelationshipCode = (java.lang.CharSequence)value$; break;
    case 2: _2000BSBR03InsuredGroupOrPolicyNumber = (java.lang.CharSequence)value$; break;
    case 3: _2000BSBR04InsuredGroupName = (java.lang.CharSequence)value$; break;
    case 4: _2000BSBR09ClaimFilingIndicatorCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2000BSBR01PayerResponsibilitySequenceNumberCode' field.
   */
  public java.lang.CharSequence get2000BSBR01PayerResponsibilitySequenceNumberCode$1() {
    return _2000BSBR01PayerResponsibilitySequenceNumberCode;
  }

  /**
   * Sets the value of the '_2000BSBR01PayerResponsibilitySequenceNumberCode' field.
   * @param value the value to set.
   */
  public void set2000BSBR01PayerResponsibilitySequenceNumberCode$1(java.lang.CharSequence value) {
    this._2000BSBR01PayerResponsibilitySequenceNumberCode = value;
  }

  /**
   * Gets the value of the '_2000BSBR02IndividualRelationshipCode' field.
   */
  public java.lang.CharSequence get2000BSBR02IndividualRelationshipCode$1() {
    return _2000BSBR02IndividualRelationshipCode;
  }

  /**
   * Sets the value of the '_2000BSBR02IndividualRelationshipCode' field.
   * @param value the value to set.
   */
  public void set2000BSBR02IndividualRelationshipCode$1(java.lang.CharSequence value) {
    this._2000BSBR02IndividualRelationshipCode = value;
  }

  /**
   * Gets the value of the '_2000BSBR03InsuredGroupOrPolicyNumber' field.
   */
  public java.lang.CharSequence get2000BSBR03InsuredGroupOrPolicyNumber$1() {
    return _2000BSBR03InsuredGroupOrPolicyNumber;
  }

  /**
   * Sets the value of the '_2000BSBR03InsuredGroupOrPolicyNumber' field.
   * @param value the value to set.
   */
  public void set2000BSBR03InsuredGroupOrPolicyNumber$1(java.lang.CharSequence value) {
    this._2000BSBR03InsuredGroupOrPolicyNumber = value;
  }

  /**
   * Gets the value of the '_2000BSBR04InsuredGroupName' field.
   */
  public java.lang.CharSequence get2000BSBR04InsuredGroupName$1() {
    return _2000BSBR04InsuredGroupName;
  }

  /**
   * Sets the value of the '_2000BSBR04InsuredGroupName' field.
   * @param value the value to set.
   */
  public void set2000BSBR04InsuredGroupName$1(java.lang.CharSequence value) {
    this._2000BSBR04InsuredGroupName = value;
  }

  /**
   * Gets the value of the '_2000BSBR09ClaimFilingIndicatorCode' field.
   */
  public java.lang.CharSequence get2000BSBR09ClaimFilingIndicatorCode$1() {
    return _2000BSBR09ClaimFilingIndicatorCode;
  }

  /**
   * Sets the value of the '_2000BSBR09ClaimFilingIndicatorCode' field.
   * @param value the value to set.
   */
  public void set2000BSBR09ClaimFilingIndicatorCode$1(java.lang.CharSequence value) {
    this._2000BSBR09ClaimFilingIndicatorCode = value;
  }

  /** Creates a new X837Ins_2000B_SBR_SubscriberInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder();
  }
  
  /** Creates a new X837Ins_2000B_SBR_SubscriberInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder(other);
  }
  
  /** Creates a new X837Ins_2000B_SBR_SubscriberInformation RecordBuilder by copying an existing X837Ins_2000B_SBR_SubscriberInformation instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2000B_SBR_SubscriberInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2000B_SBR_SubscriberInformation>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2000B_SBR_SubscriberInformation> {

    private java.lang.CharSequence _2000BSBR01PayerResponsibilitySequenceNumberCode;
    private java.lang.CharSequence _2000BSBR02IndividualRelationshipCode;
    private java.lang.CharSequence _2000BSBR03InsuredGroupOrPolicyNumber;
    private java.lang.CharSequence _2000BSBR04InsuredGroupName;
    private java.lang.CharSequence _2000BSBR09ClaimFilingIndicatorCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2000BSBR01PayerResponsibilitySequenceNumberCode)) {
        this._2000BSBR01PayerResponsibilitySequenceNumberCode = data().deepCopy(fields()[0].schema(), other._2000BSBR01PayerResponsibilitySequenceNumberCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2000BSBR02IndividualRelationshipCode)) {
        this._2000BSBR02IndividualRelationshipCode = data().deepCopy(fields()[1].schema(), other._2000BSBR02IndividualRelationshipCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2000BSBR03InsuredGroupOrPolicyNumber)) {
        this._2000BSBR03InsuredGroupOrPolicyNumber = data().deepCopy(fields()[2].schema(), other._2000BSBR03InsuredGroupOrPolicyNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2000BSBR04InsuredGroupName)) {
        this._2000BSBR04InsuredGroupName = data().deepCopy(fields()[3].schema(), other._2000BSBR04InsuredGroupName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2000BSBR09ClaimFilingIndicatorCode)) {
        this._2000BSBR09ClaimFilingIndicatorCode = data().deepCopy(fields()[4].schema(), other._2000BSBR09ClaimFilingIndicatorCode);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2000B_SBR_SubscriberInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2000BSBR01PayerResponsibilitySequenceNumberCode)) {
        this._2000BSBR01PayerResponsibilitySequenceNumberCode = data().deepCopy(fields()[0].schema(), other._2000BSBR01PayerResponsibilitySequenceNumberCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2000BSBR02IndividualRelationshipCode)) {
        this._2000BSBR02IndividualRelationshipCode = data().deepCopy(fields()[1].schema(), other._2000BSBR02IndividualRelationshipCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2000BSBR03InsuredGroupOrPolicyNumber)) {
        this._2000BSBR03InsuredGroupOrPolicyNumber = data().deepCopy(fields()[2].schema(), other._2000BSBR03InsuredGroupOrPolicyNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2000BSBR04InsuredGroupName)) {
        this._2000BSBR04InsuredGroupName = data().deepCopy(fields()[3].schema(), other._2000BSBR04InsuredGroupName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2000BSBR09ClaimFilingIndicatorCode)) {
        this._2000BSBR09ClaimFilingIndicatorCode = data().deepCopy(fields()[4].schema(), other._2000BSBR09ClaimFilingIndicatorCode);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the '_2000BSBR01PayerResponsibilitySequenceNumberCode' field */
    public java.lang.CharSequence get2000BSBR01PayerResponsibilitySequenceNumberCode$1() {
      return _2000BSBR01PayerResponsibilitySequenceNumberCode;
    }
    
    /** Sets the value of the '_2000BSBR01PayerResponsibilitySequenceNumberCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder set2000BSBR01PayerResponsibilitySequenceNumberCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2000BSBR01PayerResponsibilitySequenceNumberCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BSBR01PayerResponsibilitySequenceNumberCode' field has been set */
    public boolean has2000BSBR01PayerResponsibilitySequenceNumberCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2000BSBR01PayerResponsibilitySequenceNumberCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder clear2000BSBR01PayerResponsibilitySequenceNumberCode$1() {
      _2000BSBR01PayerResponsibilitySequenceNumberCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2000BSBR02IndividualRelationshipCode' field */
    public java.lang.CharSequence get2000BSBR02IndividualRelationshipCode$1() {
      return _2000BSBR02IndividualRelationshipCode;
    }
    
    /** Sets the value of the '_2000BSBR02IndividualRelationshipCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder set2000BSBR02IndividualRelationshipCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2000BSBR02IndividualRelationshipCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BSBR02IndividualRelationshipCode' field has been set */
    public boolean has2000BSBR02IndividualRelationshipCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2000BSBR02IndividualRelationshipCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder clear2000BSBR02IndividualRelationshipCode$1() {
      _2000BSBR02IndividualRelationshipCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2000BSBR03InsuredGroupOrPolicyNumber' field */
    public java.lang.CharSequence get2000BSBR03InsuredGroupOrPolicyNumber$1() {
      return _2000BSBR03InsuredGroupOrPolicyNumber;
    }
    
    /** Sets the value of the '_2000BSBR03InsuredGroupOrPolicyNumber' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder set2000BSBR03InsuredGroupOrPolicyNumber$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2000BSBR03InsuredGroupOrPolicyNumber = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BSBR03InsuredGroupOrPolicyNumber' field has been set */
    public boolean has2000BSBR03InsuredGroupOrPolicyNumber$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2000BSBR03InsuredGroupOrPolicyNumber' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder clear2000BSBR03InsuredGroupOrPolicyNumber$1() {
      _2000BSBR03InsuredGroupOrPolicyNumber = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2000BSBR04InsuredGroupName' field */
    public java.lang.CharSequence get2000BSBR04InsuredGroupName$1() {
      return _2000BSBR04InsuredGroupName;
    }
    
    /** Sets the value of the '_2000BSBR04InsuredGroupName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder set2000BSBR04InsuredGroupName$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2000BSBR04InsuredGroupName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BSBR04InsuredGroupName' field has been set */
    public boolean has2000BSBR04InsuredGroupName$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2000BSBR04InsuredGroupName' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder clear2000BSBR04InsuredGroupName$1() {
      _2000BSBR04InsuredGroupName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2000BSBR09ClaimFilingIndicatorCode' field */
    public java.lang.CharSequence get2000BSBR09ClaimFilingIndicatorCode$1() {
      return _2000BSBR09ClaimFilingIndicatorCode;
    }
    
    /** Sets the value of the '_2000BSBR09ClaimFilingIndicatorCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder set2000BSBR09ClaimFilingIndicatorCode$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2000BSBR09ClaimFilingIndicatorCode = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BSBR09ClaimFilingIndicatorCode' field has been set */
    public boolean has2000BSBR09ClaimFilingIndicatorCode$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2000BSBR09ClaimFilingIndicatorCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_SBR_SubscriberInformation.Builder clear2000BSBR09ClaimFilingIndicatorCode$1() {
      _2000BSBR09ClaimFilingIndicatorCode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public X837Ins_2000B_SBR_SubscriberInformation build() {
      try {
        X837Ins_2000B_SBR_SubscriberInformation record = new X837Ins_2000B_SBR_SubscriberInformation();
        record._2000BSBR01PayerResponsibilitySequenceNumberCode = fieldSetFlags()[0] ? this._2000BSBR01PayerResponsibilitySequenceNumberCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2000BSBR02IndividualRelationshipCode = fieldSetFlags()[1] ? this._2000BSBR02IndividualRelationshipCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2000BSBR03InsuredGroupOrPolicyNumber = fieldSetFlags()[2] ? this._2000BSBR03InsuredGroupOrPolicyNumber : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2000BSBR04InsuredGroupName = fieldSetFlags()[3] ? this._2000BSBR04InsuredGroupName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2000BSBR09ClaimFilingIndicatorCode = fieldSetFlags()[4] ? this._2000BSBR09ClaimFilingIndicatorCode : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
