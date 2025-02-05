package leetcode.com.leetcodedailychallenge.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Problem_1790 {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
    }
//    public boolean areAlmostEqual(String s1, String s2) {
//        int count = 0;
//        int in = 0;
//        int jn = 0;
//        if(Objects.equals(s1, s2)) return true;
//        for (int i = 0; i < s1.length(); i++) {
//                if (s1.charAt(i) != s2.charAt(i)) {
//                    count++;
//                if (count < 3) {
//                    in = i;
//                }
//                if (s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)) return true;
//            }
//        }
//        return false;
//    }
        public static boolean areAlmostEqual(String s1, String s2) {
            if (s1.equals(s2)) return true;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    list.add(i);
                }
            }

            if (list.size() != 2) return false;

            int i = list.get(0), j = list.get(1);
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        }
}
