package com.prowings.entity;

import org.springframework.http.HttpStatus;

public class Error {
	
	private HttpStatus httpStatus;

	private String errorMessage;
	
	public Error() {
		super();
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}


	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
