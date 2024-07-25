package com.softworldpgms_java8.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample 
{
public static void main(String[] args)
{
	List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3);
	List<Integer> uniqueNumbers = numbers.stream()
	                                    .distinct()
	                                    .collect(Collectors.toList());

	uniqueNumbers.forEach(System.out::println);
}
}
