package leetcode.com.leetcodedailychallenge.medium;

public class Problem_1011 {
    public static void main(String[] args) {

    }
    // with Binary search
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = weights.length - 1;

        while (left < right) {
            int mid = right + left >> 1;
            if (isPossible(weights, days, mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean isPossible(int[] weights, int days, int capacity) {
        if(weights[0] > capacity){
            return false;
        }
        int usedDays = 1;
        int usedCapacity = weights[0];
        for (int i = 1; i < weights.length && usedDays <= days; i++) {
            if (weights[i] > capacity){
                return false;
            }
            if(usedCapacity + weights[i] <= capacity){
                usedCapacity += weights[i];
            } else {
                usedDays++;
                usedCapacity = weights[i];
            }
        }
        return usedDays <= days;
    }
}
