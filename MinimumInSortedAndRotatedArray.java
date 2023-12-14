package Basics;

/*
 * Find the minimum element in a sorted and rotated array.
 */

public class MinimumInSortedAndRotatedArray {

    public static int solution(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;

            // this means that minimum element is on the right half of the array
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // this means that minimum element is on the left half of the array 
            else if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return arr[left];
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int ans = solution(arr);
        System.out.println(ans);
    }
}
