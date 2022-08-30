package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class concentrationArrays {

    public static void main(String[] args){
    int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size*2];
            for(int i = 0; i<size; i++){
                ans[i] = nums[i];
                ans[i+size]= nums[i];
            }
            return ans;
    }
}
