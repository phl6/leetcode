package com.example.easy;

import java.util.*;

// #217 - Contains Duplicate (easy)
// https://leetcode.com/problems/contains-duplicate/
// https://www.youtube.com/watch?v=3OamzN90kPg
public class _217_containsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        //slow approach:
//        Stack<Integer> stack = new Stack<>();
//        for(int num : nums){
//            if(stack.contains(num)){
//                return true;
//            }
//            stack.add(num);
//        }
//        return false;

        //faster approach:
        return Arrays.stream(nums)
                .distinct()
                .count() < nums.length;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,1};
        int[] test2 = new int[]{1,2,3,4};
        int[] test3 = new int[]{1,1,1,3,3,4,3,2,4,2};

        System.out.println("Output:" + containsDuplicate(test1));
        System.out.println("Output:" + containsDuplicate(test2));
        System.out.println("Output:" + containsDuplicate(test3));
    }

}
