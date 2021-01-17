import java.util.*;

public class Solution {

    public static double getMean(int[] arr, int n) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / (long) n;
    }

    public static double getStandardDeviation(int [] array, int n) {
        double mean = getMean(array, n);
        double sum = 0;
        for (int x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        String result = String.format("%.1f",getStandardDeviation(arr, n));
        System.out.print(result);
    }
}