package com.example.easy;

// #9 - Palindrome Numer (Easy)
// https://leetcode.com/problems/palindrome-number/
public class _9_palindromeNumber {

    public static boolean isPalindrome(int x){
        char[] arr = ("" + x).toCharArray();
        //even
        // 1 2 2 1
        //odd
        // 1 2 1
        if(arr.length % 2 == 1){
            //odd
        }else{
            //even
//            double halfLength = Math.floor(arr.length / 2);
//            double firstHalf = arr.slice(0, halfLength);
//            double secondHalf = arr.slice(halfLength, arr.length);
//
        }

        return true;
    }

    public static void main(String[] args) {

//        System.out.println("is 123 palindrome number? " + isPalindrome(123)); //false
        System.out.println("is 121 palindrome number? " + isPalindrome(1221)); //true
    }
}
