package com.first.inheritance;

public class Client {
	public static void main(String[] args) {
		MultifuncPrinter mp = new MultifuncPrinter();
		Printer p = new Printer(mp);
		
		try {
			p.print("contents");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
