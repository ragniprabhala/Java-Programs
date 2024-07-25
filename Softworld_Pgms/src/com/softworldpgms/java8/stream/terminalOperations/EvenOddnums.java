package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class EvenOddnums 
{
public static void main(String[] args)
{
	List<Integer> numbers = Arrays.asList(23,4,55,78,5,76);
	System.out.println("List - "+numbers);
	System.out.println("even numbers ");
	numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
	
	System.out.println("Odd numbers");
	
	numbers.stream().filter(n -> n%2!=0).forEach(System.out::println);
}
}
