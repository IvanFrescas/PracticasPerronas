package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s1 = "abba";
        System.out.println(sherlockAndAnagrams(s1));
    }

    static int sherlockAndAnagrams(String s) {
        int result = 0;

        ArrayList<String> substring = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                substring.add(s.substring(i, j));
            }
        }

        for (int i = 0; i < substring.size(); i++) {
            for (int j = i + 1; j < substring.size(); j++) {
                if (isAnagram(substring.get(i), substring.get(j))) {
                    result++;
                }
            }
        }

        return result;
    }


    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] lettersFromA = a.toCharArray();
        Arrays.sort(lettersFromA);
        char[] lettersFromB = b.toCharArray();
        Arrays.sort(lettersFromB);

        return Arrays.equals(lettersFromA, lettersFromB);
    }
}



