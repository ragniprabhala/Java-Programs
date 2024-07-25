package com.softworldpgms.uncheckedexceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}