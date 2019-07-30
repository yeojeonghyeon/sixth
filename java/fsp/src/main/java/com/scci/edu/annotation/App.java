package com.scci.edu.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanAopByXml.xml");
		TestBean tb = (TestBean)context.getBean("testBean");
		
		System.out.println(tb);
		
		tb.doSomething2("1234", new SomeObject(), "5678");
	}
}
