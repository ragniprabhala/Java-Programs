package com.softworldpgms.checkedexceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // This will throw ClassNotFoundException
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
           System.out.println("class is not available");
        }
    }
}