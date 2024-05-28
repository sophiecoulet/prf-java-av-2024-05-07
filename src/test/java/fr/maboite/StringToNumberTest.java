package fr.maboite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumberTest {
	
	@Test
	public void stringToNumber() {
		StringToNumber strNum=new StringToNumber();
		Integer number=strNum.stringToNumber("1234");
		Assertions.assertEquals(1234, number);
	}
}
