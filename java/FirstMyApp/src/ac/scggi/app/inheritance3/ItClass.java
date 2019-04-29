package ac.scggi.app.inheritance3;

import java.util.ArrayList;

public class ItClass {
	public ArrayList<Member> list;
	public ItClass(ArrayList<Member> list) {
		this.list = list;
	}
	public void showInfo() {
		for(Member p : list) {
			p.showInfo();
		}
	}
}
