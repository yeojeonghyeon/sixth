package com.scci.edu.annotation;

import org.springframework.stereotype.Component;

public class TestBean {
	public void doSomething1(String someValue, @Data String someData, String otherValue) {
	    // Apsect will log value of someData param
	}
	
	public void doSomething2(String someValue, @Data(methodName = "id") SomeObject someData, String otherValue) {
	    // Apsect will log returned value of someData.id() method
	}
}

@Component
class SomeObject{
	public String id() {
		return "1234";
	}
}