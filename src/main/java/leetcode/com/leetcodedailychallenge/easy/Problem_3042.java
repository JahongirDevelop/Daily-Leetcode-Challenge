package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem_3042 {
    public static void main(String[] args) {
        System.out.println(countPrefixSuffixPairs(new String[]{"a", "aba", "ababa", "aa"}));
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    res++;
                }
            }
        }
        return res;
    }


}
