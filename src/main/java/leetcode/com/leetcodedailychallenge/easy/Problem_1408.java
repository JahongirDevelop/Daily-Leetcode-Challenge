package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.*;
public class Problem_1408 {
    /*
     Path :
     https://leetcode.com/problems/string-matching-in-an-array/
     */
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
    }
        public static List<String> stringMatching(String[] words) {
            Set<String> res = new HashSet<>();
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (words[i] != words[j] && words[j].contains(words[i])) {
                        res.add(words[i]);
                    }
                }
            }
            return new ArrayList<>(res);
        }

}
