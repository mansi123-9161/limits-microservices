package com.learn.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservice.limitsservice.bean.Limits;
import com.learn.microservice.limitsservice.config.LimitConfig;

@RestController
public class LimitsController {
	@Autowired
	private LimitConfig limitConfig;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitConfig.getMinimum(),limitConfig.getMaximum());
	}
}
