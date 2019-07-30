package com.scci.edu.annotation;
public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		MyContextContainer demo = new MyContextContainer(); // Annotation을 호출할 Container를 선언합니다.
		NesoyObject object = demo.get(NesoyObject.class); // Container에서 클래스를 가져오면서 Annotation을 invoke합니다.
//		object.annotationTest(); // Method를 호출합니다.
	}
}