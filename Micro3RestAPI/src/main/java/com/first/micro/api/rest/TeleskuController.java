package com.first.micro.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeleskuController {
	
	@Autowired
	private Environment env;

	@GetMapping("/course-info")
	public ResponseEntity<String> getCourseInfo(){
		String portNo = env.getProperty("server.port");
	    String info = "Telusko Has Launched DevOps with aws course and New Java course : " + portNo;
	    return new ResponseEntity<String>(info , HttpStatus.OK);
	}
	
}
