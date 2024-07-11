package com.web.service;

import org.springframework.stereotype.Service;

@Service
public class CityService {

	AA a= new AA();
	DD d = new DD();
	EE e= new EE();
	public String cities() {
		return "mumbai,pune";
	}

	
}
