package Basics;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeardInArray {
    
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

    public static int[] findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();

        nums = cyclicSort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1) ans.add(i+1);
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String args[]){
        int[] arr = { 1, 1};
        int[] ans = findDisappearedNumbers(arr);
        for(int i : ans) System.out.print(i + " ");
    }
}
