package leetcode.com.leetcodedailychallenge.easy;

public class Problem_2843 {

    /*
     Link :
       https://leetcode.com/problems/count-symmetric-integers
     */
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200, 1230));
    }

    public static int countSymmetricIntegers(int low, int high) {
        int counter = 0;
        for (int i = low; i <= high; i++) {
            String num = String.valueOf(i);
            if (num.length() % 2 == 0) {
                int half = num.length() / 2;
                String firstHalf = num.substring(0, half);
                String secondHalf = num.substring(half);

                if (digitSum(firstHalf) == digitSum(secondHalf)) {
                    counter++;
                }
            }
        }
        return counter;
    }


    public static int digitSum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }


}
