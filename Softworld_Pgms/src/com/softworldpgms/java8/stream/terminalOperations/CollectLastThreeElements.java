package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectLastThreeElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);

        List<Integer> lastThree = numbers.stream()
                                         .sorted(Collections.reverseOrder())
                                         .limit(3)
                                         .sorted()
                                         .collect(Collectors.toList());

        System.out.println("Last three elements: " + lastThree);
    }
}
