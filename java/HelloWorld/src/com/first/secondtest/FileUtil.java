package com.first.secondtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {
	public static void copyFile (String inputFileName, String destFileName) throws IOException {
		String filePath = new File(".").getCanonicalPath() + "/src/";
		InputStream inFile = null;
		OutputStream outFile = null;
			
		int txtData = 0;
		inFile = new FileInputStream(filePath + inputFileName);
		outFile = new FileOutputStream(filePath + destFileName);
			
		while((txtData = inFile.read()) != -1) {
			outFile.write(txtData);
		}
		inFile.close();
		outFile.close();
	}
}

class Client{
	public static void main(String[]args) throws IOException {
		FileUtil.copyFile("file.txt", "dest.txt");
	}
}