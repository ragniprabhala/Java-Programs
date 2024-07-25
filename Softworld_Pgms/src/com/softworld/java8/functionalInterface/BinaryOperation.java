package com.softworld.java8.functionalInterface;

@FunctionalInterface
interface BinaryOper {
    double operate(double a, double b);
}

public class BinaryOperation {
    public static void main(String[] args) {
        BinaryOper multiply = (a, b) -> a * b;
        BinaryOper divide = (a, b) -> a / b;
        System.out.println("Multiplication: " + multiply.operate(5, 3)); // Output: 15.0
        System.out.println("Division: " + divide.operate(10, 2)); // Output: 5.0
    }
}
