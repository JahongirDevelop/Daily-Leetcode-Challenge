package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class ReverseString {
    /*
    Path :
    https://42.uz/course/express-algoritm/lesson/teskari-soz/problem-062
   */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseString(new String[]{"h", "e", "l", "l", "o"})));
    }
    public static String[] reverseString(String[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return s;
    }
}
