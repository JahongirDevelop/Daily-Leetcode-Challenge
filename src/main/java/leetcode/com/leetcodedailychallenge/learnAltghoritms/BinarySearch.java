package leetcode.com.leetcodedailychallenge.learnAltghoritms;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6,6,6,6,6,7,8,9};
        System.out.println(binary_search(arr, 6));
        System.out.println(binary_search_left_most(arr, 6));
        System.out.println(binary_search_right_most(arr, 6));
    }

    private static int binary_search(int[] arr, int targetValue) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int middle = (left + right) / 2; // or int middle = (left + right) >> 1;
            if (arr[middle] == targetValue) {
                return middle;
            }
            if (arr[middle] < targetValue) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
    public static int binary_search_left_most(int[] arr, int targetValue) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;
            if (arr[middle] < targetValue) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }
    public static int binary_search_right_most(int[] arr, int targetValue) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int middle = (left + right + 1) / 2;
            if (arr[middle] < targetValue) {
                right = middle - 1;
            } else {
                left = middle;
            }
        }
        return left;
    }
}
