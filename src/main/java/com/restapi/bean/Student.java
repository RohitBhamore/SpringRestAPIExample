package com.restapi.bean;

public class Student {

	private int rollNo;

	private String FirstName;

	private String LastName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String firstName, String lastName) {
		super();
		this.rollNo = rollNo;
		FirstName = firstName;
		LastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}

}
