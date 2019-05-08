package ac.scggi.app.generic;

import ac.scggi.app.exception.AccountHolder;
import ac.scggi.app.exception.BankAccount;

public class OrderedPairTest {
	public static void main(String[] args) {
		Pair<String, BankAccount> p = new OrderedPair<>("james", new BankAccount(new AccountHolder("james", "crazydog"), 1000000));
		OrderedPair<String, BankAccount> op = (OrderedPair<String, BankAccount>)p;
		
		Pair<Integer, GBox<String>> p1 = new OrderedPair<>(1, new GBox<String>());
	}
}
