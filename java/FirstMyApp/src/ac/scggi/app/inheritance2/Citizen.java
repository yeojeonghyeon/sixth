package ac.scggi.app.inheritance2;

public class Citizen extends Person {
	@Override
	public int makeMoney(int spendingTime) {
		int amount = super.makeMoney(spendingTime);
		return amount + (int)(amount*0.3);
	}
}
