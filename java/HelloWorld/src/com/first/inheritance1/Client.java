package com.first.inheritance1;

public class Client {
	public static void main(String[] args) {
		// Car 클래스의 인스턴스 생성
		Car c = new Car();
		// Plane 클래스의 인스턴스 생성
		Plane p = new Plane();
		try {
			Client.foo(c);
			Client.foo(p);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Client.bar(c);
		Client.bar(p);
	}
	
	public static void foo(Vehicle v) throws Exception {
		v.startEngine();
		v.run(1);
	}
	public static void bar(Flyable f) {
		f.fly();
	}
}
