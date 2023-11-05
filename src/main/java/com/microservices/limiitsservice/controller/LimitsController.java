package com.microservices.limiitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limiitsservice.bean.Limits;
import com.microservices.limiitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuartion;

	@GetMapping("/limits")
	public Limits reterive() {
		return new Limits(configuartion.getMinimum(), configuartion.getMaximum());
	}

}
