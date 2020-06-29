package com.first.nested;

public class Outer {
	private int scale;
	class Inner{
		int getScale() {
			return scale;
		}
	}
	public Outer(int scale) {
		this.scale = scale;
	}
	static class StaticInner{
	}
}

class Client{
	public static void main(String[] args) {
		Outer outer = new Outer(10);
		Outer.Inner inner = outer.new Inner();
		Outer.StaticInner sInner = new Outer.StaticInner();
		foo(inner);
	}
	public static void foo(Outer.Inner inner) {
		System.out.println(inner.getScale());
	}
	public static void bar() {
		class MethodInner{
			MethodInner(int points) {
				this.points = points;
			}
			int points;
		}
		MethodInner inner = new MethodInner(5);
	}
}