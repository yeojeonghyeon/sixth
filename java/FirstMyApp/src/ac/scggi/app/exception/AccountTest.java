package ac.scggi.app.exception;

public class AccountTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(new AccountHolder("nm", "id"), 1000000);
		ba.deposite(500000);
		try {
			ba.withdraw(1000000);
			ba.withdraw(1000000);
		} catch (ArithmeticException | BalanceNotEnoughException ae) {
			// TODO Auto-generated catch block
			System.out.println(ae.getMessage());
		}
	}
}
