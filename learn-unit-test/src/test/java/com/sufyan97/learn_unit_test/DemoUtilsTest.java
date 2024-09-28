package com.sufyan97.learn_unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(ReplaceCamelCase.class)
public class DemoUtilsTest {
	DemoUtils demoUtils;
	
	@BeforeEach
	void setupBeforeEach() {
		demoUtils = new DemoUtils();
		System.out.println("@BeforeEach execute for each test");
	}
	/*
	@AfterEach
	void setupAfterEach() {
		System.out.println("@AfterEach execute for each test ");
	}
	
	@BeforeAll
	static void setupBeforeAll() {
		System.out.println("Running once before all");
	}
	
	@AfterAll
	static void setupAfterAll() {
		System.out.println("all test was running");
	}
	*/
	
	@Test
	//@DisplayName("Equals and Not Equals")
	void testEqualAndNotEquals() {
		System.out.println("running test: testEqualAndNotEquals");
		
		assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
		assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");
	}
	
	@Test
	//@DisplayName("Null and Not Null")
	void testNullAndNotNull() {
		System.out.println("running test: testNullAndNotNull");
		
		String str1 = null;
		String str2 = "lele was here";
		
		assertNull(demoUtils.checkNull(str1), "Object should be null");
		assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
	}	
}
