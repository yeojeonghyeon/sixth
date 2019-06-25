package com.heygirl.edu.maja;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		HelloWorld hw = (HelloWorld)context.getBean("hello");
		hw.sayHelloWorld();
	}
}
