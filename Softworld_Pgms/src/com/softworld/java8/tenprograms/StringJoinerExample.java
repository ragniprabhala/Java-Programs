package com.softworld.java8.tenprograms;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
       
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Orange");
        String fruits = joiner.toString();
        System.out.println("Fruits: " + fruits);
        
        StringJoiner joiner2 = new StringJoiner(" | ");
        joiner2.add("Red");
        joiner2.add("Green");
        joiner2.add("Blue");

        // Converting StringJoiner to String
        String colors = joiner2.toString();
        System.out.println("Colors: " + colors);
    }
}
