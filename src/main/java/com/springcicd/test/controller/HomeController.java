package com.springcicd.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home/{name}")
	public String getname(@PathVariable("name")String name) {
		return name + ", Welcome";
	}
	@GetMapping("/")
	public String sayHello() {
		return "Hello Update Success";
	}
}
