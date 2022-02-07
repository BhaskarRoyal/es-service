package com.phc.es;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0.0")
public class ApiController {
	
	
	@GetMapping("/health")
	public String health(){
		return "Application up and running";
	}

}
