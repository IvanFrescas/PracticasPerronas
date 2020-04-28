package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
	        };

	    int[][] arr2 = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };

        System.out.println(hourglassSum(arr2));

    }

    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int actualSum = 0;
        boolean ban = true;

        for (int k = 0; k < 4 ; k++) {
            for (int j = 0; j < 4; j++) {

                for (int i = 0; i < 3; i++) {
                    actualSum += arr[j][k + i];
                    actualSum += arr[j + 2][k + i];
                }
                actualSum += arr[j + 1] [k + 1];
                if (actualSum > sum || ban) {
                    sum = actualSum;
                    ban = false;
                }
                actualSum = 0;
            }
        }
        return sum;
    }
}
