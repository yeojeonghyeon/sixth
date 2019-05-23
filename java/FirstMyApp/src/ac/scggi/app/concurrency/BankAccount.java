package ac.scggi.app.concurrency;

public class BankAccount {
	private AccountHolder owner;
	long balance;
	public BankAccount(AccountHolder owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public synchronized long withdraw(long amount) throws BalanceNotEnoughException, InterruptedException {
		while(balance - amount < 0) {
			wait();
		}
		balance = balance - amount;
		System.out.println(amount+" 지출 "+balance+" 현재");
		return amount;
	}

	public synchronized void deposite(long amount) {
		balance = balance + amount;
		notify();		
		System.out.println(amount+" 입금");
	}
	
	public void showInfo() {
		System.out.println(owner.ownerName);
		System.out.println(owner.ownerId);
		System.out.println(balance);
	}
}

class BalanceNotEnoughException extends Exception {
	public BalanceNotEnoughException() {
		super();
	}

	public BalanceNotEnoughException(String message) {
		super(message);
	}
}
