package com.blz.day3problem;

public class LargestElementArray {

    public static void main(String[] args) {

        int[] array = new int[]{ 1, 3, 5, 9, 5, 8, 7, 6, 5, 2 };

        int largestNumber = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > largestNumber)
                largestNumber = array[i];
        }
        System.out.println("Largest element is " + largestNumber+".");
    }
}
