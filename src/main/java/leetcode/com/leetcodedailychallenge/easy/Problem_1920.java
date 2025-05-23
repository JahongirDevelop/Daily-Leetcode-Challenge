package leetcode.com.leetcodedailychallenge.easy;

import java.util.*;

public class Problem_1920 {
    /*
     Path :
     https://leetcode.com/problems/build-array-from-permutation
     */
    public static void main(String[] args) {

        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = nums[nums[i]];
        return ans;
    }
}
