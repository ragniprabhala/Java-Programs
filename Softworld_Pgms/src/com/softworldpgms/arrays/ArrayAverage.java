package com.softworldpgms.arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("Average of array elements: " + average);
    }
}
