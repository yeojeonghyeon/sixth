package ac.scggi.app.generic.practice1;

import java.util.List;

public class Warrior extends Person {
	public Warrior(List<Item> inventory) {
		super(inventory);
	}
	@Override
	void showInfo() {
		System.out.println("Warrior");
	}
}
