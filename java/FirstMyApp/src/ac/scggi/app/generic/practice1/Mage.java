package ac.scggi.app.generic.practice1;

import java.util.List;

public class Mage extends Person {
	public Mage(List<Item> inventory) {
		super(inventory);
	}
	@Override
	void showInfo() {
		System.out.println("Mage");
	}
}
