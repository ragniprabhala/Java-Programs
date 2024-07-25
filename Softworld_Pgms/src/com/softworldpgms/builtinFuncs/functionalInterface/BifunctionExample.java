package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.BiFunction;

public class BifunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1 + num2;
        System.out.println(sum.apply(5, 3)); // Output: 8
    }
}
