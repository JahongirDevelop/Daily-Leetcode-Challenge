package leetcode.com.leetcodedailychallenge.easy;

import java.util.Arrays;

public class Problem_3090 {
    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("saalom"));
    }
    public static int maximumLengthSubstring(String s) {
        int counter = 0;
        int[] count = count(s);
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                count[i] = 0;
                counter += 2;
            }

            if (count[i] < 3 && count[i] != 0) counter++;
        }
        return counter;
    }
    public static int[] count(String word) {
        int[] a = new int[26];
        for (char c : word.toCharArray()) {
            a[c - 'a']++;
        }
        return a;
    }

}

