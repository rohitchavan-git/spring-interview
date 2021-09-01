package com.rohit.customException;

public class HelloException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public HelloException() {
		super();
	}
	public HelloException(String exception, Throwable ex) {
		super(exception, ex);
	}
}
