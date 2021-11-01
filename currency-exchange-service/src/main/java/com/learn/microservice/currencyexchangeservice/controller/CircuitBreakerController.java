package com.learn.microservice.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {
	
	@GetMapping("/sampleMapping")
	public String CircuitApi(){
		return "Sample API";
	}

}
