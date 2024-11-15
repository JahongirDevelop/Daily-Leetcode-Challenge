package leetcode.com.leetcodedailychallenge.easy;

public class Problem_125 {
    /*
     Path :
     https://leetcode.com/problems/valid-palindrome/description/
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return result.equals(new StringBuilder(result).reverse().toString());
    }
}
