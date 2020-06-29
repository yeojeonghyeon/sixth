package com.first.inheritance2;

public class Elephant implements InterfaceWithDefaultMethod {
	@Override
	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("Elephant's foo invoked");
	}
//	@Override
//	public void bar() {
//		System.out.println("Elephant's bar invoked");
//	}
	public static void main(String[] args) {
		Elephant e = new Elephant();
		e.foo();
		e.bar();
		InterfaceWithDefaultMethod.zoo();
	}
}
