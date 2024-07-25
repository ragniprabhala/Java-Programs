package com.softworld.java8.functionalInterface;

@FunctionalInterface
interface StrComparator {
    int compare(String s1, String s2);
}

public class StringComparator {
    public static void main(String[] args) {
        StrComparator comparator = (String s1, String s2) -> s1.length() - s2.length();
        System.out.println(comparator.compare("apple", "banana")); 
    }
}
