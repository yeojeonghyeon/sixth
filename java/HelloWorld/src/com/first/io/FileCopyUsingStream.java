package com.first.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyUsingStream {
	public static void copyFile(String srcFileName, String destFileName) throws IOException {
		String path = new File(".").getCanonicalPath()+"/src/";
		InputStream in = null;
		OutputStream out = null;
		try {
			int data = 0;
			in = new BufferedInputStream(new FileInputStream(path+srcFileName));
			out = new BufferedOutputStream(new FileOutputStream(path+destFileName));
			while( (data = in.read()) != -1 ) {
				out.write(data);
			}
		}catch(IOException e) {
			throw e;
		}finally {
			in.close();
			out.close();
		}
	}
}

class Client{
	public static void main(String[] args) {
		try {
			FileCopyUsingStream.copyFile("file.txt", "dest.txt");
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
}
