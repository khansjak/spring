package com.ecommerce.webapp.springdemo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public static String main(String[] args) {
		//SpringApplication.run(SpringDemoApplication, args)
		return "Hello to my  Spring bvoot App";
	}
	

}
