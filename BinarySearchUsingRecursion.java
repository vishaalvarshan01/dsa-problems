package Basics;

public class BinarySearchUsingRecursion {

    public static int binarySearchUsingRecursion(int[] arr, int target, int left, int right) {

        // exit case
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        // base case
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return binarySearchUsingRecursion(arr, target, left, mid - 1);
        return binarySearchUsingRecursion(arr, target, mid + 1, right);

        // return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 1;
        int ans = binarySearchUsingRecursion(arr, target, 0, arr.length);
        System.out.println("ans : " + ans);
    }
}
