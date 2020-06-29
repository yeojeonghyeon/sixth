package com.first.exception;

public class Client {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(new AccountHolder("hong","hongId"), 1000000000);
		try {
			ba.withdraw(500000000);
			ba.withdraw(500000000);
			ba.withdraw(500000000);
		}catch(BalanceNotEnoughException e) {
			e.printStackTrace();
			ba.showInfo();
		}
	}
}
