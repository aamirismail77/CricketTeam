package com.bellinfo.cricket.exceptions;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 8899072605208596945L;

	
	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

}
