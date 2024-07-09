package com.web.controller;

import org.springframework.web.bind.annotation.RestController;

import com.web.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CityController {
	
	@Autowired
	CityService ser;
	
	@GetMapping("/cities")
	public String cities() {
		return ser.cities();
	}
	

}
