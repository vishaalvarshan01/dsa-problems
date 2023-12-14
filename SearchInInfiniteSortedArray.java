package Basics;

public class SearchInInfiniteSortedArray {
    
    public static int binarySearch(int[] arr,int start,int end, int target){
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;

        }
        return ans;
    }

    public static int findPosition(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(end < target){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr,start,end ,target);
    }

    public static void main(String args[]){
        int[] arr = {2,3,4,5,6,7,8,9,9,10,11,12,20,23};
        int ans = findPosition(arr, 23);
        System.out.println("ans : " + ans);
    }   
}
