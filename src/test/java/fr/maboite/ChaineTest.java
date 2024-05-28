package fr.maboite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChaineTest {
	
	@Test
	public void test0() {
		Chaine collier = new Chaine();
		Assertions.assertEquals(1, collier.calcResultNumberInChaine("1blabla"));
	}
	@Test
	public void test1() {
		Chaine collier = new Chaine();
		Assertions.assertEquals(2, collier.calcResultNumberInChaine("1blabla1"));
	}

}
