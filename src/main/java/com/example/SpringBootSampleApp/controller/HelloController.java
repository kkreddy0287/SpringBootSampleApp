package com.example.SpringBootSampleApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello world";
	}
	
	@GetMapping("/greeting")
	public String sayGreet() {
		return "Welcome to the world of Devops !!";
	}
	
	@GetMapping("/email")
	public String sendEmail() {
		return "Contact Us - Send an Email !!";
	}
	
	

}
