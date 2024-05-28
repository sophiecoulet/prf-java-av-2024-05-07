package fr.maboite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class SophieTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("before each");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("after each");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("after all");
	}

	@RepeatedTest(value = 5)
	public void testSuccess() {
		int expectedValue = 4;
		int computedValue = 2 + 2;
		assertEquals(expectedValue, computedValue);
	}

	@Test
	@DisplayName("2")
	public void testFailure(TestInfo testInfo) {
		assertEquals(2, Integer.valueOf(testInfo.getDisplayName()));
	}

}
