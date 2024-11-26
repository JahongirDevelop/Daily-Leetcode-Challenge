package leetcode.com.leetcodedailychallenge.easy;

public class Problem_2490 {
    /*
     Path :
     https://leetcode.com/problems/valid-palindrome/description/
     */

    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(sentence));
    }

    public static boolean isCircularSentence(String sentence) {
        String words[] = sentence.split(" ");
        int n = words.length;
        char last = words[n - 1].charAt(words[n - 1].length() - 1);

//        for (int i = 0; i < n; i++) {
//            if (words[i].charAt(0) != last) return false;
//            last = words[i].charAt(words[i].length() - 1);
//        }
        for (String word : words) {
            if (word.charAt(0) != last) return false;
            last = word.charAt(word.length() - 1);
        }

        return true;
    }
}
