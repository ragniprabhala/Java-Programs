package com.softworldpgms.java8.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ThirdLowest {

	public static void main(String[] args) 
	{
		
		List<Integer> numbers = Arrays.asList(5, 2, 4, 8, 1, 6);
        System.out.println(numbers);
        Optional<Integer> thirdLowest = numbers.stream()
                .sorted((a, b) -> a.compareTo(b))
                .distinct() // Ensuring distinct numbers
                .skip(2)    // Skipping the first two (0-indexed)
                .findFirst();
        
        System.out.println(thirdLowest);
	}

}
