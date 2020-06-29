package com.first.inheritance;

public class MultifuncPrinter implements Printable, Transitable {
	@Override
	public void send(Object contents) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("send");
	}

	@Override
	public void print(Object contents) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(contents);
	}
}
