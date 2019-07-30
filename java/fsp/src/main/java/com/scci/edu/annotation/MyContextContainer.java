package com.scci.edu.annotation;

import java.lang.reflect.Method;

class MyContextContainer {
	public MyContextContainer(){}
	/**
	 * 객체를 반환하기 전 어노테이션을 적용합니다.
	 * @param instance
	 * @param <T>
	 * @return
	 * @throws IllegalAccessException
	 */
	private <T> T invokeAnnonations(T instance) throws IllegalAccessException {
		Method[] methods = instance.getClass().getDeclaredMethods(); // Reflect으로 해당 클래스의 Method를 전부 조회합니다.

		for(Method method : methods){
			TestAnno annotation = method.getAnnotation(TestAnno.class); // Method들 중에 TestAnno을 찾습니다.
			if(annotation != null) { // NesoyAnnotation이 존재한다면
				System.out.println(annotation.value()); // annotation의 value를 출력합니다.
			}
		}

		return instance;
	}

	/**
	 * 매개변수로 받은 클래스의 객체를 반환합니다.
	 * @param clazz
	 * @param <T>
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public <T> T get(Class clazz) throws IllegalAccessException, InstantiationException {
		T instance = (T) clazz.newInstance();
		instance = invokeAnnonations(instance);
		return instance;
	}
}