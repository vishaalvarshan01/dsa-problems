package Basics;

public class FindElementInRotatedSortedArray {

    public static int findElementInArray(int[] arr, int target, int left, int right) {
        if (left >= right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[left] < arr[mid]) {
            if (target >= arr[left] && target <= arr[mid])
                return findElementInArray(arr, target, left, mid - 1);
            else
                return findElementInArray(arr, target, mid + 1, right);
        }
        if (target >= arr[mid] && target <= arr[right])
            return findElementInArray(arr, target, mid + 1, right);

        return findElementInArray(arr, target, left, mid - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int target = 6;
        int ans = findElementInArray(arr, target, 0, arr.length - 1);
        System.out.println("ans : " + ans);
    }
}
