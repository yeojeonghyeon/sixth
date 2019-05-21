package ac.scggi.app.concurrency;

public class CosumerTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(new AccountHolder("",""), 100);
		Thread t1 = new Thread(new ComsumerThread(ba));
		Thread t2 = new Thread(new ProducerThread(ba));
		
		t1.start();
		t2.start();
	}
}
