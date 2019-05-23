package ac.scggi.app.concurrency;

public class WaitTest {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread t1 = new Thread(new Consumer(acc));
		Thread t2 = new Thread(new Producer(acc));
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}

class Consumer implements Runnable{
	private Account account;
	public Consumer(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		try {
			System.out.println("run => "+account.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Producer implements Runnable{
	private Account account;
	public Producer(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.set(Long.toString(System.currentTimeMillis()));
	}
}
class Account{
	String t;
	public synchronized String get() throws InterruptedException {
		System.out.println("get begin");
		this.wait();
		System.out.println("after wait");			
		return t;
	}
	public synchronized void set(String t) {
		this.t = t;
		notify();
	}
}

