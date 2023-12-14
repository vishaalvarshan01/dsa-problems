package Basics;

/*
 * Given a sorted array , find the first and last index of the element in the given array.
 */

public class FirstAndLastIndex {

    public void solution(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        int firstIndex = -1;
        
        // searching for first index of target
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                firstIndex = mid;
                right = mid - 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        
        left = 0;
        right = arr.length - 1;
        int lastIndex = -1;
        // searching for last inde of target
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                lastIndex = mid;
                left = mid + 1;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(firstIndex + " " + lastIndex);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 3, 4, 5, 5, 5, 5, 5, 8 , 12, 13, 14, 14, 14, 14, 15, 15, 16 };
        int target = 5;
        FirstAndLastIndex firstAndLastIndex = new FirstAndLastIndex();
        firstAndLastIndex.solution(arr, target);

    }
}
