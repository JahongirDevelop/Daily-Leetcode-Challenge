package leetcode.com.leetcodedailychallenge.easy;

public class Problem_2529 {
    public static void main(String[] args) {
        int[] nums = new int[] {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int pos = 0, neg = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0) pos++;
            if(nums[i] < 0) neg++;
        }
        return Math.max(pos, neg);
    }
}
