package Basics;

import java.util.ArrayList;

/*
 * Print all the subsets present in the array whose sum is equal to target.
 */

public class TargetSumSubsets {

    public static void solution(int arr[] , int i , int target, ArrayList<Integer> ans){

        if(target < 0) return;

        if(i == arr.length){
            if(target == 0)
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        solution(arr, i + 1, target - arr[i], ans);
        ans.remove(ans.size() - 1);
        solution(arr, i + 1, target, ans); 

    }

    public  static void main(String args[]){
        int arr[] = {10,20,15,5};
        int target = 25;
        solution(arr, 0, target, new ArrayList<Integer>());
    }
}
