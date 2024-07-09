package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.service.CountoryService;

@RestController
public class CountoryController {

	@Autowired
	CountoryService ser;
	
	@GetMapping("/countries")
	public String cities() {
		return ser.countries();
	}

	
	
	
}
