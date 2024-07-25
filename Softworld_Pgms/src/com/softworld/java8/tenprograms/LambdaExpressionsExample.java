package com.softworld.java8.tenprograms;

public class LambdaExpressionsExample 
{
    public static void main(String[] args) {
        
        Square square = (int x) -> x * x;

        
        int result = square.calculate(5);

        System.out.println("Square of 5 is: " + result);
    }

   
    interface Square {
        int calculate(int x);
    }
}

