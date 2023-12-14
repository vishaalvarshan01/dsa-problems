package Basics;

import java.util.Arrays;
import java.util.HashSet;

/* 
Given an integer array nums, return the third distinct maximum number in this array.
If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

*/
public class ThirdMaximumNumber {

    public static int[] removeDuplicates(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(hashSet.add(arr[i]));
        }
        int[] array = hashSet.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }

    public static int thirdMax(int[] nums) {
        
        nums = removeDuplicates(nums);

        Arrays.sort(nums);
        if(nums.length < 3) return nums[nums.length - 1];
        
        return nums[nums.length - 3];
    }
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1};
        int ans = thirdMax(arr);
        System.out.println("ans : " + ans);
    }
}
