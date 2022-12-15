package com.blz.day3problem;

public class DuplicateElement {

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 8, 9, 6, 9, 5};
        System.out.println("Duplicate Elements is : ");
//            Outer for loop
        for (int k = 0; k < array.length; k++) {
            // inner for loop
            for (int i = 1 + k; i < array.length; i++) {

                if (array[k] == array[i]) {
                    System.out.println(array[i]);
                }

            }
        }

    }

}
