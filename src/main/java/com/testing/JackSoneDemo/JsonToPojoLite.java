package com.basic.JackSoneDemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojoLite {
	public static void main(String[] args) {

		try {

			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// Create File object
			File file = new File("data/sample-lite.json");

			// read json file and convert to the Object
			StudentLite theStudent = mapper.readValue(file, StudentLite.class);

			// print object
			System.out.println(theStudent);

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}
}
