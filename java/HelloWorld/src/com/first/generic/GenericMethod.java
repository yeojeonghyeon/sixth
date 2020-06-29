package com.first.generic;

import java.util.Arrays;
import java.util.stream.Stream;

public class GenericMethod {
	public static <T extends Comparable<T>> int countGreatherThan(T[] arr, T ele) {
		int count = 0;
		for(T item : arr) {
			if ( item.compareTo(ele) > 0 ) count++;
		}
		return count;
	}
}

class Point implements Comparable<Point>{
	int x, y;
	@Override
	public int compareTo(Point o) {
		return this.x - o.x;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return this.x + ", " + this.y;
	}
}

class ClientForPoint{
	public static void main(String[] args) {
		Point[] points = new Point[2];
		points[0] = new Point(4, 1);
		points[1] = new Point(2, 3);
		Point point = new Point(0, 0);
		System.out.println(GenericMethod.countGreatherThan(points, point));
		Arrays.sort(points);
		for(Point p : points) {
			System.out.println(p.x+" "+p.y);
		}

		Stream<Point> stream = Arrays.stream(points);
		stream.sorted().forEach(System.out::println);
//		stream.sorted().forEach(ele->{
//			System.out.println(ele.x + " " + ele.y);
//		});
	}
}