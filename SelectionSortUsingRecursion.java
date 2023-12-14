package Basics;

public class SelectionSortUsingRecursion {

    public static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = 0;
        for (int i = start; i < end; i++) {
            if (arr[maxIndex] < arr[i])
                maxIndex = i;
        }

        return maxIndex;
    }

    public static int[] selectionSortUsingRecursion(int[] arr, int index) {

        if (index == arr.length - 1)
            return arr;
        int lastIndex = arr.length - index - 1;

        int maxValueIndex = findMaxIndex(arr, 0, arr.length - index);

        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxValueIndex];
        arr[maxValueIndex] = temp;

        return selectionSortUsingRecursion(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 9, 7, 8, 5, 6, 3, 2, 1 };
        int[] ans = selectionSortUsingRecursion(arr, 0);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
