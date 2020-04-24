package com.company;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Main {

    public static void main(String[] args) {

        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] ar2 = {1,2,1,2,1,3,2};



    }

    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer, Integer> socksMap = new HashMap<>();

        for (int i : ar) {
            if (socksMap.containsKey(i)) {
                socksMap.put(i, socksMap.get(i) + 1);
            } else {
                socksMap.put(i, 1);
            }
        }

        int result = 0;

        for (Integer sock : socksMap.keySet()) {
            result += socksMap.get(sock) / 2;
        }

        return result;
    }

    @org.junit.Test
    public void sockMerchantTest() {
        assertEquals(3, sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    @org.junit.Test
    public void sockMerchantTestNotFunctional() {
        assertNotEquals(10, sockMerchant(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }


}
