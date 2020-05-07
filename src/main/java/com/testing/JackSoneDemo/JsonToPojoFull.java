package com.basic.JackSoneDemo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPojoFull {

	public static void main(String[] args) {

		
		try {

			ObjectMapper mapper = new ObjectMapper();
			
			File file = new File("data/sample-full.json");
			
			StudentFull theStudent = mapper.readValue(file, StudentFull.class);
			
			System.out.println(theStudent);
			
		} catch (Exception ex) {

			ex.printStackTrace();

		}
	}
}
