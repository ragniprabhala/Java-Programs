package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Function to double a number
        Function<Integer, Integer> doubleNumber = x -> x * 2;

        // Apply the function
        int result = doubleNumber.apply(5); 
        System.out.println("Double of 5 is: " + result);
    }
}