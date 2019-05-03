package ac.scggi.app.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundDemo {
	public static void main(String[] args){
		File file = new File("c:/dev/temp/text.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			int word;
			while( (word=fr.read()) != -1 ) {
				System.out.print((char)word);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException");
		}catch(IOException ie) {
			ie.printStackTrace();
			System.out.println("IOException");
		}finally {
			// exception 발생 여부와 상관 없이 무조건 실행
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(NullPointerException ne) {
				ne.printStackTrace();
			}
			System.out.println("finally");
		}
	}
}
