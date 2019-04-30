package ac.scggi.app.inheritance3;

import java.util.List;

public class ItClass {
	public List<Member> list;
	public ItClass(List<Member> list) {
		this.list = list;
	}
	public void showInfo() {
		for(Member p : list) {
			p.showInfo();
		}
	}
}
