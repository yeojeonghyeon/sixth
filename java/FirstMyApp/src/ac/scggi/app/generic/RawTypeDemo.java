package ac.scggi.app.generic;

import java.util.ArrayList;
import java.util.List;

public class RawTypeDemo {
	public static void main(String[] args) {
		List rawList = new ArrayList();
		rawList.add("Hello Raw type");
		rawList.add(1);
		String str = (String)rawList.get(0);
		// down casting, Object -> Integer
		Integer n = (Integer)rawList.get(1);
		
		System.out.println(n.toString());
		
		System.out.println(str);
		
		List<String> geList = new ArrayList<String>();
		geList.add("Hello generic type");
		geList.add("1");
		String geStr = geList.get(0);
		
		System.out.println(geStr);
	}
}
