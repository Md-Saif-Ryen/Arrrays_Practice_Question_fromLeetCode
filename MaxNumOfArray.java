package com.company;

import java.util.Arrays;

public class MaxNumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,5,1,6,4,2,2};
        System.out.println(Arrays.toString(findMaxNum(arr)));
    }
    public static int[] findMaxNum (int[] arr){
        int maxNum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        } return new int[]{maxNum};
    }
}
