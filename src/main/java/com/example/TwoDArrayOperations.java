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
        for (int [] H: array) {
            for (int num: H) {
                sum +=num;
            }
        avg=sum/(array.length*H.length);
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
        int x=0;
        int y=0;
        for (int i=0; i<array.length; i++) {
            x++;
            for (int j=0; j<array[i].length; j++) {
                y++;
            }
        }
        int[] newArray= new int[x*y];
        int count=0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j]= newArray[count];
                count++;
            }
        }

        return newArray;
    }
}
