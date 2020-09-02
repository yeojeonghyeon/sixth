package com.edu.scci.sp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitializePostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ( bean instanceof ExampleBean ) {
			System.out.println(((ExampleBean) bean).getProp());
		}
		System.out.println("postProcessBeforeInitialization beanName = " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ( bean instanceof ExampleBean ) {
			System.out.println(((ExampleBean) bean).getProp());
		}		
		System.out.println("postProcessAfterInitialization beanName = " + beanName);		
		return bean;
	}

}
