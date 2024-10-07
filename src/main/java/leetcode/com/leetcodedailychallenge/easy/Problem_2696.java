package leetcode.com.leetcodedailychallenge.easy;

import java.util.Stack;

public class Problem_2696 {
    public static void main(String[] args) {
        minLength("ABFCACDB");
    }
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()){
                char first = stack.peek();
                if ((first == 'A' && c == 'B') || (first == 'C' && c == 'D')){
                    stack.pop();
                    continue;
                }
            }
        stack.push(c);
        }
        return stack.size();
    }
}
