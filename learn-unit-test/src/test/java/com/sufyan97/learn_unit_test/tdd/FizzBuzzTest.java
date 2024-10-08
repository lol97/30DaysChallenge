package com.sufyan97.learn_unit_test.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.sufyan97.learn_unit_test.junitdemo.ReplaceCamelCase;

@DisplayNameGeneration(ReplaceCamelCase.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

	//RULE
	/*
	 * if number divisible by 3, print Fizz
	 * if number divisible by 5, print Buzz
	 * if number divisible by 3 and 5, print FizzBuzz
	 * if number not divisible by 3 and 5, then print the number
	 */
	
	@Test
	@Order(1)
	void testForDivisibleByThree() {
		String expected = "Fizz";
		
		assertEquals(expected, FizzBuzz.compute(3), "should return Fizz");
	}
	
	@Test
	@Order(2)
	void testForDivisibleByFive() {
		String expected = "Buzz";
		
		assertEquals(expected, FizzBuzz.compute(5), "should return Buzz");
	}
	
	@Test
	@Order(3)
	void testForDivisibleByThreeAndFive() {
		String expected = "FizzBuzz";
		
		assertEquals(expected, FizzBuzz.compute(15), "should return FizzBuzz");
	}
	
	@Test
	@Order(4)
	void testForNotDivisibleByThreeOrFive() {
		String expected = "2";
		
		assertEquals(expected, FizzBuzz.compute(2), "should return 2");
	}
	
	@ParameterizedTest(name = "value={0}, expected={1}")
	@CsvFileSource(resources = "/small-test-data-fizzbuzz.csv")
	@Order(5)
	void testSmallDataFile(int value, String expected){
		assertEquals(expected, FizzBuzz.compute(value), "should return " + expected);
	}
	
	@ParameterizedTest(name = "value={0}, expected={1}")
	@CsvFileSource(resources = "/medium-test-data.csv")
	@Order(6)
	void testMediumDataFile(int value, String expected){
		assertEquals(expected, FizzBuzz.compute(value), "should return " + expected);
	}
	
	@ParameterizedTest(name = "value={0}, expected={1}")
	@CsvFileSource(resources = "/large-test-data.csv")
	@Order(7)
	void testLargeDataFile(int value, String expected){
		assertEquals(expected, FizzBuzz.compute(value), "should return " + expected);
	}

}
