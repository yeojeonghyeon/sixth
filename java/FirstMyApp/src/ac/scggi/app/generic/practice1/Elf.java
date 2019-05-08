package ac.scggi.app.generic.practice1;

import java.util.List;

public class Elf extends Person{
	public Elf(List<Item> inventory) {
		super(inventory);
	}
	@Override
	void showInfo() {
		System.out.println("Elf");
	}
}
