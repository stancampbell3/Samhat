/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2300_DTP_StatementDates extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2300_DTP_StatementDates\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300DTP01DateTimeQualifier\",\"type\":\"string\"},{\"name\":\"_2300DTP02DateTimePeriodFormatQualifier\",\"type\":\"string\"},{\"name\":\"_2300DTP03StatementFromOrToDate\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300DTP01DateTimeQualifier;
  @Deprecated public java.lang.CharSequence _2300DTP02DateTimePeriodFormatQualifier;
  @Deprecated public java.lang.CharSequence _2300DTP03StatementFromOrToDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2300_DTP_StatementDates() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2300_DTP_StatementDates(java.lang.CharSequence _2300DTP01DateTimeQualifier, java.lang.CharSequence _2300DTP02DateTimePeriodFormatQualifier, java.lang.CharSequence _2300DTP03StatementFromOrToDate) {
    this._2300DTP01DateTimeQualifier = _2300DTP01DateTimeQualifier;
    this._2300DTP02DateTimePeriodFormatQualifier = _2300DTP02DateTimePeriodFormatQualifier;
    this._2300DTP03StatementFromOrToDate = _2300DTP03StatementFromOrToDate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300DTP01DateTimeQualifier;
    case 1: return _2300DTP02DateTimePeriodFormatQualifier;
    case 2: return _2300DTP03StatementFromOrToDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300DTP01DateTimeQualifier = (java.lang.CharSequence)value$; break;
    case 1: _2300DTP02DateTimePeriodFormatQualifier = (java.lang.CharSequence)value$; break;
    case 2: _2300DTP03StatementFromOrToDate = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300DTP01DateTimeQualifier' field.
   */
  public java.lang.CharSequence get2300DTP01DateTimeQualifier$1() {
    return _2300DTP01DateTimeQualifier;
  }

  /**
   * Sets the value of the '_2300DTP01DateTimeQualifier' field.
   * @param value the value to set.
   */
  public void set2300DTP01DateTimeQualifier$1(java.lang.CharSequence value) {
    this._2300DTP01DateTimeQualifier = value;
  }

  /**
   * Gets the value of the '_2300DTP02DateTimePeriodFormatQualifier' field.
   */
  public java.lang.CharSequence get2300DTP02DateTimePeriodFormatQualifier$1() {
    return _2300DTP02DateTimePeriodFormatQualifier;
  }

  /**
   * Sets the value of the '_2300DTP02DateTimePeriodFormatQualifier' field.
   * @param value the value to set.
   */
  public void set2300DTP02DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
    this._2300DTP02DateTimePeriodFormatQualifier = value;
  }

  /**
   * Gets the value of the '_2300DTP03StatementFromOrToDate' field.
   */
  public java.lang.CharSequence get2300DTP03StatementFromOrToDate$1() {
    return _2300DTP03StatementFromOrToDate;
  }

  /**
   * Sets the value of the '_2300DTP03StatementFromOrToDate' field.
   * @param value the value to set.
   */
  public void set2300DTP03StatementFromOrToDate$1(java.lang.CharSequence value) {
    this._2300DTP03StatementFromOrToDate = value;
  }

  /** Creates a new X837Ins_2300_DTP_StatementDates RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder();
  }
  
  /** Creates a new X837Ins_2300_DTP_StatementDates RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder(other);
  }
  
  /** Creates a new X837Ins_2300_DTP_StatementDates RecordBuilder by copying an existing X837Ins_2300_DTP_StatementDates instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2300_DTP_StatementDates instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2300_DTP_StatementDates>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2300_DTP_StatementDates> {

    private java.lang.CharSequence _2300DTP01DateTimeQualifier;
    private java.lang.CharSequence _2300DTP02DateTimePeriodFormatQualifier;
    private java.lang.CharSequence _2300DTP03StatementFromOrToDate;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300DTP01DateTimeQualifier)) {
        this._2300DTP01DateTimeQualifier = data().deepCopy(fields()[0].schema(), other._2300DTP01DateTimeQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300DTP02DateTimePeriodFormatQualifier)) {
        this._2300DTP02DateTimePeriodFormatQualifier = data().deepCopy(fields()[1].schema(), other._2300DTP02DateTimePeriodFormatQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2300DTP03StatementFromOrToDate)) {
        this._2300DTP03StatementFromOrToDate = data().deepCopy(fields()[2].schema(), other._2300DTP03StatementFromOrToDate);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2300_DTP_StatementDates instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.SCHEMA$);
      if (isValidValue(fields()[0], other._2300DTP01DateTimeQualifier)) {
        this._2300DTP01DateTimeQualifier = data().deepCopy(fields()[0].schema(), other._2300DTP01DateTimeQualifier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300DTP02DateTimePeriodFormatQualifier)) {
        this._2300DTP02DateTimePeriodFormatQualifier = data().deepCopy(fields()[1].schema(), other._2300DTP02DateTimePeriodFormatQualifier);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2300DTP03StatementFromOrToDate)) {
        this._2300DTP03StatementFromOrToDate = data().deepCopy(fields()[2].schema(), other._2300DTP03StatementFromOrToDate);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the '_2300DTP01DateTimeQualifier' field */
    public java.lang.CharSequence get2300DTP01DateTimeQualifier$1() {
      return _2300DTP01DateTimeQualifier;
    }
    
    /** Sets the value of the '_2300DTP01DateTimeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder set2300DTP01DateTimeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300DTP01DateTimeQualifier = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300DTP01DateTimeQualifier' field has been set */
    public boolean has2300DTP01DateTimeQualifier$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300DTP01DateTimeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder clear2300DTP01DateTimeQualifier$1() {
      _2300DTP01DateTimeQualifier = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300DTP02DateTimePeriodFormatQualifier' field */
    public java.lang.CharSequence get2300DTP02DateTimePeriodFormatQualifier$1() {
      return _2300DTP02DateTimePeriodFormatQualifier;
    }
    
    /** Sets the value of the '_2300DTP02DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder set2300DTP02DateTimePeriodFormatQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300DTP02DateTimePeriodFormatQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300DTP02DateTimePeriodFormatQualifier' field has been set */
    public boolean has2300DTP02DateTimePeriodFormatQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300DTP02DateTimePeriodFormatQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder clear2300DTP02DateTimePeriodFormatQualifier$1() {
      _2300DTP02DateTimePeriodFormatQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2300DTP03StatementFromOrToDate' field */
    public java.lang.CharSequence get2300DTP03StatementFromOrToDate$1() {
      return _2300DTP03StatementFromOrToDate;
    }
    
    /** Sets the value of the '_2300DTP03StatementFromOrToDate' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder set2300DTP03StatementFromOrToDate$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2300DTP03StatementFromOrToDate = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2300DTP03StatementFromOrToDate' field has been set */
    public boolean has2300DTP03StatementFromOrToDate$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2300DTP03StatementFromOrToDate' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_DTP_StatementDates.Builder clear2300DTP03StatementFromOrToDate$1() {
      _2300DTP03StatementFromOrToDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public X837Ins_2300_DTP_StatementDates build() {
      try {
        X837Ins_2300_DTP_StatementDates record = new X837Ins_2300_DTP_StatementDates();
        record._2300DTP01DateTimeQualifier = fieldSetFlags()[0] ? this._2300DTP01DateTimeQualifier : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300DTP02DateTimePeriodFormatQualifier = fieldSetFlags()[1] ? this._2300DTP02DateTimePeriodFormatQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2300DTP03StatementFromOrToDate = fieldSetFlags()[2] ? this._2300DTP03StatementFromOrToDate : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
