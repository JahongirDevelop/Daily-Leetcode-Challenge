package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_3396 {
    public static void main(String[] args) {
        System.out.println("minimumOperations = " + minimumOperations(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7}));
    }
    public static int minimumOperations(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int counter = 0;
        for (int num : nums){
            list.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[i] == nums[j]){
                    list.remove(nums[j]);
                    list.remove(nums[j+1]);
                    list.remove(nums[j+2]);
                    counter++;
                }
            }
        }
        System.out.println("list.size() = " + list.size());
        return counter;
    }

}
