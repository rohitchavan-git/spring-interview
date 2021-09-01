package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

import com.rohit.config.AppConfig;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(context.getEnvironment());
		
		System.out.println("...............Resource Class info.........");
		Resource resource = context.getResource("");
		
		System.out.println(resource.getClass().getName());
		
		
	}

}
