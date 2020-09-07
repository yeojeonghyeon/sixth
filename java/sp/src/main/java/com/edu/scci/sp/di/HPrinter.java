package com.edu.scci.sp.di;

public class HPrinter implements Printable {
	@Override
	public void print(String contents) {
		System.out.println("HPrinter's print called.");
	}
}
