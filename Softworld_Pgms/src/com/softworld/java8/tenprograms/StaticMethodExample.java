package com.softworld.java8.tenprograms;

interface MathOperation {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int result1 = MathOperation.add(5, 3); // Calling static method add()
        System.out.println("Addition: " + result1); // Output: 8

        int result2 = MathOperation.subtract(10, 5); // Calling static method subtract()
        System.out.println("Subtraction: " + result2); // Output: 5
    }
}
