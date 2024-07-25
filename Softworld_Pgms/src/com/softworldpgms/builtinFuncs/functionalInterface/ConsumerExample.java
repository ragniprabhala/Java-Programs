package com.softworldpgms.builtinFuncs.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer to print a message
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        // Accept the message
        printMessage.accept("Hello, world!"); // Output: Message: Hello, world!
    }
}
