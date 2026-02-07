package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSpringBootApplication.class, args);
		System.out.println("\n\t\t\t\t\t\t\t My Redis application is running...");
	}

}
