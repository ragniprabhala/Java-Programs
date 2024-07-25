package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to generate a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        // Get a random number
        double randomNumber = randomNumberSupplier.get();
        System.out.println("Random number: " + randomNumber);
    }
}
