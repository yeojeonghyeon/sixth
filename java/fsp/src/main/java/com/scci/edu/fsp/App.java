package com.scci.edu.fsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld)context.getBean("helloWorld");
        hw.showMesssage();
    }
}
