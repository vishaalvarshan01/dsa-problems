package Basics;

public class SelectionSort {
    public static void main(String args[]) {

        int[] arr = { 9, 7, 8, 5, 6, 3, 2, 1 };
        int max = findMaxIndex(arr, 0, arr.length);
        System.out.println("max : " + arr[max]);
        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int last = n - i - 1;

            // index of max element
            int index = findMaxIndex(arr, 0, n - i);

            // swap the max element with the last element

            int temp = arr[index];
            arr[index] = arr[last];
            arr[last] = temp;

            for (int x : arr)
                System.out.print(x + " ");
            System.out.println("");
        }
    }

    public static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = 0;
        for (int i = start; i < end; i++) {
            if (arr[maxIndex] < arr[i])
                maxIndex = i;
        }

        return maxIndex;
    }

}
