package ac.scggi.app;

public class ArithmeticTest {
	public static void main(String[] args) {
		ArithmeticOperator a1 = new ArithmeticOperator(10, 20);
		System.out.println(a1.add());
		System.out.println(a1.subtract());
		System.out.println(a1.multiply());
		System.out.println(a1.divide());
		a1.x = 100;
		
		System.out.println(a1.add());

		ArithmeticOperator a2 = new ArithmeticOperator(20, 30);
		System.out.println(a2.add());
	}
}
