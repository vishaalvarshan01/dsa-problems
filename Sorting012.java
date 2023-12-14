package Basics;

/*
 * Given an array containing 1's , 0's and 2's sort them in ascending order.
 * Note : You must traversal only once.
 */

public class Sorting012 {
    
    public static void solution(int arr[]){
        int i = 0,j = 0, k = arr.length - 1;
        while(i <= k){
            if(arr[i] == 1) i++;
            else if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }else{ // we are unsure if the element in arr[k] is 1 or 0 hence we dont increment i here
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
            for(int x : arr) System.out.print(x + " ");
            System.out.println("");
        }

    }

    public static void main(String args[]){
        int arr[] = {0,1,1,0,2,1,0,2,0,2,1};
        solution(arr);
    }
}
