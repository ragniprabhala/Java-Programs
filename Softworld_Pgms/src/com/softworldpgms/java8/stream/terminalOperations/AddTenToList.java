package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddTenToList 
{
	public static void main(String[] args) 
	{
		
		List<Integer> nums = Arrays.asList(23, 4,55,78,5,76);
	    
	   
	    List<Integer> incrementedNums = nums.stream()
	                                        .map(num -> num + 10)
	                                        .collect(Collectors.toList());

	    System.out.println("Original list: " + nums);
	    System.out.println("Incremented list: " + incrementedNums);
	}
	

}


