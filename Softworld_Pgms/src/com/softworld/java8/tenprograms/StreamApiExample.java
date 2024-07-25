package com.softworld.java8.tenprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Integer> squares = numbers.stream()
                                      .map(num -> num * num)
                                      .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);
    }
}
