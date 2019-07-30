package com.scci.edu.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class YourAspect {
	@Pointcut("execution(* com.scci.edu.annotation..*.*(..))")
	private void all() { 
	}
	
	@Around("all()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		Method method = MethodSignature.class.cast(point.getSignature()).getMethod();
		Object[] args = point.getArgs();
		StringBuilder data = new StringBuilder();
		Annotation[][] parameterAnnotations = method.getParameterAnnotations();
		for (int argIndex = 0; argIndex < args.length; argIndex++) {
			for (Annotation paramAnnotation : parameterAnnotations[argIndex]) {
				if (!(paramAnnotation instanceof Data)) {
					continue;
				}
				Data dataAnnotation = (Data) paramAnnotation;
				if (dataAnnotation.methodName().length() > 0) {
					Object obj = args[argIndex];
					Method dataMethod = obj.getClass().getMethod(dataAnnotation.methodName());
					data.append(dataMethod.invoke(obj));
					continue;
				}
				data.append(args[argIndex]);
			}
		}
		return point.proceed();
	}
}