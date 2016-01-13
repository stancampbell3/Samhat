/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2330E_NM1_OtherPayerOperatingProvider extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2330E_NM1_OtherPayerOperatingProvider\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2330ENM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2330ENM102EntityTypeQualifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2330ENM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2330ENM102EntityTypeQualifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2330E_NM1_OtherPayerOperatingProvider() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2330E_NM1_OtherPayerOperatingProvider(java.lang.CharSequence _2330ENM101EntityIdentifierCode, java.lang.CharSequence _2330ENM102EntityTypeQualifier) {
    this._2330ENM101EntityIdentifierCode = _2330ENM101EntityIdentifierCode;
    this._2330ENM102EntityTypeQualifier = _2330ENM102EntityTypeQualifier;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2330ENM101EntityIdentifierCode;
    case 1: return _2330ENM102EntityTypeQualifier;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2330ENM101EntityIdentifierCode = (java.lang.CharSequence)value$; break;
    case 1: _2330ENM102EntityTypeQualifier = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2330ENM101EntityIdentifierCode' field.
   */
  public java.lang.CharSequence get2330ENM101EntityIdentifierCode$1() {
    return _2330ENM101EntityIdentifierCode;
  }

  /**
   * Sets the value of the '_2330ENM101EntityIdentifierCode' field.
   * @param value the value to set.
   */
  public void set2330ENM101EntityIdentifierCode$1(java.lang.CharSequence value) {
    this._2330ENM101EntityIdentifierCode = value;
  }

  /**
   * Gets the value of the '_2330ENM102EntityTypeQualifier' field.
   */
  public java.lang.CharSequence get2330ENM102EntityTypeQualifier$1() {
    return _2330ENM102EntityTypeQualifier;
  }

  /**
   * Sets the value of the '_2330ENM102EntityTypeQualifier' field.
   * @param value the value to set.
   */
  public void set2330ENM102EntityTypeQualifier$1(java.lang.CharSequence value) {
    this._2330ENM102EntityTypeQualifier = value;
  }

  /** Creates a new X837Ins_2330E_NM1_OtherPayerOperatingProvider RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder();
  }
  
  /** Creates a new X837Ins_2330E_NM1_OtherPayerOperatingProvider RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder(other);
  }
  
  /** Creates a new X837Ins_2330E_NM1_OtherPayerOperatingProvider RecordBuilder by copying an existing X837Ins_2330E_NM1_OtherPayerOperatingProvider instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2330E_NM1_OtherPayerOperatingProvider instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2330E_NM1_OtherPayerOperatingProvider>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2330E_NM1_OtherPayerOperatingProvider> {

    private java.lang.CharSequence _2330ENM101EntityIdentifierCode;
    private java.lang.CharSequence _2330ENM102EntityTypeQualifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2330ENM101EntityIdentifierCode)) {
        this._2330ENM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2330ENM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330ENM102EntityTypeQualifier)) {
        this._2330ENM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2330ENM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2330E_NM1_OtherPayerOperatingProvider instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.SCHEMA$);
      if (isValidValue(fields()[0], other._2330ENM101EntityIdentifierCode)) {
        this._2330ENM101EntityIdentifierCode = data().deepCopy(fields()[0].schema(), other._2330ENM101EntityIdentifierCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330ENM102EntityTypeQualifier)) {
        this._2330ENM102EntityTypeQualifier = data().deepCopy(fields()[1].schema(), other._2330ENM102EntityTypeQualifier);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the '_2330ENM101EntityIdentifierCode' field */
    public java.lang.CharSequence get2330ENM101EntityIdentifierCode$1() {
      return _2330ENM101EntityIdentifierCode;
    }
    
    /** Sets the value of the '_2330ENM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder set2330ENM101EntityIdentifierCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2330ENM101EntityIdentifierCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2330ENM101EntityIdentifierCode' field has been set */
    public boolean has2330ENM101EntityIdentifierCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2330ENM101EntityIdentifierCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder clear2330ENM101EntityIdentifierCode$1() {
      _2330ENM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2330ENM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2330ENM102EntityTypeQualifier$1() {
      return _2330ENM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2330ENM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder set2330ENM102EntityTypeQualifier$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2330ENM102EntityTypeQualifier = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2330ENM102EntityTypeQualifier' field has been set */
    public boolean has2330ENM102EntityTypeQualifier$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2330ENM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Ins_2330E_NM1_OtherPayerOperatingProvider.Builder clear2330ENM102EntityTypeQualifier$1() {
      _2330ENM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Ins_2330E_NM1_OtherPayerOperatingProvider build() {
      try {
        X837Ins_2330E_NM1_OtherPayerOperatingProvider record = new X837Ins_2330E_NM1_OtherPayerOperatingProvider();
        record._2330ENM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2330ENM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2330ENM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2330ENM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
