package com.basic.JackSoneDemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Its allow to ignor unknown property.
@JsonIgnoreProperties(ignoreUnknown = true)  
public class StudentLite {
	/*
	 * "id": 14,
	 *  "firstName": "Mario",
	 *  "lastName": "Rossi", 
	 *  "active": true
	 */

	private int id;

	private String firstName;

	private String lastName;

	private boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active + "]";
	}

}
