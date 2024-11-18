package leetcode.com.leetcodedailychallenge.easy;

import java.util.Arrays;

public class Problem_1652 {
    /*
     Path :
          https://leetcode.com/problems/valid-palindrome/description/
     */
    public static void main(String[] args) {
        int[] code = {5,7,1,4,3};
        int k = 4;
        System.out.println(Arrays.toString(decrypt(code, k)));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0) {
            return result;
        }

        for (int i = 0; i < code.length; i++) {
            result[i] = plus(code, i, k);
        }
        return result;
    }

    private static int plus(int[] code, int index, int k) {
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
