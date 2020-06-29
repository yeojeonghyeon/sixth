package com.scci.edu.bean.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		Person p = (Person)context.getBean("person");
		
		Student s = (Student)context.getBean("student");
		
		System.out.println(s.getName()+" "+s.getNationality());
	}
}
