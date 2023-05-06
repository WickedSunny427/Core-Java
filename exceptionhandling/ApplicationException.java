package com.corejavaprojects.exceptionhandling;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = 1L;

	public ApplicationException() {
		super();
	}

	public ApplicationException(String message) {
		super(message);
	}
}
