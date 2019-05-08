package ac.scggi.app.generic.practice1;

import java.util.ArrayList;
import java.util.List;

public class CharacterFactory {
	public Person createCharacter(String tp, int connectTp) {
		List<Item> defaultInventory = null;
		Person p = null;
		switch(tp) {
		case "Elf":
			defaultInventory = createInventory(connectTp);
			p = new Elf(defaultInventory);
			break;
		case "Mage":
			defaultInventory = createInventory(connectTp);
			p = new Mage(defaultInventory);
			break;
		case "Warrior":
			defaultInventory = createInventory(connectTp);
			p = new Warrior(defaultInventory);
			break;
		}
		return p;
	}
	public List<Item> createInventory(int connectTp){
		List<Item> inventory = new ArrayList<Item>();
		switch(connectTp) {
		case 1:
			inventory.add(new Item("엑스칼리버", 101010114, false));
		case 0:
			inventory.add(new Item("짝대기", 101010111, false));
			inventory.add(new Item("천옷", 101010112, false));
			inventory.add(new Item("빨간약", 101010113, true));			
		}
		return inventory;
	}
}
