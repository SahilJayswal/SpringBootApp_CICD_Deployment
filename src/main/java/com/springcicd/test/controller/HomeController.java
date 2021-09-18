package com.springcicd.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String getname() {
		return "Sahil";
	}
	@GetMapping("/")
	public String sayHello() {
		return "Hello";
	}
}
