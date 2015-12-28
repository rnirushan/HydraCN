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
public class myLogonType implements org.apache.thrift.TBase<myLogonType, myLogonType._Fields>, java.io.Serializable, Cloneable, Comparable<myLogonType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("myLogonType");

  private static final org.apache.thrift.protocol.TField LOGON__TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("Logon_Type", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new myLogonTypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new myLogonTypeTupleSchemeFactory());
  }

  public String Logon_Type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOGON__TYPE((short)1, "Logon_Type");

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
        case 1: // LOGON__TYPE
          return LOGON__TYPE;
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
    tmpMap.put(_Fields.LOGON__TYPE, new org.apache.thrift.meta_data.FieldMetaData("Logon_Type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(myLogonType.class, metaDataMap);
  }

  public myLogonType() {
  }

  public myLogonType(
    String Logon_Type)
  {
    this();
    this.Logon_Type = Logon_Type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public myLogonType(myLogonType other) {
    if (other.isSetLogon_Type()) {
      this.Logon_Type = other.Logon_Type;
    }
  }

  public myLogonType deepCopy() {
    return new myLogonType(this);
  }

  @Override
  public void clear() {
    this.Logon_Type = null;
  }

  public String getLogon_Type() {
    return this.Logon_Type;
  }

  public myLogonType setLogon_Type(String Logon_Type) {
    this.Logon_Type = Logon_Type;
    return this;
  }

  public void unsetLogon_Type() {
    this.Logon_Type = null;
  }

  /** Returns true if field Logon_Type is set (has been assigned a value) and false otherwise */
  public boolean isSetLogon_Type() {
    return this.Logon_Type != null;
  }

  public void setLogon_TypeIsSet(boolean value) {
    if (!value) {
      this.Logon_Type = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOGON__TYPE:
      if (value == null) {
        unsetLogon_Type();
      } else {
        setLogon_Type((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOGON__TYPE:
      return getLogon_Type();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOGON__TYPE:
      return isSetLogon_Type();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof myLogonType)
      return this.equals((myLogonType)that);
    return false;
  }

  public boolean equals(myLogonType that) {
    if (that == null)
      return false;

    boolean this_present_Logon_Type = true && this.isSetLogon_Type();
    boolean that_present_Logon_Type = true && that.isSetLogon_Type();
    if (this_present_Logon_Type || that_present_Logon_Type) {
      if (!(this_present_Logon_Type && that_present_Logon_Type))
        return false;
      if (!this.Logon_Type.equals(that.Logon_Type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Logon_Type = true && (isSetLogon_Type());
    list.add(present_Logon_Type);
    if (present_Logon_Type)
      list.add(Logon_Type);

    return list.hashCode();
  }

  @Override
  public int compareTo(myLogonType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLogon_Type()).compareTo(other.isSetLogon_Type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogon_Type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Logon_Type, other.Logon_Type);
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
    StringBuilder sb = new StringBuilder("myLogonType(");
    boolean first = true;

    sb.append("Logon_Type:");
    if (this.Logon_Type == null) {
      sb.append("null");
    } else {
      sb.append(this.Logon_Type);
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

  private static class myLogonTypeStandardSchemeFactory implements SchemeFactory {
    public myLogonTypeStandardScheme getScheme() {
      return new myLogonTypeStandardScheme();
    }
  }

  private static class myLogonTypeStandardScheme extends StandardScheme<myLogonType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, myLogonType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOGON__TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Logon_Type = iprot.readString();
              struct.setLogon_TypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, myLogonType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Logon_Type != null) {
        oprot.writeFieldBegin(LOGON__TYPE_FIELD_DESC);
        oprot.writeString(struct.Logon_Type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class myLogonTypeTupleSchemeFactory implements SchemeFactory {
    public myLogonTypeTupleScheme getScheme() {
      return new myLogonTypeTupleScheme();
    }
  }

  private static class myLogonTypeTupleScheme extends TupleScheme<myLogonType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, myLogonType struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLogon_Type()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLogon_Type()) {
        oprot.writeString(struct.Logon_Type);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, myLogonType struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.Logon_Type = iprot.readString();
        struct.setLogon_TypeIsSet(true);
      }
    }
  }

}
