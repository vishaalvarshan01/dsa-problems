package Basics;

public class RadixSort {

    public static void solution(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int exp = 1;
        while (max >= 0) {
            max = max / 10;
            countSort(arr, exp);
            exp *= 10;
        }

        // for(int i : arr) System.out.print(i + " ");
    }

    public static void countSort(int[] arr, int exp) {

        int freq[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[(arr[i] / exp) % 10]++;
        }

        int[] prefixSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }

        int ans[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int pos = prefixSum[arr[i]];
            ans[pos - 1] = arr[i];
            prefixSum[arr[i]] = prefixSum[arr[i]] - 1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 7865, 6547, 5643, 99, 110, 9, 92, 100 };
        solution(arr);
    }
}
