package leetcode.com.leetcodedailychallenge.easy;

public class Problem_1957 {
       /*
     Path :
     https://leetcode.com/problems/delete-characters-to-make-fancy-string
     */

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }

    public static String makeFancyString(String s) {
        char prev = s.charAt(0);
        int counter = 1; // chunki 0 index 'prev' ga tegishli shuning uchun i = 1 dan boshlanadi
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) { // chunki 0 index 'prev' ga tegishli shuning uchun i = 1 dan boshlanadi
            if (s.charAt(i) == prev) {
                counter++;
            } else {
                prev = s.charAt(i);
                counter = 1;  // chunki 0 index 'prev' ga tegishli shuning uchun 1 ga tenglaymiz
            }
            if (counter < 3) ans.append(s.charAt(i));
        }
        return ans.toString();
    }

}
