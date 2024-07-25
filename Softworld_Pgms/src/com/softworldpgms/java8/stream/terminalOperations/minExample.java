package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class minExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);
    }
}
