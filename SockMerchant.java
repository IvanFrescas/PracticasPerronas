package com.company;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Main {

    public static void main(String[] args) {
        
    }

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        HashMap<Integer, Integer> socksMap = new HashMap<>();

        for (int i : ar) {
            if (socksMap.containsKey(i)) {
                socksMap.put(i, socksMap.get(i) + 1);
            } else {
                socksMap.put(i, 1);
            }
        }

        for (Integer sock : socksMap.keySet()) {
            result += socksMap.get(sock) / 2;
        }

        return result;
    }
}
