package com.example;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        int [][] array= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(array);
    }

    // Exercise 2: Find the Maximum Value in a 2D Array
    public static int findMaximumValue(int[][] array) {
        int max= array[0][0];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if (array[i][j]>max) {
                    max=array[i][j];
                }
            }
        }
        return max; 
    }

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int i=0; i<array.length; i++) {
            for (int num: array[i]) {
                if (value==num) {
                    return true;
                }
            }
        }
        return false; 
    }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
        return 0.0; // Placeholder return value
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        // TODO: Calculate and return the sum of diagonal elements in the 2D array.
        return 0; // Placeholder return value
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        // TODO: Implement the logic to flatten the 2D array into a 1D array.
        return new int[0]; // Placeholder return value
    }
}
