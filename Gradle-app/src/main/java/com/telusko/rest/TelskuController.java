package com.telusko.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelskuController {

	@GetMapping("/info")
	public String info() {
		return "Telsku will announce free workshop of AI";
	}
}
