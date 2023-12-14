package Basics;

public class FindMinimumInRotatedSortedArray {
    public static int findPivot(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // case 1
            if (mid < end && arr[mid] > arr[mid + 1])
                return arr[mid + 1];

            // case 2
            else if (mid > start && arr[mid] < arr[mid - 1])
                return arr[mid];

            // case 3
            else if (arr[mid] <= arr[start])
                end = mid - 1;

            // case 4
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int findMin(int[] arr) {
        int pivot = findPivot(arr);

        if (pivot == -1)
            return Math.min(arr[0], arr[arr.length - 1]);
        else
            return pivot;
    }
    
    public static void main(String[] args){
        int arr[] = {5,1,2,3,4};
        int ans = findMin(arr);
        System.out.println("ans : " + ans);
    }
}

