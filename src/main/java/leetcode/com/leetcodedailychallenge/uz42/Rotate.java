package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class Rotate {
    /*
    Path :
    https://42.uz/course/arena/lesson/royxatni-aylantirish/masala
   */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // k > n bo‘lsa ham muammo bo‘lmasligi uchun

        reverse(nums, 0, n - 1);     // 1. To‘liq aylantirish
        reverse(nums, 0, k - 1);     // 2. Chap tomonni aylantirish
        reverse(nums, k, n - 1);         // 3. O‘ng tomonni aylantirish
        return nums;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}
