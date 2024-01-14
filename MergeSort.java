package Basics;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
                k++;
            } else {
                ans[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

        
    }

    // public static int[] mergeInPlace(int[] arr,int left, int right){

    // }

    public static int[] inPlaceMergeSort(int[] arr, int start ,int end){
        if(end - start == 1) return arr;

        int mid = (start + end) / 2;

        int[] left = inPlaceMergeSort(arr, start, mid);
        int[] right = inPlaceMergeSort(arr, mid, end);


        return merge(left, right);
    }
 
    public static void main(String[] args) {
        int[] arr = { 9, 7, 8, 5, 6, 3, 2, 1 };
        int[] ans = inPlaceMergeSort(arr,0,arr.length);
        for(int i : ans) System.out.print(i + " ");
    }
}
