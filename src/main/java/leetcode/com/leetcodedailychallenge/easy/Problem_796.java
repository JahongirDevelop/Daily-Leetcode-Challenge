package leetcode.com.leetcodedailychallenge.easy;

public class Problem_796 {
    /*
     Path :
     https://leetcode.com/problems/rotate-string/
     */

    public static void main(String[] args) {
        System.out.println(rotateString("abcde|abcde", "sda"));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() == goal.length()){
            String str = s + s;
            return str.contains(goal);
        } else return false;
    }


}
