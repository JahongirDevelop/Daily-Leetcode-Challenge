package leetcode.com.leetcodedailychallenge.easy;

public class Problem_1422 {
    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore2("011101"));
    }

    public static int maxScore(String s) {
        int ans = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int curr = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    curr++;
                }
            }

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    curr++;
                }
            }

            ans = Math.max(ans, curr);
        }

        return ans;
    }

    public static int maxScore2(String s) {
        int z = 0;
        int max = 0;
        while (z < s.length() - 1) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                char charAt = s.charAt(i);
                if (charAt == '0' && i <= z) {
                    zeros++;
                }
                if (charAt == '1' && i > z) {
                    ones++;
                }
            }
            z++;
            max = Math.max(max, zeros + ones);
        }
        return max;
    }
}
