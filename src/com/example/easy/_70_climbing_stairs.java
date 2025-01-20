package com.example.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/climbing-stairs/description/
// 19/01/2025 - still approach is rated as TLE(Time Limit Exceeded), not recommended, it takes long time if n is large
public class _70_climbing_stairs {

    public static int climbStairs(int n){
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    public static int climbStairs(int n, Map<Integer, Integer> memo) {
        if(n <= 1){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n, climbStairs(n-1) + climbStairs(n-2));
        }

        return memo.get(n);
    }

    public static void main(String[] args) {
        int testCase1 = climbStairs(1); //1
        System.out.println("testCase1 = " + testCase1);

        int testCase2 = climbStairs(2); //2
        System.out.println("testCase2 = " + testCase2);

        int testCase3 = climbStairs(3); //3
        System.out.println("testCase3 = " + testCase3);

        int testCase4 = climbStairs(4); //5
        System.out.println("testCase4 = " + testCase4);

        int testCase5 = climbStairs(5); //8
        System.out.println("testCase5 = " + testCase5);
    }

}
