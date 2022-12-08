package com.ws.ride.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ws.ride.soap.RideProcessorImpl;

@Configuration
public class WebServiceConfig {

	public WebServiceConfig() {
		super();
	}

	@Autowired
	private Bus bus;
	
	@Bean
	Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new RideProcessorImpl());
		endpoint.publish("/rideProcessor");
		
		return endpoint;
	}
}
