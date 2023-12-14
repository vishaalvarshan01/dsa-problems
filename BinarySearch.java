package Basics;
import java.util.Arrays;

/*Binary search algorithm : 
 * search an element in a sorted array
 * finds in nlog(n) times
*/

public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {1,2,3,5,7,9,10};
        
        int result = binarySearch(arr, 12);
        System.out.println(result);

        int result2 = Arrays.binarySearch(arr, 9);
        System.out.println(result2);
    }

    public static int binarySearch(int[] arr, int search){
        int left = 0, right = arr.length;

        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] == search) return mid;
            else if(arr[mid] < search) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}