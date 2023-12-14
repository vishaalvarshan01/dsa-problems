package Basics;

public class FindMissingPositive {

    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {

            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return nums;
    }

    public static int firstMissingPositive(int[] nums) {

        nums = cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i+1 != nums[i]) {
                return i+1;
            }
        }
        return nums.length + 1;
    }

    public static void main(String args[]) {
        int[] nums = { 3,4,-1,1};
        int ans = firstMissingPositive(nums);
        System.out.println("ans : " + ans);
    }
}
