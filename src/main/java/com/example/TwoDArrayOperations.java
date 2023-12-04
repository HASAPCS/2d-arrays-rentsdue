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
        int sum=0;
        double avg=0;
        for (int [] Hitler: array) {
            for (int num: Hitler) {
                sum +=num;
            }
        avg=sum/(array.length*Hitler.length);
        }
        return avg; 
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        int sum=0;
        for (int i=0; i<array.length; i++) {
            sum +=array[i][i];
            }
        return sum; 
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        return new int[0]; 
    }
}
