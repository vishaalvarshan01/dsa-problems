package Basics;

public class PeakIndexInMountainArray {
    public static int solution(int[] arr) {

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid + 1]) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    public static int brutuForceApproach(int[] arr) {
        int ans = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return mid;
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
                left = mid + 1;
            else if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
                right = mid - 1;
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 0,3,2,1,0 };
        int ans = solution(arr);
        System.out.println("ans : " + ans);
    }
}
