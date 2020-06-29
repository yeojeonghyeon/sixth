package com.first.variable;

import java.util.Arrays;
import java.util.List;


public class Client {
	public static void main(String[] args) {
		Puppy[] puppies = new Puppy[3];
		puppies[0] = new Puppy("poodle", "white", 1, new int[] {1, 2, 3});
		puppies[1] = new Puppy("bulldog", "black", 1, new int[] {4, 5, 3});
		puppies[2] = new Puppy("whiteTerrier", "white", 1, new int[] {2, 3, 2});
		
		for(Puppy p : puppies) {
			p.showInfo();
		}
		
		String[] arr = {"a", "b"};
		Object[] list = new Object[] {1, 2, 3, 4};
		List<Object> lists = Arrays.asList(list);
	}
}
