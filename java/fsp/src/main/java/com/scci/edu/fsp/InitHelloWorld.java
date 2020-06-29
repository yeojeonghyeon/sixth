package com.scci.edu.fsp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if ( bean instanceof HelloWorld ) {
			System.out.println("HelloWrod! postProcessBeforeInitialization");
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if ( bean instanceof HelloWorld ) {
			System.out.println("postProcessAfterInitialization = > start!");
			((HelloWorld)bean).showMesssage();
			System.out.println("postProcessAfterInitialization = > end!");			
		}		
		return bean;
	}

}
