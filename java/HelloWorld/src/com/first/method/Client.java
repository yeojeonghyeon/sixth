package com.first.method;

public class Client {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		Param p = new Param();
		
		App.callByValue(x, y);
		App.callByReference(p);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(p.x);
	}
}
