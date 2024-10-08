package com.sufyan97.learn_unit_test.junitdemo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayNameGeneration(ReplaceCamelCase.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DemoUtilsTest {
	DemoUtils demoUtils;
	
	@BeforeEach
	void setupBeforeEach() {
		demoUtils = new DemoUtils();
		//System.out.println("@BeforeEach execute for each test");
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
	
	@Test
	void testSameAndNotSame() {
		String str = "Nebulae2 Academy";
		
		assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to same object");
		assertNotSame(str, demoUtils.getAcademy(), "Object should not refer to same object");
	}
	
	@Test
	void testTrueFalse() {
		int gradeOne = 10;
		int gradeTwo = 5;
		
		assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "this should return true");
		assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "this should return true");
	}
	
	@Test
	void testArrayEquals() {
		String[] strArray = {"A", "B", "C"};
		
		assertArrayEquals(demoUtils.getFirstThreeLetterAlphabet(), strArray, "should be equals");
	}
	
	@Test
	void testIterableEquals() {
		List<String> nameStreet = List.of("WAHIDIN", "WAHID", "JAKARTA");
		
		assertIterableEquals(demoUtils.getListNamaJalan(), nameStreet, "should be equals");
	}
	
	@Test
	@Order(2)
	void testLinesMatch() {
		List<String> nameStreet = List.of("WAHIDIN", "WAHID", "JAKARTA"); 
		
		assertLinesMatch(nameStreet, demoUtils.getListNamaJalan(), "should be match");
	}
	
	@Test
	@Order(-10)
	void testThrowsAndDoesNotThrow() {
		assertThrows(Exception.class, () -> {demoUtils.throwEx(-1); }, "should throw exception");
		
		assertDoesNotThrow(() -> {demoUtils.throwEx(20); }, "should not throw");
	}
	
	@Test
	@Order(1)
	void testTimeout() {
		assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout(); }, "method should execute in 3 second" );
	}	
	
	@Test
	void testMultiply() {
		assertEquals(12, demoUtils.multiply(3, 4), "should return 12");
	}
}
