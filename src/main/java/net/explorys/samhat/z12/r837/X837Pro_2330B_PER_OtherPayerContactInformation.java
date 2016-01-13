/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Pro_2330B_PER_OtherPayerContactInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Pro_2330B_PER_OtherPayerContactInformation\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2330BPER01ContactFunctionCode\",\"type\":\"string\"},{\"name\":\"_2330BPER02OtherPayerContactName\",\"type\":\"string\"},{\"name\":\"_2330BPER03CommunicationNumberQualifier\",\"type\":\"string\"},{\"name\":\"_2330BPER04CommunicationNumber\",\"type\":\"string\"},{\"name\":\"_2330BPER05CommunicationNumberQualifier\",\"type\":\"string\"},{\"name\":\"_2330BPER06CommunicationNumber\",\"type\":\"string\"},{\"name\":\"_2330BPER07CommunicationNumberQualifier\",\"type\":\"string\"},{\"name\":\"_2330BPER08CommunicationNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2330BPER01ContactFunctionCode;
  @Deprecated public java.lang.CharSequence _2330BPER02OtherPayerContactName;
  @Deprecated public java.lang.CharSequence _2330BPER03CommunicationNumberQualifier;
  @Deprecated public java.lang.CharSequence _2330BPER04CommunicationNumber;
  @Deprecated public java.lang.CharSequence _2330BPER05CommunicationNumberQualifier;
  @Deprecated public java.lang.CharSequence _2330BPER06CommunicationNumber;
  @Deprecated public java.lang.CharSequence _2330BPER07CommunicationNumberQualifier;
  @Deprecated public java.lang.CharSequence _2330BPER08CommunicationNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Pro_2330B_PER_OtherPayerContactInformation() {}

  /**
   * All-args constructor.
   */
  public X837Pro_2330B_PER_OtherPayerContactInformation(java.lang.CharSequence _2330BPER01ContactFunctionCode, java.lang.CharSequence _2330BPER02OtherPayerContactName, java.lang.CharSequence _2330BPER03CommunicationNumberQualifier, java.lang.CharSequence _2330BPER04CommunicationNumber, java.lang.CharSequence _2330BPER05CommunicationNumberQualifier, java.lang.CharSequence _2330BPER06CommunicationNumber, java.lang.CharSequence _2330BPER07CommunicationNumberQualifier, java.lang.CharSequence _2330BPER08CommunicationNumber) {
    this._2330BPER01ContactFunctionCode = _2330BPER01ContactFunctionCode;
    this._2330BPER02OtherPayerContactName = _2330BPER02OtherPayerContactName;
    this._2330BPER03CommunicationNumberQualifier = _2330BPER03CommunicationNumberQualifier;
    this._2330BPER04CommunicationNumber = _2330BPER04CommunicationNumber;
    this._2330BPER05CommunicationNumberQualifier = _2330BPER05CommunicationNumberQualifier;
    this._2330BPER06CommunicationNumber = _2330BPER06CommunicationNumber;
    this._2330BPER07CommunicationNumberQualifier = _2330BPER07CommunicationNumberQualifier;
    this._2330BPER08CommunicationNumber = _2330BPER08CommunicationNumber;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2330BPER01ContactFunctionCode;
    case 1: return _2330BPER02OtherPayerContactName;
    case 2: return _2330BPER03CommunicationNumberQualifier;
    case 3: return _2330BPER04CommunicationNumber;
    case 4: return _2330BPER05CommunicationNumberQualifier;
    case 5: return _2330BPER06CommunicationNumber;
    case 6: return _2330BPER07CommunicationNumberQualifier;
    case 7: return _2330BPER08CommunicationNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2330BPER01ContactFunctionCode = (java.lang.CharSequence)value$; break;
    case 1: _2330BPER02OtherPayerContactName = (java.lang.CharSequence)value$; break;
    case 2: _2330BPER03CommunicationNumberQualifier = (java.lang.CharSequence)value$; break;
    case 3: _2330BPER04CommunicationNumber = (java.lang.CharSequence)value$; break;
    case 4: _2330BPER05CommunicationNumberQualifier = (java.lang.CharSequence)value$; break;
    case 5: _2330BPER06CommunicationNumber = (java.lang.CharSequence)value$; break;
    case 6: _2330BPER07CommunicationNumberQualifier = (java.lang.CharSequence)value$; break;
    case 7: _2330BPER08CommunicationNumber = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2330BPER01ContactFunctionCode' field.
   */
  public java.lang.CharSequence get2330BPER01ContactFunctionCode$1() {
    return _2330BPER01ContactFunctionCode;
  }

  /**
   * Sets the value of the '_2330BPER01ContactFunctionCode' field.
   * @param value the value to set.
   */
  public void set2330BPER01ContactFunctionCode$1(java.lang.CharSequence value) {
    this._2330BPER01ContactFunctionCode = value;
  }

  /**
   * Gets the value of the '_2330BPER02OtherPayerContactName' field.
   */
  public java.lang.CharSequence get2330BPER02OtherPayerContactName$1() {
    return _2330BPER02OtherPayerContactName;
  }

  /**
   * Sets the value of the '_2330BPER02OtherPayerContactName' field.
   * @param value the value to set.
   */
  public void set2330BPER02OtherPayerContactName$1(java.lang.CharSequence value) {
    this._2330BPER02OtherPayerContactName = value;
  }

  /**
   * Gets the value of the '_2330BPER03CommunicationNumberQualifier' field.
   */
  public java.lang.CharSequence get2330BPER03CommunicationNumberQualifier$1() {
    return _2330BPER03CommunicationNumberQualifier;
  }

  /**
   * Sets the value of the '_2330BPER03CommunicationNumberQualifier' field.
   * @param value the value to set.
   */
  public void set2330BPER03CommunicationNumberQualifier$1(java.lang.CharSequence value) {
    this._2330BPER03CommunicationNumberQualifier = value;
  }

  /**
   * Gets the value of the '_2330BPER04CommunicationNumber' field.
   */
  public java.lang.CharSequence get2330BPER04CommunicationNumber$1() {
    return _2330BPER04CommunicationNumber;
  }

  /**
   * Sets the value of the '_2330BPER04CommunicationNumber' field.
   * @param value the value to set.
   */
  public void set2330BPER04CommunicationNumber$1(java.lang.CharSequence value) {
    this._2330BPER04CommunicationNumber = value;
  }

  /**
   * Gets the value of the '_2330BPER05CommunicationNumberQualifier' field.
   */
  public java.lang.CharSequence get2330BPER05CommunicationNumberQualifier$1() {
    return _2330BPER05CommunicationNumberQualifier;
  }

  /**
   * Sets the value of the '_2330BPER05CommunicationNumberQualifier' field.
   * @param value the value to set.
   */
  public void set2330BPER05CommunicationNumberQualifier$1(java.lang.CharSequence value) {
    this._2330BPER05CommunicationNumberQualifier = value;
  }

  /**
   * Gets the value of the '_2330BPER06CommunicationNumber' field.
   */
  public java.lang.CharSequence get2330BPER06CommunicationNumber$1() {
    return _2330BPER06CommunicationNumber;
  }

  /**
   * Sets the value of the '_2330BPER06CommunicationNumber' field.
   * @param value the value to set.
   */
  public void set2330BPER06CommunicationNumber$1(java.lang.CharSequence value) {
    this._2330BPER06CommunicationNumber = value;
  }

  /**
   * Gets the value of the '_2330BPER07CommunicationNumberQualifier' field.
   */
  public java.lang.CharSequence get2330BPER07CommunicationNumberQualifier$1() {
    return _2330BPER07CommunicationNumberQualifier;
  }

  /**
   * Sets the value of the '_2330BPER07CommunicationNumberQualifier' field.
   * @param value the value to set.
   */
  public void set2330BPER07CommunicationNumberQualifier$1(java.lang.CharSequence value) {
    this._2330BPER07CommunicationNumberQualifier = value;
  }

  /**
   * Gets the value of the '_2330BPER08CommunicationNumber' field.
   */
  public java.lang.CharSequence get2330BPER08CommunicationNumber$1() {
    return _2330BPER08CommunicationNumber;
  }

  /**
   * Sets the value of the '_2330BPER08CommunicationNumber' field.
   * @param value the value to set.
   */
  public void set2330BPER08CommunicationNumber$1(java.lang.CharSequence value) {
    this._2330BPER08CommunicationNumber = value;
  }

  /** Creates a new X837Pro_2330B_PER_OtherPayerContactInformation RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder();
  }
  
  /** Creates a new X837Pro_2330B_PER_OtherPayerContactInformation RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder(other);
  }
  
  /** Creates a new X837Pro_2330B_PER_OtherPayerContactInformation RecordBuilder by copying an existing X837Pro_2330B_PER_OtherPayerContactInformation instance */
  public static net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder newBuilder(net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation other) {
    return new net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Pro_2330B_PER_OtherPayerContactInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Pro_2330B_PER_OtherPayerContactInformation>
    implements org.apache.avro.data.RecordBuilder<X837Pro_2330B_PER_OtherPayerContactInformation> {

    private java.lang.CharSequence _2330BPER01ContactFunctionCode;
    private java.lang.CharSequence _2330BPER02OtherPayerContactName;
    private java.lang.CharSequence _2330BPER03CommunicationNumberQualifier;
    private java.lang.CharSequence _2330BPER04CommunicationNumber;
    private java.lang.CharSequence _2330BPER05CommunicationNumberQualifier;
    private java.lang.CharSequence _2330BPER06CommunicationNumber;
    private java.lang.CharSequence _2330BPER07CommunicationNumberQualifier;
    private java.lang.CharSequence _2330BPER08CommunicationNumber;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2330BPER01ContactFunctionCode)) {
        this._2330BPER01ContactFunctionCode = data().deepCopy(fields()[0].schema(), other._2330BPER01ContactFunctionCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330BPER02OtherPayerContactName)) {
        this._2330BPER02OtherPayerContactName = data().deepCopy(fields()[1].schema(), other._2330BPER02OtherPayerContactName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2330BPER03CommunicationNumberQualifier)) {
        this._2330BPER03CommunicationNumberQualifier = data().deepCopy(fields()[2].schema(), other._2330BPER03CommunicationNumberQualifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2330BPER04CommunicationNumber)) {
        this._2330BPER04CommunicationNumber = data().deepCopy(fields()[3].schema(), other._2330BPER04CommunicationNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2330BPER05CommunicationNumberQualifier)) {
        this._2330BPER05CommunicationNumberQualifier = data().deepCopy(fields()[4].schema(), other._2330BPER05CommunicationNumberQualifier);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2330BPER06CommunicationNumber)) {
        this._2330BPER06CommunicationNumber = data().deepCopy(fields()[5].schema(), other._2330BPER06CommunicationNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2330BPER07CommunicationNumberQualifier)) {
        this._2330BPER07CommunicationNumberQualifier = data().deepCopy(fields()[6].schema(), other._2330BPER07CommunicationNumberQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2330BPER08CommunicationNumber)) {
        this._2330BPER08CommunicationNumber = data().deepCopy(fields()[7].schema(), other._2330BPER08CommunicationNumber);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Pro_2330B_PER_OtherPayerContactInformation instance */
    private Builder(net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation other) {
            super(net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.SCHEMA$);
      if (isValidValue(fields()[0], other._2330BPER01ContactFunctionCode)) {
        this._2330BPER01ContactFunctionCode = data().deepCopy(fields()[0].schema(), other._2330BPER01ContactFunctionCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2330BPER02OtherPayerContactName)) {
        this._2330BPER02OtherPayerContactName = data().deepCopy(fields()[1].schema(), other._2330BPER02OtherPayerContactName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2330BPER03CommunicationNumberQualifier)) {
        this._2330BPER03CommunicationNumberQualifier = data().deepCopy(fields()[2].schema(), other._2330BPER03CommunicationNumberQualifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2330BPER04CommunicationNumber)) {
        this._2330BPER04CommunicationNumber = data().deepCopy(fields()[3].schema(), other._2330BPER04CommunicationNumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other._2330BPER05CommunicationNumberQualifier)) {
        this._2330BPER05CommunicationNumberQualifier = data().deepCopy(fields()[4].schema(), other._2330BPER05CommunicationNumberQualifier);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other._2330BPER06CommunicationNumber)) {
        this._2330BPER06CommunicationNumber = data().deepCopy(fields()[5].schema(), other._2330BPER06CommunicationNumber);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other._2330BPER07CommunicationNumberQualifier)) {
        this._2330BPER07CommunicationNumberQualifier = data().deepCopy(fields()[6].schema(), other._2330BPER07CommunicationNumberQualifier);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._2330BPER08CommunicationNumber)) {
        this._2330BPER08CommunicationNumber = data().deepCopy(fields()[7].schema(), other._2330BPER08CommunicationNumber);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the '_2330BPER01ContactFunctionCode' field */
    public java.lang.CharSequence get2330BPER01ContactFunctionCode$1() {
      return _2330BPER01ContactFunctionCode;
    }
    
    /** Sets the value of the '_2330BPER01ContactFunctionCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER01ContactFunctionCode$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2330BPER01ContactFunctionCode = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER01ContactFunctionCode' field has been set */
    public boolean has2330BPER01ContactFunctionCode$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2330BPER01ContactFunctionCode' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER01ContactFunctionCode$1() {
      _2330BPER01ContactFunctionCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER02OtherPayerContactName' field */
    public java.lang.CharSequence get2330BPER02OtherPayerContactName$1() {
      return _2330BPER02OtherPayerContactName;
    }
    
    /** Sets the value of the '_2330BPER02OtherPayerContactName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER02OtherPayerContactName$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2330BPER02OtherPayerContactName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER02OtherPayerContactName' field has been set */
    public boolean has2330BPER02OtherPayerContactName$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2330BPER02OtherPayerContactName' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER02OtherPayerContactName$1() {
      _2330BPER02OtherPayerContactName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER03CommunicationNumberQualifier' field */
    public java.lang.CharSequence get2330BPER03CommunicationNumberQualifier$1() {
      return _2330BPER03CommunicationNumberQualifier;
    }
    
    /** Sets the value of the '_2330BPER03CommunicationNumberQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER03CommunicationNumberQualifier$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2330BPER03CommunicationNumberQualifier = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER03CommunicationNumberQualifier' field has been set */
    public boolean has2330BPER03CommunicationNumberQualifier$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2330BPER03CommunicationNumberQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER03CommunicationNumberQualifier$1() {
      _2330BPER03CommunicationNumberQualifier = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER04CommunicationNumber' field */
    public java.lang.CharSequence get2330BPER04CommunicationNumber$1() {
      return _2330BPER04CommunicationNumber;
    }
    
    /** Sets the value of the '_2330BPER04CommunicationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER04CommunicationNumber$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2330BPER04CommunicationNumber = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER04CommunicationNumber' field has been set */
    public boolean has2330BPER04CommunicationNumber$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2330BPER04CommunicationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER04CommunicationNumber$1() {
      _2330BPER04CommunicationNumber = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER05CommunicationNumberQualifier' field */
    public java.lang.CharSequence get2330BPER05CommunicationNumberQualifier$1() {
      return _2330BPER05CommunicationNumberQualifier;
    }
    
    /** Sets the value of the '_2330BPER05CommunicationNumberQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER05CommunicationNumberQualifier$1(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this._2330BPER05CommunicationNumberQualifier = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER05CommunicationNumberQualifier' field has been set */
    public boolean has2330BPER05CommunicationNumberQualifier$1() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the '_2330BPER05CommunicationNumberQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER05CommunicationNumberQualifier$1() {
      _2330BPER05CommunicationNumberQualifier = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER06CommunicationNumber' field */
    public java.lang.CharSequence get2330BPER06CommunicationNumber$1() {
      return _2330BPER06CommunicationNumber;
    }
    
    /** Sets the value of the '_2330BPER06CommunicationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER06CommunicationNumber$1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this._2330BPER06CommunicationNumber = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER06CommunicationNumber' field has been set */
    public boolean has2330BPER06CommunicationNumber$1() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the '_2330BPER06CommunicationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER06CommunicationNumber$1() {
      _2330BPER06CommunicationNumber = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER07CommunicationNumberQualifier' field */
    public java.lang.CharSequence get2330BPER07CommunicationNumberQualifier$1() {
      return _2330BPER07CommunicationNumberQualifier;
    }
    
    /** Sets the value of the '_2330BPER07CommunicationNumberQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER07CommunicationNumberQualifier$1(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this._2330BPER07CommunicationNumberQualifier = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER07CommunicationNumberQualifier' field has been set */
    public boolean has2330BPER07CommunicationNumberQualifier$1() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the '_2330BPER07CommunicationNumberQualifier' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER07CommunicationNumberQualifier$1() {
      _2330BPER07CommunicationNumberQualifier = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the '_2330BPER08CommunicationNumber' field */
    public java.lang.CharSequence get2330BPER08CommunicationNumber$1() {
      return _2330BPER08CommunicationNumber;
    }
    
    /** Sets the value of the '_2330BPER08CommunicationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder set2330BPER08CommunicationNumber$1(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this._2330BPER08CommunicationNumber = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the '_2330BPER08CommunicationNumber' field has been set */
    public boolean has2330BPER08CommunicationNumber$1() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the '_2330BPER08CommunicationNumber' field */
    public net.explorys.samhat.z12.r837.X837Pro_2330B_PER_OtherPayerContactInformation.Builder clear2330BPER08CommunicationNumber$1() {
      _2330BPER08CommunicationNumber = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public X837Pro_2330B_PER_OtherPayerContactInformation build() {
      try {
        X837Pro_2330B_PER_OtherPayerContactInformation record = new X837Pro_2330B_PER_OtherPayerContactInformation();
        record._2330BPER01ContactFunctionCode = fieldSetFlags()[0] ? this._2330BPER01ContactFunctionCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2330BPER02OtherPayerContactName = fieldSetFlags()[1] ? this._2330BPER02OtherPayerContactName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2330BPER03CommunicationNumberQualifier = fieldSetFlags()[2] ? this._2330BPER03CommunicationNumberQualifier : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2330BPER04CommunicationNumber = fieldSetFlags()[3] ? this._2330BPER04CommunicationNumber : (java.lang.CharSequence) defaultValue(fields()[3]);
        record._2330BPER05CommunicationNumberQualifier = fieldSetFlags()[4] ? this._2330BPER05CommunicationNumberQualifier : (java.lang.CharSequence) defaultValue(fields()[4]);
        record._2330BPER06CommunicationNumber = fieldSetFlags()[5] ? this._2330BPER06CommunicationNumber : (java.lang.CharSequence) defaultValue(fields()[5]);
        record._2330BPER07CommunicationNumberQualifier = fieldSetFlags()[6] ? this._2330BPER07CommunicationNumberQualifier : (java.lang.CharSequence) defaultValue(fields()[6]);
        record._2330BPER08CommunicationNumber = fieldSetFlags()[7] ? this._2330BPER08CommunicationNumber : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
