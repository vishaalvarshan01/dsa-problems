package Basics;

import java.util.ArrayList;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = i + 1;
        while (i < nums.length && j < nums.length) {
            if(nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }else{
                j++;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParityBruteForce(int[] nums){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i : nums){
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        int k = 0;
        for(int i = 0; i < even.size(); i++){
            nums[k] = even.get(i);
            k++; 
        }
        for(int i = 0; i < odd.size(); i++){
            nums[k] = odd.get(i);
            k++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 0 };
        int[] ans = sortArrayByParity(arr);
        for (int i : ans)
            System.out.print(i + " ");
    }
}
