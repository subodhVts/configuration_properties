package com.subodh.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String SayHello() {
		return "Hello";
	}
	
	
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public String helloUser() {
		return "Hello User";
	}
	
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String helloAdmin() {
		return "Hello admin";
	}


}
