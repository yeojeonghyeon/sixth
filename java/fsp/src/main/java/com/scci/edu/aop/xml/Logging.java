package com.scci.edu.aop.xml;

import org.aspectj.lang.JoinPoint;

public class Logging {
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature().getName()+" Going to setup student profile.");
		
//		System.out.println(joinPoint.getArgs());
		
		for(Object o : joinPoint.getArgs() ) {
			System.out.println(o);
		}
	}

	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	public void afterReturningAdvice(Object retVal) {
		System.out.println("Returning:" + retVal.toString());
	}

	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}
