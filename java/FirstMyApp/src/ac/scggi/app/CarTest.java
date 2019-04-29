package ac.scggi.app;

public class CarTest {
	public static void main(String[] args) {
		Car smCar = new Car("르노삼성", "white", 25000000, "gasolin", "auto", "에셈파이브");
		Car kCar = new Car("기아", "black", 30000000, "diesel", "manual", "케이파이브");
		
		smCar.showInfo();
		kCar.showInfo();
	}
}
