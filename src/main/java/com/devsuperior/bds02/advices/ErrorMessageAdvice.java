package com.devsuperior.bds02.advices;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorMessageAdvice {

	private String message;
	private Integer statusCode;
	private HttpStatus httpStatus = null;
	private LocalDateTime localDateTime = null;

	public ErrorMessageAdvice() {
	}

	public ErrorMessageAdvice(String message, HttpStatus httpStatus) {
		this.message = message;
		this.statusCode = httpStatus.value();
		this.httpStatus = httpStatus;
		this.localDateTime = LocalDateTime.now();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

}
