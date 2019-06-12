package com.scggi.servlet.temp;

public class Animal {
	private String name;
	private String whereLives;
	private int lv;
	public Animal(String name, String whereLives, int lv) {
		super();
		this.name = name;
		this.whereLives = whereLives;
		this.lv = lv;
	}
	public String getName() {
		return name;
	}
	public String getWhereLives() {
		return whereLives;
	}
	public int getLv() {
		return lv;
	}
}
