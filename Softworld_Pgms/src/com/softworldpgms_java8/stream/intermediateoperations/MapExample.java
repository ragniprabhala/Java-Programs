package com.softworldpgms_java8.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample 
{
public static void main(String[] args) 
{
	List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
	List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
	
	System.out.println(upperCaseNames);
}
	
}
