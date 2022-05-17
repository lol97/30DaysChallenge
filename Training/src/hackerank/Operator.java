package hackerank;

public class Operator {
	/*
	 * Objective In this challenge, you will work with arithmetic operators. Check
	 * out the Tutorial tab for learning materials and an instructional video.
	 * 
	 * Task Given the meal price (base cost of a meal), tip percent (the percentage
	 * of the meal price being added as tip), and tax percent (the percentage of the
	 * meal price being added as tax) for a meal, find and print the meal's total
	 * cost. Round the result to the nearest integer.
	 */

	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		// Write your code here
		double tip = (tip_percent * meal_cost) / 100;
		double tax = (tax_percent * meal_cost) / 100;
		double res = meal_cost + tip + tax;
		System.out.println(Math.round(res));

	}
}
