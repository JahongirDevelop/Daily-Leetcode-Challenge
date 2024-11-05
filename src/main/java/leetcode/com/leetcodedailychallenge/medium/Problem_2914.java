package leetcode.com.leetcodedailychallenge.medium;

public class Problem_2914 {
    /*
    Path :
    https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful
   */
    public static void main(String[] args) {
        minChanges("1100");
    }

    public static int minChanges(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result++;
            }
        }
        return result;
    }
}
