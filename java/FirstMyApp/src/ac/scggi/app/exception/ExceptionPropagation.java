package ac.scggi.app.exception;

import java.io.IOException;

public class ExceptionPropagation {
	int kor;
	int eng;
	// 생성자를 만들었기 때문에, 기본 생성자 사라짐
	public ExceptionPropagation(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	public int getAverage() throws IOException {
		if ( kor==0 && eng==0 ) throw new IOException();
		return (kor+eng)/2;
	}
	
	public int getTotal() throws ArithmeticException {
		if ( kor==0 && eng==0 ) throw new ArithmeticException();
		return (kor+eng);
	}
	
	public void showScore() throws IOException{
		System.out.println(getAverage());
		System.out.println(getTotal());
		System.out.println("after getTotal in showScore");
	}
	
	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation(10, 10);
		try {
			ep.showScore();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
		}
	}
}
