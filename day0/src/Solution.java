import java.util.*;

public class Solution {

    public static double mean(int[] arr, int n) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) sum / (long) n;
    }

    public static double meadian(int[] arr) {
        Arrays.sort(arr);
        double theMeadian;
        if (arr.length % 2 == 0) theMeadian = (double) ((arr[arr.length / 2 - 1] + arr[arr.length / 2]))/2;
        else theMeadian = arr[(arr.length + 1) / 2 - 1];

        return theMeadian;
    }

    public static int moda(int[] arr) {

        LinkedHashMap<Integer, Integer> mElementsMap = new LinkedHashMap<>();
        Arrays.sort(arr);

        for (int j : arr) {
            if (mElementsMap.containsKey(j)) {
                mElementsMap.put(j, mElementsMap.get(j) + 1);
                continue;
            }
            mElementsMap.put(j, 1);
        }

        int maximalCount;
        int resultElement = maximalCount = 0;
        for (Map.Entry <Integer, Integer> currentEntry : mElementsMap.entrySet()) {
            if (currentEntry.getValue() > maximalCount) {
                maximalCount = currentEntry.getValue();
                resultElement = currentEntry.getKey();
            }
        }

        return resultElement;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        System.out.println(mean(arr, n));
        System.out.println(meadian(arr));
        System.out.println(moda(arr));
    }
}