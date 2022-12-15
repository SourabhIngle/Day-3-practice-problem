package com.blz.day3problem;

public class ArrayEvenPosition {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("This is an even element from in array : ");
        for (int k : array) {

            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
    }

}
