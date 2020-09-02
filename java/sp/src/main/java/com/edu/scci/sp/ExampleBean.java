package com.edu.scci.sp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean {
	String prop; 
	public String getProp() {
		return prop;
	}
	public void setProp(String prop) {
		this.prop = prop;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ExampleBean's afterPropertiesSet prop's value " + prop);
	}
	
	public void init() {
		System.out.println("ExampleBean's init");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("ExampleBean's destroy");
	}
}