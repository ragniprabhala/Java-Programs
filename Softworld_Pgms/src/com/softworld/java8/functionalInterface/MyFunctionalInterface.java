package com.softworld.java8.functionalInterface;

@FunctionalInterface
interface MyInterface {
    void myMethod();
}

public class MyFunctionalInterface {
    public static void main(String[] args) {
        MyInterface myFunction = () -> System.out.println("Executing myMethod");
        myFunction.myMethod();
    }
}
