package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        String s1 = "be";
        String s2 = "cat";

        System.out.println(twoStrings(s1, s2));

    }

    static String twoStrings(String s1, String s2) {

        HashSet<Character> letters = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char letter = s1.charAt(i);
            letters.add(letter);
        }

        for (int i = 0; i < s2.length(); i++) {
            char letter = s2.charAt(i);
            if (letters.contains(letter)) {
                return ("Yes");

            }
        }

        return ("No");
    }
}



