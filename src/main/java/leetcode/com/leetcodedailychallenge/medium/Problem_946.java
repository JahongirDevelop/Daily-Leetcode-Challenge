package leetcode.com.leetcodedailychallenge.medium;

import java.util.ArrayList;
import java.util.List;



public class Problem_946 {
    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"}, words2 = {"e","o"};
        System.out.println(wordSubsets(words1, words2));
    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < words1.length; i++) {
            for (int j = 0; j < words2.length; j++) {
                if (words1[i].contains(words2[j])) {
                    count++;
                }

                if (count == words2.length) {
                    result.add(words1[i]);
                } else {
                    count = 0;
                }
            }
        }

        return result;
    }
}
