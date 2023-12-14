package DSAScalar.BinarySearch;

/*
 * Given a sorted and rotated array, find the index of the given element 
 */

/*
 * To find the target element we first try to find the minimum element in the array
 * Then perform binary search on the left side of the rotated array
 * If the ans return -1 , perform binary search on the right side of the rotated array
 */
public class SearchInSortedAndRotatedArray {

    public static int BinarySearch(int[] arr, int left, int right, int target) {
        
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 7, 67, 133, 178 };
        int target = 1;
        int minIdx = findMin(arr);
        int ans = BinarySearch(arr, 0, minIdx - 1, target);
        if(ans == -1){
            ans = BinarySearch(arr, minIdx, arr.length - 1, target);
        }
        System.out.println(ans);
    }
}
