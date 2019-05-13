package ac.scggi.app.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
	public static void process(List<? extends Foo> list) {
		for(Foo e : list) {
			e.showInfo();
		}
	}
	public static void main(String[] args) {
		ArrayList<Foo> fooList = new ArrayList<>();
		fooList.add(new Foo("a"));
		fooList.add(new Foo("b"));
		fooList.add(new Zoo("zoo"));
		ArrayList<Zoo> zooList = new ArrayList<>();
		zooList.add(new Zoo("c"));
		zooList.add(new Zoo("d"));
		
		ArrayList<?> wc = fooList;
		wc = zooList;
		
		ArrayList<? extends Foo> uwc = fooList;
		uwc = zooList;
		
		WildCardDemo.process(fooList);
		WildCardDemo.process(zooList);

	}
}

class Foo{
	String name;
	public Foo(String name) {
		this.name = name;
	}
	void showInfo() {
		System.out.println(name);
	}
}
class Zoo extends Foo{
	public Zoo(String name) {
		super(name);
	}
}