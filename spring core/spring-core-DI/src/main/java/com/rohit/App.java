package com.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.config.AppConfig;
import com.rohit.model.Foo;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
			context.registerShutdownHook();
			Foo foo = context.getBean(Foo.class);
				
			context.close();
	
	}

}
