package ac.scggi.app.inheritance4;

import java.util.ArrayList;

public class Rectangle extends Shape {
	public Rectangle(ArrayList<Point> points) {
		super(points);
	}
	@Override
	public void drawAll() {
		System.out.println("Rectangle's drawAll.");
		super.drawAll();
	}
}
