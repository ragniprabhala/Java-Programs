package com.softworldpgms.java8.methodrefernce;

import java.util.function.BiFunction;

public class InstanceMethodReferenceExample2 
{
	public int add(int a, int b){  
		return a+b;  
		}  
	public static void main(String[] args)
	{
		InstanceMethodReferenceExample2 ex2 = new InstanceMethodReferenceExample2();
		BiFunction<Integer, Integer, Integer> biFunction= ex2::add;
	System.out.println(biFunction.apply(10, 20));
		
	}
}
