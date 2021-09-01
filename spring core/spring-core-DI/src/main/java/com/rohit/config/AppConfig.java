package com.rohit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rohit.model.Bar;
import com.rohit.model.Foo;

@Configuration
public class AppConfig {

	@Bean(name = { "barName", "chlidDIName" },
			initMethod = "init", destroyMethod = "finish")
	public Bar bar() {
		Bar bar = new Bar();
		bar.setBname("bar Name");
		return bar;
	}

	@Bean(name = { "fooName", "ParentDIName" }, 
			initMethod = "init", destroyMethod = "finish")
	@Scope("prototype")
	public Foo foo(Bar bar) { // DI using Factory Method DI
		return new Foo(bar);
	}
}
