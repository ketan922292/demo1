package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.service.Jio;

@RestController
@RequestMapping("/jio")
public class JioContro {

	@Autowired
	Jio ser;
	
	@GetMapping("/plans")
	public String cities() {
		System.out.println("demo");
		return ser.plans();
	}
	
}
