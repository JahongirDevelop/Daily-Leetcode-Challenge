package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class LeftRightDifference {
    // Path :  http://42.uz/course/arena/lesson/arqon-tortish/masala

    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(leftRightDifference2(new int[]{1, 2, 3, 4})));
    }

    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int totalSum = 0;
        for (int num : nums) totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum > rightSum) res[i] = -1;
            else if (leftSum < rightSum) res[i] = 1;
            else res[i] = 0;

            leftSum += nums[i];
        }
        return res;
    }

    public static int[] leftRightDifference2(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum > rightSum) res[i] = -1;
            else if (leftSum < rightSum) res[i] = 1;
            else res[i] = 0;
        }
        return res;
    }

}
