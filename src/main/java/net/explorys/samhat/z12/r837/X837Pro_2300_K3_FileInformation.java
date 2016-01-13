/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2300_K3_FileInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2300_K3_FileInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2300K301FixedFormatInformation\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2300K301FixedFormatInformation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2300_K3_FileInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2300_K3_FileInformation(java.lang.CharSequence _2300K301FixedFormatInformation) {
    this._2300K301FixedFormatInformation = _2300K301FixedFormatInformation;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2300K301FixedFormatInformation;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2300K301FixedFormatInformation = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2300K301FixedFormatInformation' field.
   */
  public java.lang.CharSequence get2300K301FixedFormatInformation$1() {
    return _2300K301FixedFormatInformation;
  }

  /**
   * Sets the value of the '_2300K301FixedFormatInformation' field.
   * @param value the value to set.
   */
  public void set2300K301FixedFormatInformation$1(java.lang.CharSequence value) {
    this._2300K301FixedFormatInformation = value;
  }

  /** Creates a new X837Pro_2300_K3_FileInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder();
  }
  
  /** Creates a new X837Pro_2300_K3_FileInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2300_K3_FileInformation RecordBuilder by copying an existing X837Pro_2300_K3_FileInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2300_K3_FileInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2300_K3_FileInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2300_K3_FileInformation> {

    private java.lang.CharSequence _2300K301FixedFormatInformation;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2300K301FixedFormatInformation)) {
        this._2300K301FixedFormatInformation = data().deepCopy(fields()[0].schema(), other._2300K301FixedFormatInformation);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2300_K3_FileInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2300K301FixedFormatInformation)) {
        this._2300K301FixedFormatInformation = data().deepCopy(fields()[0].schema(), other._2300K301FixedFormatInformation);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the '_2300K301FixedFormatInformation' field */
    public java.lang.CharSequence get2300K301FixedFormatInformation$1() {
      return _2300K301FixedFormatInformation;
    }
    
    /** Sets the value of the '_2300K301FixedFormatInformation' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder set2300K301FixedFormatInformation$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2300K301FixedFormatInformation = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2300K301FixedFormatInformation' field has been set */
    public boolean has2300K301FixedFormatInformation$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2300K301FixedFormatInformation' field */
    public net.explorys.samhat.z12.r837.X837Pro_2300_K3_FileInformation.Builder clear2300K301FixedFormatInformation$1() {
      _2300K301FixedFormatInformation = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public X837Pro_2300_K3_FileInformation build() {
      try {
        X837Pro_2300_K3_FileInformation record = new X837Pro_2300_K3_FileInformation();
        record._2300K301FixedFormatInformation = fieldSetFlags()[0] ? this._2300K301FixedFormatInformation : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
