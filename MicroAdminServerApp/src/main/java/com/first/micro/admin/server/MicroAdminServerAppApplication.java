package com.first.micro.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroAdminServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAdminServerAppApplication.class, args);
		System.out.println("\n\t\t\t\t\t This is the admin2 server application...");
	}

}
