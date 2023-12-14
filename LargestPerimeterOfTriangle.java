package Basics;

import java.util.Arrays;

public class LargestPerimeterOfTriangle {

    public static int largestPerimeterOfTriangle(int[] nums) {
        Arrays.sort(nums);

        // for (int i : nums)
        //     System.out.print(i + " ");

        int largestPerimeter = 0;

        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                largestPerimeter = nums[i] + nums[i - 1] + nums[i - 2];
                break;
            }
        }

        return largestPerimeter;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,2 };
        int ans = largestPerimeterOfTriangle(arr);
        System.out.println("ans : " + ans);
    }
}
