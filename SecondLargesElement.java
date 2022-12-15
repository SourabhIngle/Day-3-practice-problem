package com.blz.day3problem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargesElement {

    public static void main(String[] args) {

        int[] array = new int[]{1456,145, 2, 35, 95, 6,5,5,6,6, 2, 58, 85, 95};


//        Arrays.sort(array);
//        System.out.println(array[array.length - 2]);


        int a, b, temp;
        for (a = 0; a < array.length; a++) {

            for (b = a; b < array.length; b++) {

                if (array[a] > array[b]) {
                    temp = array[a];
                    array[a] = array[b];
                    array[b] = temp;
                }
            }
        }System.out.println(array[a-2]);

    }
}



