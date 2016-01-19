/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2000C_PAT_PatientInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2000C_PAT_PatientInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2000CPAT01IndividualRelationshipCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2000CPAT01IndividualRelationshipCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2000C_PAT_PatientInformation() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2000C_PAT_PatientInformation(java.lang.CharSequence _2000CPAT01IndividualRelationshipCode) {
    this._2000CPAT01IndividualRelationshipCode = _2000CPAT01IndividualRelationshipCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2000CPAT01IndividualRelationshipCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2000CPAT01IndividualRelationshipCode = (java.lang.CharSequence)value$; break;
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

  /** Creates a new X837Ins_2000C_PAT_PatientInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder();
  }
  
  /** Creates a new X837Ins_2000C_PAT_PatientInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder(other);
  }
  
  /** Creates a new X837Ins_2000C_PAT_PatientInformation RecordBuilder by copying an existing X837Ins_2000C_PAT_PatientInformation instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2000C_PAT_PatientInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2000C_PAT_PatientInformation>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2000C_PAT_PatientInformation> {

    private java.lang.CharSequence _2000CPAT01IndividualRelationshipCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2000CPAT01IndividualRelationshipCode)) {
        this._2000CPAT01IndividualRelationshipCode = data().deepCopy(fields()[0].schema(), other._2000CPAT01IndividualRelationshipCode);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2000C_PAT_PatientInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2000CPAT01IndividualRelationshipCode)) {
        this._2000CPAT01IndividualRelationshipCode = data().deepCopy(fields()[0].schema(), other._2000CPAT01IndividualRelationshipCode);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the '_2000CPAT01IndividualRelationshipCode' field */
    public java.lang.CharSequence get2000CPAT01IndividualRelationshipCode$1() {
      return _2000CPAT01IndividualRelationshipCode;
    }
    
    /** Sets the value of the '_2000CPAT01IndividualRelationshipCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder set2000CPAT01IndividualRelationshipCode$1(java.lang.CharSequence value) {
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
    public net.explorys.samhat.z12.r837.X837Ins_2000C_PAT_PatientInformation.Builder clear2000CPAT01IndividualRelationshipCode$1() {
      _2000CPAT01IndividualRelationshipCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public X837Ins_2000C_PAT_PatientInformation build() {
      try {
        X837Ins_2000C_PAT_PatientInformation record = new X837Ins_2000C_PAT_PatientInformation();
        record._2000CPAT01IndividualRelationshipCode = fieldSetFlags()[0] ? this._2000CPAT01IndividualRelationshipCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}