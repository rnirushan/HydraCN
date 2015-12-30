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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-30")
public class myObject implements org.apache.thrift.TBase<myObject, myObject._Fields>, java.io.Serializable, Cloneable, Comparable<myObject> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("myObject");

  private static final org.apache.thrift.protocol.TField OBJECT__SERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("Object_Server", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OBJECT__TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("Object_Type", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField OBJECT__NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Object_Name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HANDLE__ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Handle_ID", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RESOURCE__ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("Resource_Attributes", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new myObjectStandardSchemeFactory());
    schemes.put(TupleScheme.class, new myObjectTupleSchemeFactory());
  }

  public String Object_Server; // required
  public String Object_Type; // required
  public String Object_Name; // required
  public String Handle_ID; // required
  public String Resource_Attributes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OBJECT__SERVER((short)1, "Object_Server"),
    OBJECT__TYPE((short)2, "Object_Type"),
    OBJECT__NAME((short)3, "Object_Name"),
    HANDLE__ID((short)4, "Handle_ID"),
    RESOURCE__ATTRIBUTES((short)5, "Resource_Attributes");

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
        case 1: // OBJECT__SERVER
          return OBJECT__SERVER;
        case 2: // OBJECT__TYPE
          return OBJECT__TYPE;
        case 3: // OBJECT__NAME
          return OBJECT__NAME;
        case 4: // HANDLE__ID
          return HANDLE__ID;
        case 5: // RESOURCE__ATTRIBUTES
          return RESOURCE__ATTRIBUTES;
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
    tmpMap.put(_Fields.OBJECT__SERVER, new org.apache.thrift.meta_data.FieldMetaData("Object_Server", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OBJECT__TYPE, new org.apache.thrift.meta_data.FieldMetaData("Object_Type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OBJECT__NAME, new org.apache.thrift.meta_data.FieldMetaData("Object_Name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HANDLE__ID, new org.apache.thrift.meta_data.FieldMetaData("Handle_ID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE__ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("Resource_Attributes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(myObject.class, metaDataMap);
  }

  public myObject() {
  }

  public myObject(
    String Object_Server,
    String Object_Type,
    String Object_Name,
    String Handle_ID,
    String Resource_Attributes)
  {
    this();
    this.Object_Server = Object_Server;
    this.Object_Type = Object_Type;
    this.Object_Name = Object_Name;
    this.Handle_ID = Handle_ID;
    this.Resource_Attributes = Resource_Attributes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public myObject(myObject other) {
    if (other.isSetObject_Server()) {
      this.Object_Server = other.Object_Server;
    }
    if (other.isSetObject_Type()) {
      this.Object_Type = other.Object_Type;
    }
    if (other.isSetObject_Name()) {
      this.Object_Name = other.Object_Name;
    }
    if (other.isSetHandle_ID()) {
      this.Handle_ID = other.Handle_ID;
    }
    if (other.isSetResource_Attributes()) {
      this.Resource_Attributes = other.Resource_Attributes;
    }
  }

  public myObject deepCopy() {
    return new myObject(this);
  }

  @Override
  public void clear() {
    this.Object_Server = null;
    this.Object_Type = null;
    this.Object_Name = null;
    this.Handle_ID = null;
    this.Resource_Attributes = null;
  }

  public String getObject_Server() {
    return this.Object_Server;
  }

  public myObject setObject_Server(String Object_Server) {
    this.Object_Server = Object_Server;
    return this;
  }

  public void unsetObject_Server() {
    this.Object_Server = null;
  }

  /** Returns true if field Object_Server is set (has been assigned a value) and false otherwise */
  public boolean isSetObject_Server() {
    return this.Object_Server != null;
  }

  public void setObject_ServerIsSet(boolean value) {
    if (!value) {
      this.Object_Server = null;
    }
  }

  public String getObject_Type() {
    return this.Object_Type;
  }

  public myObject setObject_Type(String Object_Type) {
    this.Object_Type = Object_Type;
    return this;
  }

  public void unsetObject_Type() {
    this.Object_Type = null;
  }

  /** Returns true if field Object_Type is set (has been assigned a value) and false otherwise */
  public boolean isSetObject_Type() {
    return this.Object_Type != null;
  }

  public void setObject_TypeIsSet(boolean value) {
    if (!value) {
      this.Object_Type = null;
    }
  }

  public String getObject_Name() {
    return this.Object_Name;
  }

  public myObject setObject_Name(String Object_Name) {
    this.Object_Name = Object_Name;
    return this;
  }

  public void unsetObject_Name() {
    this.Object_Name = null;
  }

  /** Returns true if field Object_Name is set (has been assigned a value) and false otherwise */
  public boolean isSetObject_Name() {
    return this.Object_Name != null;
  }

  public void setObject_NameIsSet(boolean value) {
    if (!value) {
      this.Object_Name = null;
    }
  }

  public String getHandle_ID() {
    return this.Handle_ID;
  }

  public myObject setHandle_ID(String Handle_ID) {
    this.Handle_ID = Handle_ID;
    return this;
  }

  public void unsetHandle_ID() {
    this.Handle_ID = null;
  }

  /** Returns true if field Handle_ID is set (has been assigned a value) and false otherwise */
  public boolean isSetHandle_ID() {
    return this.Handle_ID != null;
  }

  public void setHandle_IDIsSet(boolean value) {
    if (!value) {
      this.Handle_ID = null;
    }
  }

  public String getResource_Attributes() {
    return this.Resource_Attributes;
  }

  public myObject setResource_Attributes(String Resource_Attributes) {
    this.Resource_Attributes = Resource_Attributes;
    return this;
  }

  public void unsetResource_Attributes() {
    this.Resource_Attributes = null;
  }

  /** Returns true if field Resource_Attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetResource_Attributes() {
    return this.Resource_Attributes != null;
  }

  public void setResource_AttributesIsSet(boolean value) {
    if (!value) {
      this.Resource_Attributes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OBJECT__SERVER:
      if (value == null) {
        unsetObject_Server();
      } else {
        setObject_Server((String)value);
      }
      break;

    case OBJECT__TYPE:
      if (value == null) {
        unsetObject_Type();
      } else {
        setObject_Type((String)value);
      }
      break;

    case OBJECT__NAME:
      if (value == null) {
        unsetObject_Name();
      } else {
        setObject_Name((String)value);
      }
      break;

    case HANDLE__ID:
      if (value == null) {
        unsetHandle_ID();
      } else {
        setHandle_ID((String)value);
      }
      break;

    case RESOURCE__ATTRIBUTES:
      if (value == null) {
        unsetResource_Attributes();
      } else {
        setResource_Attributes((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJECT__SERVER:
      return getObject_Server();

    case OBJECT__TYPE:
      return getObject_Type();

    case OBJECT__NAME:
      return getObject_Name();

    case HANDLE__ID:
      return getHandle_ID();

    case RESOURCE__ATTRIBUTES:
      return getResource_Attributes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OBJECT__SERVER:
      return isSetObject_Server();
    case OBJECT__TYPE:
      return isSetObject_Type();
    case OBJECT__NAME:
      return isSetObject_Name();
    case HANDLE__ID:
      return isSetHandle_ID();
    case RESOURCE__ATTRIBUTES:
      return isSetResource_Attributes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof myObject)
      return this.equals((myObject)that);
    return false;
  }

  public boolean equals(myObject that) {
    if (that == null)
      return false;

    boolean this_present_Object_Server = true && this.isSetObject_Server();
    boolean that_present_Object_Server = true && that.isSetObject_Server();
    if (this_present_Object_Server || that_present_Object_Server) {
      if (!(this_present_Object_Server && that_present_Object_Server))
        return false;
      if (!this.Object_Server.equals(that.Object_Server))
        return false;
    }

    boolean this_present_Object_Type = true && this.isSetObject_Type();
    boolean that_present_Object_Type = true && that.isSetObject_Type();
    if (this_present_Object_Type || that_present_Object_Type) {
      if (!(this_present_Object_Type && that_present_Object_Type))
        return false;
      if (!this.Object_Type.equals(that.Object_Type))
        return false;
    }

    boolean this_present_Object_Name = true && this.isSetObject_Name();
    boolean that_present_Object_Name = true && that.isSetObject_Name();
    if (this_present_Object_Name || that_present_Object_Name) {
      if (!(this_present_Object_Name && that_present_Object_Name))
        return false;
      if (!this.Object_Name.equals(that.Object_Name))
        return false;
    }

    boolean this_present_Handle_ID = true && this.isSetHandle_ID();
    boolean that_present_Handle_ID = true && that.isSetHandle_ID();
    if (this_present_Handle_ID || that_present_Handle_ID) {
      if (!(this_present_Handle_ID && that_present_Handle_ID))
        return false;
      if (!this.Handle_ID.equals(that.Handle_ID))
        return false;
    }

    boolean this_present_Resource_Attributes = true && this.isSetResource_Attributes();
    boolean that_present_Resource_Attributes = true && that.isSetResource_Attributes();
    if (this_present_Resource_Attributes || that_present_Resource_Attributes) {
      if (!(this_present_Resource_Attributes && that_present_Resource_Attributes))
        return false;
      if (!this.Resource_Attributes.equals(that.Resource_Attributes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Object_Server = true && (isSetObject_Server());
    list.add(present_Object_Server);
    if (present_Object_Server)
      list.add(Object_Server);

    boolean present_Object_Type = true && (isSetObject_Type());
    list.add(present_Object_Type);
    if (present_Object_Type)
      list.add(Object_Type);

    boolean present_Object_Name = true && (isSetObject_Name());
    list.add(present_Object_Name);
    if (present_Object_Name)
      list.add(Object_Name);

    boolean present_Handle_ID = true && (isSetHandle_ID());
    list.add(present_Handle_ID);
    if (present_Handle_ID)
      list.add(Handle_ID);

    boolean present_Resource_Attributes = true && (isSetResource_Attributes());
    list.add(present_Resource_Attributes);
    if (present_Resource_Attributes)
      list.add(Resource_Attributes);

    return list.hashCode();
  }

  @Override
  public int compareTo(myObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetObject_Server()).compareTo(other.isSetObject_Server());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObject_Server()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Object_Server, other.Object_Server);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetObject_Type()).compareTo(other.isSetObject_Type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObject_Type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Object_Type, other.Object_Type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetObject_Name()).compareTo(other.isSetObject_Name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObject_Name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Object_Name, other.Object_Name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHandle_ID()).compareTo(other.isSetHandle_ID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHandle_ID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Handle_ID, other.Handle_ID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResource_Attributes()).compareTo(other.isSetResource_Attributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource_Attributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Resource_Attributes, other.Resource_Attributes);
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
    StringBuilder sb = new StringBuilder("myObject(");
    boolean first = true;

    sb.append("Object_Server:");
    if (this.Object_Server == null) {
      sb.append("null");
    } else {
      sb.append(this.Object_Server);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Object_Type:");
    if (this.Object_Type == null) {
      sb.append("null");
    } else {
      sb.append(this.Object_Type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Object_Name:");
    if (this.Object_Name == null) {
      sb.append("null");
    } else {
      sb.append(this.Object_Name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Handle_ID:");
    if (this.Handle_ID == null) {
      sb.append("null");
    } else {
      sb.append(this.Handle_ID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Resource_Attributes:");
    if (this.Resource_Attributes == null) {
      sb.append("null");
    } else {
      sb.append(this.Resource_Attributes);
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

  private static class myObjectStandardSchemeFactory implements SchemeFactory {
    public myObjectStandardScheme getScheme() {
      return new myObjectStandardScheme();
    }
  }

  private static class myObjectStandardScheme extends StandardScheme<myObject> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, myObject struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJECT__SERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Object_Server = iprot.readString();
              struct.setObject_ServerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OBJECT__TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Object_Type = iprot.readString();
              struct.setObject_TypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OBJECT__NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Object_Name = iprot.readString();
              struct.setObject_NameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HANDLE__ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Handle_ID = iprot.readString();
              struct.setHandle_IDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RESOURCE__ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Resource_Attributes = iprot.readString();
              struct.setResource_AttributesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, myObject struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Object_Server != null) {
        oprot.writeFieldBegin(OBJECT__SERVER_FIELD_DESC);
        oprot.writeString(struct.Object_Server);
        oprot.writeFieldEnd();
      }
      if (struct.Object_Type != null) {
        oprot.writeFieldBegin(OBJECT__TYPE_FIELD_DESC);
        oprot.writeString(struct.Object_Type);
        oprot.writeFieldEnd();
      }
      if (struct.Object_Name != null) {
        oprot.writeFieldBegin(OBJECT__NAME_FIELD_DESC);
        oprot.writeString(struct.Object_Name);
        oprot.writeFieldEnd();
      }
      if (struct.Handle_ID != null) {
        oprot.writeFieldBegin(HANDLE__ID_FIELD_DESC);
        oprot.writeString(struct.Handle_ID);
        oprot.writeFieldEnd();
      }
      if (struct.Resource_Attributes != null) {
        oprot.writeFieldBegin(RESOURCE__ATTRIBUTES_FIELD_DESC);
        oprot.writeString(struct.Resource_Attributes);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class myObjectTupleSchemeFactory implements SchemeFactory {
    public myObjectTupleScheme getScheme() {
      return new myObjectTupleScheme();
    }
  }

  private static class myObjectTupleScheme extends TupleScheme<myObject> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, myObject struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetObject_Server()) {
        optionals.set(0);
      }
      if (struct.isSetObject_Type()) {
        optionals.set(1);
      }
      if (struct.isSetObject_Name()) {
        optionals.set(2);
      }
      if (struct.isSetHandle_ID()) {
        optionals.set(3);
      }
      if (struct.isSetResource_Attributes()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetObject_Server()) {
        oprot.writeString(struct.Object_Server);
      }
      if (struct.isSetObject_Type()) {
        oprot.writeString(struct.Object_Type);
      }
      if (struct.isSetObject_Name()) {
        oprot.writeString(struct.Object_Name);
      }
      if (struct.isSetHandle_ID()) {
        oprot.writeString(struct.Handle_ID);
      }
      if (struct.isSetResource_Attributes()) {
        oprot.writeString(struct.Resource_Attributes);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, myObject struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.Object_Server = iprot.readString();
        struct.setObject_ServerIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Object_Type = iprot.readString();
        struct.setObject_TypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Object_Name = iprot.readString();
        struct.setObject_NameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.Handle_ID = iprot.readString();
        struct.setHandle_IDIsSet(true);
      }
      if (incoming.get(4)) {
        struct.Resource_Attributes = iprot.readString();
        struct.setResource_AttributesIsSet(true);
      }
    }
  }

}

