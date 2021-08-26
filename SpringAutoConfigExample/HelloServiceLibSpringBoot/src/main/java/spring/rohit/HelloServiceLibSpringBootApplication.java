package spring.rohit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rohit.HelloService;

@SpringBootApplication
public class HelloServiceLibSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloServiceLibSpringBootApplication.class, args);
		HelloService bean = context.getBean(HelloService.class);
		bean.sayHello("Rohit");
	}

}
