package com.phc.es.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiConroller {
	
	
	@GetMapping("/health")
	public String health(){
		return "UP";
	}

	
	@GetMapping("/")
	public String index(){
		return "Welcome to Azure Devops tutorial";
	}
}
