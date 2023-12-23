package Basics;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInArray {
    
    public static int maxProduct(int[] nums) {

        Arrays.sort(nums);

        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
    public static void main(String[] args) {
        int[] nums = { 3, 7};
        int ans = maxProduct(nums);
        System.out.println("ans : " + ans);
    }
}
