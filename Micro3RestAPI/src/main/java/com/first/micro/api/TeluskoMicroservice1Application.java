package com.first.micro.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class TeluskoMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(TeluskoMicroservice1Application.class, args);
		System.out.println("\n\t\t\t\t\t\t This is the 3rd Micro s api...");
	}

}
