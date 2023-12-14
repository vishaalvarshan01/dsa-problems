package Basics;

public class MaximumSubArray {

    public static int maxArray(int[] nums){
      
        int maxValue = nums[0];

        int currentSum = maxValue;
        for(int i = 1; i < nums.length; i++){
            if(currentSum < 0)
                currentSum = 0;
            currentSum += nums[i];
            maxValue = Math.max(maxValue, currentSum);
        }

        return maxValue;
    }

    public static void main(String args[]) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = maxArray(nums);

        System.out.println("ans : " + ans);
    }
}
