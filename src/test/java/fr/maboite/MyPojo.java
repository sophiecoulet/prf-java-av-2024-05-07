package fr.maboite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyPojo {
	public MyPojo(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) throws JsonProcessingException {
		MyPojo myPojo = new MyPojo("carembar",1);
		ObjectMapper mapper = new ObjectMapper(); 
		String jsonString = mapper.writeValueAsString(myPojo);
		System.out.println(jsonString);
	}
}

