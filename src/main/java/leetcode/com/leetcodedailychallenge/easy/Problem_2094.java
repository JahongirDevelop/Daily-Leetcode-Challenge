package leetcode.com.leetcodedailychallenge.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_2094 {
    /*
    Path :
    https://leetcode.com/problems/finding-3-digit-even-numbers
    */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEvenNumbers(new int[]{2, 1, 3, 0})));

    }
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int d1 = digits[i];
                    int d2 = digits[j];
                    int d3 = digits[k];

                    if (d1 == 0 || d3 % 2 != 0) continue;

                    int num = d1 * 100 + d2 * 10 + d3;
                    resultSet.add(num);
                }
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        Arrays.sort(result);
        return result;
    }

}
