package com.example.easy;

import java.net.Inet4Address;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

//https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class _1005_maximizeSumOfArrayAfterKNegations {

    //1st approach - slow
//    public static int largestSumAfterKNegations(int[] nums, int k) {
//        int result = 0;
//        nums = IntStream.of(nums).sorted().toArray();
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] < 0 && k > 0){
//                nums[i] *=  -1;
//                k--;
//            }
//        }
//        nums = IntStream.of(nums).sorted().toArray();
//        if(k%2 == 1){
//            nums[0] *= -1;
//        }
//
//        for(int num : nums){
//            result += num;
//        }
//
//        return result;
//    }

    //faster, but not fastest
    //https://youtu.be/wJWVuP48kSI?si=21Aso7gHi0KD1XcQ
    public static int largestSumAfterKNegations(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        IntStream.of(nums).forEach(queue::offer);
        while(k-- > 0){
            int negateInt = -queue.poll();
            queue.offer(negateInt);
        }
        return queue.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
//        int[] testCase1 = {4,2,3};
//        int testCase1_result = largestSumAfterKNegations(testCase1, 1);
//        System.out.println("testCase1_result = " + testCase1_result); //5
//
//        int[] testCase2 = {3,-1,0,2};
//        int testCase2_result = largestSumAfterKNegations(testCase2, 3);
//        System.out.println("testCase2_result = " + testCase2_result); //6

        int[] testCase3 = {2,-3,-1,5,-4};
        int testCase3_result = largestSumAfterKNegations(testCase3, 2);
        System.out.println("testCase3_result = " + testCase3_result); //11

    }

}
