package fr.maboite;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("Je suis le boss au dessus de la classe")
public class Tp1Test {
	
	@BeforeAll
	public static void avantCommencerTest() {
		System.out.println("@BeforeAll - Exécuté avant de commencer le test");
	}
	
	@BeforeEach
	public void avantChaqueTest() {
		System.out.println("@BeforeEach - Exécuté avant chaque méthode de test");
	}
	
	@AfterEach
	public void apresChaqueTest() {
		System.out.println("@AfterEach - Exécuté après chaque test de la classe");
	}
	
	@AfterAll
	public static void apresTousLesTests() {
		System.out.println("@AfterAll - Exécuté après tout les tests de la classe");
	}
	
	@Test
	@DisplayName("Je suis le boss")
	public void methodQuiEchou() {
		 System.out.println("methodQuiEchou");
		Assertions.assertEquals(5, 3);
	}
	
	 @RepeatedTest(4)
	public void methodQuiReussi() {
		 System.out.println("methodQuiReussi");
		Assertions.assertEquals(3, 3);
	}

}
