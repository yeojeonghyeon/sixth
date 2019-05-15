package ac.scggi.app.concurrency;

public class HelloRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello world from a thread");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new HelloRunnable());
		t.start();
	}
}

