package fr.maboite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OlivierTest {

	
	
	@BeforeAll
	public static void beforeAll(){
		System.out.println("Avant les methodes");
	}
	
	@BeforeEach
	public  void beforeEach(){
		System.out.println("Avant chaque methodes");
	}	
	
	
	
	@AfterAll
	public static void afterAll(){
		System.out.println("après les methodes");
	}
	
	@AfterEach
	public  void afterEach(){
		System.out.println("aprè chaque methodes");
	}	
	
	@Test
	public void testSucess() {
		int value = 4;
		int calcule = 2 + 2;
		assertEquals(value, calcule);		
		//	System.out.println( value);

	}
	@Test
	public void testSucess2() {
		int value = 4;
		int calcule = 2 + 2;
		assertEquals(value, calcule);
		//	System.out.println( value);

	}
	@Test
	public void testFail() {
		//assertEquals(3, 2);
	}

}
