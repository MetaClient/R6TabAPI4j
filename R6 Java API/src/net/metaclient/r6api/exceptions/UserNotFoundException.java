package net.metaclient.r6api.exceptions;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}