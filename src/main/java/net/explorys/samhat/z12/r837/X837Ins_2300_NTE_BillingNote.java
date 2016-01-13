/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2300_NTE_BillingNote extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2300_NTE_BillingNote\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300NTE01NoteReferenceCode\",\"type\":\"string\"},{\"name\":\"_2300NTE02BillingNoteText\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300NTE01NoteReferenceCode;
  @Deprecated public java.lang.CharSequence _2300NTE02BillingNoteText;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2300_NTE_BillingNote() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2300_NTE_BillingNote(java.lang.CharSequence _2300NTE01NoteReferenceCode, java.lang.CharSequence _2300NTE02BillingNoteText) {
    this._2300NTE01NoteReferenceCode = _2300NTE01NoteReferenceCode;
    this._2300NTE02BillingNoteText = _2300NTE02BillingNoteText;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300NTE01NoteReferenceCode;
    case 1: return _2300NTE02BillingNoteText;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300NTE01NoteReferenceCode = (java.lang.CharSequence)value$; break;
    case 1: _2300NTE02BillingNoteText = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300NTE01NoteReferenceCode' field.
   */
  public java.lang.CharSequence get2300NTE01NoteReferenceCode$1() {
    return _2300NTE01NoteReferenceCode;
  }

  /**
   * Sets the value of the '_2300NTE01NoteReferenceCode' field.
   * @param value the value to set.
   */
  public void set2300NTE01NoteReferenceCode$1(java.lang.CharSequence value) {
    this._2300NTE01NoteReferenceCode = value;
  }

  /**
   * Gets the value of the '_2300NTE02BillingNoteText' field.
   */
  public java.lang.CharSequence get2300NTE02BillingNoteText$1() {
    return _2300NTE02BillingNoteText;
  }

  /**
   * Sets the value of the '_2300NTE02BillingNoteText' field.
   * @param value the value to set.
   */
  public void set2300NTE02BillingNoteText$1(java.lang.CharSequence value) {
    this._2300NTE02BillingNoteText = value;
  }

  /** Creates a new X837Ins_2300_NTE_BillingNote RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder();
  }
  
  /** Creates a new X837Ins_2300_NTE_BillingNote RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder(other);
  }
  
  /** Creates a new X837Ins_2300_NTE_BillingNote RecordBuilder by copying an existing X837Ins_2300_NTE_BillingNote instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2300_NTE_BillingNote instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2300_NTE_BillingNote>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2300_NTE_BillingNote> {

    private java.lang.CharSequence _2300NTE01NoteReferenceCode;
    private java.lang.CharSequence _2300NTE02BillingNoteText;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300NTE01NoteReferenceCode)) {
        this._2300NTE01NoteReferenceCode = data().deepCopy(fields()[0].schema(), other._2300NTE01NoteReferenceCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300NTE02BillingNoteText)) {
        this._2300NTE02BillingNoteText = data().deepCopy(fields()[1].schema(), other._2300NTE02BillingNoteText);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2300_NTE_BillingNote instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.SCHEMA$);
      if (isValidValue(fields()[0], other._2300NTE01NoteReferenceCode)) {
        this._2300NTE01NoteReferenceCode = data().deepCopy(fields()[0].schema(), other._2300NTE01NoteReferenceCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2300NTE02BillingNoteText)) {
        this._2300NTE02BillingNoteText = data().deepCopy(fields()[1].schema(), other._2300NTE02BillingNoteText);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2300NTE01NoteReferenceCode' field */
    public java.lang.CharSequence get2300NTE01NoteReferenceCode$1() {
      return _2300NTE01NoteReferenceCode;
    }
    
    /** Sets the value of the '_2300NTE01NoteReferenceCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder set2300NTE01NoteReferenceCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300NTE01NoteReferenceCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300NTE01NoteReferenceCode' field has been set */
    public boolean has2300NTE01NoteReferenceCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300NTE01NoteReferenceCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder clear2300NTE01NoteReferenceCode$1() {
      _2300NTE01NoteReferenceCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2300NTE02BillingNoteText' field */
    public java.lang.CharSequence get2300NTE02BillingNoteText$1() {
      return _2300NTE02BillingNoteText;
    }
    
    /** Sets the value of the '_2300NTE02BillingNoteText' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder set2300NTE02BillingNoteText$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2300NTE02BillingNoteText = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2300NTE02BillingNoteText' field has been set */
    public boolean has2300NTE02BillingNoteText$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2300NTE02BillingNoteText' field */
    public net.explorys.samhat.z12.r837.X837Ins_2300_NTE_BillingNote.Builder clear2300NTE02BillingNoteText$1() {
      _2300NTE02BillingNoteText = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2300_NTE_BillingNote build() {
      try {
        X837Ins_2300_NTE_BillingNote record = new X837Ins_2300_NTE_BillingNote();
        record._2300NTE01NoteReferenceCode = fieldSetFlags()[0] ? this._2300NTE01NoteReferenceCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2300NTE02BillingNoteText = fieldSetFlags()[1] ? this._2300NTE02BillingNoteText : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
