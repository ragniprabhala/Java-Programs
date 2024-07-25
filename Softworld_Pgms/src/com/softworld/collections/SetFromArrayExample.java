package com.softworld.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetFromArrayExample {
    public static void main(String[] args) {
        String[] colorsArray = {"Red", "Green", "Blue", "Red", "Yellow", "Green"};

        Set<String> colorsSet = new HashSet(Arrays.asList(colorsArray));

        System.out.println("Unique colors: " + colorsSet);
    }
}
