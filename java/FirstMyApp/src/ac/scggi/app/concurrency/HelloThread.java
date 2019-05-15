package ac.scggi.app.concurrency;

public class HelloThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello from a thread");
	}
	
	public static void main(String[] args) {
		System.out.println("1");
		HelloThread t = new HelloThread();
		t.start(); // RUNNABLE
		System.out.println("2");
	}
}
