package com.first.method;

public class App {
	// 클래스 함수
	static void callByValue(int x, int y) {
		x++; // x = x + 1;
		y++; // y = y + 1;
	}
	// 클래스 함수
	static void callByReference(Param p) {
		p.x = p.x + 1;
	}
}
