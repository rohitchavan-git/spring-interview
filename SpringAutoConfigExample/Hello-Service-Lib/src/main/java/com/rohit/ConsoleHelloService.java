package com.rohit;

import java.util.Optional;

public class ConsoleHelloService implements HelloService {

	private String prefix;

	private String postfix;

	public ConsoleHelloService() {
		this(null,null);
	}

	public ConsoleHelloService(String prefix, String postfix) {
		this.prefix = Optional.ofNullable(prefix).orElseGet(()->"hi");
		this.postfix = Optional.ofNullable(postfix).orElseGet(()->"!!");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(this.prefix+ " " + name+ " "+ this.postfix);
	}

}
