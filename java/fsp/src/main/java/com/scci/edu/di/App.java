package com.scci.edu.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansDi.xml");
		TextEditor tx = (TextEditor)context.getBean("textEditor");
		tx.spellCheck();
		
		TextEditor tx2 = (TextEditor)context.getBean("textEditorSetter");
		tx2.spellCheck();
		
		TextEditor tx3 = (TextEditor)context.getBean("textEditorInner");
		tx3.spellCheck();
		
		JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		
		System.out.println(jc.getAddressList().getClass().getName());
		jc.getAddressSet();
		System.out.println(jc.getAddressSet().getClass().getName());		
		jc.getAddressMap();
		System.out.println(jc.getAddressMap().getClass().getName());
		jc.getAddressProp();
	}
}
