package com.company;

import java.util.Arrays;

public class numOfSmallerThanCurrentNum {
    public static void main(String[] args) {
            int[] arr= {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numOfSmaller = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            int max = nums[i];
            int count = 0;
            for(int l = 0; l<nums.length; l++){
                if(nums[l]<nums[i]){
                    count++;
                }
            } numOfSmaller[i] = count;
        } return numOfSmaller;
    }
}
