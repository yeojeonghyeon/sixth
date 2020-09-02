package com.edu.scci.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

//		HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
//		
//		System.out.println(hw.getMessage());
//		
//		hw.setMessage("new Hello World!");
//		HelloWorld hw2 = (HelloWorld)context.getBean("helloWorld");
//
//		System.out.println(hw.getMessage());		
//		System.out.println(hw2.getMessage());
		
//		ExampleBean exBean = (ExampleBean)context.getBean("exampleBean");
//		ExampleBean exBean1 = (ExampleBean)context.getBean("exampleBean1");
		
		Student student = (Student)context.getBean("student");
		System.out.println(student.getAddress());
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}


