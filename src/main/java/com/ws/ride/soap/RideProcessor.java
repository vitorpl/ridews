package com.ws.ride.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ws.ride.dto.RideProcessorRequest;
import com.ws.ride.dto.RideProcessorResponse;

@WebService(name="RideProcessor")
public interface RideProcessor {

	
	@WebMethod
	public @WebResult(name = "response") RideProcessorResponse processRide (
			@WebParam(name = "rideProcessorRequest") RideProcessorRequest rideProcessorRequest);
	
}
