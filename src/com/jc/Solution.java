package com.jc;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * мапа >10% =(
     */
    public boolean isPalindromeMap(int x) {

        if (x < 0) return false;
        int temp = x;
        int y = 0;
        int i = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (temp > 0) {
            map.put(i, temp % 10);
            temp = temp / 10;
            i++;
        }
        for (int j = 0; j < i / 2; j++) {
            if (map.get(j) != map.get(i - 1 - j))
                return false;
        }
        return true;
    }

    /**
     * реверт инт > 100%
     */
    public boolean isPalindromeReverse(int x) {
        if (x < 0) return false;
        int temp = x;
        long y = 0;
        int i = 0;
        while (temp > 0) {
            y = y * 10 + temp % 10;
            temp = temp / 10;
            i++;
        }
        if (x == y)
            return true;
        return false;
    }

    /**
     * 40.28% string
     */
    public boolean isPalinromeString(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
