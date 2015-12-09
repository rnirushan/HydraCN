package com.uom.cse.central_node.services;

import java.util.List;

import org.apache.thrift.TException;

import com.uom.cse.central_node.HydraCN;
import com.uom.cse.central_node.android_agent_services.AndroidAgentServiceClient;
import com.uom.cse.central_node.model.Device;
import com.uom.cse.central_node.view.DeviceOverviewController;

import javafx.application.Platform;

public class RegisterDeviceHandler implements RegisterDeviceService.Iface {

	public static HydraCN hydraCN;

	int count = 0;
	@Override
	public void registerDevice(com.uom.cse.central_node.services.Device deviceDetails) throws TException {
		
		com.uom.cse.central_node.model.Device device = new com.uom.cse.central_node.model.Device(
				deviceDetails.deviceId, deviceDetails.IPAddress, deviceDetails.type);
		
		List<com.uom.cse.central_node.model.Device> existingDeviceList = 
				DeviceOverviewController.deviceOverviewController.deviceTable.getItems();
		
		count = 0;
		for(com.uom.cse.central_node.model.Device tempDevice : existingDeviceList){
			
			if(tempDevice.getDeviceId().equals(device.getDeviceId())){
				
				Platform.runLater 
				( () -> DeviceOverviewController.deviceOverviewController.deviceTable.getItems().remove(count));
				
			}
			count++;
		}
		
		//add device to observableList of device table
		hydraCN.getDeviceData().add(device);
		float bandwidth = AndroidAgentServiceClient.getNetworkBandwidth(device.getIPAddress());
		return;
		
	}
	
	@Override
	public void pushProcessesInfo(List<ThriftAgentProcessInfo> processes) throws TException {
		// TODO Auto-generated method stub
		
	}
	
}
