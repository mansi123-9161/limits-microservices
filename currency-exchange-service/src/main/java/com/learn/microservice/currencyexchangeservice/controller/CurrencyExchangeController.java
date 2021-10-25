package com.learn.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservice.currencyexchangeservice.entity.CurrencyExchange;

@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		return new CurrencyExchange(100L, from, to, BigDecimal.valueOf(40));
	}
}
