package fr.maboite;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonProcessingException {

		MyPojo myPojo = new MyPojo("test",1); 
		ObjectMapper mapper = new ObjectMapper(); 
		String jsonString = mapper.writeValueAsString(myPojo);
	}

}
