/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package net.explorys.samhat.z12.r837;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class X837Ins_2000B_HL_SubscriberHierarchicalLevel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"X837Ins_2000B_HL_SubscriberHierarchicalLevel\",\"namespace\":\"net.explorys.samhat.z12.r837\",\"fields\":[{\"name\":\"_2000BHL01HierarchicalIDNumber\",\"type\":\"string\"},{\"name\":\"_2000BHL02HierarchicalParentIDNumber\",\"type\":\"string\"},{\"name\":\"_2000BHL03HierarchicalLevelCode\",\"type\":\"string\"},{\"name\":\"_2000BHL04HierarchicalChildCode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _2000BHL01HierarchicalIDNumber;
  @Deprecated public java.lang.CharSequence _2000BHL02HierarchicalParentIDNumber;
  @Deprecated public java.lang.CharSequence _2000BHL03HierarchicalLevelCode;
  @Deprecated public java.lang.CharSequence _2000BHL04HierarchicalChildCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public X837Ins_2000B_HL_SubscriberHierarchicalLevel() {}

  /**
   * All-args constructor.
   */
  public X837Ins_2000B_HL_SubscriberHierarchicalLevel(java.lang.CharSequence _2000BHL01HierarchicalIDNumber, java.lang.CharSequence _2000BHL02HierarchicalParentIDNumber, java.lang.CharSequence _2000BHL03HierarchicalLevelCode, java.lang.CharSequence _2000BHL04HierarchicalChildCode) {
    this._2000BHL01HierarchicalIDNumber = _2000BHL01HierarchicalIDNumber;
    this._2000BHL02HierarchicalParentIDNumber = _2000BHL02HierarchicalParentIDNumber;
    this._2000BHL03HierarchicalLevelCode = _2000BHL03HierarchicalLevelCode;
    this._2000BHL04HierarchicalChildCode = _2000BHL04HierarchicalChildCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _2000BHL01HierarchicalIDNumber;
    case 1: return _2000BHL02HierarchicalParentIDNumber;
    case 2: return _2000BHL03HierarchicalLevelCode;
    case 3: return _2000BHL04HierarchicalChildCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _2000BHL01HierarchicalIDNumber = (java.lang.CharSequence)value$; break;
    case 1: _2000BHL02HierarchicalParentIDNumber = (java.lang.CharSequence)value$; break;
    case 2: _2000BHL03HierarchicalLevelCode = (java.lang.CharSequence)value$; break;
    case 3: _2000BHL04HierarchicalChildCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_2000BHL01HierarchicalIDNumber' field.
   */
  public java.lang.CharSequence get2000BHL01HierarchicalIDNumber$1() {
    return _2000BHL01HierarchicalIDNumber;
  }

  /**
   * Sets the value of the '_2000BHL01HierarchicalIDNumber' field.
   * @param value the value to set.
   */
  public void set2000BHL01HierarchicalIDNumber$1(java.lang.CharSequence value) {
    this._2000BHL01HierarchicalIDNumber = value;
  }

  /**
   * Gets the value of the '_2000BHL02HierarchicalParentIDNumber' field.
   */
  public java.lang.CharSequence get2000BHL02HierarchicalParentIDNumber$1() {
    return _2000BHL02HierarchicalParentIDNumber;
  }

  /**
   * Sets the value of the '_2000BHL02HierarchicalParentIDNumber' field.
   * @param value the value to set.
   */
  public void set2000BHL02HierarchicalParentIDNumber$1(java.lang.CharSequence value) {
    this._2000BHL02HierarchicalParentIDNumber = value;
  }

  /**
   * Gets the value of the '_2000BHL03HierarchicalLevelCode' field.
   */
  public java.lang.CharSequence get2000BHL03HierarchicalLevelCode$1() {
    return _2000BHL03HierarchicalLevelCode;
  }

  /**
   * Sets the value of the '_2000BHL03HierarchicalLevelCode' field.
   * @param value the value to set.
   */
  public void set2000BHL03HierarchicalLevelCode$1(java.lang.CharSequence value) {
    this._2000BHL03HierarchicalLevelCode = value;
  }

  /**
   * Gets the value of the '_2000BHL04HierarchicalChildCode' field.
   */
  public java.lang.CharSequence get2000BHL04HierarchicalChildCode$1() {
    return _2000BHL04HierarchicalChildCode;
  }

  /**
   * Sets the value of the '_2000BHL04HierarchicalChildCode' field.
   * @param value the value to set.
   */
  public void set2000BHL04HierarchicalChildCode$1(java.lang.CharSequence value) {
    this._2000BHL04HierarchicalChildCode = value;
  }

  /** Creates a new X837Ins_2000B_HL_SubscriberHierarchicalLevel RecordBuilder */
  public static net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder newBuilder() {
    return new net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder();
  }
  
  /** Creates a new X837Ins_2000B_HL_SubscriberHierarchicalLevel RecordBuilder by copying an existing Builder */
  public static net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder(other);
  }
  
  /** Creates a new X837Ins_2000B_HL_SubscriberHierarchicalLevel RecordBuilder by copying an existing X837Ins_2000B_HL_SubscriberHierarchicalLevel instance */
  public static net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder newBuilder(net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel other) {
    return new net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder(other);
  }
  
  /**
   * RecordBuilder for X837Ins_2000B_HL_SubscriberHierarchicalLevel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<X837Ins_2000B_HL_SubscriberHierarchicalLevel>
    implements org.apache.avro.data.RecordBuilder<X837Ins_2000B_HL_SubscriberHierarchicalLevel> {

    private java.lang.CharSequence _2000BHL01HierarchicalIDNumber;
    private java.lang.CharSequence _2000BHL02HierarchicalParentIDNumber;
    private java.lang.CharSequence _2000BHL03HierarchicalLevelCode;
    private java.lang.CharSequence _2000BHL04HierarchicalChildCode;

    /** Creates a new Builder */
    private Builder() {
      super(net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._2000BHL01HierarchicalIDNumber)) {
        this._2000BHL01HierarchicalIDNumber = data().deepCopy(fields()[0].schema(), other._2000BHL01HierarchicalIDNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2000BHL02HierarchicalParentIDNumber)) {
        this._2000BHL02HierarchicalParentIDNumber = data().deepCopy(fields()[1].schema(), other._2000BHL02HierarchicalParentIDNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2000BHL03HierarchicalLevelCode)) {
        this._2000BHL03HierarchicalLevelCode = data().deepCopy(fields()[2].schema(), other._2000BHL03HierarchicalLevelCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2000BHL04HierarchicalChildCode)) {
        this._2000BHL04HierarchicalChildCode = data().deepCopy(fields()[3].schema(), other._2000BHL04HierarchicalChildCode);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing X837Ins_2000B_HL_SubscriberHierarchicalLevel instance */
    private Builder(net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel other) {
            super(net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.SCHEMA$);
      if (isValidValue(fields()[0], other._2000BHL01HierarchicalIDNumber)) {
        this._2000BHL01HierarchicalIDNumber = data().deepCopy(fields()[0].schema(), other._2000BHL01HierarchicalIDNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other._2000BHL02HierarchicalParentIDNumber)) {
        this._2000BHL02HierarchicalParentIDNumber = data().deepCopy(fields()[1].schema(), other._2000BHL02HierarchicalParentIDNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other._2000BHL03HierarchicalLevelCode)) {
        this._2000BHL03HierarchicalLevelCode = data().deepCopy(fields()[2].schema(), other._2000BHL03HierarchicalLevelCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._2000BHL04HierarchicalChildCode)) {
        this._2000BHL04HierarchicalChildCode = data().deepCopy(fields()[3].schema(), other._2000BHL04HierarchicalChildCode);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the '_2000BHL01HierarchicalIDNumber' field */
    public java.lang.CharSequence get2000BHL01HierarchicalIDNumber$1() {
      return _2000BHL01HierarchicalIDNumber;
    }
    
    /** Sets the value of the '_2000BHL01HierarchicalIDNumber' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder set2000BHL01HierarchicalIDNumber$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._2000BHL01HierarchicalIDNumber = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BHL01HierarchicalIDNumber' field has been set */
    public boolean has2000BHL01HierarchicalIDNumber$1() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the '_2000BHL01HierarchicalIDNumber' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder clear2000BHL01HierarchicalIDNumber$1() {
      _2000BHL01HierarchicalIDNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the '_2000BHL02HierarchicalParentIDNumber' field */
    public java.lang.CharSequence get2000BHL02HierarchicalParentIDNumber$1() {
      return _2000BHL02HierarchicalParentIDNumber;
    }
    
    /** Sets the value of the '_2000BHL02HierarchicalParentIDNumber' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder set2000BHL02HierarchicalParentIDNumber$1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this._2000BHL02HierarchicalParentIDNumber = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BHL02HierarchicalParentIDNumber' field has been set */
    public boolean has2000BHL02HierarchicalParentIDNumber$1() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the '_2000BHL02HierarchicalParentIDNumber' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder clear2000BHL02HierarchicalParentIDNumber$1() {
      _2000BHL02HierarchicalParentIDNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the '_2000BHL03HierarchicalLevelCode' field */
    public java.lang.CharSequence get2000BHL03HierarchicalLevelCode$1() {
      return _2000BHL03HierarchicalLevelCode;
    }
    
    /** Sets the value of the '_2000BHL03HierarchicalLevelCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder set2000BHL03HierarchicalLevelCode$1(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this._2000BHL03HierarchicalLevelCode = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BHL03HierarchicalLevelCode' field has been set */
    public boolean has2000BHL03HierarchicalLevelCode$1() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the '_2000BHL03HierarchicalLevelCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder clear2000BHL03HierarchicalLevelCode$1() {
      _2000BHL03HierarchicalLevelCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the '_2000BHL04HierarchicalChildCode' field */
    public java.lang.CharSequence get2000BHL04HierarchicalChildCode$1() {
      return _2000BHL04HierarchicalChildCode;
    }
    
    /** Sets the value of the '_2000BHL04HierarchicalChildCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder set2000BHL04HierarchicalChildCode$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._2000BHL04HierarchicalChildCode = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_2000BHL04HierarchicalChildCode' field has been set */
    public boolean has2000BHL04HierarchicalChildCode$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_2000BHL04HierarchicalChildCode' field */
    public net.explorys.samhat.z12.r837.X837Ins_2000B_HL_SubscriberHierarchicalLevel.Builder clear2000BHL04HierarchicalChildCode$1() {
      _2000BHL04HierarchicalChildCode = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public X837Ins_2000B_HL_SubscriberHierarchicalLevel build() {
      try {
        X837Ins_2000B_HL_SubscriberHierarchicalLevel record = new X837Ins_2000B_HL_SubscriberHierarchicalLevel();
        record._2000BHL01HierarchicalIDNumber = fieldSetFlags()[0] ? this._2000BHL01HierarchicalIDNumber : (java.lang.CharSequence) defaultValue(fields()[0]);
        record._2000BHL02HierarchicalParentIDNumber = fieldSetFlags()[1] ? this._2000BHL02HierarchicalParentIDNumber : (java.lang.CharSequence) defaultValue(fields()[1]);
        record._2000BHL03HierarchicalLevelCode = fieldSetFlags()[2] ? this._2000BHL03HierarchicalLevelCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._2000BHL04HierarchicalChildCode = fieldSetFlags()[3] ? this._2000BHL04HierarchicalChildCode : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
