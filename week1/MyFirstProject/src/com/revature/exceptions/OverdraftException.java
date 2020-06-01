package com.revature.exceptions;

// Since we extended RuntimeException, our class will also be an unchecked exception
public class OverdraftException extends RuntimeException {

	public OverdraftException() {
		super();
	}

	public OverdraftException(String message, Throwable cause) {
		super(message, cause);
	}

	public OverdraftException(String message) {
		super(message);
	}

	public OverdraftException(Throwable cause) {
		super(cause);
	}

}
