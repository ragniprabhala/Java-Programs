package com.softworldpgms.arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
