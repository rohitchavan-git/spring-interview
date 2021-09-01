package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	public HelloController() {
		System.out.println("HEllo Controller constructor");
	}

	@GetMapping("/hello")
	public String handleHelloRequest() {
		System.out.println("hello request hander...");
		return "hellopage";
	}
}
