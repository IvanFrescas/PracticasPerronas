package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> magazineHash = new HashMap<>();

        for (String word : magazine) {
            if (magazineHash.containsKey(word)) {
                magazineHash.put(word, magazineHash.get(word) + 1);
            } else {
                magazineHash.put(word, 1);
            }
        }

        for (String word : note) {
            if (magazineHash.containsKey(word) && magazineHash.get(word) > 0) {
                magazineHash.put(word, magazineHash.get(word) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }
}



