/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2330E_NM1_OtherPayerRenderingProvider extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2330E_NM1_OtherPayerRenderingProvider\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2330ENM101EntityIdentifierCode\",\"type\":\"string\"},{\"name\":\"_2330ENM102EntityTypeQualifier\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2330ENM101EntityIdentifierCode;
  @Deprecated public java.lang.CharSequence _2330ENM102EntityTypeQualifier;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2330E_NM1_OtherPayerRenderingProvider() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2330E_NM1_OtherPayerRenderingProvider(java.lang.CharSequence _2330ENM101EntityIdentifierCode, java.lang.CharSequence _2330ENM102EntityTypeQualifier) {
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

  /** Creates a new X837Pro_2330E_NM1_OtherPayerRenderingProvider RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder();
  }
  
  /** Creates a new X837Pro_2330E_NM1_OtherPayerRenderingProvider RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder(other);
  }
  
  /** Creates a new X837Pro_2330E_NM1_OtherPayerRenderingProvider RecordBuilder by copying an existing X837Pro_2330E_NM1_OtherPayerRenderingProvider instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2330E_NM1_OtherPayerRenderingProvider instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2330E_NM1_OtherPayerRenderingProvider>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2330E_NM1_OtherPayerRenderingProvider> {

    private java.lang.CharSequence _2330ENM101EntityIdentifierCode;
    private java.lang.CharSequence _2330ENM102EntityTypeQualifier;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder other) {
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
    
    /** Creates a Builder by copying an existing X837Pro_2330E_NM1_OtherPayerRenderingProvider instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.SCHEMA$);
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
    public net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder set2330ENM101EntityIdentifierCode$1(java.lang.CharSequence value) {
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
    public net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder clear2330ENM101EntityIdentifierCode$1() {
      _2330ENM101EntityIdentifierCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2330ENM102EntityTypeQualifier' field */
    public java.lang.CharSequence get2330ENM102EntityTypeQualifier$1() {
      return _2330ENM102EntityTypeQualifier;
    }
    
    /** Sets the value of the '_2330ENM102EntityTypeQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder set2330ENM102EntityTypeQualifier$1(java.lang.CharSequence value) {
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
    public net.explorys.samhat.z12.r837.X837Pro_2330E_NM1_OtherPayerRenderingProvider.Builder clear2330ENM102EntityTypeQualifier$1() {
      _2330ENM102EntityTypeQualifier = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public X837Pro_2330E_NM1_OtherPayerRenderingProvider build() {
      try {
        X837Pro_2330E_NM1_OtherPayerRenderingProvider record = new X837Pro_2330E_NM1_OtherPayerRenderingProvider();
        record._2330ENM101EntityIdentifierCode = fieldSetFlags()[0] ? this._2330ENM101EntityIdentifierCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2330ENM102EntityTypeQualifier = fieldSetFlags()[1] ? this._2330ENM102EntityTypeQualifier : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}