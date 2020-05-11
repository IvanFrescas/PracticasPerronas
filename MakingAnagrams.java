package com.company;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String a = "cde";
        String b = "dcf";
        System.out.println(makeAnagram(a, b));

    }

    static int makeAnagram(String a, String b) {
        int result = 0;

        HashMap<Character, Integer> aMap = new HashMap();
        HashMap<Character, Integer> bMap = new HashMap();


        for (int i = 0; i < a.length(); i++) {
            char letter = a.charAt(i);
            if (aMap.containsKey(letter)) {
                aMap.put(letter, aMap.get(letter) + 1);
            } else {
                aMap.put(letter, 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char letter = b.charAt(i);
            if (bMap.containsKey(letter)) {
                bMap.put(letter, bMap.get(letter) + 1);
            } else {
                bMap.put(letter, 1);
            }
        }

        return result;
    }
}
