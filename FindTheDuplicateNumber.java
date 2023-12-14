package Basics;

public class FindTheDuplicateNumber {

    public static int[] cyclicSort(int[] nums){
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

    public static int duplicateNumber(int[] nums) {
        
        nums = cyclicSort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i+1 != nums[i]) return nums[i];
        }

        return 0;
    }

    public static void main(String args[]) {
        int[] nums = { 3, 1, 3, 4, 2};
        int ans = duplicateNumber(nums);
        System.out.println(ans);
    }
}
