package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class SortByParityII {

    public static int[] sortArrayByParityII(int[] nums){
        
        Arrays.sort(nums);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i : nums){
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        int i = 0, j = 0, k = 0;

        while(k < nums.length){
            nums[k] = even.get(i);
            k += 1;
            nums[k] = odd.get(i);
            k+=1;
            i++;
        }

        return nums;

    }
    public static void main(String[] args) {
        int[] arr = { 4,2,5,7};
        int[] ans = sortArrayByParityII(arr);
        for(int i : ans) System.out.print(i + " ");
    }
}
