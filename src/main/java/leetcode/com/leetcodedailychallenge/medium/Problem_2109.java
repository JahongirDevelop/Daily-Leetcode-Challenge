package leetcode.com.leetcodedailychallenge.medium;

public class Problem_2109 {
    /*
     Path :
          https://leetcode.com/problems/adding-spaces-to-a-string
     */
    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder stringBuilder = new StringBuilder();
        int spaceIndex = 0; // spaces massivini boshqarish uchun indeks

        for (int i = 0; i < s.length(); i++) {
            // Agar i indeks space massivida bo'lsa, probel qo'shish
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                stringBuilder.append(" ");
                spaceIndex++; // Keyingi probel indeksiga o'tish
            }
            // Har bir belgini qo'shish
            stringBuilder.append(s.charAt(i));
        }

        return stringBuilder.toString();
    }


}
