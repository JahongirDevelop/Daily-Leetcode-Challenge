package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        return nums;
    }
    public int[] moveZeroes2(int[] nums) {
        int insertPos = 0;

        // 1. Nollar bo'lmagan elementlarni oldinga yozamiz
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        // 2. Qolgan joylarni nol bilan to'ldiramiz
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        return nums;
    }
}
