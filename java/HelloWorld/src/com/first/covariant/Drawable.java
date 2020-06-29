package com.first.covariant;

public interface Drawable<T> {
	public T getShape();
}

class Shape implements Drawable<Shape>{
	Shape sp;
	@Override
	public Shape getShape() {
		return sp;
	}
}

class Rectangle extends Shape{
	Rectangle sp;
	@Override
	public Shape getShape() {
		return sp;
	}	
}

class Client{
	public static void main(String[] args) {
		Shape sp = new Shape();
		Rectangle rect = new Rectangle();
		Shape temp = callShape(sp);
		temp = callShape(rect);
	}
	public static Shape callShape(Drawable<Shape> drawable) {
		return drawable.getShape();
	}
}
