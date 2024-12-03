package leetcode.com.leetcodedailychallenge.easy;

public class Problem_1455 {
    /*
     Path :
          https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence
     */
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("words[i] = " + words[i]);
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Indeks 1 dan boshlanadi (masalan, 1-so'z, 2-so'z va h.k.)
            }
        }
        return -1;
    }
}
