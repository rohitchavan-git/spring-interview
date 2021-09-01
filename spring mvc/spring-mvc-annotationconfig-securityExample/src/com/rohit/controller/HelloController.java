package com.rohit.controller;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

@Controller
public class HelloController {

	@Autowired
	WebApplicationContext applicationContext;

	@GetMapping("/internal/printOnConsole")
	public void handlePrintBeanCountRequest() {
		Stream.of(applicationContext.getBeanDefinitionNames())
				.map(i -> applicationContext.getBean(i.getClass()).toString()).peek(System.out::println);
	}
	
	@GetMapping("hello")
	public String handleHelloRequest() {
		return "hellopage";
	}
	
}
