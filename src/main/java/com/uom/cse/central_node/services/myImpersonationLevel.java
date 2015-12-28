package com.uom.cse.central_node.services;


import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-28")
public class myImpersonationLevel implements org.apache.thrift.TBase<myImpersonationLevel, myImpersonationLevel._Fields>, java.io.Serializable, Cloneable, Comparable<myImpersonationLevel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("myImpersonationLevel");

  private static final org.apache.thrift.protocol.TField IMPERSONATION__LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("Impersonation_Level", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new myImpersonationLevelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new myImpersonationLevelTupleSchemeFactory());
  }

  public String Impersonation_Level; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IMPERSONATION__LEVEL((short)1, "Impersonation_Level");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IMPERSONATION__LEVEL
          return IMPERSONATION__LEVEL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IMPERSONATION__LEVEL, new org.apache.thrift.meta_data.FieldMetaData("Impersonation_Level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(myImpersonationLevel.class, metaDataMap);
  }

  public myImpersonationLevel() {
  }

  public myImpersonationLevel(
    String Impersonation_Level)
  {
    this();
    this.Impersonation_Level = Impersonation_Level;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public myImpersonationLevel(myImpersonationLevel other) {
    if (other.isSetImpersonation_Level()) {
      this.Impersonation_Level = other.Impersonation_Level;
    }
  }

  public myImpersonationLevel deepCopy() {
    return new myImpersonationLevel(this);
  }

  @Override
  public void clear() {
    this.Impersonation_Level = null;
  }

  public String getImpersonation_Level() {
    return this.Impersonation_Level;
  }

  public myImpersonationLevel setImpersonation_Level(String Impersonation_Level) {
    this.Impersonation_Level = Impersonation_Level;
    return this;
  }

  public void unsetImpersonation_Level() {
    this.Impersonation_Level = null;
  }

  /** Returns true if field Impersonation_Level is set (has been assigned a value) and false otherwise */
  public boolean isSetImpersonation_Level() {
    return this.Impersonation_Level != null;
  }

  public void setImpersonation_LevelIsSet(boolean value) {
    if (!value) {
      this.Impersonation_Level = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IMPERSONATION__LEVEL:
      if (value == null) {
        unsetImpersonation_Level();
      } else {
        setImpersonation_Level((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IMPERSONATION__LEVEL:
      return getImpersonation_Level();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IMPERSONATION__LEVEL:
      return isSetImpersonation_Level();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof myImpersonationLevel)
      return this.equals((myImpersonationLevel)that);
    return false;
  }

  public boolean equals(myImpersonationLevel that) {
    if (that == null)
      return false;

    boolean this_present_Impersonation_Level = true && this.isSetImpersonation_Level();
    boolean that_present_Impersonation_Level = true && that.isSetImpersonation_Level();
    if (this_present_Impersonation_Level || that_present_Impersonation_Level) {
      if (!(this_present_Impersonation_Level && that_present_Impersonation_Level))
        return false;
      if (!this.Impersonation_Level.equals(that.Impersonation_Level))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Impersonation_Level = true && (isSetImpersonation_Level());
    list.add(present_Impersonation_Level);
    if (present_Impersonation_Level)
      list.add(Impersonation_Level);

    return list.hashCode();
  }

  @Override
  public int compareTo(myImpersonationLevel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetImpersonation_Level()).compareTo(other.isSetImpersonation_Level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImpersonation_Level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Impersonation_Level, other.Impersonation_Level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("myImpersonationLevel(");
    boolean first = true;

    sb.append("Impersonation_Level:");
    if (this.Impersonation_Level == null) {
      sb.append("null");
    } else {
      sb.append(this.Impersonation_Level);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class myImpersonationLevelStandardSchemeFactory implements SchemeFactory {
    public myImpersonationLevelStandardScheme getScheme() {
      return new myImpersonationLevelStandardScheme();
    }
  }

  private static class myImpersonationLevelStandardScheme extends StandardScheme<myImpersonationLevel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, myImpersonationLevel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IMPERSONATION__LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Impersonation_Level = iprot.readString();
              struct.setImpersonation_LevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, myImpersonationLevel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Impersonation_Level != null) {
        oprot.writeFieldBegin(IMPERSONATION__LEVEL_FIELD_DESC);
        oprot.writeString(struct.Impersonation_Level);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class myImpersonationLevelTupleSchemeFactory implements SchemeFactory {
    public myImpersonationLevelTupleScheme getScheme() {
      return new myImpersonationLevelTupleScheme();
    }
  }

  private static class myImpersonationLevelTupleScheme extends TupleScheme<myImpersonationLevel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, myImpersonationLevel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetImpersonation_Level()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetImpersonation_Level()) {
        oprot.writeString(struct.Impersonation_Level);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, myImpersonationLevel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.Impersonation_Level = iprot.readString();
        struct.setImpersonation_LevelIsSet(true);
      }
    }
  }

}

