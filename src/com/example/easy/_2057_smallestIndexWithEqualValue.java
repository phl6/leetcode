package com.example.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/smallest-index-with-equal-value/description/
public class _2057_smallestIndexWithEqualValue {

//    //super slowwwww 4ms
//    public static int smallestEqual(int[] nums) {
//        Map<Integer, Boolean> hashMap = new HashMap();
//        for(int i = 0; i < nums.length ; i++){
//            hashMap.put(i, i % 10 == nums[i]);
//        }
//
//        return hashMap.containsValue(Boolean.TRUE) ?
//                hashMap.entrySet().stream()
//                    .filter(entry -> entry.getValue().equals(Boolean.TRUE))
//                    .findFirst()
//                    .get()
//                    .getKey() :
//                -1;
//    }

    //super fast 0ms
    public static int smallestEqual(int[] nums) {
       for(int i=0; i < nums.length; i++){
           if(i % 10 == nums[i]) return i;
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] testCase1 = {0,1,2};
        int testCase1_result = smallestEqual(testCase1); //0
        System.out.println("testCase1_result = " + testCase1_result);

        int[] testCase2 = {4,3,2,1};
        int testCase2_result = smallestEqual(testCase2); //2
        System.out.println("testCase2_result = " + testCase2_result);

        int[] testCase3 = {1,2,3,4,5,6,7,8,9,0};
        int testCase3_result = smallestEqual(testCase3); //-1
        System.out.println("testCase3_result = " + testCase3_result);

        int[] testCase439 = {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
        int testCase439_result = smallestEqual(testCase439); //21
        System.out.println("testCase439_result = " + testCase439_result);

    }

}
