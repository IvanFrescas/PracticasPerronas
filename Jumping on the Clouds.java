package com.company;

public class Main {

    public static void main(String[] args) {
        int[] c = {0, 0, 0, 1, 0, 0};

        System.out.println(jumpingOnClouds(c));
    }

    static int jumpingOnClouds(int[] c) {

        int lastIndex = c.length - 1;
        int jumps = 0;
        int position = 0;



        while(position < lastIndex) {
            if (position == lastIndex - 1) {
                return jumps + 1;
            }
            if (c[position + 2] == 0) {
                position += 2;
            } else {
                position += 1;
            }
                jumps++;
        }
        return jumps;

    }
}
