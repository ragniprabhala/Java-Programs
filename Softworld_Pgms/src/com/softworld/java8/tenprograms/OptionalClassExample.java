package com.softworld.java8.tenprograms;

import java.util.Optional;


class User
{
	private String name ;
	private int age;
	
	public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	public Optional<String> getName()
	{
		return Optional.ofNullable(name);
	}
	
	public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }
}
public class OptionalClassExample 
{
	
	
public static void main(String[] args)
{
	User user1 = new User("John", 30);
    User user2 = new User(null, 25);
    
    user1.getName().ifPresent(name -> System.out.println("Name: " + name));
    user1.getAge().ifPresent(age -> System.out.println("Age: " + age));
    
    user2.getName().ifPresent(name -> System.out.println("Name: " + name));
    user2.getAge().ifPresent(age -> System.out.println("Age: " + age));
}
}
