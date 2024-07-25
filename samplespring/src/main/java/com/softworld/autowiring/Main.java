package com.softworld.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
		Human human=(Human) context.getBean("human");
        human.startPumping();
	}

}
