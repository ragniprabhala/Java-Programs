package com.softworldpgms_java8.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample 
{
	public static void main(String[] args) 
	{
		
	List<List<Integer>> numbersList=	Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
	List<Integer> flatnumIntegers=numbersList.stream().flatMap(List::stream).collect(Collectors.toList());
	System.out.println(flatnumIntegers);
	}

}
