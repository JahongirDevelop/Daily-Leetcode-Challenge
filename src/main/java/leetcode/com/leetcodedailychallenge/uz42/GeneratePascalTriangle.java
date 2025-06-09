package leetcode.com.leetcodedailychallenge.uz42;

import java.util.Arrays;

public class GeneratePascalTriangle {
    // Path :  https://42.uz/course/arena/lesson/paskal-uchburchagi/masala

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(2)));
    }

    public static int[][] generate(int n) {
        int[][] result = new int[n][];

        for (int i = 0; i < n; i++) {
            // Har bir qatorda i+1 ta element bo'ladi
            result[i] = new int[i + 1];
            result[i][0] = 1; // har bir qatorning birinchi elementi 1
            result[i][i] = 1; // har bir qatorning oxirgi elementi 1

            // O'rtadagi elementlar: oldingi qatordagi 2 element yig'indisi
            for (int j = 1; j < i; j++) {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
            }
        }
        return result;
    }

}
