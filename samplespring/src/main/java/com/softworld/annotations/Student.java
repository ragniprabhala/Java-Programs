package com.softworld.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
 
   
	@Value("${Student.rollno}") 
	private int rollNo;
	
   
   @Value("${Student.name}") 
   private String name;
    @Value("${Student.age}") 
    private int age;
 
    
    
    public void setRollNo(int rollNo)
    {
       
        this.rollNo = rollNo;
    }
 
    @Required
   
    @Value("${Student.name}")
    public void setName(String name) { this.name = name; }
 
   
    public void setAge(int age) { this.age = age; }
 
   
    public void display()
    {
       
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}