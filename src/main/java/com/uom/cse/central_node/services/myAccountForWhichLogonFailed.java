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
public class myAccountForWhichLogonFailed implements org.apache.thrift.TBase<myAccountForWhichLogonFailed, myAccountForWhichLogonFailed._Fields>, java.io.Serializable, Cloneable, Comparable<myAccountForWhichLogonFailed> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("myAccountForWhichLogonFailed");

  private static final org.apache.thrift.protocol.TField SECURITY__ID_FIELD_DESC = new org.apache.thrift.protocol.TField("Security_ID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT__NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("Account_Name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ACCOUNT__DOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("Account_Domain", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new myAccountForWhichLogonFailedStandardSchemeFactory());
    schemes.put(TupleScheme.class, new myAccountForWhichLogonFailedTupleSchemeFactory());
  }

  public String Security_ID; // required
  public String Account_Name; // required
  public String Account_Domain; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SECURITY__ID((short)1, "Security_ID"),
    ACCOUNT__NAME((short)2, "Account_Name"),
    ACCOUNT__DOMAIN((short)3, "Account_Domain");

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
        case 1: // SECURITY__ID
          return SECURITY__ID;
        case 2: // ACCOUNT__NAME
          return ACCOUNT__NAME;
        case 3: // ACCOUNT__DOMAIN
          return ACCOUNT__DOMAIN;
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
    tmpMap.put(_Fields.SECURITY__ID, new org.apache.thrift.meta_data.FieldMetaData("Security_ID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCOUNT__NAME, new org.apache.thrift.meta_data.FieldMetaData("Account_Name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCOUNT__DOMAIN, new org.apache.thrift.meta_data.FieldMetaData("Account_Domain", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(myAccountForWhichLogonFailed.class, metaDataMap);
  }

  public myAccountForWhichLogonFailed() {
  }

  public myAccountForWhichLogonFailed(
    String Security_ID,
    String Account_Name,
    String Account_Domain)
  {
    this();
    this.Security_ID = Security_ID;
    this.Account_Name = Account_Name;
    this.Account_Domain = Account_Domain;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public myAccountForWhichLogonFailed(myAccountForWhichLogonFailed other) {
    if (other.isSetSecurity_ID()) {
      this.Security_ID = other.Security_ID;
    }
    if (other.isSetAccount_Name()) {
      this.Account_Name = other.Account_Name;
    }
    if (other.isSetAccount_Domain()) {
      this.Account_Domain = other.Account_Domain;
    }
  }

  public myAccountForWhichLogonFailed deepCopy() {
    return new myAccountForWhichLogonFailed(this);
  }

  @Override
  public void clear() {
    this.Security_ID = null;
    this.Account_Name = null;
    this.Account_Domain = null;
  }

  public String getSecurity_ID() {
    return this.Security_ID;
  }

  public myAccountForWhichLogonFailed setSecurity_ID(String Security_ID) {
    this.Security_ID = Security_ID;
    return this;
  }

  public void unsetSecurity_ID() {
    this.Security_ID = null;
  }

  /** Returns true if field Security_ID is set (has been assigned a value) and false otherwise */
  public boolean isSetSecurity_ID() {
    return this.Security_ID != null;
  }

  public void setSecurity_IDIsSet(boolean value) {
    if (!value) {
      this.Security_ID = null;
    }
  }

  public String getAccount_Name() {
    return this.Account_Name;
  }

  public myAccountForWhichLogonFailed setAccount_Name(String Account_Name) {
    this.Account_Name = Account_Name;
    return this;
  }

  public void unsetAccount_Name() {
    this.Account_Name = null;
  }

  /** Returns true if field Account_Name is set (has been assigned a value) and false otherwise */
  public boolean isSetAccount_Name() {
    return this.Account_Name != null;
  }

  public void setAccount_NameIsSet(boolean value) {
    if (!value) {
      this.Account_Name = null;
    }
  }

  public String getAccount_Domain() {
    return this.Account_Domain;
  }

  public myAccountForWhichLogonFailed setAccount_Domain(String Account_Domain) {
    this.Account_Domain = Account_Domain;
    return this;
  }

  public void unsetAccount_Domain() {
    this.Account_Domain = null;
  }

  /** Returns true if field Account_Domain is set (has been assigned a value) and false otherwise */
  public boolean isSetAccount_Domain() {
    return this.Account_Domain != null;
  }

  public void setAccount_DomainIsSet(boolean value) {
    if (!value) {
      this.Account_Domain = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SECURITY__ID:
      if (value == null) {
        unsetSecurity_ID();
      } else {
        setSecurity_ID((String)value);
      }
      break;

    case ACCOUNT__NAME:
      if (value == null) {
        unsetAccount_Name();
      } else {
        setAccount_Name((String)value);
      }
      break;

    case ACCOUNT__DOMAIN:
      if (value == null) {
        unsetAccount_Domain();
      } else {
        setAccount_Domain((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SECURITY__ID:
      return getSecurity_ID();

    case ACCOUNT__NAME:
      return getAccount_Name();

    case ACCOUNT__DOMAIN:
      return getAccount_Domain();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SECURITY__ID:
      return isSetSecurity_ID();
    case ACCOUNT__NAME:
      return isSetAccount_Name();
    case ACCOUNT__DOMAIN:
      return isSetAccount_Domain();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof myAccountForWhichLogonFailed)
      return this.equals((myAccountForWhichLogonFailed)that);
    return false;
  }

  public boolean equals(myAccountForWhichLogonFailed that) {
    if (that == null)
      return false;

    boolean this_present_Security_ID = true && this.isSetSecurity_ID();
    boolean that_present_Security_ID = true && that.isSetSecurity_ID();
    if (this_present_Security_ID || that_present_Security_ID) {
      if (!(this_present_Security_ID && that_present_Security_ID))
        return false;
      if (!this.Security_ID.equals(that.Security_ID))
        return false;
    }

    boolean this_present_Account_Name = true && this.isSetAccount_Name();
    boolean that_present_Account_Name = true && that.isSetAccount_Name();
    if (this_present_Account_Name || that_present_Account_Name) {
      if (!(this_present_Account_Name && that_present_Account_Name))
        return false;
      if (!this.Account_Name.equals(that.Account_Name))
        return false;
    }

    boolean this_present_Account_Domain = true && this.isSetAccount_Domain();
    boolean that_present_Account_Domain = true && that.isSetAccount_Domain();
    if (this_present_Account_Domain || that_present_Account_Domain) {
      if (!(this_present_Account_Domain && that_present_Account_Domain))
        return false;
      if (!this.Account_Domain.equals(that.Account_Domain))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Security_ID = true && (isSetSecurity_ID());
    list.add(present_Security_ID);
    if (present_Security_ID)
      list.add(Security_ID);

    boolean present_Account_Name = true && (isSetAccount_Name());
    list.add(present_Account_Name);
    if (present_Account_Name)
      list.add(Account_Name);

    boolean present_Account_Domain = true && (isSetAccount_Domain());
    list.add(present_Account_Domain);
    if (present_Account_Domain)
      list.add(Account_Domain);

    return list.hashCode();
  }

  @Override
  public int compareTo(myAccountForWhichLogonFailed other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSecurity_ID()).compareTo(other.isSetSecurity_ID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecurity_ID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Security_ID, other.Security_ID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccount_Name()).compareTo(other.isSetAccount_Name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccount_Name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Account_Name, other.Account_Name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccount_Domain()).compareTo(other.isSetAccount_Domain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccount_Domain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Account_Domain, other.Account_Domain);
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
    StringBuilder sb = new StringBuilder("myAccountForWhichLogonFailed(");
    boolean first = true;

    sb.append("Security_ID:");
    if (this.Security_ID == null) {
      sb.append("null");
    } else {
      sb.append(this.Security_ID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Account_Name:");
    if (this.Account_Name == null) {
      sb.append("null");
    } else {
      sb.append(this.Account_Name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Account_Domain:");
    if (this.Account_Domain == null) {
      sb.append("null");
    } else {
      sb.append(this.Account_Domain);
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

  private static class myAccountForWhichLogonFailedStandardSchemeFactory implements SchemeFactory {
    public myAccountForWhichLogonFailedStandardScheme getScheme() {
      return new myAccountForWhichLogonFailedStandardScheme();
    }
  }

  private static class myAccountForWhichLogonFailedStandardScheme extends StandardScheme<myAccountForWhichLogonFailed> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, myAccountForWhichLogonFailed struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SECURITY__ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Security_ID = iprot.readString();
              struct.setSecurity_IDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCOUNT__NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Account_Name = iprot.readString();
              struct.setAccount_NameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACCOUNT__DOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Account_Domain = iprot.readString();
              struct.setAccount_DomainIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, myAccountForWhichLogonFailed struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Security_ID != null) {
        oprot.writeFieldBegin(SECURITY__ID_FIELD_DESC);
        oprot.writeString(struct.Security_ID);
        oprot.writeFieldEnd();
      }
      if (struct.Account_Name != null) {
        oprot.writeFieldBegin(ACCOUNT__NAME_FIELD_DESC);
        oprot.writeString(struct.Account_Name);
        oprot.writeFieldEnd();
      }
      if (struct.Account_Domain != null) {
        oprot.writeFieldBegin(ACCOUNT__DOMAIN_FIELD_DESC);
        oprot.writeString(struct.Account_Domain);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class myAccountForWhichLogonFailedTupleSchemeFactory implements SchemeFactory {
    public myAccountForWhichLogonFailedTupleScheme getScheme() {
      return new myAccountForWhichLogonFailedTupleScheme();
    }
  }

  private static class myAccountForWhichLogonFailedTupleScheme extends TupleScheme<myAccountForWhichLogonFailed> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, myAccountForWhichLogonFailed struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSecurity_ID()) {
        optionals.set(0);
      }
      if (struct.isSetAccount_Name()) {
        optionals.set(1);
      }
      if (struct.isSetAccount_Domain()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSecurity_ID()) {
        oprot.writeString(struct.Security_ID);
      }
      if (struct.isSetAccount_Name()) {
        oprot.writeString(struct.Account_Name);
      }
      if (struct.isSetAccount_Domain()) {
        oprot.writeString(struct.Account_Domain);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, myAccountForWhichLogonFailed struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.Security_ID = iprot.readString();
        struct.setSecurity_IDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Account_Name = iprot.readString();
        struct.setAccount_NameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Account_Domain = iprot.readString();
        struct.setAccount_DomainIsSet(true);
      }
    }
  }

}

