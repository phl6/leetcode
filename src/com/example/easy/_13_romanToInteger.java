package com.example.easy;

import java.util.Map;

// #13 - Two Sums (Easy)
// https://leetcode.com/problems/roman-to-integer/
class _13_romanToInteger {
    public static int romanToInt(String s){
        if (s == null || s.length() == 0) return -1;
        Map<Character, Integer> romanIntMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int result = romanIntMap.get(s.charAt(s.length()-1));
        for(int i = s.length() - 2; i >= 0; i--){
            int current = romanIntMap.get(s.charAt(i));
            int previous = romanIntMap.get(s.charAt(i + 1));
            result = (current < previous) ? result - current : result + current;
        }
        return result;
    }



    public static void main(String[] args) {
//        mapRomanWithInteger();
        System.out.println("III in int: " + romanToInt("III")); //3
        System.out.println("LVIII in int: " + romanToInt("LVIII")); //58
        System.out.println("XXVII in int: " + romanToInt("XXVII")); //27
        System.out.println("MCMXCIV in int: " + romanToInt("MCMXCIV")); //1994
    }
}
