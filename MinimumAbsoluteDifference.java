package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(arr);

        int minimumDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i - 1];
            minimumDiff = Math.min(minimumDiff, temp);
        }

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) == minimumDiff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 10, 15 };
        List<List<Integer>> ans = minimumAbsDifference(arr);
        System.out.println(ans);
    }
}
