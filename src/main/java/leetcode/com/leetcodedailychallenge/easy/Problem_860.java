package leetcode.com.leetcodedailychallenge.easy;

public class Problem_860 {
     /*
      Path :
      https://leetcode.com/problems/lemonade-change
      */

    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        System.out.println(lemonadeChange(bills));

    }
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        if (bills[0] != 5){
            return false;
        }
        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5) {
                five += 1;
            } else if (bills[i] == 10) {
                if (five > 0){
                    five -= 1;
                    ten += 1;
                }
            } else if (bills[i] == 20) {
                if (five > 0 && ten > 0){
                    ten -= 1;
                    five -= 1;
                } else if (five > 2 && ten == 0){
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;

    }
}
