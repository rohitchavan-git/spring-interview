package com.rohit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.rohit.controller")
public class DSConfigContainer {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		System.out.println("view resolver");
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}

}
