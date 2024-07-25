package com.softworld.java8.functionalInterface;


@FunctionalInterface
interface Math {
    int operate(int number);
}

public class MathOperation {
    public static void main(String[] args) {
        Math square = (int x) -> x * x;
        int result = square.operate(5);
        System.out.println("Square of 5 is: " + result);
    }
}
