package com.basic.JackSoneDemo;

import java.util.Arrays;

public class StudentFull {

    /*
	 * "id": 14, 
	 * "firstName": "Mario", 
	 * "lastName": "Rossi", 
	 * "active": true,
	 * "address": 
	 *     { 
	 *         "street": "100 Main St",
	 *         "city": "Philadelphia", 
	 *         "state": "Pennsylvania", 
	 *         "zip": "19103", 
	 *         "country": "USA" 
	 *     }, 
	 * "languages" : ["Java","C#", "Python", "Javascript"]
	 * 
	 */
	
	private int id;

	private String firstName;

	private String lastName;

	private boolean active;

	private address address;

	private String[] languages;

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

	public address getAddress() {
		return address;
	}

	public void setAddress(address address) {
		this.address = address;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "StudentFull [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active
				+ ", address=" + address + ", languages=" + Arrays.toString(languages) + "]";
	}

	public class address {
		private String street;

		private String city;

		private String state;

		private int zip;

		private String country;

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
					+ country + "]";
		}

	}

}
