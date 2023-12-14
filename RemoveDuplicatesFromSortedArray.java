package Basics;

public class RemoveDuplicatesFromSortedArray {
    
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        for(int x : nums){
            System.out.print(x + " ");
        }
        return i + 1;
    }

    public static void main(String args[]){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
        System.out.println(" ans : " + ans);
    }
}
