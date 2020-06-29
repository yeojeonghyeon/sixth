package com.first.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {
   public static void main(String args[]) {
      File file = new File("E://file.txt");
      try {
    	  FileReader fr = new FileReader(file);
      }catch(FileNotFoundException | IndexOutOfBoundsException e) {
    	  e.printStackTrace();
      }
   }
   
   public static void propagateException() throws FileNotFoundException{
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);
   }
}
