package Basics;

public class SearchInRotateSortedArray {

    public static int binarySearch(int[] arr, int target, int left, int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target)
                right = mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int findPivot(int[] arr){

        int start = 0,end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            // case 1
            if(arr[mid] > arr[mid + 1] && mid < end) return mid;

            // case 2
            else if(arr[mid] < arr[mid - 1] && mid > start) return mid - 1;

            // case 3
            else if(arr[mid] <= arr[start]) end = mid - 1;

            else start = mid + 1;
        }   
        return -1;
    }

    public static int searchInArray(int[] arr, int target){
        
        int pivot = findPivot(arr);

        if(pivot == -1) return binarySearch(arr, target, 0,arr.length);


        return 0;

    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 4,5,6,0,1,2};
        int target = 0;
        System.out.println("pivot : " + findPivot(arr));
        int ans2 = searchInArray(arr, target);
        System.out.println("ans : " + ans2);

    }
}
