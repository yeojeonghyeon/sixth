package com.first.array;

public class ArrayDemo {
	public static void main(String[] args) {
		for(String argument : args) {
			System.out.println(argument);
		}
		
		int[] firstArr = new int[10];
		int[] secondArr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] thirdArr = {1,2,3,4,5};
		
		int result = sum(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println(result);
	}
	
	public static int sum(int[] params) {
		int result = 0;
		for(int element : params) {
			System.out.println(element);
			result += element;
		}
		return result;
	}
}
