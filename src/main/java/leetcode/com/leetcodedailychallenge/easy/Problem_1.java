package leetcode.com.leetcodedailychallenge.easy;

public class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target);
                res[0] = i;
                res[1] = j;
            }
        }
        return res;
    }
    MyClass myClass = new MyClass(){
        @Override
        int solve2(int[] nums) {
            return 0;
        }
    };
}
