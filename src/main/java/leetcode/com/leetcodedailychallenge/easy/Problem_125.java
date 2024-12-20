package leetcode.com.leetcodedailychallenge.easy;

public class Problem_125 {
    /*
     Path :
     https://leetcode.com/problems/valid-palindrome/description/
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return result.contentEquals(new StringBuilder(result).reverse());
    }

    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0) {
            return result;
        }

        for (int i = 0; i < code.length; i++) {
            result[i] = plus(code, i, k);
        }
        return result;
    }

    private int plus(int[] code, int index, int k) {
        int res = 0;
        if (k > 0) {
            for (int j = 1; j <= k; j++) {
                res += code[(index + j) % code.length];
            }
        } else {
            for (int j = 1; j <= -k; j++) {
                res += code[(index - j + code.length) % code.length];
            }
        }

        return res;
    }

}
