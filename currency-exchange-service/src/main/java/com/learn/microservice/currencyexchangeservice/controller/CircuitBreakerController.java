package com.learn.microservice.currencyexchangeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
	private Logger logger=LoggerFactory.getLogger(CircuitBreakerController.class);
	@GetMapping("/sampleMapping")
	@Retry(name = "sampleApi")
	public String CircuitApi(){
		/* by default it will retry 3 times */
		logger.info("sample call recieved");
		ResponseEntity<String> entity = new RestTemplate().getForEntity("http://8089/spring", String.class);
		return entity.getBody();
	}

}
