package ac.scggi.app.generic.practice1;

public class CharacterTest {
	public static void main(String[] args) {
		CharacterFactory factory = new CharacterFactory();
		Person warrior = factory.createCharacter("Warrior", 0);
		Person elf = factory.createCharacter("Elf", 1);
		
		warrior.showInfo();
		warrior.showAllItems();
		
		elf.showInfo();
		elf.showAllItems();
	}
}
