package com.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.restapi.bean.StudentNotFount;
import com.restapi.bean.StudentResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentResponse> handlerException(StudentNotFount ex) {

		StudentResponse error = new StudentResponse();
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentResponse>(error, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<StudentResponse> handlerException(Exception ex) {

		StudentResponse error = new StudentResponse();
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentResponse>(error, HttpStatus.BAD_REQUEST);

	}
}
