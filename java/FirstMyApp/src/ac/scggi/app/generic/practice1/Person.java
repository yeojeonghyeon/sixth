package ac.scggi.app.generic.practice1;

import java.util.List;

public abstract class Person {
	protected final static int INVENTORY_MAX_SIZE = 100;
	protected List<Item> inventory;
	public Person(List<Item> inventory) {
		this.inventory = inventory;
	}
	public boolean pickItem(Item item) {
		if ( inventory.size() >= INVENTORY_MAX_SIZE ) return false;
		return inventory.add(item);
	}
	public void showAllItems() {
		for(Item item : inventory) {
			item.showItemInfo();
		}
//		inventory
//			.stream()
//			.forEach(v->{v.showItemInfo();});
	}
	abstract void showInfo();
}
