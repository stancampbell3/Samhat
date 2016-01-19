/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2400_PWK_DMERCCMNIndicator extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2400_PWK_DMERCCMNIndicator\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2400PWK01AttachmentReportTypeCode\",\"type\":\"string\"},{\"name\":\"_2400PWK02AttachmentTransmissionCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2400PWK01AttachmentReportTypeCode;
  @Deprecated public java.lang.CharSequence _2400PWK02AttachmentTransmissionCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2400_PWK_DMERCCMNIndicator() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2400_PWK_DMERCCMNIndicator(java.lang.CharSequence _2400PWK01AttachmentReportTypeCode, java.lang.CharSequence _2400PWK02AttachmentTransmissionCode) {
    this._2400PWK01AttachmentReportTypeCode = _2400PWK01AttachmentReportTypeCode;
    this._2400PWK02AttachmentTransmissionCode = _2400PWK02AttachmentTransmissionCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2400PWK01AttachmentReportTypeCode;
    case 1: return _2400PWK02AttachmentTransmissionCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2400PWK01AttachmentReportTypeCode = (java.lang.CharSequence)value$; break;
    case 1: _2400PWK02AttachmentTransmissionCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2400PWK01AttachmentReportTypeCode' field.
   */
  public java.lang.CharSequence get2400PWK01AttachmentReportTypeCode$1() {
    return _2400PWK01AttachmentReportTypeCode;
  }

  /**
   * Sets the value of the '_2400PWK01AttachmentReportTypeCode' field.
   * @param value the value to set.
   */
  public void set2400PWK01AttachmentReportTypeCode$1(java.lang.CharSequence value) {
    this._2400PWK01AttachmentReportTypeCode = value;
  }

  /**
   * Gets the value of the '_2400PWK02AttachmentTransmissionCode' field.
   */
  public java.lang.CharSequence get2400PWK02AttachmentTransmissionCode$1() {
    return _2400PWK02AttachmentTransmissionCode;
  }

  /**
   * Sets the value of the '_2400PWK02AttachmentTransmissionCode' field.
   * @param value the value to set.
   */
  public void set2400PWK02AttachmentTransmissionCode$1(java.lang.CharSequence value) {
    this._2400PWK02AttachmentTransmissionCode = value;
  }

  /** Creates a new X837Pro_2400_PWK_DMERCCMNIndicator RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder();
  }
  
  /** Creates a new X837Pro_2400_PWK_DMERCCMNIndicator RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder(other);
  }
  
  /** Creates a new X837Pro_2400_PWK_DMERCCMNIndicator RecordBuilder by copying an existing X837Pro_2400_PWK_DMERCCMNIndicator instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2400_PWK_DMERCCMNIndicator instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2400_PWK_DMERCCMNIndicator>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2400_PWK_DMERCCMNIndicator> {

    private java.lang.CharSequence _2400PWK01AttachmentReportTypeCode;
    private java.lang.CharSequence _2400PWK02AttachmentTransmissionCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2400PWK01AttachmentReportTypeCode)) {
        this._2400PWK01AttachmentReportTypeCode = data().deepCopy(fields()[0].schema(), other._2400PWK01AttachmentReportTypeCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400PWK02AttachmentTransmissionCode)) {
        this._2400PWK02AttachmentTransmissionCode = data().deepCopy(fields()[1].schema(), other._2400PWK02AttachmentTransmissionCode);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2400_PWK_DMERCCMNIndicator instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.SCHEMA$);
      if (isValidValue(fields()[0], other._2400PWK01AttachmentReportTypeCode)) {
        this._2400PWK01AttachmentReportTypeCode = data().deepCopy(fields()[0].schema(), other._2400PWK01AttachmentReportTypeCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400PWK02AttachmentTransmissionCode)) {
        this._2400PWK02AttachmentTransmissionCode = data().deepCopy(fields()[1].schema(), other._2400PWK02AttachmentTransmissionCode);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2400PWK01AttachmentReportTypeCode' field */
    public java.lang.CharSequence get2400PWK01AttachmentReportTypeCode$1() {
      return _2400PWK01AttachmentReportTypeCode;
    }
    
    /** Sets the value of the '_2400PWK01AttachmentReportTypeCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder set2400PWK01AttachmentReportTypeCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2400PWK01AttachmentReportTypeCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2400PWK01AttachmentReportTypeCode' field has been set */
    public boolean has2400PWK01AttachmentReportTypeCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2400PWK01AttachmentReportTypeCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder clear2400PWK01AttachmentReportTypeCode$1() {
      _2400PWK01AttachmentReportTypeCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2400PWK02AttachmentTransmissionCode' field */
    public java.lang.CharSequence get2400PWK02AttachmentTransmissionCode$1() {
      return _2400PWK02AttachmentTransmissionCode;
    }
    
    /** Sets the value of the '_2400PWK02AttachmentTransmissionCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder set2400PWK02AttachmentTransmissionCode$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2400PWK02AttachmentTransmissionCode = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2400PWK02AttachmentTransmissionCode' field has been set */
    public boolean has2400PWK02AttachmentTransmissionCode$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2400PWK02AttachmentTransmissionCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_PWK_DMERCCMNIndicator.Builder clear2400PWK02AttachmentTransmissionCode$1() {
      _2400PWK02AttachmentTransmissionCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Pro_2400_PWK_DMERCCMNIndicator build() {
      try {
        X837Pro_2400_PWK_DMERCCMNIndicator record = new X837Pro_2400_PWK_DMERCCMNIndicator();
        record._2400PWK01AttachmentReportTypeCode = fieldSetFlags()[0] ? this._2400PWK01AttachmentReportTypeCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2400PWK02AttachmentTransmissionCode = fieldSetFlags()[1] ? this._2400PWK02AttachmentTransmissionCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}