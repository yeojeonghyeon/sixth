package ac.scggi.app.exception;

public class ExceptionDemo {
	public static void methodA() {
		try {
			methodB();
		}catch(Exception e) {
			// to do something
			System.out.println("catch in methodA");
		}
	}
	public static void methodB() {
		methodC();
	}
	public static void methodC() {
		int i=0;
		float r = i/0;
		System.out.println("after exception occured");
	}
	
	public static void main(String[] args) {
		methodA();
		System.out.println("main 정상 종료");
	}
}
