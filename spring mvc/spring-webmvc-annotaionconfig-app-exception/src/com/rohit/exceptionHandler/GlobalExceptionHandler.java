package com.rohit.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.rohit.customException.HelloException;
import com.rohit.customException.HeyException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(HelloException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleHelloException() {
		return "helloExceptionPage";
	}
	
	@ExceptionHandler(HeyException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public String handleHeyException() {
		return "heyExceptionPage";
	}
	
}
