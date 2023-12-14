package Basics;

public class SlidingWindowTechnique {

    public static int solution(int[] arr, int n, int k) {
        // window size should be lesser than length of array
        if (n < k)
            return -1;

        int maxValue = 0;

        // value of first window of size k
        for (int i = 0; i < k; i++) {
            maxValue += arr[i];
        }

        int windowSum = maxValue;

        for(int i = k; i < n; i++){
            windowSum += arr[i] - arr[i - k];
            maxValue = Math.max(maxValue, windowSum);
        }

        return maxValue;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        int ans = solution(arr, n, k);
        System.out.println("Ans : " + ans);
    }
}
