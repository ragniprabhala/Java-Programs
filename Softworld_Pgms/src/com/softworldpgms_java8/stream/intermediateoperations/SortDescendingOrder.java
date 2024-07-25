package com.softworldpgms_java8.stream.intermediateoperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted(Collections.reverseOrder())
                                             .collect(Collectors.toList());
        System.out.println("Sorted in descending order: " + sortedNumbers);
    }
}
