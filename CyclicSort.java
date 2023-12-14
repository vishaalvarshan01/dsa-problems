package Basics;

public class CyclicSort {

    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 1, 0 };
        int[] ans = cyclicSort(arr);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
