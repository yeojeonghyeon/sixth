package com.scci.edu.annotation;
class NesoyObject{
	@TestAnno(value = "I'm Annotation") // 새로운 value를 넣을 수 있습니다.
	public void annotationTest(){
		System.out.println("Hello! Nesoy");
	}

	@TestAnno(value = "I'm Annotation2") // 새로운 value를 넣을 수 있습니다.
	public void annotationTest2(){
		System.out.println("Hello! Nesoy2");
	}
}