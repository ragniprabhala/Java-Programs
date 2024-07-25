package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;
        System.out.println(sum.apply(5, 3)); // Output: 8
    }
}
