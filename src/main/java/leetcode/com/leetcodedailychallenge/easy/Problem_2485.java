package leetcode.com.leetcodedailychallenge.easy;

public class Problem_2485 {
    /*
     Path :
     https://leetcode.com/problems/find-the-pivot-integer/description/
     */

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
    public static int pivotInteger(int n) {
        int sum= n*(n+1)/2;
        double a= Math.sqrt(sum);

        if(a - Math.ceil(a) == 0) return (int) a;
        else return -1;
    }


    public static int pivotInteger2(int n) {
        double a = Math.sqrt((n * (n + 1)) / 2);
        return a == (int)a ? (int)a : -1;
    }



}
