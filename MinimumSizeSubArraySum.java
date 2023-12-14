package Basics;

import java.util.Arrays;

public class MinimumSizeSubArraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int totalMax = 99999999;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            int max = 99999999;
            for (int j = 0; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    if (i != j)
                        sum += nums[k];
                    if (sum == target) {
                        max = (j - i);
                        break;
                    }
                }
                // System.out.println("");
            }
            totalMax = Math.min(totalMax, max);

        }
        if (totalMax == 99999999)
            return 0;
        return totalMax;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int ans = minSubArrayLen(target, nums);
        System.out.println("ans : " + ans);
    }
}
