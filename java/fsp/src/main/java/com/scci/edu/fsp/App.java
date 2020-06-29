package com.scci.edu.fsp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
        hw.showMesssage();        
        hw.setMessage("I'm object A!");
        hw.showMesssage();
        HelloWorld objectB = (HelloWorld)context.getBean("helloWorld");
        objectB.showMesssage();
        
        HelloWorld objectC = (HelloWorld)context.getBean("helloWorldPrototype");
        HelloWorld objectD = (HelloWorld)context.getBean("helloWorldPrototype");
        objectC.setMessage("I'm Object C!");
        objectC.showMesssage();
        objectD.showMesssage();
        context.registerShutdownHook();
    }
}
