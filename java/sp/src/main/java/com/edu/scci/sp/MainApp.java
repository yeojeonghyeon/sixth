package com.edu.scci.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.edu.scci.sp.di.Student;

import com.edu.scci.sp.di.MultiMachine;
import com.edu.scci.sp.di.TextEditor;

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
		
//		Student student = (Student)context.getBean("student");
//		System.out.println(student.getAddress());
		
		MultiMachine mm = (MultiMachine)context.getBean("multiMachine");
		mm.print("태풍이 지나갔다.");
		
		MultiMachine ms = (MultiMachine)context.getBean("multiMachineSetter");
		ms.print("태풍이 지나갔다.");
		
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
		// client 코드로 SpellChecker를 주입시킴
//		textEditor.setSpellChecker(new SpellChecker());
		textEditor.spellCheck();
		
		Student student = (Student)context.getBean("student");
		System.out.println(student.getName());
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}


