package com.first.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowDemo {
	public static void main(String[] args) {
		throwMethod();
	}
	
	public static void throwMethod() throws FileNotFoundException {
		File f = new File("c:/file.txt");
		char[] buf = new char[4096];
		int nRead = 0;
		try {
			FileReader fr = new FileReader(f);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
