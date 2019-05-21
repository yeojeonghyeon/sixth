package ac.scggi.app.concurrency;

public class BankAccount {
	private AccountHolder owner;
	long balance;
	public BankAccount(AccountHolder owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public synchronized long withdraw(long amount) throws BalanceNotEnoughException, InterruptedException {
		if (balance - amount < 0) {
			wait(); // 지출을 하는 thread를 재운다.
			throw new BalanceNotEnoughException("잔액이 부족합니다");
		}
		balance = balance - amount;
		notify();
		return amount;
	}

	public synchronized void deposite(long amount) {
		balance = balance + amount;
		notify(); // 지출을 하는 녀석을 깨운다.
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
