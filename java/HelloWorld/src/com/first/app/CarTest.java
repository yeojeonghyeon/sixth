package com.first.app;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(10);
		Car car2 = new Car(15);
		
		car1.speedUp(1);
		car1.speedUp(1);
		
		car2.speedUp(1);
		
		System.out.println(" car1's speed => " + car1.speed);
		System.out.println(" car2's speed => " + car2.speed);
	}
}
