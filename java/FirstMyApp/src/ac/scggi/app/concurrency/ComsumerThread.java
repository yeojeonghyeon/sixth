package ac.scggi.app.concurrency;

public class ComsumerThread implements Runnable {
	private BankAccount account;
	public ComsumerThread(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		while(true) {
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			if ( account.balance > 0 ) {
				try {
					System.out.println(account.withdraw(1));
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
}

class ProducerThread implements Runnable {
	private BankAccount account;
	public ProducerThread(BankAccount account) {
		this.account = account;
	}
	@Override
	public void run() {
		while(true) {
			if ( account.balance <= 0 ) {
				account.deposite(1);
			}
		}
	}
}
