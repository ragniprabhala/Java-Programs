package com.softworldpgms.java8.methodrefernce;

import java.util.function.Function;

public class StaticMethodReferenceExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Function<String, String> func= String::toUpperCase;
		
 String string="hello";
 System.out.println(func.apply(string));
 
	}

}
