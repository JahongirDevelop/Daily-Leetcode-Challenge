package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class ProductExceptSelf {
    // Path :  https://42.uz/course/arena/lesson/sonlar-kopaytmasi/masala

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {         // O(n^2)
        int[] res = new int[nums.length];
        int count = 1;
        int cur = 1;
        for(int i = 0; i < nums.length; i++){
            cur = nums[i];
            nums[i] = 1;
            for(int j = 0; j < nums.length; j++){
                count *= nums[j];
            }
            nums[i] = cur;
            res[i] = count;
            count = 1;
        }
        return res;
    }
    public static int[] productExceptSelf2(int[] nums) {     // O(n)
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }

}
