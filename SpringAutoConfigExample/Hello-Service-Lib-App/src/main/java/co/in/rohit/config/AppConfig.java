package co.in.rohit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rohit.ConsoleHelloService;
import com.rohit.HelloService;

@Configuration
public class AppConfig {

	@Bean
	public HelloService helloService() {
		return new ConsoleHelloService("hey","###");
	}
	
}
