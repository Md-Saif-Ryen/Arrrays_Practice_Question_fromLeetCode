package com.company;

import java.util.Arrays;

// Q. Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all
//the elements on the secondary diagonal that are not part of the primary diagonal.

public class diagonalSum {
    public static void main(String[] args) {
        int[][] diaSum = {{1,8,5},{8,6,2},{2,25,6}};
        System.out.println(Arrays.toString(new int[]{diagonalSum(diaSum)}));
    }
    public static int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum = 0;
        for(int i = 0; i<m; i++){
            sum = sum + mat[i][i] + mat[i][m-i-1];
        } if(m % 2 != 0){
            sum = sum-mat[m/2][m/2];

        } return sum;
    }
}
