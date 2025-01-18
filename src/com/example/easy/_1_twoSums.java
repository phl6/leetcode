package com.example.easy;

import java.util.HashMap;
import java.util.Map;

// #1 - Two Sums (Easy)
// https://leetcode.com/problems/two-sum/
public class _1_twoSums {

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap();

        for(int i = 0; i < nums.length; ++i) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No match in the array");
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3, 2, 4};
        int target1 = 6;
        twoSums(test1, target1);
    }

}
