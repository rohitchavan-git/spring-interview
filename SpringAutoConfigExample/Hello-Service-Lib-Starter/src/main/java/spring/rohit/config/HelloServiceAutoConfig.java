package spring.rohit.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rohit.ConsoleHelloService;
import com.rohit.HelloService;

import spring.rohit.propertyConfig.HelloPropertyConfig;

@Configuration
@ConditionalOnClass(HelloService.class)
@EnableConfigurationProperties(HelloPropertyConfig.class)
public class HelloServiceAutoConfig {

	@Bean
	@ConditionalOnMissingBean
	public HelloService helloService(HelloPropertyConfig helloPropertyConfig) {
		System.out.println("create bean automatically with param "+helloPropertyConfig);
		return new ConsoleHelloService(helloPropertyConfig.getPrefix(),helloPropertyConfig.getPostfix());
	}
	
}
