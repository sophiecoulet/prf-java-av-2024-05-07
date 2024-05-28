package fr.maboite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Tests {
	
	@BeforeAll
	
	public  static void faim() {
		
		System.out.println("j'ai faim");
		
	}

     @BeforeEach
     public void toto() {
    	 System.out.println("ingrédients du tartare prêts");
     }
     
     @AfterEach
     
     public void tartare() {
    	 System.out.println("test tartaré");
     }
     

	@RepeatedTest(5)
	public void testSuccess() {
		System.out.println("blue");
		assertEquals(2, 2);
	}
	
	@Test 
	@DisplayName("bogue le bogue mange un bug")
	public void testFailure() {
		
		assertEquals(3, 2);
	}
	@AfterAll
	public static void toConclude() {
		System.out.println("all test completed, time to enjoy some joe!");
	}

	
	}

