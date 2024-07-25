package com.softworld.component.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
    {
 
        // Annotation based spring context
        AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext();
        context.scan("com.softworld.component.annotation");
        context.refresh();
 
        // Getting the Bean from the component class
        ComponentDemo componentDemo
            = context.getBean(ComponentDemo.class);
        componentDemo.setName("ragni");
        System.out.println(componentDemo.getName());
 
        // Closing the context
        // using close() method
        context.close();
    }
}

