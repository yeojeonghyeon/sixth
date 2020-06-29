package com.scci.edu.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME) // 컴파일 이후에도 JVM에 의해서 참조가 가능합니다
@Target({
		ElementType.METHOD, // 메소드 선언시
})
public @interface TestAnno{
	String value() default "NesoyAnnotation : Default String Value"; // 기본 값으로 확인할 수 있습니다.
}