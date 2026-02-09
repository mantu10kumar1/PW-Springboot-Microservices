package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublisAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublisAppApplication.class, args);
		System.out.println("\n\t\t\t\t\t\t Kafka Pubs app is running...");
	}

}
