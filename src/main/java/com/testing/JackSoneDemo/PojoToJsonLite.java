package com.basic.JackSoneDemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class PojoToJsonLite {

	public static void main(String[] args) {
		try {

			//Create a objectMapper object
			ObjectMapper mapper = new ObjectMapper();

			//Create a student class which want to convert the json
			StudentLite theStudent = new StudentLite();
			theStudent.setId(1);
			theStudent.setFirstName("ROHIT");
			theStudent.setLastName("Bhamore");
			theStudent.setActive(true);

			//File for location of the json file creation
			File file = new File("data/liteOutput.json");

			//actual converting pojo to Json
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(file, theStudent);
			
			System.out.println("done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
