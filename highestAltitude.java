package com.company;

import java.util.Arrays;

// Q. You are given an integer array gain of length n where gain[i] is the net gain in altitude between
// points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
public class highestAltitude {
    public static void main(String[] args) {
//            int[] arr = {-5,1,5,0,-7};
        // [28,0,-8,-99,11,62,-35,68,2,12,-71,13,66,-28]
            int[] arr = {28,0,-8,-99,11,62,-35,68,2,12,-71,13,66,-28};
        System.out.println(Arrays.toString(new int[]{largestAltitude(arr)}));
    }
    public static int largestAltitude(int[] gain) {
        int count = gain[0];
      if(count<0){
          count = 0;
      }
      for(int i = 1; i< gain.length; i++){
          gain[i] += gain[i-1];
          if(gain[i]>count){
              count = gain[i];
          }
      }
       return count;
    }

}
