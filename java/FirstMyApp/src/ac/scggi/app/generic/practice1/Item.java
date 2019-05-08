package ac.scggi.app.generic.practice1;

public class Item {
	public String name;
	public long id;
	public boolean isEatable;
	public Item(String name, long id, boolean isEatable) {
		this.name = name;
		this.id = id;
		this.isEatable = isEatable;
	}
	public void use() {
		System.out.println(name+"를 사용합니다.");
	}
	public void showItemInfo() {
		System.out.println("================================");
		System.out.println("아이템명은 "+name);
		System.out.println("id "+id);
		System.out.println("먹을 수 있는 아이템 "+isEatable);
		System.out.println("================================");		
	}
}
