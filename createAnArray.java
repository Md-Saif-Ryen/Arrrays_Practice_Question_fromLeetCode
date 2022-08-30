package com.company;

import java.util.Arrays;

public class createAnArray {

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
            int[] arrayCreate = new int[nums.length];
            for(int i = 0; i<index.length; i++){
                for(int j =i; j>index[i]; j--){
                    arrayCreate[j] = arrayCreate[j-1];
                    
                }
                arrayCreate[index[i]] = nums[i];
            }
            return arrayCreate;
    }
}
