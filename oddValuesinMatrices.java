package com.company;

import java.util.Arrays;

// Q. Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

public class oddValuesinMatrices {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(Arrays.toString(new int[]{oddCells(m,n,indices)}));

    }
    public static int oddCells(int m, int n, int[][] indices) {
        int size = indices.length;
        int count= 0;
        int[][] ans = new int[m][n];
        for(int i = 0; i<size; i++){
            for(int k = 0; k<n; k++){
                ans[indices[i][0]][k]++;
            }
            for(int ka = 0; ka<m; ka++){
                ans[ka][indices[i][1]]++;
            }

        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++)
            if(ans[i][j]%2 !=0){
                count++;
            }
        }
        return count;
    }
}
