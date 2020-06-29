package com.first.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try{
            // ./는 현재경로를 의미합니다.
        	String dir = new File(".").getCanonicalPath() + "/src";
        	String path = new File(".").getCanonicalPath() + "/src/file.txt";
        	System.out.println(new File(".").getCanonicalPath());
            is = new FileInputStream(path);
            os = new FileOutputStream(dir+"/dest.file");

            int data = -1;
            while( (data = is.read()) != -1 ){
                os.write(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("파일 없음");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("I/O 에러");
            e.printStackTrace();
        }
        finally {
            // 예외가 발생했을 때도 스트림을 닫아야 하므로 finally에서 스트림을 닫아줍니다.
            try {
                if( is != null ){
                  is.close();  
                }
                if( os != null ){
                    os.close();
                }
            }
            catch ( IOException e){
                e.printStackTrace();
            }
        }
    }
}