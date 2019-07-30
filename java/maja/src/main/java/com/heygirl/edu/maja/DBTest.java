package com.heygirl.edu.maja;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		ConnectDB con = (ConnectDB)context.getBean("connectDB");
		List<Map> lst = con.retrieve();
		lst.stream().filter((row)->{
			return row.get("BOOK_NM").equals("축구의 역사");
		}).forEach(System.out::println);
	}
}

