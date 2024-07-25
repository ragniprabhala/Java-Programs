package com.softworldpgms.arrays;

public class ArrayContains {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        boolean contains = false;
        for (int num : array) {
            if (num == target) {
                contains = true;
                break;
            }
        }
        System.out.println("Array contains " + target + ": " + contains);
    }
}
