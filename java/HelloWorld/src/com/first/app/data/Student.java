package com.first.app.data;

public class Student {
	int height;
	int age;
	String id;
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public void doAction(int action) {
		if ( action == 1 ) {
			score = score + 10;
		}else if ( action == 2 ) {
			score = score - 10;
		}else if ( action == 3 ) {
			score = score - 5;
		}
	}
	
	public void showInfo() {
		System.out.println("¿Ã∏ß : " + name + " score : " + score);
	}
}
