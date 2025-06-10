package leetcode.com.leetcodedailychallenge.uz42;

public class MaxArea {
    // Path :  https://42.uz/course/arena/lesson/eng-kop-suvli-hovuz/masala

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int max = 0;

        while (left < right) {
            int height = Math.min(nums[left], nums[right]);
            int width = right - left;
            int area = height * width;
            max = Math.max(max, area);

            if (nums[left] < nums[right]) left++;
            else right--;
        }
        return max;
    }

}
