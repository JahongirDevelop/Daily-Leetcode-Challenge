package leetcode.com.leetcodedailychallenge.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_2657 {
    public static void main(String[] args) {
        int[] A = {1,3,2,4}, B = {3,1,2,4};

        System.out.println(Arrays.toString(findThePrefixCommonArray33(A, B)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int counter = 0;
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == A[j] || A[i] == B[j]  || B[i] == A[j] || B[i] == B[j]) {
                    counter++;
                    ans += counter;
                }
            }
            res[i] = ans + counter;
        }
        return res;
    }

    public static int[] findThePrefixCommonArray2(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        Set<Integer> seen = new HashSet<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            if (seen.contains(A[i])) {
                commonCount++;
            } else {
                seen.add(A[i]);
            }

            if (seen.contains(B[i])) {
                commonCount++;
            } else {
                seen.add(B[i]);
            }

            res[i] = commonCount;
        }

        return res;
    }
    public static int[] findThePrefixCommonArray33(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        Set<Integer> seen = new HashSet<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            commonCount += seen.contains(A[i]) ? 1 : 0;
            seen.add(A[i]);

            commonCount += seen.contains(B[i]) ? 1 : 0;
            seen.add(B[i]);

            res[i] = commonCount;
        }

        return res;
    }


}
