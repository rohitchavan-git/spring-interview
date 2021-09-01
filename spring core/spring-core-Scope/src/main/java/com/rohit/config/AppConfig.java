package com.rohit.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.SimpleThreadScope;

import com.rohit.model.Student;

@Configuration
public class AppConfig {

	@Bean
	@Scope("singleton")
	public Student s1() {
		return new Student();
	}

	@Bean
	@Scope("prototype")
	public Student s2() {
		return new Student();
	}
	
	@Bean
	@Scope("thread")
	public Student s3() {
		return new Student();
	}

	@Bean
	public CustomScopeConfigurer threadScope() {
		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
		Map<String, Object> scopes = new HashMap<>();
		scopes.put("thread", new SimpleThreadScope());
		configurer.setScopes(scopes);

		return configurer;
	}
}
