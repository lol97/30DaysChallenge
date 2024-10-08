package com.sufyan97.learn_unit_test.tdd;

public class FizzBuzz {
	//RULE
	/*
	 * if number divisible by 3, print Fizz
	 * if number divisible by 5, print Buzz
	 * if number divisible by 3 and 5, print FizzBuzz
	 * if number not divisible by 3 and 5, then print the number
	 */
	
	public static String compute(int i) {
		StringBuilder result = new StringBuilder();
		if(i%3 == 0) {
			result.append("Fizz");
		}
		if(i%5 == 0) {
			result.append("Buzz");
		}
		if(result.isEmpty()) {
			result.append(i);
		}
		return result.toString();
	}
	
//	public static String compute(int i) {
//		if((i%3 == 0) && (i%5 == 0)) {
//			return "FizzBuzz";
//		}else if(i%3 == 0) {
//			return "Fizz";
//		}else if(i%5 == 0) {
//			return "Buzz";
//		}else {
//			return Integer.toString(i);
//		}
//	}

}
