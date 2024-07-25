package com.softworld.java8.functionalInterface;

@FunctionalInterface
interface Predicate {
    boolean test(int number);
}

public class NumberPredicate {
    public static void main(String[] args) {
        Predicate isEven = (int x) -> x % 2 == 0;
        System.out.println("Is 6 even? " + isEven.test(6));
        System.out.println("Is 9 even? " + isEven.test(9));
    }
}
