package com.rohit.model;

public class Foo {

	private Bar bar;

	public Foo() {
	}

	public Foo(Bar bar) {
		this.bar = bar;
	}

	public void init() {
		System.out.println("postConstruct callback method : FOO");
	}

	public void finish() {
		System.out.println("predestroy callback method : FOO");
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

}
