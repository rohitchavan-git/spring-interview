package com.rohit.config;

public class Bar {

	private String name;

	public Bar() {
	}

	public Bar(String name) {
		System.out.println("bar param constructor with paramenter: "+ name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
