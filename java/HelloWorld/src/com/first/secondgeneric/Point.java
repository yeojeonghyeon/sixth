package com.first.secondgeneric;

import java.util.ArrayList;
import java.util.List;

public class Point {
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point's toString "+ x + " " + y;
	}
}

class ThreeDimensionPoint extends Point{
	int z;
	ThreeDimensionPoint(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "ThreeDimensionPoint's toString "+ x + " " + y + " " + z;
	}	
}

class Client{
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(2,3));
		list.add(new ThreeDimensionPoint(1, 2, 3));
		list.add(new ThreeDimensionPoint(2, 3, 4));
		for(Point p : list) {
			System.out.println(p);
			if ( p instanceof ThreeDimensionPoint ) {
				ThreeDimensionPoint tp = (ThreeDimensionPoint)p;
			}
		}
	}
}