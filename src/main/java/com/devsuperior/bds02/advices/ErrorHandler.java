package com.devsuperior.bds02.advices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.bds02.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ErrorMessageAdvice> entityNotFound(ResourceNotFoundException e) {
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		return new ResponseEntity(new ErrorMessageAdvice(e.getMessage(), httpStatus), httpStatus);
	}
}