package ac.scggi.app.generic;
import ac.scggi.app.exception.BankAccount;
import ac.scggi.app.exception.AccountHolder;

public class Box {
	private Object element;
	public Box() {
	}
	public Box(Object element) {
		this.element = element;
	}
	void set(Object element) {
		this.element = element;
	}
	Object get() {
		return element;
	}
}
// E는 type parameter
class GBox<E>{
	// 인스턴스 변수
	private E element;
	public GBox() {
	}
	// 생성자 함수
	public GBox(E element) {
		this.element = element;
	}
	// 인스턴스 함수
	void set(E element) {
		this.element = element;
	}
	// 인스턴스 함수
	E get() {
		return element;
	}
}

class BoxTest{
	public static void main(String[] args) {
		Box box = new Box();
		box.set(new BankAccount(new AccountHolder("james", "crazydog"), 1000000));
		box.get();
		// Box 클래스의 get 함수의 return type이 Object이므로, Object type의 변수에 할당 가능
		Object obj = box.get();
		BankAccount ba = (BankAccount)box.get();
		ba.showInfo();
		// 컴파일 시 오류는 안나지만, 런타임에 오류가 발생
//		AccountHolder ah = (AccountHolder)box.get();
		// BankAccount는 type argument
		// gbox의 element로는 BankAccount의 subtype
		GBox<BankAccount> gbox = new GBox<>();
		gbox.set(new BankAccount(new AccountHolder("smith", "smartdog"), 2000000));
		BankAccount ba1 = gbox.get();
		ba1.showInfo();
	}
}
