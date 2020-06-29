package com.first.inheritance;

public class Printer {
	private Printable p;
	public void print(Object contents) throws Exception {
		p.print(contents);
	}
	public Printer(Printable p) {
		this.p = p;
	}
}
