package com.rohit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Config.properties")
public class AppConfig {

	@Bean
	public Bar bar(@Value("${name}") String name) {
		return new Bar(name);
	}

}
