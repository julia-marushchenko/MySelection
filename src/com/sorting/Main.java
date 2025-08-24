package com.sorting;// Java program to sort array with selection algorithm

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating array to sort
        long arr [] = {2L, 6L, 1L, 8L, 5L, 8L, 3L, 2L};

        // Creating instance of Sorting class
        Sorting sort = new Sorting();

        // Calling method to sort array
        sort.selectionSort(arr);

        // Printing sorted array to console
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr [i] + " ");
        }

        System.out.println("]");
    }
}

// Sorting class
class Sorting {

    static void selectionSort(long [] arr){
        int arr_length = arr.length;
        for (int i = 0; i < arr_length - 1; i++) {

            // Index of minimum element
            int min_index = i;

            // Iterate through the unsorted part to find the actual minimum element
            for (int j = i + 1; j < arr_length; j++) {

                // Condition to check if smallest is found
                if (arr [j] < arr [min_index]){

                    // Update min_index
                    min_index = j;
                }
            }

            // Move minimum element to its correct position
            long temp = arr [i];
            arr [i] = arr [min_index];
            arr [min_index] = temp;
        }
    }

}