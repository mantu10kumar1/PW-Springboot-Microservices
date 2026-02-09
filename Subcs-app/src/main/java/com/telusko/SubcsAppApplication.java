package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.telusko.util.AppConstants;

@SpringBootApplication
public class SubcsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubcsAppApplication.class, args);
		System.out.println("\n\t\t\t\t\t\t Kafka Subcs app is running...");
		
	}
	
	@KafkaListener(topics= AppConstants.TOPIC_NAME , groupId = "group_telusko_customer")
	public void subscribeMsgFromKafkaTopic(String cxData) {
		System.out.println("Message is comming from kafka server ");
		System.out.println(cxData);
	}

}
