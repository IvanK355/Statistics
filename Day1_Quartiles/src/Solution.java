import java.util.*;

public class Solution {

    private static int meadian(int[] arr, int start, int end) {
        int length = end - start + 1;
        int median = 0;
        if (length % 2 != 0) {
            median = arr[start + length / 2];
        } else {
            median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
        }
        return median;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


        System.out.println(meadian(arr, 0, n / 2 - 1));
        System.out.println(meadian(arr, 0, n - 1));
        System.out.println(meadian(arr, n / 2 + n % 2, n - 1));

    }
}
