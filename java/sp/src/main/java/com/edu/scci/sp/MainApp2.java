package com.edu.scci.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.scci.sp.di.MultiMachine;

public class MainApp2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		MultiMachine mm = (MultiMachine)context.getBean("multiMachine");
		mm.print("content");
		mm.print2("content");
	}
}
