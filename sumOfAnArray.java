package com.company;

import java.util.Arrays;

public class sumOfAnArray {
    public static void main(String[] args) {
            int[] arr ={1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int size = nums.length;
        int[] sum = new int[size];
        sum[0]= nums[0];
        for(int i = 1; i<size; i++){
            sum[i] = sum[i-1] + nums[i];
            }
        return sum;
    }
}
