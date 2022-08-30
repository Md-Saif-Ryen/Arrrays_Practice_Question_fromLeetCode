package com.company;

import java.util.Arrays;

public class flipTheImage {

    public static void main(String[] args) {
        int[][] image = {{1,8,5},{8,6,2},{2,25,6}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<(n+1)/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][n-j-1];
                image[i][n-j-1] = temp;
            }
        }
        return image;
    }
}
