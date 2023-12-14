package Basics;

import java.util.HashSet;
import java.util.Set;

public class KthMissingPositiveNumber {

    public static int findKthPositive(int[] arr, int k) {
        Set<Integer> hset = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            hset.add(arr[i]);
        }

        System.out.println(hset);
        int i = 1;
        for( i = 1; i <= arr[arr.length - 1] + k + 1; i++){
            
            if(k <= 0) return i - 1;
            if(!hset.contains(i)){
                System.out.println(i);
                k--;
            }
        }
        if(k > 0) return arr[arr.length - 1] + k + 1;

        return 0;
    }
    public static void main(String args[]){
        int[] arr = { 5, 6, 7, 8, 9};
        int k = 9;
        int ans = findKthPositive(arr, k);
        System.out.println("ans : " + ans);
    }
}
