package com.telsku.API_Gateway.routes;

import java.net.URI;

import org.springframework.cloud.gateway.server.mvc.filter.CircuitBreakerFilterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.function.RequestPredicate;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {

	@Bean
	public RouterFunction<ServerResponse> eluskoService(){
		return GatewayRouterFunctions.route("teluskomicroservice1")
				.route(RequestPredicates.path("/course-info"),
						HandlerFunctions.http("http://localhost:8583"))
				.filter(CircuitBreakerFilterFunctions
						.circuitBreaker("teluskomicroservice1CircuitBreaker",URI.create("forward:/fallbackRoute")))
				.build();
				
	}
	@Bean
	public RouterFunction<ServerResponse> fallbackRoute(){
		return GatewayRouterFunctions.route("fallbackRoute")
				.GET("/fallbackRoute" , request -> ServerResponse.status(HttpStatus.SERVICE_UNAVAILABLE)
						.body("Service Currently Unavailable , try again after some time"))
								.build();
				
	}
	@Bean
	public RouterFunction<ServerResponse> eluskoService2(){
		return GatewayRouterFunctions.route("teluskomicroservice2")
				.route(RequestPredicates.path("/course-details"),
						HandlerFunctions.http("http://localhost:8484")).build();
				
	}
	
	
}
