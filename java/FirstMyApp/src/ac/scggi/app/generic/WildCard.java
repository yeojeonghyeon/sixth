package ac.scggi.app.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	public static void main(String[] args) {
		List<Child> childList = new ArrayList<Child>();
		childList.add(new Child());

		List<? extends Parent> parentList = childList;
		for(Parent p : parentList) {
			System.out.println(p.toString());
		}
		List<? super Child> lowerList = childList;

		parentList.set(0, new Parent());
		
		lowerList.set(0, new Child());

		Child child = childList.get(0);
	}
}

class Parent{
	
}

class Child extends Parent{
	
}