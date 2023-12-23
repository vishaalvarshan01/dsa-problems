package Basics;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays {

    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] target = { 3, 7, 9 };
        int[] arr = { 3, 7, 11 };
        boolean ans = canBeEqual(target, arr);
        System.out.println(" ans : " + ans);
    }
}