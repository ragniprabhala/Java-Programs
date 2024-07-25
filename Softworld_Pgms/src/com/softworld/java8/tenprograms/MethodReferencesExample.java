package com.softworld.java8.tenprograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        
        MethodReferencesExample example = new MethodReferencesExample();
        Consumer<String> printNameLength = example::printLength;
        
       
        names.forEach(printNameLength);
    }
    
    public void printLength(String str) {
        System.out.println("Length of " + str + ": " + str.length());
    }
    
    
}
