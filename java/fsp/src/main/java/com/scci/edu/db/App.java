package com.scci.edu.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		ConnectDB con = (ConnectDB)context.getBean("connectDB");
		List<Map<String, String>> result = con.selectBooks(new HashMap<String, String>());
		
		result.stream().forEach(System.out::println);

		result.stream().forEach(new Consumer<Map<String, String>>(){
			@Override
			public void accept(Map<String, String> t) {
				System.out.println(t);
			}
		});
		
		result.stream().forEach((t)->System.out.println(t));
	}
}
