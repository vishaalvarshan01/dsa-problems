package Basics;

import java.util.Arrays;

/*
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 */
public class MaxiumProductOfThreeNumbers {

    public static int maximumProduct(int[] nums) {
        int product = 0;
       // Arrays.sort(nums);

       return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[0] * nums[1] * nums[nums.length - 1]);
       

    }

    public static void main(String[] args) {
        int[] arr = { -100, -98, -1, 2, 3, 4 };
        int ans = maximumProduct(arr);
        // System.out.println("ans : " + ans);
    }
}
