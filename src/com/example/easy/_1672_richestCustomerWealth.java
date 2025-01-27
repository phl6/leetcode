package com.example.easy;

//https://leetcode.com/problems/richest-customer-wealth/
public class _1672_richestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int i = 0; i < accounts.length; i++){
            int subListTotal = 0;
            for(int j = 0; j < accounts[i].length; j++){
                subListTotal += accounts[i][j];
            }
            result = Math.max(subListTotal, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] testCase1 = {{1,2,3}, {3,2,1}};
        int testCase1_result = maximumWealth(testCase1);
        System.out.println("testCase1_result = " + testCase1_result); //6

        int[][] testCase2 = {{1,5}, {7,3}, {3,5}};
        int testCase2_result = maximumWealth(testCase2);
        System.out.println("testCase2_result = " + testCase2_result); //10
    }

}
