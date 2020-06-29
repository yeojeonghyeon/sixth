package com.first.app;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int result;
		float divideRes;
		
		result = ArithmeticCalculator.plus(1, 1);
		System.out.println("plus's result = > " + result);
		
		result = ArithmeticCalculator.subtract(1, 1);
		System.out.println("plus's subtract = > " + result);
		
		result = ArithmeticCalculator.multiply(1, 1);
		System.out.println("plus's multiply = > " + result);
		
		result = ArithmeticCalculator.divide(4, 2);
		System.out.println("plus's divide = > " + result);
	}
}
