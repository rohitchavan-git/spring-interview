package com.rohit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	public HelloController() {
		System.out.println("Hello controller constructor");
	}

	@GetMapping("/hello")
	public String hello() {
		System.out.println("hello mapping ..");
		return "hellopage";
	}
}
