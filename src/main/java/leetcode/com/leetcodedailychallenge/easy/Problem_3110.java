package leetcode.com.leetcodedailychallenge.easy;

public class Problem_3110 {
    /*
     Path :
     https://leetcode.com/problems/score-of-a-string/description/
     */

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }

    public static int scoreOfString(String s) {
            int score = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                score += Math.abs(s.charAt(i) - s.charAt(i + 1));
            }
            return score;
        }

}
