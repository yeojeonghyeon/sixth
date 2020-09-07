package com.edu.scci.sp.di;

public class PrinterClient {
	public static void main(String[] args) {
		HPrinter hp = new HPrinter();
		LPrinter lp = new LPrinter();
		MultiMachine mm = new MultiMachine(lp);
		mm.print("태풍 지나갔다.");
	}
}
