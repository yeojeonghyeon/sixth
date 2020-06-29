package com.first.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GroupExceptionDemo {
	public static void main(String[] args) {
		readFile();
	}

	public static void readFile() {
		try {
			String path = new File(".").getCanonicalPath() + "/src/file.txt";
			Path file = Paths.get(path);
			Charset charset = Charset.forName("US-ASCII");
			BufferedReader reader = Files.newBufferedReader(file, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} catch (Exception e) {
			System.err.format("Exception: %s%n", e);
		}
	}
}
