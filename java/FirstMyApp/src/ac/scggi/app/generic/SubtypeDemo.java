package ac.scggi.app.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubtypeDemo {
	public static void main(String[] args) {
		ArrayList<Number> al = new ArrayList<Number>();
		Collection<Number> c = al;
		List<Number> l = al;
	}
}
