package com.web.service;

import org.springframework.stereotype.Service;

@Service
public class CityService {

	GG g= new GG();
	FF f= new FF();
	JJ j = new JJ();
	public String cities() {
		return "mumbai,pune";
	}

	
}
