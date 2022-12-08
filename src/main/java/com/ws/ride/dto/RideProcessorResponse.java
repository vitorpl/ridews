package com.ws.ride.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideProcessorResponse")
public class RideProcessorResponse {
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
