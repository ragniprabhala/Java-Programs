package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.BiPredicate;

public class BipredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisible = (num1, num2) -> num1 % num2 == 0;
        System.out.println(isDivisible.test(10, 2)); // Output: true
    }
}
