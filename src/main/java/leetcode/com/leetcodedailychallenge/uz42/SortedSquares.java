package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class SortedSquares {
    // Path :  https://42.uz/course/arena/lesson/royxat-kvadrati/masala

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
        System.out.println(Arrays.toString(sortedSquares2(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {
        for (int num : nums) {
            Math.pow(num, 2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
