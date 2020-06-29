package com.scci.edu.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanAopByXml.xml");
		Student stu = (Student)context.getBean("student");
		stu.getAge();
		stu.getName();
		
		stu.setName("임걱정");
		
		stu.printThrowException();
	}
}
