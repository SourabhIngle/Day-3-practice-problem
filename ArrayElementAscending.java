package com.blz.day3problem;

import java.util.Arrays;

public class ArrayElementAscending {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 87, 3, 4, 5, 6, 46, 51, 55};

        int a, b, temp;
        for (a = 0; a < array.length; a++) {

            for (b = a; b < array.length; b++) {

                if (array[a] > array[b]) {
                    temp = array[a];
                    array[a] = array[b];
                    array[b] = temp;

                }
            }

        }
        for (int arr : array) {
            System.out.println(arr);

        }

    }

}
