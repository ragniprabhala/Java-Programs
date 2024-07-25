package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        long count = names.stream().count();
        System.out.println("Count: " + count);
    }
}
