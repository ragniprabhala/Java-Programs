package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThirdHighestElement{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);

        Optional<Integer> thirdHighest = numbers.stream()
                                                .sorted((a, b) -> b.compareTo(a))
                                                .skip(2)
                                                .findFirst();
        System.out.println(thirdHighest);
        
        

    }}