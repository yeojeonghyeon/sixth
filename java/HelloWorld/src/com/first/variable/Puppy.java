package com.first.variable;

public class Puppy {
	private String speciesOfDog;
	private String color;
	private int size;
	private int[] eachWeight;
	public Puppy(String speciesOfDog, String color, int size, int[] weightList) {
		this.speciesOfDog = speciesOfDog;
		this.color = color;
		this.size = size;
		eachWeight = weightList;
	}
	public void showInfo() {
		System.out.println("Puppy's species = > " + speciesOfDog);
		System.out.println("Puppy's color => " + color);
		System.out.println("Puppy's size =>" + size);
		int nThYear = 1; 
		for(int weight : eachWeight) {
			System.out.println("Puppy's" + nThYear +" weight => " + weight);
		}
	}
}
