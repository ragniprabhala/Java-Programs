package com.softworldpgms_java8.stream.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        List<String> processedNames = names.stream()
                                           .peek(System.out::println)
                                           .collect(Collectors.toList());
        System.out.println(processedNames);
    }
}
