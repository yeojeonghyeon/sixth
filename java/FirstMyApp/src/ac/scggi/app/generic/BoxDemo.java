package ac.scggi.app.generic;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {

	public static <U> void addBox(U u, List<Box<U>> boxes) {
		Box<U> box = new Box<>();
		box.set(u);
		boxes.add(box);
	}

	public static <U> void outputBoxes(List<Box<U>> boxes) {
		int counter = 0;
		for (Box<U> box : boxes) {
			U boxContents = box.get();
			System.out.println("Box #" + counter + " contains [" + boxContents.toString() + "]");
			counter++;
		}
	}

	public static <K,V>void process(List<? extends Pair<K,V>> list) {
		for (Pair<K,V> l : list) {
			System.out.println(l.getKey());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
		BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		BoxDemo.outputBoxes(listOfIntegerBoxes);
		
		ArrayList<Pair<String,String>> al = new ArrayList<Pair<String,String>>();
		al.add(new OrderedPair<String, String>("key", "value"));
		BoxDemo.process(al);
	}
}
