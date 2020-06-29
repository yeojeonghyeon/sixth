package com.first.inheritance;

public class Child extends Parent{
	public Child(String name, String bornYear) {
		// name의 접근지정자는 private이므로, name이 선언된 클래스 내에서만 접근 가능
//		this.name = name;
		setName(name);
		this.bornYear = bornYear;
	}
}