package ac.scggi.app.concurrency;

public class ComsumerThread implements Runnable {
	private BankAccount account;
	public ComsumerThread(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		while(true) {
			try {
				account.withdraw(1);
			} catch (BalanceNotEnoughException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ProducerThread implements Runnable {
	private BankAccount account;
	public ProducerThread(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		while(true) {
			account.deposite(1);
		}
	}
}
