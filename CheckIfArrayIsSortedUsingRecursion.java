package Basics;

public class CheckIfArrayIsSortedUsingRecursion {
    
    public static boolean checkArrayIsSorted(int[] arr, int i){
        if(i == arr.length - 1) return true;
        if(arr[i] < arr[i-1]) return false;
        return checkArrayIsSorted(arr, ++i);

    }

    public static void main(String[] args) {
        int[] arr = { 1,2,7,4,5};
        boolean ans = checkArrayIsSorted(arr, 1);
        System.out.println(ans);
    }
}
