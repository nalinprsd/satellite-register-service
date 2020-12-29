package com.starlink.satellite.register.service.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starlink.satellite.register.service.pojo.SatAddRequest;
import com.starlink.satellite.register.service.pojo.SatAddResponse;
	

@RestController
@RequestMapping("/spacex-starlink/registerservice")
public class SatelliteAddRestController {
	
		
	@PostMapping("/satellite/add")
	public ResponseEntity<?> control(@RequestBody SatAddRequest addRequest, 
			@RequestHeader("username") String username, @RequestHeader("password") String password) {
		
		
		SatAddResponse addResponse = new SatAddResponse();
		
		if(isValidUser(username, password)) {
			addResponse.setSatellite_name(addRequest.getSatellite_name());
			addResponse.setMessage("SUCCESSFULLY ADDED");
			addResponse.setStatus("ADDED");
			addResponse.setNorad_id(addRequest.getNorad_id());
			addResponse.setLatitude(addRequest.getLatitude());
			addResponse.setLongitude(addRequest.getLongitude());
			addResponse.setAltitude(addRequest.getAltitude());
			addResponse.setSpeed_km(addRequest.getSpeed_km());
			addResponse.setSpeed_mi(4.73 + "[mi/s]");
			addResponse.setAzimuth(170.9 +"S");
			addResponse.setElevation(addRequest.getElevation());
			addResponse.setRight_ascension("14h 54m 19s");
			addResponse.setDeclination(addRequest.getDeclination());
			
			return new ResponseEntity<>(addResponse, HttpStatus.OK);
			
		}else{
			return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
		}
	}
		
	
	public boolean isValidUser(String username, String password) {
		
		return ("user1".equals(username) && "abc123".equals(password)) ? true : false;
		
	}
}

