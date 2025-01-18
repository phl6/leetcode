package com.example.easy;

import java.util.LinkedList;
import java.util.Queue;


//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/
//https://neetcode.io/courses/dsa-for-beginners/7
public class _1700_numberOfStudentsUnableToEatLunch {

    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();
        for(int s : students){
            studentsQueue.add(s);
        }

        int topSandwich = 0;
        while(!studentsQueue.isEmpty()){
            if(!studentsQueue.contains(sandwiches[topSandwich])){
                return studentsQueue.size();
            }

            if(studentsQueue.peek().equals(sandwiches[topSandwich])){
                studentsQueue.poll();
                topSandwich++;
            }else{
                Integer unmatchedStudent = studentsQueue.poll();
                studentsQueue.add(unmatchedStudent);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] case1_students = {1,1,0,0};
        int[] case1_sandwiches = {0,1,0,1};
        int[] case2_students = {1,1,1,0,0,1};
        int[] case2_sandwiches = {1,0,0,0,1,1};

        System.out.println(countStudents(case1_students, case1_sandwiches)); //case 1
        System.out.println(countStudents(case2_students, case2_sandwiches)); //case 2
    }

}
