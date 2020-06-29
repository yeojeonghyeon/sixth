package com.first.method;
class Student {
	int rollNo;
	String name;
	static String college = "ITS";
	static void change() {
		Student.college = "BBDIT";
	}
	Student(int r, String n) {
		rollNo = r;
		name = n;
	}
	void display() {
		System.out.println(rollNo + " " + name + " " + Student.college);
	}
	public static void main(String[] args) {
		Student.change();

		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();
	}
}
