package com.example.sorting;

import java.util.Arrays;


//Remember it as librarian organise books on bookshelf,
//for asc order, always assume that books on the left is sorted
//if there is an unsorted book to the left of the book (the while loop below)
//then start looping the book the with the left one by one until it is sorted
//then carry on with the next book (index i)

//Reference: https://neetcode.io/courses/dsa-for-beginners/10
public class InsertionSort {

    public static int[] insertionSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int j = i-1; // set pointer j for left sub array
            while(j >=0 && nums[j+1] < nums[j]){ //j>0 is to prevent it goes out of bound
                //swap position
                int tmp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = tmp;
                j--; //move j index to left by 1 and looping through the left subarray until it's sorted
//                System.out.println("nums = " + Arrays.toString(nums));
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] testCase1 = {4,3,5,1,2,0};
        System.out.println("Arrays.toString(insertionSort(testCase1)) = " + Arrays.toString(insertionSort(testCase1)));

        int[] testCase2 = {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
        int[] testCase2_result = insertionSort(testCase2);
        System.out.println("Arrays.toString(testCase2_result) = " + Arrays.toString(testCase2_result));
    }
}
