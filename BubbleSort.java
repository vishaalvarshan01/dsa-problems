package Basics;
/*
   Bubble Sort :
 * compares consequetive elements 
 * avg case : O(n^2)
 * use for small dataset but not for large dataset
 */
public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = { 1,7,3,4,5 };

        bubbleSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1;i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
