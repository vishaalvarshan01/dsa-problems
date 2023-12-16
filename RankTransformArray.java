package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RankTransformArray {

    public static int findRank(int[] arr, int target){
        Set<Integer> distinctElements = new HashSet<>();

        for (int num : arr) {
            if (num < target) {
                distinctElements.add(num);
            }
        }

        return distinctElements.size() + 1;
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] indexArray = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(indexArray);

        int[] ans = new int[arr.length];

        for(int i = 0; i < ans.length; i++){
            ans[i] = findRank(indexArray,arr[i]);
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = { 100,100,100};
        int[] ans = arrayRankTransform(arr);
        for(int i : ans) System.out.print(i + " ");
    }
}
