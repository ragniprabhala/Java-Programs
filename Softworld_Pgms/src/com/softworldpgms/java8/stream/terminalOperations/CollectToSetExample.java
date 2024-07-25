package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        Set<String> collectedNames = names.stream().collect(Collectors.toSet());
        System.out.println(collectedNames);
    }
}
