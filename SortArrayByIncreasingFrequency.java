package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortArrayByIncreasingFrequency {

    public static int getFrequency(int[] arr, int target) {
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                freq += 1;
        }
        return freq;
    }

    public static int[] frequencySort(int[] nums) {
        int[] distinctArray = Arrays.copyOf(nums, nums.length);
        int[] frequencyArray = new int[nums.length];

        for (int i = 0; i < distinctArray.length; i++) {
            frequencyArray[i] = getFrequency(nums, distinctArray[i]);
        }

        for (int i = 0; i < distinctArray.length - 1; i++) {
            for (int j = i + 1; j < distinctArray.length; j++) {
                if (frequencyArray[i] > frequencyArray[j] || frequencyArray[i] == frequencyArray[j] && distinctArray[i] < distinctArray[j]) {
                    int temp = frequencyArray[i];
                    frequencyArray[i] = frequencyArray[j];
                    frequencyArray[j] = temp;

                    temp = distinctArray[i];
                    distinctArray[i] = distinctArray[j];
                    distinctArray[j] = temp;
                }
            }
        }

        return distinctArray;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 3, 2 };
        int[] ans = frequencySort(nums);
        System.out.println("\nans");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
