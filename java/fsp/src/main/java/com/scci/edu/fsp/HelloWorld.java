package com.scci.edu.fsp;

public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void showMesssage() {
		System.out.println(message);
	}
	public void init() {
		System.out.println("init");
	}
	public void destroy() {
		System.out.println("destroy");		
	}
}
