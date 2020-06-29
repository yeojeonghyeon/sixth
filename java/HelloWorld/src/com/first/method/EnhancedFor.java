package com.first.method;

public class EnhancedFor {
	public static int sumListEnhanced(int[] list) {
		int total = 0;
		for(int val : list) {
			total += val;
		}
		return total;
	}
	public static int sumListOld(int[] list) {
		int total = 0;
		for(int i=0; i<list.length; i++) {
			total += list[i];
		}
		return total;
	}
	public static void addOne(int[] list) {
		for(int i=0; i<list.length; i++) {
			list[i]++;
		}
	}
	public static void printList(int[] list) {
		for(int val : list) {
			System.out.println(val);
		}
	}
}
