import java.util.*;

public class Solution {

    public static double wMean(int[] elements, int[] weights, int n) {
        int total = 0;
        int totalWeights = 0;
        for (int i = 0; i < n; i++) {
            total += elements[i] * weights[i];
            totalWeights += weights[i];
        }

        return (double) total / totalWeights;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        String result = String.format("%.1f",wMean(arr, arr1, n));
        System.out.print(result);
    }
}