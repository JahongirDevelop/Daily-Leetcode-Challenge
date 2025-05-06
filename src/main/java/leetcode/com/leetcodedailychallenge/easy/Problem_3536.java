package leetcode.com.leetcodedailychallenge.easy;

public class Problem_3536 {
    /*
     Path :
     https://leetcode.com/problems/maximum-product-of-two-digits
     */
    public static void main(String[] args) {
        System.out.println(maxProduct(31));  // Expected: 3
        System.out.println(maxProduct(22));  // Expected: 4
        System.out.println(maxProduct(124)); // Expected: 8
    }

    public static int maxProduct(int n) {
        // Convert the number to a string to easily extract digits
        String num = String.valueOf(n);
        int maxProduct = 0;

        // Iterate through all pairs of digits
        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                // Convert characters to integers
                int digit1 = num.charAt(i) - '0';
                int digit2 = num.charAt(j) - '0';

                // Calculate the product
                int product = digit1 * digit2;

                // Update the maximum product if necessary
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}
