package leetcode.com.leetcodedailychallenge.easy;

public class Problem_268 {
    /* Path:
    https://leetcode.com/problems/missing-number/
     */
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }

}
