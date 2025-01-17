package leetcode.com.leetcodedailychallenge.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Problem_3223 {
    public static void main(String[] args) {
        String s1 = "abaacbcbb";
        String s2 = "aa";

        System.out.println("Minimal uzunlik (s1): " + minimumLength2(s1)); // Output: 5
        System.out.println("Minimal uzunlik (s2): " + minimumLength2(s2)); // Output: 2

    }
    public static int minimumLength(String s) {
        // Belgilarni saqlash uchun stek
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Agar stek bo'sh emas va stekning oxirgi elementi currentChar bilan teng bo'lsa
            if (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop(); // Oxirgi belgini stekdan o'chiramiz
            } else {
                stack.push(currentChar); // Belgini stekka qo'shamiz
            }
        }

        // Stekdagi elementlar soni minimal uzunlikni bildiradi
        return stack.size();
    }
    public static int minimumLength2(String s) {
        int[] charFrequency = new int[26];

        // Har bir belgining chastotasini hisoblash
        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        int minLength = 0;

        // Har bir belgining chastotasini tekshirish
        for (int freq : charFrequency) {
            if (freq > 2) {
                // Agar chastota 3 yoki undan ko‘p bo‘lsa, faqat 2 tasini qoldiramiz
                minLength += freq % 2 == 0 ? 2 : 1;
            } else {
                // Agar chastota 2 yoki 1 bo‘lsa, barcha belgilarni qoldiramiz
                minLength += freq;
            }
        }

        return minLength;
    }

}
