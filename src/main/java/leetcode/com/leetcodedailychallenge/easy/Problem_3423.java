package leetcode.com.leetcodedailychallenge.easy;

public class Problem_3423 {
    public static void main(String[] args) {
        System.out.println(maxAdjacentDistance(new int[]{1,2,4}));
        System.out.println(Math.abs(4-2));
    }

    public static int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n];
            int diff = Math.abs(nums[i] - next);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }

}
