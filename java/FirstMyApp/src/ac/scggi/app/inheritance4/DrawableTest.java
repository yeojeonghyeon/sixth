package ac.scggi.app.inheritance4;

import java.util.ArrayList;

public class DrawableTest {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		ArrayList<Point> rtPoints = new ArrayList<Point>();
		rtPoints.add(new Point(1f, 1f, 1f));
		rtPoints.add(new Point(2f, 2f, 2f));
		rtPoints.add(new Point(3f, 3f, 3f));
		rtPoints.add(new Point(4f, 4f, 4f));
		Rectangle rt = new Rectangle(rtPoints);
		ArrayList<Point> trPoints = new ArrayList<Point>();
		trPoints.add(new Point(1f, 1f, 1f));
		trPoints.add(new Point(2f, 2f, 1f));
		trPoints.add(new Point(3f, 3f, 1f));
		Triangle tr = new Triangle(trPoints);
		shapes.add(rt);
		shapes.add(tr);
		
		for(Shape element : shapes) {
			element.drawAll();
		}
		// java8 stream
		shapes
			.stream()
			.forEach(v->v.drawAll());
	}
}
