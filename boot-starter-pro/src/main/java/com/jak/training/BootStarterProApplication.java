package com.jak.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/main")
public class BootStarterProApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStarterProApplication.class, args);
	}
	
	@RequestMapping("/news")
	String getNews() {
		return "Your dose of daily good news is here !";
	}

}
