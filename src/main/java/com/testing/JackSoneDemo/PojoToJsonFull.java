package com.basic.JackSoneDemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PojoToJsonFull {

	public static void main(String[] args) {
		try {

			ObjectMapper mapper = new ObjectMapper();

			StudentFull theStudent = new StudentFull();
			theStudent.setId(1);
			theStudent.setFirstName("ROHIT");
			theStudent.setLastName("Bhamore");
			theStudent.setActive(true);

			StudentFull.address address = theStudent.new address();
			address.setStreet("Manickpur");
			address.setCity("mumbai");
			address.setState("Maharastra");
			address.setZip(401202);
			address.setCountry("india");
			theStudent.setAddress(address);

			String[] languages = new String[] { "Hindi", "English", "Marathi" };
			theStudent.setLanguages(languages);

			File file = new File("data/outputFull.json");

			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(file, theStudent);

			System.out.println("DONE");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
