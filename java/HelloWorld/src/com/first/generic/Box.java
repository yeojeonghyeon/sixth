package com.first.generic;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	T t;
	Box(T t){
		this.t = t;
	}
	T getT() {
		return t;
	}
}

class BoxClient{
	public static void main(String[] args) {
		Box<String>[] b = new Box[2];
		b[0] = new Box<String>("a");
		b[1] = new Box<String>("b");
		for(Box<String> ele : b) {
			System.out.println(ele.getT());
		}
		List<Object>[] stringLists = new List[2];  // compiler error, but pretend it's allowed
		stringLists[0] = new ArrayList<Object>();   // OK
		stringLists[1] = new ArrayList<Object>();
	}
}
