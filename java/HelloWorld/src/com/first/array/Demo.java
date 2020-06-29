package com.first.array;

public class Demo {
	int age;
	public Demo(int age) {
		this.age = age;
	}
}

class Client{
	public static void main(String[] args) {
		Demo d = new Demo(15) {
			public void show() {
				System.out.println(age);
			}
		};
	}
}
