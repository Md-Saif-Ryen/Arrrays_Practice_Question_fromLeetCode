package com.company;

import java.util.Arrays;

public class sumOfWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {1, 2, 3}};
        System.out.println(Arrays.toString(new int[]{maximumWealth(accounts)}));
    }
    public static int maximumWealth(int[][] accounts) {

        int maX = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = +i;

            }
            if (sum>maX) {
                maX = sum;
            }
         }
        return maX;
    }
}
