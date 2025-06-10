package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_3442 {

    // Path :  https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i

    public static void main(String[] args) {
        System.out.println(maxDifference("aaabbb"));
    }

    public static int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxOdd = Integer.MIN_VALUE;
        int maxDiff = Integer.MIN_VALUE;
        List<Integer> evenFreqs = new ArrayList<>();

        for (int count : freq) {
            if (count == 0) continue;

            if (count % 2 == 1) maxOdd = Math.max(maxOdd, count);
            else evenFreqs.add(count);
        }

        for (int even : evenFreqs) {
            maxDiff = Math.max(maxDiff, maxOdd - even);
        }
        return maxDiff;
    }
}
