package Basics;
public class InsertionSort {
    public static void main(String args[]){
        int[] arr = {9,1,8,2,7,3,6,4,5};

        insertionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                }else break;
            }
        }
    }
}
