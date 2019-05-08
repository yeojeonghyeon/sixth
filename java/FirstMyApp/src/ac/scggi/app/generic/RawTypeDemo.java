package ac.scggi.app.generic;

import java.util.ArrayList;
import java.util.List;

public class RawTypeDemo {
	public static void main(String[] args) {
		List rawList = new ArrayList();
		rawList.add("Hello Raw type");
		String str = (String)rawList.get(0);
		
		System.out.println(str);
		
		List<String> geList = new ArrayList<String>();
		geList.add("Hello generic type");
		String geStr = geList.get(0);
		
		System.out.println(geStr);
	}
}
