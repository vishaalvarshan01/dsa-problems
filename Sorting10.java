package Basics;

/*
 * Given an array containing only 1's and 0's, sort them in order.
 * Note : You must traverse them only once.
 */

public class Sorting10 {

    public static void solution(int[] arr) {
        int i = 0, j = 0;
        while (i < arr.length  && j < arr.length ) {
            if (arr[i] == 1 && i < arr.length - 1)
                i++;

            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 0, 1, 1};
        solution(arr);
    }
}
