/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.uom.central_node.android_agent_services;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-11-5")
public class DeviceOverallInfo implements org.apache.thrift.TBase<DeviceOverallInfo, DeviceOverallInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DeviceOverallInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeviceOverallInfo");

  private static final org.apache.thrift.protocol.TField CPU_USAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("cpuUsage", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RAM_FREE_MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("ramFreeMemory", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RAM_USED_MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("ramUsedMemory", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BATTERY_FIELD_DESC = new org.apache.thrift.protocol.TField("battery", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeviceOverallInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeviceOverallInfoTupleSchemeFactory());
  }

  public String cpuUsage; // required
  public String ramFreeMemory; // required
  public String ramUsedMemory; // required
  public String battery; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CPU_USAGE((short)1, "cpuUsage"),
    RAM_FREE_MEMORY((short)2, "ramFreeMemory"),
    RAM_USED_MEMORY((short)3, "ramUsedMemory"),
    BATTERY((short)4, "battery");

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
        case 1: // CPU_USAGE
          return CPU_USAGE;
        case 2: // RAM_FREE_MEMORY
          return RAM_FREE_MEMORY;
        case 3: // RAM_USED_MEMORY
          return RAM_USED_MEMORY;
        case 4: // BATTERY
          return BATTERY;
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
    tmpMap.put(_Fields.CPU_USAGE, new org.apache.thrift.meta_data.FieldMetaData("cpuUsage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RAM_FREE_MEMORY, new org.apache.thrift.meta_data.FieldMetaData("ramFreeMemory", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RAM_USED_MEMORY, new org.apache.thrift.meta_data.FieldMetaData("ramUsedMemory", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BATTERY, new org.apache.thrift.meta_data.FieldMetaData("battery", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeviceOverallInfo.class, metaDataMap);
  }

  public DeviceOverallInfo() {
  }

  public DeviceOverallInfo(
    String cpuUsage,
    String ramFreeMemory,
    String ramUsedMemory,
    String battery)
  {
    this();
    this.cpuUsage = cpuUsage;
    this.ramFreeMemory = ramFreeMemory;
    this.ramUsedMemory = ramUsedMemory;
    this.battery = battery;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeviceOverallInfo(DeviceOverallInfo other) {
    if (other.isSetCpuUsage()) {
      this.cpuUsage = other.cpuUsage;
    }
    if (other.isSetRamFreeMemory()) {
      this.ramFreeMemory = other.ramFreeMemory;
    }
    if (other.isSetRamUsedMemory()) {
      this.ramUsedMemory = other.ramUsedMemory;
    }
    if (other.isSetBattery()) {
      this.battery = other.battery;
    }
  }

  public DeviceOverallInfo deepCopy() {
    return new DeviceOverallInfo(this);
  }

  @Override
  public void clear() {
    this.cpuUsage = null;
    this.ramFreeMemory = null;
    this.ramUsedMemory = null;
    this.battery = null;
  }

  public String getCpuUsage() {
    return this.cpuUsage;
  }

  public DeviceOverallInfo setCpuUsage(String cpuUsage) {
    this.cpuUsage = cpuUsage;
    return this;
  }

  public void unsetCpuUsage() {
    this.cpuUsage = null;
  }

  /** Returns true if field cpuUsage is set (has been assigned a value) and false otherwise */
  public boolean isSetCpuUsage() {
    return this.cpuUsage != null;
  }

  public void setCpuUsageIsSet(boolean value) {
    if (!value) {
      this.cpuUsage = null;
    }
  }

  public String getRamFreeMemory() {
    return this.ramFreeMemory;
  }

  public DeviceOverallInfo setRamFreeMemory(String ramFreeMemory) {
    this.ramFreeMemory = ramFreeMemory;
    return this;
  }

  public void unsetRamFreeMemory() {
    this.ramFreeMemory = null;
  }

  /** Returns true if field ramFreeMemory is set (has been assigned a value) and false otherwise */
  public boolean isSetRamFreeMemory() {
    return this.ramFreeMemory != null;
  }

  public void setRamFreeMemoryIsSet(boolean value) {
    if (!value) {
      this.ramFreeMemory = null;
    }
  }

  public String getRamUsedMemory() {
    return this.ramUsedMemory;
  }

  public DeviceOverallInfo setRamUsedMemory(String ramUsedMemory) {
    this.ramUsedMemory = ramUsedMemory;
    return this;
  }

  public void unsetRamUsedMemory() {
    this.ramUsedMemory = null;
  }

  /** Returns true if field ramUsedMemory is set (has been assigned a value) and false otherwise */
  public boolean isSetRamUsedMemory() {
    return this.ramUsedMemory != null;
  }

  public void setRamUsedMemoryIsSet(boolean value) {
    if (!value) {
      this.ramUsedMemory = null;
    }
  }

  public String getBattery() {
    return this.battery;
  }

  public DeviceOverallInfo setBattery(String battery) {
    this.battery = battery;
    return this;
  }

  public void unsetBattery() {
    this.battery = null;
  }

  /** Returns true if field battery is set (has been assigned a value) and false otherwise */
  public boolean isSetBattery() {
    return this.battery != null;
  }

  public void setBatteryIsSet(boolean value) {
    if (!value) {
      this.battery = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CPU_USAGE:
      if (value == null) {
        unsetCpuUsage();
      } else {
        setCpuUsage((String)value);
      }
      break;

    case RAM_FREE_MEMORY:
      if (value == null) {
        unsetRamFreeMemory();
      } else {
        setRamFreeMemory((String)value);
      }
      break;

    case RAM_USED_MEMORY:
      if (value == null) {
        unsetRamUsedMemory();
      } else {
        setRamUsedMemory((String)value);
      }
      break;

    case BATTERY:
      if (value == null) {
        unsetBattery();
      } else {
        setBattery((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CPU_USAGE:
      return getCpuUsage();

    case RAM_FREE_MEMORY:
      return getRamFreeMemory();

    case RAM_USED_MEMORY:
      return getRamUsedMemory();

    case BATTERY:
      return getBattery();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CPU_USAGE:
      return isSetCpuUsage();
    case RAM_FREE_MEMORY:
      return isSetRamFreeMemory();
    case RAM_USED_MEMORY:
      return isSetRamUsedMemory();
    case BATTERY:
      return isSetBattery();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeviceOverallInfo)
      return this.equals((DeviceOverallInfo)that);
    return false;
  }

  public boolean equals(DeviceOverallInfo that) {
    if (that == null)
      return false;

    boolean this_present_cpuUsage = true && this.isSetCpuUsage();
    boolean that_present_cpuUsage = true && that.isSetCpuUsage();
    if (this_present_cpuUsage || that_present_cpuUsage) {
      if (!(this_present_cpuUsage && that_present_cpuUsage))
        return false;
      if (!this.cpuUsage.equals(that.cpuUsage))
        return false;
    }

    boolean this_present_ramFreeMemory = true && this.isSetRamFreeMemory();
    boolean that_present_ramFreeMemory = true && that.isSetRamFreeMemory();
    if (this_present_ramFreeMemory || that_present_ramFreeMemory) {
      if (!(this_present_ramFreeMemory && that_present_ramFreeMemory))
        return false;
      if (!this.ramFreeMemory.equals(that.ramFreeMemory))
        return false;
    }

    boolean this_present_ramUsedMemory = true && this.isSetRamUsedMemory();
    boolean that_present_ramUsedMemory = true && that.isSetRamUsedMemory();
    if (this_present_ramUsedMemory || that_present_ramUsedMemory) {
      if (!(this_present_ramUsedMemory && that_present_ramUsedMemory))
        return false;
      if (!this.ramUsedMemory.equals(that.ramUsedMemory))
        return false;
    }

    boolean this_present_battery = true && this.isSetBattery();
    boolean that_present_battery = true && that.isSetBattery();
    if (this_present_battery || that_present_battery) {
      if (!(this_present_battery && that_present_battery))
        return false;
      if (!this.battery.equals(that.battery))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cpuUsage = true && (isSetCpuUsage());
    list.add(present_cpuUsage);
    if (present_cpuUsage)
      list.add(cpuUsage);

    boolean present_ramFreeMemory = true && (isSetRamFreeMemory());
    list.add(present_ramFreeMemory);
    if (present_ramFreeMemory)
      list.add(ramFreeMemory);

    boolean present_ramUsedMemory = true && (isSetRamUsedMemory());
    list.add(present_ramUsedMemory);
    if (present_ramUsedMemory)
      list.add(ramUsedMemory);

    boolean present_battery = true && (isSetBattery());
    list.add(present_battery);
    if (present_battery)
      list.add(battery);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeviceOverallInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCpuUsage()).compareTo(other.isSetCpuUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpuUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cpuUsage, other.cpuUsage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRamFreeMemory()).compareTo(other.isSetRamFreeMemory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRamFreeMemory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ramFreeMemory, other.ramFreeMemory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRamUsedMemory()).compareTo(other.isSetRamUsedMemory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRamUsedMemory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ramUsedMemory, other.ramUsedMemory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBattery()).compareTo(other.isSetBattery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBattery()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.battery, other.battery);
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
    StringBuilder sb = new StringBuilder("DeviceOverallInfo(");
    boolean first = true;

    sb.append("cpuUsage:");
    if (this.cpuUsage == null) {
      sb.append("null");
    } else {
      sb.append(this.cpuUsage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ramFreeMemory:");
    if (this.ramFreeMemory == null) {
      sb.append("null");
    } else {
      sb.append(this.ramFreeMemory);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ramUsedMemory:");
    if (this.ramUsedMemory == null) {
      sb.append("null");
    } else {
      sb.append(this.ramUsedMemory);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("battery:");
    if (this.battery == null) {
      sb.append("null");
    } else {
      sb.append(this.battery);
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

  private static class DeviceOverallInfoStandardSchemeFactory implements SchemeFactory {
    public DeviceOverallInfoStandardScheme getScheme() {
      return new DeviceOverallInfoStandardScheme();
    }
  }

  private static class DeviceOverallInfoStandardScheme extends StandardScheme<DeviceOverallInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeviceOverallInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CPU_USAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cpuUsage = iprot.readString();
              struct.setCpuUsageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RAM_FREE_MEMORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ramFreeMemory = iprot.readString();
              struct.setRamFreeMemoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RAM_USED_MEMORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ramUsedMemory = iprot.readString();
              struct.setRamUsedMemoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BATTERY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.battery = iprot.readString();
              struct.setBatteryIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeviceOverallInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cpuUsage != null) {
        oprot.writeFieldBegin(CPU_USAGE_FIELD_DESC);
        oprot.writeString(struct.cpuUsage);
        oprot.writeFieldEnd();
      }
      if (struct.ramFreeMemory != null) {
        oprot.writeFieldBegin(RAM_FREE_MEMORY_FIELD_DESC);
        oprot.writeString(struct.ramFreeMemory);
        oprot.writeFieldEnd();
      }
      if (struct.ramUsedMemory != null) {
        oprot.writeFieldBegin(RAM_USED_MEMORY_FIELD_DESC);
        oprot.writeString(struct.ramUsedMemory);
        oprot.writeFieldEnd();
      }
      if (struct.battery != null) {
        oprot.writeFieldBegin(BATTERY_FIELD_DESC);
        oprot.writeString(struct.battery);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeviceOverallInfoTupleSchemeFactory implements SchemeFactory {
    public DeviceOverallInfoTupleScheme getScheme() {
      return new DeviceOverallInfoTupleScheme();
    }
  }

  private static class DeviceOverallInfoTupleScheme extends TupleScheme<DeviceOverallInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeviceOverallInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCpuUsage()) {
        optionals.set(0);
      }
      if (struct.isSetRamFreeMemory()) {
        optionals.set(1);
      }
      if (struct.isSetRamUsedMemory()) {
        optionals.set(2);
      }
      if (struct.isSetBattery()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCpuUsage()) {
        oprot.writeString(struct.cpuUsage);
      }
      if (struct.isSetRamFreeMemory()) {
        oprot.writeString(struct.ramFreeMemory);
      }
      if (struct.isSetRamUsedMemory()) {
        oprot.writeString(struct.ramUsedMemory);
      }
      if (struct.isSetBattery()) {
        oprot.writeString(struct.battery);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeviceOverallInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.cpuUsage = iprot.readString();
        struct.setCpuUsageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ramFreeMemory = iprot.readString();
        struct.setRamFreeMemoryIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ramUsedMemory = iprot.readString();
        struct.setRamUsedMemoryIsSet(true);
      }
      if (incoming.get(3)) {
        struct.battery = iprot.readString();
        struct.setBatteryIsSet(true);
      }
    }
  }

}

