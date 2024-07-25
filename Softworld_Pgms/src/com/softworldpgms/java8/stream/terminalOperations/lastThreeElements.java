package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class lastThreeElements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	List<Integer> nums	=Arrays.asList(7,4,9,3,2,5);
	List<Integer> lastthreeIntegers= nums.stream().skip(3).collect(Collectors.toList());
	System.out.println(lastthreeIntegers);
		

	}

}
