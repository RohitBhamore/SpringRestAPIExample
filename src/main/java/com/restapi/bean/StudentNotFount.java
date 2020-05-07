package com.restapi.bean;

public class StudentNotFount extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StudentNotFount(String msg) {
		super(msg);
	}

}
