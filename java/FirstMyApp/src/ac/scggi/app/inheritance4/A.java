package ac.scggi.app.inheritance4;

public class A {
	public interface NestedIF{
		boolean isNegative(int n);
	}
}

class B implements A.NestedIF{
	public boolean isNegative(int n) {
		if ( n < 0 ) return true;
		return false;
	}
}

class C{
	public static void main(String[] args) {
		A.NestedIF nif = new B();
		System.out.println(nif.isNegative(10));
		System.out.println(nif.isNegative(-1));
	}
}