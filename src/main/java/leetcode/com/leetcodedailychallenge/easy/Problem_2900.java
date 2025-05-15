package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_2900 {
    /*
     Link :
       https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i
     */
    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,0,1};
        System.out.println(getLongestSubsequence(words, groups));

    }

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int prevGroup = -1; // -1: hech narsa tanlanmagan hali

        for (int i = 0; i < words.length; i++) {
            if (prevGroup == -1 || groups[i] != prevGroup) {
                result.add(words[i]);
                prevGroup = groups[i];
            }
        }

        return result;
    }

    public static List<String> getLongestSubsequence2(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        result.add(words[0]); // Boshlang'ich elementni qo'shamiz
        for (int i = 1; i < words.length; i++) {
            if (groups[i] != groups[i - 1]) {
                result.add(words[i]);
            }
        }

        return result;
    }



}
