package com.rohit.model;

public class Bar {

	private String bname;

	public Bar() {
	}

	public Bar(String bname) {
		this.bname = bname;
	}

	public void init() {
		System.out.println("postConstruct callback method : BAR");
	}

	public void finish() {
		System.out.println("predestroy callback method : Bar");
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}
}
