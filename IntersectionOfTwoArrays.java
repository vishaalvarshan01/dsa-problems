package Basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> hSet1 = new HashSet<>();
        Set<Integer> hSet2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) hSet1.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++) hSet2.add(nums2[i]);

        List<Integer> ans = new ArrayList<>();

        for(int i : hSet1){
            if(hSet2.contains(i)) ans.add(i);
        }
        
        System.out.println(hSet1);
        System.out.println(hSet2);

        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
    
    // optimized approach

    public static boolean checkIfPossible(int[] arr, int value, List<Integer> ans){

        boolean result = false;

        for(int i = 0; i < arr.length;i++){
            if(value == arr[i]){
                result = true;
                break;
            }
        }

        if(ans.contains(value)) result = false;

        return result;
    }

    public static int[] optimizedSolution(int[] nums1, int[] nums2){

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            if(checkIfPossible(nums2, nums1[i], ans))
                ans.add(nums1[i]);
        }

        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = optimizedSolution(nums1, nums2);
        for(int i : ans)
            System.out.print(i + " ");
    }
}
