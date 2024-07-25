package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Test the predicate
        System.out.println("Is 5 even? " + isEven.test(5)); 
        System.out.println("Is 10 even? " + isEven.test(10)); 
    }
}