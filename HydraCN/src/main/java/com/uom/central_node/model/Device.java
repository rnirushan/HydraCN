package com.uom.central_node.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Device {
	
	private final StringProperty deviceId;
	private final StringProperty IPAddress;
	private final StringProperty type;
	
	public final static String TYPE_ANDROID = "ANDROID_DEVICE";
	public final static String TYPE_WINDOWS = "WINDOWS_DEVICE";
	
	public Device(String deviceId, String IPaddress, String type) {
		this.deviceId = new SimpleStringProperty(deviceId);
		this.IPAddress = new SimpleStringProperty(IPaddress);
		this.type = new SimpleStringProperty(type);
	}
	
	public String getDeviceId() {
        return deviceId.get();
    }

    public void setDeviceId(String deviceId) {
        this.deviceId.set(deviceId);
    }
    
    public StringProperty deviceIdProperty() {
        return deviceId;
    }
    
	public String getIPAddress() {
        return IPAddress.get();
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress.set(IPAddress);
    }
    
    public StringProperty IPAddressProperty() {
        return IPAddress;
    }
    
	public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }
    
    public StringProperty typeProperty() {
        return type;
    }
}
