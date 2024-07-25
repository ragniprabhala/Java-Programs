package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> byLength = (str1, str2) -> Integer.compare(str1.length(), str2.length());
        System.out.println(byLength.compare("apple", "banana")); // Output: -3
    }
}
