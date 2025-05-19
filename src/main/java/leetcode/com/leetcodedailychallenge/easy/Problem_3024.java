package leetcode.com.leetcodedailychallenge.easy;

public class Problem_3024 {
    /*
     Link :
       https://leetcode.com/problems/type-of-triangle
     */
    public static void main(String[] args) {
        System.out.println(triangleType(new int[]{3, 4, 5}));
    }
    public static String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        // Avval uchburchak bo'lishini tekshiramiz
        if (a + b <= c || a + c <= b || b + c <= a) return "none";
        if (a == b && b == c) return "equilateral";
        if (a == b || b == c || a == c) return "isosceles";
        return "scalene";
    }
}
