package com.softworldpgms_java8.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterExample 
{
public static void main(String[] args) 
{
	
	List<String> names = Arrays.asList("john","Alice","Bob","Charlie");
	List<String> LongNames = names.stream().filter(name -> name.length()>4).collect(Collectors.toList());
	
	System.out.println(LongNames);
}
}
