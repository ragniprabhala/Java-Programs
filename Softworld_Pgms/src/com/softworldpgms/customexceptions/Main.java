package com.softworldpgms.customexceptions;

public class Main {

	public static void main(String[] args) throws InvalidAgeException
	{
		Person person= new Person("alex",130);
		System.out.println("Age - " +person.getAge());
		System.out.println("Name - "+person.getName()); 

		
		
	}

}
