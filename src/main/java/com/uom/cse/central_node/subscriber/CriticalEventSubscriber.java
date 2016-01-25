package com.uom.cse.central_node.subscriber;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.uom.cse.central_node.data_objects.Filter;
import com.uom.cse.central_node.event.ApplicationEvent;

@Component
public class CriticalEventSubscriber implements StatementSubscriber {
	
	public CriticalEventSubscriber(String alert) {
		this.alertMessage = alert;
	}
	
    public String alertMessage;
    
    private static Logger LOG = LoggerFactory.getLogger(CriticalEventSubscriber.class);
      
    public String getStatement() {
    	        
       // String crtiticalEventExpression = "select avg(cpuUsage) as avgCpu from ApplicationEvent.win:time_batch(10) having avg(cpuUsage) > 20";
        
       // String criticalEventExpression = "select mac,cpuUsage,ramUsage,sentData,receiveData from ApplicationEvent where cpuUsage > "+ filter.getCpuUsage() +" and ramUsage > " + filter.getRamUsage() + " and sentData > " + filter.getSentData()+" and receiveData > " + filter.getReceivedData();
        return "";
    }
    
    
    public void update(Map<String, ApplicationEvent> eventMap) {


        StringBuilder sb = new StringBuilder();
        sb.append("************************************************");
        sb.append("\n* [ALERT] : CRITICAL EVENT DETECTED BY ESPER! ");
        sb.append("\n" + alertMessage);
        sb.append("\n" + "Detected in PC MAC - " + eventMap.get("mac"));
        //sb.append("\n* The CPU Usage of device 1 is above 20%; Device id - " +eventMap.get("mac") + " CPU Usage - " + eventMap.get("cpuUsage") + "RAM Usage - " + eventMap.get("ramUsage") + " Sent Data -" + eventMap.get("sentData") + " Receive Data -" + eventMap.get("receiveData"));
        sb.append("\n**********************************************");
        System.out.println(sb.toString());
        LOG.debug(sb.toString());
    }


	

    
}
