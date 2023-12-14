package Basics;

/*
 * Given an array from range 1 - 10, sort them using counting sort algorithm.
 * Counting sort algorithm : count the number the frequency of the elements in the array
 * and use it to sort the array.
 */

public class CountingSort {

    public static void solution(int[] arr){
        
        int freq[] = new int[10];

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }

        int prefixSum[] = new int[freq.length];

        for(int i = 1; i < freq.length; i++){
            prefixSum[i] = freq[i] + prefixSum[i-1];
        }

        int ans[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            int pos = prefixSum[arr[i]];
            ans[pos - 1] = arr[i];
            prefixSum[arr[i]] = prefixSum[arr[i]] - 1;
        }

        for(int i : ans) System.out.print(i  + " ");
    }
    public static void main(String args[]) {
        int arr[] = { 6, 8, 1, 3, 1, 4, 9, 1, 2, 8, 8, 7, 5};
        solution(arr);
    }
}
