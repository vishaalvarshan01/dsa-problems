package Basics;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

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

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        nums = cyclicSort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i+1 != nums[i]) ans.add(nums[i]);
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans);
    }
}
