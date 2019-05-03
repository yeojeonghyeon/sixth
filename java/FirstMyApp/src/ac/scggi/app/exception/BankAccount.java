package ac.scggi.app.exception;

public class BankAccount {
	private AccountHolder owner;
	long balance;
	public BankAccount(AccountHolder owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public long withdraw(long amount) throws BalanceNotEnoughException {
		if (balance - amount >= 0) {
			throw new BalanceNotEnoughException("잔액이 부족합니다");
		}
		balance = balance - amount;
		return amount;
	}

	public void deposite(long amount) {
		balance = balance + amount;
	}
}

class AccountHolder {
	String ownerName;
	String ownerId;
	String accountNo;

	public AccountHolder(String ownerName, String ownerId) {
		this.ownerName = ownerName;
		this.ownerId = ownerId;
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
