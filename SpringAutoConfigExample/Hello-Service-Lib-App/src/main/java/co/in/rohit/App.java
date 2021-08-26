package co.in.rohit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohit.HelloService;

import co.in.rohit.config.AppConfig;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService bean = context.getBean("helloService", HelloService.class);
		bean.sayHello("Rohit");
	}
}
