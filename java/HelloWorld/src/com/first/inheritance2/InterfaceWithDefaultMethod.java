package com.first.inheritance2;

public interface InterfaceWithDefaultMethod {
	public abstract void foo();
	public default void bar() {
		System.out.println("default bar invoked");
	}
	public static void zoo() {
		System.out.println("static zoo invoked");
	}
}
