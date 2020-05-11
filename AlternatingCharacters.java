package com.company;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "AAABBB";

        System.out.println( alternatingCharacters(s));

    }

    static int alternatingCharacters(String s) {
        int ans = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                ans++;
            }
        }

        return ans;
    }


}
