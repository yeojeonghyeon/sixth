package com.first.classmethod;

public class SuperType {
	public void foo() {
		System.out.println("SuperType's foo");
	}
	public static void zoo() {
		System.out.println("SuperType's static zoo");
	}
}

class SubType extends SuperType{
	@Override
	public void foo() {
		System.out.println("SubType's foo");		
	}
	public static void zoo() {
		System.out.println("SubType's static zoo");
	}	
}

class Client{
	public static void callFoo(SuperType su) {
		su.foo();
	}
	public static void callZoo(SuperType su) {
		su.zoo();
	}
	public static void main(String[] args) {
		SuperType sp = new SuperType();
		SubType sb = new SubType();
		
		callFoo(sp);
		callFoo(sb);
		callZoo(sp);
		callZoo(sb);
	}
}