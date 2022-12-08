package com.ws.ride.soap;

import com.ws.ride.dto.RideProcessorRequest;
import com.ws.ride.dto.RideProcessorResponse;

public class RideProcessorImpl implements RideProcessor {

	@Override
	public RideProcessorResponse processRide(RideProcessorRequest request) {
		RideProcessorResponse response = new RideProcessorResponse();
		
		System.out.println(request.toString());
		
		response.setStatus("Approved");
		
		return response;
	}

}
