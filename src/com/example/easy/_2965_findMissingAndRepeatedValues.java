package com.example.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-missing-and-repeated-values/description/
public class _2965_findMissingAndRepeatedValues {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        //create key of each number in the 2d array
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 1; i <= grid[0].length * grid.length; i++) {
            hashMap.put(i, 0);
        }

        //count appearance of each number
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(hashMap.containsKey(grid[i][j])){
                    Integer count = hashMap.get(grid[i][j]);
                    hashMap.put(grid[i][j], count+1);
                }
            }
        }

        //filter out the key that has exact count of 2 for repeatedNumber
        //filter out the key that has exact count of 0 for missingNumber
        int repeatedNumber = 0;
        int missingNumber = 0 ;
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue().equals(2)) {
                repeatedNumber = entry.getKey();
            }
            if(entry.getValue().equals(0)){
                missingNumber = entry.getKey();
            }
        }
        return new int[]{repeatedNumber,missingNumber};
    }

    public static void main(String[] args) {
        int[][] testCase1 = {{1,3}, {2,2}};
        int[] testCase1_result = findMissingAndRepeatedValues(testCase1);
        System.out.println("testCase1_result = " + Arrays.toString(testCase1_result)); //[2,4]

        int[][] testCase2 = {{9, 1, 7},{8, 9, 2},{3, 4, 6}};
        int[] testCase2_result = findMissingAndRepeatedValues(testCase2);
        System.out.println("testCase2_result = " + Arrays.toString(testCase2_result)); //[9,5]
    }
}
