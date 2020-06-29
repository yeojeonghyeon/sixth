package com.first.generic;

import com.first.inheritance.Child;
import com.first.inheritance.Parent;

public class BoxGeneric<T> {
	T item;
	public BoxGeneric(T item) {
		this.item = item;
	}
	void setItem(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
}

class ClientForGenericBox{
	public static void main(String[] args) {
		BoxGeneric<Parent> box = new BoxGeneric<>(new Parent());
		box.getItem().setName("ȫ�浿");
		BoxGeneric<Parent> p;
		BoxGeneric<Child> c;
		p = c;
	}
}
