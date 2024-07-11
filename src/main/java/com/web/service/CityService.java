package com.web.service;

import org.springframework.stereotype.Service;

@Service
public class CityService {

	OO O = new OO();
	SS s= new SS();
	public String cities() {
		return "mumbai,pune";
	}

	
}
