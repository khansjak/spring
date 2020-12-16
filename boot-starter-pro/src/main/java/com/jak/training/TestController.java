package com.jak.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/message")
	String getMessage() {
		return "Yess ! we are able to call this from a client ...!";
	}
	
	@RequestMapping("/second")
	String getMessage2() {
		return "This is second message from other url";
	}
	
	@RequestMapping("/third")
	String getMessage3() {
		return "This is third message";
	}

}
