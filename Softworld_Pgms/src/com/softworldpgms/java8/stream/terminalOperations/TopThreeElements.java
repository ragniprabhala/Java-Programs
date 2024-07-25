package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeElements 
{

	public static void main(String[] args) 
	{
		
		        List<Integer> numbers = Arrays.asList(5, 2, 4, 8, 1, 6);
		        System.out.println(numbers);

		        List<Integer> topThree = numbers.stream()
		                .sorted((a, b) -> b.compareTo(a)) 
		                .limit(3) 
		                .collect(Collectors.toList()); 

		        topThree.forEach(System.out::println);

		    }


		
	}

