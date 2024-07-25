package com.softworldpgms.arrays;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 3};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}
