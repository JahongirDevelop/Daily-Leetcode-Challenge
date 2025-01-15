package leetcode.com.leetcodedailychallenge.easy;

import java.util.Arrays;

public class Problem_2784 {
    /*
     Path :
       https://leetcode.com/problems/check-if-array-is-good
     */

    public static void main(String[] args) {
        // Misollarni sinab ko'ramiz
        int[] nums1 = {3, 4, 4, 1, 2, 1};
        int[] nums2 = {1, 3, 3, 2};
        int[] nums3 = {1, 1};

        System.out.println("Example 1: " + isGood(nums1)); // Output: false
        System.out.println("Example 2: " + isGood(nums2)); // Output: true
        System.out.println("Example 3: " + isGood(nums3)); // Output: true
    }



    public static boolean isGood(int[] nums) {
        // Maksimal qiymatni topamiz (n)
        int n = Arrays.stream(nums).max().orElse(0);

        // base[n] massivini hosil qilamiz
        int[] base = new int[n + 1];
        for (int i = 0; i < n; i++) {
            base[i] = i + 1; // 1 dan n gacha qiymatlar
        }
        base[n] = n; // n qiymatini yana bir marta qo'shamiz

        // nums va base massivlarini saralab taqqoslaymiz
        Arrays.sort(nums);
        Arrays.sort(base);

        // Agar uzunliklar yoki elementlar mos bo'lmasa, false qaytaramiz
        return Arrays.equals(nums, base);
    }
}
