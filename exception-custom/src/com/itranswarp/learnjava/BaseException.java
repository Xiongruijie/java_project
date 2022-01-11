package com.itranswarp.learnjava;

public class BaseException extends RuntimeException {
	
//	protected String messageString;

	public BaseException() {
		super();
	}

	public BaseException(String message, Throwable cause) {
		
		super(message, cause);
//		this.messageString = message;
	}

	public BaseException(String message) {
		super(message);
//		this.messageString = message;
	}

	public BaseException(Throwable cause) {
		super(cause);
	}	
}
