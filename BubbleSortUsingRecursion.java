package Basics;

public class BubbleSortUsingRecursion {

    public static int[] bubbleSort(int[] arr, int i, int j) {
        if (i == arr.length)
            return arr;

        // for (int x : arr)
        //     System.out.print(x + " ");
        // System.out.println("");

        if (j < i) {
            // Move to the next pass
            return bubbleSort(arr, i + 1, 0);
        }

        if (arr[j] > arr[j + 1]) {
            // Swap if the current element is greater than the next one
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }

        // Move to the next pair
        return bubbleSort(arr, i, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int[] ans = bubbleSort(arr, 0, 1);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
