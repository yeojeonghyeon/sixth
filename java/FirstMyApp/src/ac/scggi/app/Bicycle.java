package ac.scggi.app;

public class Bicycle {
	public int cadence;
	public int gear;
	public int speed;
	// Ãß°¡
	public String ownerName;
	public String manufacturer;
	
	public Bicycle(int cadence, int gear, int speed, String ownerName, String manufacturer) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
		this.ownerName = ownerName;
		this.manufacturer = manufacturer;
	}
	// setter
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void applyBrake(int decrement) {
		speed = speed - decrement; // speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment; // speed += increment;
	}
	
	public void showInfo() {
		System.out.println(cadence);
		System.out.println(gear);
		System.out.println(speed);
		System.out.println(ownerName);
		System.out.println(manufacturer);
	}
}
