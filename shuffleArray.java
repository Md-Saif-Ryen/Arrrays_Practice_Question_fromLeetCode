package com.company;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
            int[] arr  = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr)));
    }

    public static int[] shuffle(int[] arr){
        int[] ans = new int[arr.length];
        int k =0;
        for(int i = 0; i< arr.length/2; i++){
            ans[k] = arr[i];
            ans[k+1] = arr[i+(arr.length)/2];
            k +=2;
        }
        return ans;
    }
}
