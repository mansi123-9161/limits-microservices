package com.learn.microservice.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservice.currencyconversionservice.entity.CurrencyConversion;

@RestController
public class CurrencyConversionController {
	
	@GetMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String to, @PathVariable String from,
			@PathVariable BigDecimal quantity) {
		return new CurrencyConversion(100L, to, from, quantity, BigDecimal.ONE, BigDecimal.ONE,"");
	}

}
