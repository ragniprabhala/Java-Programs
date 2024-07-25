package com.softworld.java8.functionalInterface;

@FunctionalInterface
interface Calc{
    double calculate(double x, double y);
}

public class Calculator {
    public static void main(String[] args) {
        Calc add = (double x, double y) -> x + y;
        Calc subtract = (double x, double y) -> x - y;
        System.out.println("Addition: " + add.calculate(5, 3));
        System.out.println("Subtraction: " + subtract.calculate(5, 3));
    }
}
