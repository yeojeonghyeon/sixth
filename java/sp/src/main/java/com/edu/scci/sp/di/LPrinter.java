package com.edu.scci.sp.di;

public class LPrinter implements Printable {
	@Override
	public void print(String contents) {
		System.out.println("LPrinter's print called.");
	}
}
