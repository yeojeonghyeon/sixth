package ac.scggi.app.inheritance4;

import java.util.ArrayList;

public class Triangle extends Shape {
	public Triangle(ArrayList<Point> points) {
		super(points);
	}
	@Override
	public void drawAll() {
		System.out.println("Triangle's drawAll.");
		super.drawAll();
	}
}
