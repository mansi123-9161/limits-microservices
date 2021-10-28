package com.learn.microservice.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LoggingFilter implements GlobalFilter {
	private Logger logger = LoggerFactory.getLogger(LoggingFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("path of req recieved is: ",exchange.getRequest().getURI().getPath());
		System.out.println(exchange.getRequest().getURI().getPath());
		logger.info("path of requress recieved is: ",exchange.getRequest().getPath().contextPath().value());
		return chain.filter(exchange);
	}

}
