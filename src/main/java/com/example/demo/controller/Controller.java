package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/")
	public String getHome() {
		return "<h1>My name is Hamza<h1>";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "<h1>I am a user<h1>";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "<h1>I am a admin<h1>";
	}
	

}
