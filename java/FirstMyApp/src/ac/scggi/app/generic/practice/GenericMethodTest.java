package ac.scggi.app.generic.practice;

public class GenericMethodTest {
	public static void main(String[] args) {
		Pair<String, String> p1 = new Pair<>("james", "crazydog");
		Pair<String, String> p2 = new Pair<>("smith", "smartdog");
		boolean isEqual = Util.<String, String>compare(p1, p2);
		System.out.println(isEqual);
		System.out.println(Util.compare(p1, p2)); 
	}
}
