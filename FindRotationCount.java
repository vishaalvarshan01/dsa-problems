package Basics;

public class FindRotationCount {

    public static int findPivot(int[] arr){
        int left = 0, right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            // case 1 :
            if(mid < right && arr[mid] > arr[mid + 1]) return mid;

            // case 2 :
            else if(mid > left && arr[mid] < arr[mid - 1]) return mid-1;

            // case 3 :
            else if(arr[left] > arr[mid]) right = mid - 1;

            // case 4 : 
            else left = mid + 1;
        }

        return -1;
    }

    public static int rotationCount(int[] arr){
        
        int pivot = findPivot(arr);

        return pivot+1;
    }

    public static void main(String[] args){
        int[] arr = { 5, 1, 2, 3, 4};
        int ans = findPivot(arr);
        System.out.println("pivot : " + ans);
    }
}
