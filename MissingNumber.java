package Basics;

public class MissingNumber {

    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return nums;
    }

    public static int missingNumber(int[] nums) {
        nums = cyclicSort(nums);

        for (int i : nums)
            System.out.print(i + " ");

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;

        }
        return nums.length;
    }

    public static void main(String args[]) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int ans = missingNumber(nums);
        System.out.println(" ans : " + ans);
    }
}
