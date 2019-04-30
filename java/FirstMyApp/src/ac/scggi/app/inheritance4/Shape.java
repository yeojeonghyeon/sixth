package ac.scggi.app.inheritance4;

import java.util.ArrayList;

public class Shape implements Drawable {
	ArrayList<Point> points;
	public Shape(ArrayList<Point> points) {
		this.points = points;
	}
	@Override
	public boolean draw(Point p) {
		System.out.println("x "+p.x);
		System.out.println("y "+p.y);
		System.out.println("z "+p.z);
		return true;
	}
	
	public void drawAll() {
		for(Point p : points) {
			draw(p);
		}
	}
}
