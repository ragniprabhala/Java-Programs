package com.softworld.java8.tenprograms;

import java.util.Arrays;
import java.util.Comparator;

// Define a functional interface with one abstract method
@FunctionalInterface
interface StringComparator {
    int compare(String str1, String str2);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};

        // Sort strings based on their length using a lambda expression
        Arrays.sort(strings, (str1, str2) -> Integer.compare(str1.length(), str2.length()));

        // Print sorted strings
        System.out.println("Sorted strings by length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

