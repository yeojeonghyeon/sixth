package com.scci.edu.di.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanAutowired.xml");
		Television tv = (Television)context.getBean("television");
		
		tv.turnOn();
		
		TextEditor tx = (TextEditor)context.getBean("textEditor");
		tx.spellCheck();
	}

}
