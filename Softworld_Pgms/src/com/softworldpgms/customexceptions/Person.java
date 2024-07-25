package com.softworldpgms.customexceptions;

public class Person 
{
	private String name;
    private int age;
	public Person(String name, int age) throws InvalidAgeException {
		super();
		if(age>0 && age <=120)
		{
			this.age = age;
		}
		else 
			{
				throw new InvalidAgeException("Invalid age "+age);
			}
		
		this.name = name;
		
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
    
}
