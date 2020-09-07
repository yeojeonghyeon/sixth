package com.edu.scci.sp.di;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MultiMachine {
	@Autowired
	@Qualifier("hPrinter")
	private Printable printer;

	@Resource(name="lPrinter")
	private Printable printer2;
//	private Transferable fax;
//	private Scannable scanner;
//	@Autowired
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
//	@Autowired
	public MultiMachine(Printable printer) {
		this.printer = printer;
	}
	public void print(String contents) {
		printer.print(contents);
	}
	public void print2(String contents) {
		printer2.print(contents);
	}	
}
