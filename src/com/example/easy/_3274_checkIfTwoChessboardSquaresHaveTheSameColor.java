package com.example.easy;

public class _3274_checkIfTwoChessboardSquaresHaveTheSameColor {

    public static char blackOrWhite(char x, int y){
        if(x == 'a' ||  x == 'c' || x == 'e' || x == 'g'){
            return y % 2 == 1 ? 'b' : 'w';
        } else {
            return y % 2 == 1 ? 'w' : 'b';
        }
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return blackOrWhite(coordinate1.charAt(0), coordinate1.charAt(1)) == blackOrWhite(coordinate2.charAt(0), coordinate2.charAt(1));
    }

    public static void main(String[] args) {
        boolean testCase1_result = checkTwoChessboards("a1", "c3");
        System.out.println("testCase1_result = " + testCase1_result); //true

        boolean testCase2_result = checkTwoChessboards("a1", "h3");
        System.out.println("testCase2_result = " + testCase2_result); //false
    }

}
