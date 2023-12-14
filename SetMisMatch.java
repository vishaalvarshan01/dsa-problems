package Basics;

public class SetMisMatch {

    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return nums;
    }

    public static int[] findErrorNums(int[] nums) {
        nums = cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return new int[] { nums[i], i + 1 };
        }

        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        int[] nums = { 1, 1 };
        int[] ans = findErrorNums(nums);
        for(int i : ans) System.out.print(i + " ");
    }
}
