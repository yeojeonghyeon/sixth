package com.edu.scci.sp.di;

public class MultiMachine {
	private Printable printer;
//	private Transferable fax;
//	private Scannable scanner;
	
	public void setPrinter(Printable printer) {
		this.printer = printer;
	}

	public MultiMachine() {
		
	}
	
	private MultiMachine(Printable printer, Transferable fax, Scannable scanner) {
		this.printer = printer;
//		this.fax = fax;
//		this.scanner = scanner;
	}
	
	public MultiMachine(Printable printer) {
		this.printer = printer;
	}
	public void print(String contents) {
		printer.print(contents);
	}
}
