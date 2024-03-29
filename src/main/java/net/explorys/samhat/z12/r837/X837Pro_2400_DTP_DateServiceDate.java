/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2400_DTP_DateServiceDate extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2400_DTP_DateServiceDate\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2400DTP01DateTimeQualifier\",\"type\":\"string\"},{\"name\":\"_2400DTP02DateTimePeriodFormatQualifier\",\"type\":\"string\"},{\"name\":\"_2400DTP03ServiceDate\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2400DTP01DateTimeQualifier;
  @Deprecated public java.lang.CharSequence _2400DTP02DateTimePeriodFormatQualifier;
  @Deprecated public java.lang.CharSequence _2400DTP03ServiceDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2400_DTP_DateServiceDate() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2400_DTP_DateServiceDate(java.lang.CharSequence _2400DTP01DateTimeQualifier, java.lang.CharSequence _2400DTP02DateTimePeriodFormatQualifier, java.lang.CharSequence _2400DTP03ServiceDate) {
    this._2400DTP01DateTimeQualifier = _2400DTP01DateTimeQualifier;
    this._2400DTP02DateTimePeriodFormatQualifier = _2400DTP02DateTimePeriodFormatQualifier;
    this._2400DTP03ServiceDate = _2400DTP03ServiceDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2400DTP01DateTimeQualifier;
    case 1: return _2400DTP02DateTimePeriodFormatQualifier;
    case 2: return _2400DTP03ServiceDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2400DTP01DateTimeQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2400DTP02DateTimePeriodFormatQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2400DTP03ServiceDate = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2400DTP01DateTimeQualifier' field.
   */
  public java.lang.CharSequence get2400DTP01DateTimeQualifier$1() {
    return _2400DTP01DateTimeQualifier;
  }

  /**
   * Sets the value of the '_2400DTP01DateTimeQualifier' field.
   * @param value the value to set.
   */
  public void set2400DTP01DateTimeQualifier$1(java.lang.CharSequence value) {
    this._2400DTP01DateTimeQualifier = value;
  }

  /**
   * Gets the value of the '_2400DTP02DateTimePeriodFormatQualifier' field.
   */
  public java.lang.CharSequence get2400DTP02DateTimePeriodFormatQualifier$1() {
    return _2400DTP02DateTimePeriodFormatQualifier;
  }

  /**
   * Sets the value of the '_2400DTP02DateTimePeriodFormatQualifier' field.
   * @param value the value to set.
   */
  public void set2400DTP02DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
    this._2400DTP02DateTimePeriodFormatQualifier = value;
  }

  /**
   * Gets the value of the '_2400DTP03ServiceDate' field.
   */
  public java.lang.CharSequence get2400DTP03ServiceDate$1() {
    return _2400DTP03ServiceDate;
  }

  /**
   * Sets the value of the '_2400DTP03ServiceDate' field.
   * @param value the value to set.
   */
  public void set2400DTP03ServiceDate$1(java.lang.CharSequence value) {
    this._2400DTP03ServiceDate = value;
  }

  /** Creates a new X837Pro_2400_DTP_DateServiceDate RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder();
  }
  
  /** Creates a new X837Pro_2400_DTP_DateServiceDate RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder(other);
  }
  
  /** Creates a new X837Pro_2400_DTP_DateServiceDate RecordBuilder by copying an existing X837Pro_2400_DTP_DateServiceDate instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2400_DTP_DateServiceDate instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2400_DTP_DateServiceDate>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2400_DTP_DateServiceDate> {

    private java.lang.CharSequence _2400DTP01DateTimeQualifier;
    private java.lang.CharSequence _2400DTP02DateTimePeriodFormatQualifier;
    private java.lang.CharSequence _2400DTP03ServiceDate;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2400DTP01DateTimeQualifier)) {
        this._2400DTP01DateTimeQualifier = data().deepCopy(fields()[0].schema(), other._2400DTP01DateTimeQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400DTP02DateTimePeriodFormatQualifier)) {
        this._2400DTP02DateTimePeriodFormatQualifier = data().deepCopy(fields()[1].schema(), other._2400DTP02DateTimePeriodFormatQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400DTP03ServiceDate)) {
        this._2400DTP03ServiceDate = data().deepCopy(fields()[2].schema(), other._2400DTP03ServiceDate);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2400_DTP_DateServiceDate instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.SCHEMA$);
      if (isValidValue(fields()[0], other._2400DTP01DateTimeQualifier)) {
        this._2400DTP01DateTimeQualifier = data().deepCopy(fields()[0].schema(), other._2400DTP01DateTimeQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2400DTP02DateTimePeriodFormatQualifier)) {
        this._2400DTP02DateTimePeriodFormatQualifier = data().deepCopy(fields()[1].schema(), other._2400DTP02DateTimePeriodFormatQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2400DTP03ServiceDate)) {
        this._2400DTP03ServiceDate = data().deepCopy(fields()[2].schema(), other._2400DTP03ServiceDate);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2400DTP01DateTimeQualifier' field */
    public java.lang.CharSequence get2400DTP01DateTimeQualifier$1() {
      return _2400DTP01DateTimeQualifier;
    }
    
    /** Sets the value of the '_2400DTP01DateTimeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder set2400DTP01DateTimeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2400DTP01DateTimeQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2400DTP01DateTimeQualifier' field has been set */
    public boolean has2400DTP01DateTimeQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2400DTP01DateTimeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder clear2400DTP01DateTimeQualifier$1() {
      _2400DTP01DateTimeQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2400DTP02DateTimePeriodFormatQualifier' field */
    public java.lang.CharSequence get2400DTP02DateTimePeriodFormatQualifier$1() {
      return _2400DTP02DateTimePeriodFormatQualifier;
    }
    
    /** Sets the value of the '_2400DTP02DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder set2400DTP02DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2400DTP02DateTimePeriodFormatQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2400DTP02DateTimePeriodFormatQualifier' field has been set */
    public boolean has2400DTP02DateTimePeriodFormatQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2400DTP02DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder clear2400DTP02DateTimePeriodFormatQualifier$1() {
      _2400DTP02DateTimePeriodFormatQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2400DTP03ServiceDate' field */
    public java.lang.CharSequence get2400DTP03ServiceDate$1() {
      return _2400DTP03ServiceDate;
    }
    
    /** Sets the value of the '_2400DTP03ServiceDate' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder set2400DTP03ServiceDate$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2400DTP03ServiceDate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2400DTP03ServiceDate' field has been set */
    public boolean has2400DTP03ServiceDate$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2400DTP03ServiceDate' field */
    public net.explorys.samhat.z12.r837.X837Pro_2400_DTP_DateServiceDate.Builder clear2400DTP03ServiceDate$1() {
      _2400DTP03ServiceDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Pro_2400_DTP_DateServiceDate build() {
      try {
        X837Pro_2400_DTP_DateServiceDate record = new X837Pro_2400_DTP_DateServiceDate();
        record._2400DTP01DateTimeQualifier = fieldSetFlags()[0] ? this._2400DTP01DateTimeQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2400DTP02DateTimePeriodFormatQualifier = fieldSetFlags()[1] ? this._2400DTP02DateTimePeriodFormatQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2400DTP03ServiceDate = fieldSetFlags()[2] ? this._2400DTP03ServiceDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
