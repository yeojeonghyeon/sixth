package com.scggi.servlet.temp;

public class Student {
	private String name;
	private String gender;
	private String hobby;
	public Student(String name, String gender, String hobby) {
		this.name = name;
		this.gender = gender;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getHobby() {
		return hobby;
	}
}
