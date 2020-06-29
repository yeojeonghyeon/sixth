package com.first.app;

public class Car {
	// 멤버 변수, member variable, 인스턴스 변수(instance variable)
	int color;
	int speed;
	int mileage;
	
	// 생성자(constructor) 함수
	public Car(int s) {
		speed = s;
	}
	
	// 멤버 함수, member method, 인스턴스 함수(instance method)
	void speedUp(int s) {
		this.speed = speed + s;
	}
	
	void speedDown(int s) {
		speed = speed - s;
	}
}
