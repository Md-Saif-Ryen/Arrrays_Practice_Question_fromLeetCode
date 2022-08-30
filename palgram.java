package com.company;
// Q. Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
public class palgram {
    public static void main(String[] args) {
        String alphabet = "thequickbrownfoxjumpsovertfaljkhdfklaoiwiohfandxhelazydog";
        System.out.println(checkIfPangram(alphabet));
    }
    public static boolean checkIfPangram(String sentence) {
       boolean ans = true;
        for(char i = 'a'; i<='z'; i++){
       if(sentence.indexOf(i) == -1){
           ans = false;
       }

        }
        return ans;
    }
}
