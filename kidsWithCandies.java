package com.company;

import java.util.Arrays;

public class kidsWithCandies {
    public static void main(String[] args) {
            int[] numOfCandies = {2,3,5,1,3,5,8,2};
        System.out.println(Arrays.toString(kidsWithCandies(numOfCandies, 3)));
    }
    public  static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] isMaxCandies = new boolean[candies.length];
        int maxNum = 0;
        for(int k = 0; k<candies.length; k++){
            if(candies[k]>maxNum){
                maxNum = candies[k];
            };
        }
        for(int i = 0; i<candies.length;i++){
            int addd = candies[i] + extraCandies;
            if(addd>=maxNum){
                isMaxCandies[i] = true;
            }else{
                isMaxCandies[i] = false;
            }
        }
        return isMaxCandies;
    }
}
