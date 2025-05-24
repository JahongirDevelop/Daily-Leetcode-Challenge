package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_2942 {
    /*
     Link :
       https://leetcode.com/problems/find-words-containing-character
     */
    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"cat", "bt", "hat", "tree"}, 'a'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                res.add(i);
            }
        }
        return res;
    }
}
