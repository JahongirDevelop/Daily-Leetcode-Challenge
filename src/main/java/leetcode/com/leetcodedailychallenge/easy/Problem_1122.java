package leetcode.com.leetcodedailychallenge.easy;

import java.util.Arrays;

public class Problem_1122 {
    public static void main(String[] args) {
        int[] arr1 =  {28,6,22,8,44,17};
        int[] arr2 =  {22,28,8,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2){

        String[] s = new String[arr1.length];
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    res[i] = arr1[j];
                }
                res[res.length - 1] = arr1[i];
            }
        }
        return res;
    }
}
