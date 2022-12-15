package com.blz.day3problem;

public class SmallestArray {
    public static void main(String[] args) {

        int[] array = { 6, 88, 8, 5, -9, 7, 15};
        int smallestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
            }
        }
        System.out.println(smallestElement);
    }
}