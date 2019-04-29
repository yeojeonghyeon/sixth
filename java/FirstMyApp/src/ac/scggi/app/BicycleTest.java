package ac.scggi.app;

public class BicycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b1 = new Bicycle(10, 11, 12, "°©µ¹ÀÌ", "»ïÃµ¸®");
		Bicycle b2 = new Bicycle(20, 21, 22, "°©¼øÀÌ", "·º½ºÆ÷");
		
		b1.showInfo();
		b2.showInfo();
		
		b1.speedUp(1);
		b1.speedUp(1);
		
		b1.showInfo();
		
		b1.applyBrake(1);
		b1.applyBrake(1);
	}

}
