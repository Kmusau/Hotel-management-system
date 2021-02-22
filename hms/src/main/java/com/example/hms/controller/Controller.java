package com.example.hms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String homeResource() {
		return ("Welcome home");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("Welcome user");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome admin</h1>");
	}
	
}
