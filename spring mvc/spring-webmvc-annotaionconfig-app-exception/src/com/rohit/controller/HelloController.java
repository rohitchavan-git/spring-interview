package com.rohit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rohit.customException.HelloException;
import com.rohit.customException.HeyException;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String helloMapping() {
		System.out.println("hello controller mapping.");
		return "hellopage";
	}

	@GetMapping("/helloException")
	public void handleSayHelloRequest() {
		throw new HeyException();
	}

	@GetMapping("/heyException")
	public void handleSayHey() {
		throw new HelloException("test exception", null);
	}

}
