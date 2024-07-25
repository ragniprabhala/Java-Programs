package samplespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
	Student student=(Student)	context.getBean("student");
	System.out.println(student.getName());
	System.out.println(student.getRollno());
		

	}

}
