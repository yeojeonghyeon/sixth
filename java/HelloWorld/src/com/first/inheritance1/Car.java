package com.first.inheritance1;

public class Car implements Drivable {

	@Override
	public void startEngine() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("자동차 엔진에 불을 붙입니다.");
	}

	@Override
	public void run(int speed) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(speed + " 만큼 엔진을 가속합니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 주행 중입니다.");
	}

}
