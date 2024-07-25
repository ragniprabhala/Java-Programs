package com.softworldpgms.java8.methodrefernce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InstanceMethodReferenceExample {

	public static void main(String[] args) 
	{
		// Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        Consumer<String> methodReference = System.out::println;
        names.forEach(methodReference);;
	}

}
